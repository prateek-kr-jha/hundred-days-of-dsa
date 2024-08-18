import UFinterface.UF;

public class quickFind implements UF {

    public void union(int p, int q) {}

    public int count() {
        return 0;
    }

    public int find(int p) {
        return 1;
    }

    public boolean connected(int p, int q) {
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
