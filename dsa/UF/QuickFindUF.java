public class QuickFindUF {
    private int[] id;
    private int count;
    public QuickFindUF(int num){
        this.id = new int[num];
        for(int i = 0; i < num; i++){
            id[i] = i;
        }
        this.count = num;
    }
    public boolean connected(int p, int q){
        return id[p] == id[q];
    }
    public void union(int p, int q){
        if(connected(p, q)){
            return;
        }
        int idP = id[p];
        int idQ = id[q];
        for(int i = 0; i < count; i++){
            if(id[i] == idP){
                id[i] = idQ;
            }
        }
    }

    public int count(){
        return count;
    }

    public void printConnections(){
        for(int i = 0; i < count; i++){
            System.out.print(id[i] + "  ");
        }
        System.out.println();
    }
}
