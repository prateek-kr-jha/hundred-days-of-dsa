import edu.princeton.cs.algs4.In;
public class Selection {
    //change less logic for ascending or descending
    private static boolean less(Comparable num1, Comparable num2){
        return num1.compareTo(num2) > 0;
    }

    private static void exch(Comparable[] array, int i, int j){
        Comparable t = array[i];
        array[i] = array[j];
        array[j] = t;
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

    public static void sort(Comparable[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(less(array[i], array[j])){
                    exch(array, i, j);
                }
            }
        }
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
