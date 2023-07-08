public class QuickUnionUF {
    private int[] id;
    private int count;
    public QuickUnionUF(int num){
        id = new int[num];
        for(int i = 0; i < num; i++){
            id[i] = i;
        }

        count = num;
    }

    public int count(){
        return count;
    }

    private int root(int p){
        if(id[p] == p){
            return p;
        }
        int root = root(id[p]);
        return root;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int rootP = root(p);
        int rootQ = root(q);
        id[rootP] = rootQ;
    }
    
    public void printConnections(){
        for(int i = 0; i < count; i++){
            System.out.print(id[i] + "  ");
        }
        System.out.println();
    }
}
