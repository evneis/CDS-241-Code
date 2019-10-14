public class Person1 implements Partier {
    private String name;

    public Person1(String n){
        this.name = n;
    }
    @Override
    public void party() {
        System.out.println(name + " says its time to party!");
    }

    public static void main(String[] args){
        Person1 p = new Person1("Sally");

        p.party();
        p.endParty();
    }
}
