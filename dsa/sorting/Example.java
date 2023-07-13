import edu.princeton.cs.algs4.In;

public class Example {
    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void show(Comparable[] a) {
        for(int i = 0; i  < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        for(int i = 1; i < a.length; i++){
            if(less(a[i], a[i - 1])){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(less(a, b));
        String[] input = In.readStrings();
        System.out.println(isSorted(input));
        // assert a > 30:"smaller";
        assert isSorted(input) : "not sorted";
        show(input);
    }
}