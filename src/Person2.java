import java.util.Arrays;
import java.util.stream.Stream;

public class Person2 implements Comparable<Person2> {
    String firstName;
    String lastName;

    public Person2(String f, String l){
        firstName = f;
        lastName = l;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String f){
        firstName = f;
    }

    public void setLastName(String l){
        lastName = l;
    }

    public String toString(){
        return firstName + " " + lastName;
    }


    public static void main(String args[]){
        Person2[] people = new Person2[5];
        people[0] = new Person2("John", "smith");
        people[1] = new Person2("Jane", "Smith");
        people[2] = new Person2("Jon", "Doe");
        people[3] = new Person2("Sally", "Smith");
        people[4] = new Person2("Jane", "Doe");


        //TODO - use the Arrays.sort method to sort the people array using (1) a lambda expression; (2) by implementing the Comparable interface
        Arrays.sort(people, Person2::compareTo);
        for(Person2 p : people){
            System.out.println(p);
        }

        Stream<Person2> stream = Arrays.stream(people);
        stream = stream.filter(p -> p.getLastName().toLowerCase().equals("smith"));

    }


    @Override
    public int compareTo(Person2 p) {
        int first = this.firstName.toLowerCase().compareTo(p.firstName.toLowerCase());
        int last = this.lastName.toLowerCase().compareTo(p.lastName.toLowerCase());

        if(last == 0)
            return first;
        else
            return last;
    }

}
