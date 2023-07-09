public class WeightedUF {
    private int[] id;
    private int[] size;
    private int count = 0;
    public WeightedUF(int num){
        id = new int[num];
        size = new int[num];
        for(int i = 0; i < id.length; i++){
            id[i] = i;
            size[i] = 1;
        }
        count = num;
    }

    public int count(){
        return count;
    }

    private int root(int i){
        if(id[i] == i){
            return i;
        }
        int root = root(id[i]);
        return root;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int rootP = root(p);
        int rootQ = root(q);
        if(size[rootP] < size[rootQ]){
            id[rootP] = rootQ;
            size[rootQ] += size[rootP];
        } else {
            id[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }

        count--;
    }

    public void printConnections(){
        for(int i = 0; i < id.length; i++){
            System.out.print(id[i] + "  ");
        }
        System.out.println();
        for(int i = 0; i < id.length; i++){
            System.out.print(size[i] + "  ");
        }
        System.out.println();

    }
     
}
