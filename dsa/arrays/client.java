import java.util.Scanner;

public class client {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hi, there " + args[0]);
        int[] testArray = helper.createArrayWithInput(scn.nextInt(), scn);

        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }
}
