import java.util.Scanner;

public class findElement {

    private static boolean hasElement(int num, int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == num) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int[] inputArray = new int[scn.nextInt()];
        int toFind = scn.nextInt();

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scn.nextInt();
        }

        if (hasElement(toFind, inputArray)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
