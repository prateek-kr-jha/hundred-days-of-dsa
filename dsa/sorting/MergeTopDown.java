import edu.princeton.cs.algs4.In;

public class MergeTopDown {
    //change less logic for ascending or descending
    private static boolean less(Comparable num1, Comparable num2){
        // System.out.println("inside less");
        return num1.compareTo(num2) < 0;
    }
    public static void merge(Comparable[] array, int lo, int mid, int hi){
        int i = lo, j = mid + 1;
        // System.out.println(lo + "   " + mid + "  " + hi);
        Comparable[] aux = new Comparable[array.length];
        for(int k = 0; k < array.length; k++){
            aux[k] = array[k];
        }

        for(int k = lo; k <= hi; k++){
            // System.out.println(j);
            // System.out.println(aux[j] + "   " + aux[i]);
            if(i > mid){
                array[k] = aux[j++];
            } else if(j > hi) {
                array[k] = aux[i++];
            } else if(less(aux[j], aux[i])){
                array[k] = aux[j++];
                // i++;
            } else {
                array[k] = aux[i++];
                // j++;
            }
        }
    }

    public static void sort(Comparable[] array, int lo, int hi){
        if(lo >= hi){
            return;
        }
        // int mid = (hi + lo) / 2;
        int mid = lo + (hi - lo) / 2;

        sort(array, lo, mid);
        sort(array, mid + 1, hi);
        merge(array, lo, mid, hi);

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
    }
}
