// import java.util.Arrays;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.In;

public class SortCompare {
    public static class Stopwatch {
        private final long start;
        public Stopwatch() {
            start = System.currentTimeMillis();
        }
    
        public double elapsedTime() {
            long now = System.currentTimeMillis();
            return (now - start) / 1000.0;
        }
    }
    public static double time(String alg, Double[] a) {
            Stopwatch sw = new Stopwatch();
            if      (alg.equals("Insertion"))       Insertion.sort(a);
            // else if (alg.equals("InsertionX"))      InsertionX.sort(a);
            // else if (alg.equals("BinaryInsertion")) BinaryInsertion.sort(a);
            else if (alg.equals("Selection"))       Selection.sort(a);
            // else if (alg.equals("Bubble"))          Bubble.sort(a);
            else if (alg.equals("Shell"))           Shell.sort(a);
            // else if (alg.equals("Merge"))           Merge.sort(a);
            // else if (alg.equals("MergeX"))          MergeX.sort(a);
            // else if (alg.equals("MergeBU"))         MergeBU.sort(a);
            // else if (alg.equals("Quick"))           Quick.sort(a);
            // else if (alg.equals("Quick3way"))       Quick3way.sort(a);
            // else if (alg.equals("QuickX"))          QuickX.sort(a);
            // else if (alg.equals("Heap"))            Heap.sort(a);
            // else if (alg.equals("System"))          Arrays.sort(a);
            else throw new IllegalArgumentException("Invalid algorithm: " + alg);
            return sw.elapsedTime();
        }
    public static double timeRandomInput(String alg, int N, int T){
        double total = 0.0;
        Double[] a = new Double[N];
        for(int t = 0; t < T; t++){
            for(int i = 0; i < a.length; i++){
                a[i] = StdRandom.uniformDouble();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args){
        String alg1 = args[0];
        String alg2 = args[1];

        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);

        System.out.printf("For %d random Doubles\n    %s is", N, alg1);
        System.out.printf(" %.1f times faster than %s\n", t2/t1, alg2);

    }


}
