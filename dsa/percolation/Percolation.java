import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private boolean[][] matrix;
    private int size;
    private  WeightedQuickUnionUF ufArray;
    private int openSites = 0;

    public Percolation(int num){
        if(num <= 0){
            throw new IllegalArgumentException("the number should be grater than 0");
        }
        matrix = new boolean[num][num];
        size = num;
        ufArray = new WeightedQuickUnionUF((num * num) + 2);
    }

    private int block(int row, int col){
        return (size * row) + col + 1;
    }

    private void connect(int row, int col){
        int block = block(row, col);
        if(row == 0){
            ufArray.union(0, block);
        }
        if(row == (size - 1)){
            ufArray.union((size * size) + 1, block);
        }

        if(row - 1 >= 0 && matrix[row - 1][col]){
            ufArray.union(block(row - 1, col), block);
        }
        if(row + 1 < size  && matrix[row + 1][col]){
            ufArray.union(block(row + 1, col), block);
        }
        if(col - 1 >= 0 && matrix[row][col - 1]){
            ufArray.union(block(row, col - 1), block);
        }

        if(col + 1 < size && matrix[row][col + 1]){
            ufArray.union(block(row, col + 1), block);
        }
        
        

    }

    public void open(int row, int col){
        row = row - 1;
        col = col - 1;
        if(matrix[row][col]){
            return;
        }
        matrix[row][col] = true;
        connect(row, col);
        openSites++;
    }

    public boolean isOpen(int row, int col){
        row = row - 1;
        col = col - 1;
        return matrix[row][col];
    }

    public boolean isFull(int row, int col){
        row = row - 1;
        col = col - 1;
        int location = block(row, col);
        // return ufArray.connected(0, location);
        return ufArray.find(0) == ufArray.find(location);
    }


    public int numberOfOpenSites(){
        return openSites;
    }

    public boolean percolates(){
        // return ufArray.connected(0, ((size * size) + 1));
        return ufArray.find(0) == ufArray.find((size * size) + 1);
    }
    
}
