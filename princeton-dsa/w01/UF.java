package UFinterface;

public interface UF {
    public void union(int p, int q);

    public int count();

    public int find(int p);

    public boolean connected(int p, int q);
}
