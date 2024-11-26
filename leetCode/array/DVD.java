public class DVD{
    public String name;
    public int releaseYear;
    public String director;

    public  DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }
    public static void main(String[] args) {
        DVD rajaBabu = new DVD("raja babu", 2003, "David Dhawan");
        System.out.println(rajaBabu.toString());
        DVD[] dvdCollection = new DVD[15];
    }
}