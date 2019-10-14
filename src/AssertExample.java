public class AssertExample {
    public static void main(String[] args){
        myFunction(0);
    }

    public static void myFunction(int x){
        assert x != 0: x;

        System.out.println(10/x);
        /* You can turn on and off assertions to toggle and
        see where things are, and can turn all off when in production

        To toggle, go to Run, Edit Configurations, VM Options, type -ea
         */
    }
}
