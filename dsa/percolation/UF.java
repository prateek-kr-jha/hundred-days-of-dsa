public class UF {
    private int[] id;
    private int count;
    private int[] size;
    public UF(int num){
        count = num;
        id = new int[num];
        size = new int[num];
        for(int i = 0; i < id.length; i++){
            id[i] = i;
            size[i] = 1;
        }
    }

    public int count(){
        return count;
    }

    private int root(int p){
        if(id[p] == p){
            return p;
        }
        return root(id[p]);
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

    public void printId(){
        for(int i = 0; i < id.length; i++){
            System.out.print(id[i] + "  ");
        }
        System.out.println();
    }

}