import java.util.Scanner;
public class ListClient {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args){
        String[] str = new String[14];
        String word;
        int i = 0;
        while(scn.hasNext()){
            word = scn.next();
            str[i++] = word;
        }

        for(String s: str){
            System.out.println(s);
        }

    }

}
