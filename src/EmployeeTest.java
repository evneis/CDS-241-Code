public class EmployeeTest {
    public static class Person
    {
        private String name;

        public Person()
        {
            name = "No name yet.";
        }
        public Person(String n)
        {
            name = n;
        }
        public void setName(String newName)
        {
            name = newName;
        }
        public String getName()
        {
            return name;
        }
        public void print()
        {
            System.out.println("Name: " + name);
        }
//        public boolean equals(Object p)
//        {
//            return name.equals(p.getName);
//        }
    }

    public static class Employee extends Person{
        private String name;
        private double salary;
        private int startYear;
        private String insurance;

        public Employee(){
            name = null;
            salary = 0.0;
            startYear = 0000;
            insurance = null;
        }
        public Employee(String n, double s, int y, String i){
            super(n);
            name = n;
            salary = s;
            startYear = y;
            insurance = i;
        }

        public double getSalary(){ return salary;}

        public int getStartYear(){ return startYear;}

        public String getInsurance(){ return insurance;}
    }

    public static void main(String[] args){
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Mike", 200000, 1987, "REF1986W");
        employees[1] = new Employee("Francine", 15000, 1970, "REF1969G");
        employees[2] = new Employee("Charles", 130000, 1995, "REF1993NF");
        employees[3] = new Employee("Roger", 90000, 2019, "REF1999TO");
        employees[4] = new Employee();

        for(int i = 0; i < employees.length; i++){

            System.out.println(employees[i].getName());
            System.out.println(employees[i].getSalary());
            System.out.println(employees[i].getStartYear());
            System.out.println(employees[i].getInsurance());
            System.out.println();
        }
    }
}
