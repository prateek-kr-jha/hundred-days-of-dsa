import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class PercolationStats {
    private int size;
    private double[] experiments;
    private int trials;
    public PercolationStats(int n, int trials){
        if(n <= 0 || trials <= 0){
            throw new IllegalArgumentException("Both arguments should be greater than zero");
        }
        size = n;
        experiments = new double[trials];
        this.trials = trials;
        for(int i = 0; i < experiments.length; i++){
            Percolation uf = new Percolation(size);
            while(!uf.percolates()){
                int k = StdRandom.uniformInt(1, n+1);
                int j = StdRandom.uniformInt(1, n+1);
                if(!uf.isOpen(k, j) && !uf.isFull(k, j)){
                    uf.open(k, j);

                }
            }
            experiments[i] = (double) uf.numberOfOpenSites() / (size * size);
        }

    }

    public double mean(){
        return StdStats.mean(experiments);
    }

    public double stddev(){
        return StdStats.stddev(experiments);
    }

    public double confidenceLo(){
        return (mean() - (1.96 * stddev())) / Math.sqrt(trials);
    }

    public double confidenceHi(){
        return (mean() + (1.96 * stddev())) / Math.sqrt(trials);
    }


    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        PercolationStats ps = new PercolationStats(n, trials);
        System.out.println("mean                    = " + ps.mean());
        System.out.println("stddev                  = " + ps.stddev());
        System.out.println("95% confidence interval = [" + ps.confidenceLo() + ", " + ps.confidenceHi() + "]");

    }
}
