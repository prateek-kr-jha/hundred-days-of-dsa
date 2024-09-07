import java.util.Scanner;

public class client {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hi, there " + args[0]);
        String l = scn.nextLine();
        System.out.println("bye " + l);
    }
}
