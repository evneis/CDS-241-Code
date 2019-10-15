public class Max {
    public static <T extends Comparable<T>> T genericMax(T x, T y, T z){
        T max = x;

        if(y.compareTo(max) > 0)
            max = y;

        if(z.compareTo(max) > 0)
            max = z;

        return max;
    }


    public static void main(String[] args){
        System.out.println(genericMax(1, 2,3));

        System.out.println(genericMax("B", "a", "Z"));
    }
}
