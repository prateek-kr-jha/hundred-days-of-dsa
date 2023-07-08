import java.util.Scanner;
public class RepeatedInt {
    public static Scanner scn = new Scanner(System.in);

    public void repeatedInt(int[] arr){

    }
    public static int main(String[] args){
        int num = Integer.parseInt(scn.nextLine());
        int[] arr = new int[num];
        int i = 0;
        while(scn.hasNext()){
            int read = Integer.parseInt(scn.next());
            arr[i++] = read;
        }

        for(int integer: arr){
            System.out.print(integer + "  ");
        }

        System.out.println();
    }
}