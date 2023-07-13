import edu.princeton.cs.algs4.In;
public class Shell {
    private static boolean less(Comparable num1, Comparable num2){
        return num1.compareTo(num2) < 0;
    }

    private static void exch(Comparable[] array, int i, int j){
        Comparable t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    private static boolean isSorted(Comparable[] array){
        for(int i = 1; i < array.length; i++){
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

    public static void sort(Comparable[] array){
        int size = array.length;
        int h = 1;
        while(h < size){
            h = 3 * h + 1;
        }
        while(h >= 1){
            for(int i = h; i < size; i++){
                for(int j = i; j >= h && less(array[j], array[j - h]); j-= h){
                    exch(array, j, j-h);
                }
            }
            h = h/3;

        }
    }

    public static void main(String[] args){
        String[] input = In.readStrings();
        System.out.println(isSorted(input));
        show(input);
        sort(input);
        assert isSorted(input) : "not sorted";
        show(input);
        System.out.println(isSorted(input));

    }
}
