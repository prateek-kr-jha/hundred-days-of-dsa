import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;

public class Quick {
    private static boolean less(Comparable num1, Comparable num2){
        return num1.compareTo(num2) < 0;
    }


    private static void exch(Comparable[] array, int i, int j){
        Comparable t = array[i];
        array[i] = array[j];
        array[j] = t;
    }


    public static int partition(Comparable[] array, int lo, int hi){
        int j = hi + 1;
        int i = lo;
        Comparable v = array[i];
        while(true){
            while(less(array[++i], v)){
                if(i == hi){
                    break;
                }
            }
            while(less(v, array[--j])){
                // System.out.println(j);
                if(j == lo){
                    break;
                }
            }
            if(i >= j){
                break;
            }
            exch(array, j, i);
        }
        
        exch(array, lo, j);
        return j;
    }
    public static void sort(Comparable[] array){
        StdRandom.shuffle(array);
        sort(array, 0, array.length - 1);
    }

    private static void sort(Comparable[] array, int lo, int hi){
        if(lo >= hi){
            return;
        }

        int j = partition(array, lo, hi);
        sort(array, lo, j - 1);
        sort(array, j + 1, hi);

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
        String[] input = In.readStrings();
        System.out.println(isSorted(input));
        show(input);
        sort(input, 0, input.length - 1);
        assert isSorted(input) : "not sorted";
        System.out.println(isSorted(input));
        show(input);
        // for(int i = 0; i < input.length; i++){
        //     System.out.print(input[i] + "  ");
        // }
        // System.out.println();

        // partition(input, 0, 15);

        // for(int i = 0; i < input.length; i++){
        //     System.out.print(input[i] + "  ");
        // }
        // System.out.println();
        
    }
}
