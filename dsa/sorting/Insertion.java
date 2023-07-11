import edu.princeton.cs.algs4.In;
public class Insertion {
    private static boolean less(Comparable num1, Comparable num2){
        return num1.compareTo(num2) < 0;
    }

    private static void exch(Comparable[] array, int i, int j){
        Comparable t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    private static boolean isSorted(Comparable[] array){
        for(int i = 0; i < array.length; i++){
            if(less(array[i], array[i - 1])){
                return false;
            }
        }

        return true;
    }

    private static void show(Comparable[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    private static void sort(Comparable[] array){
        
    }

    public static void main(String[] args){
        String[] input = In.readStrings();
        System.out.println(isSorted(input));
        show(input);
        sort(input);
        assert isSorted(input) : "not sorted";
        show(input);
    }
}
