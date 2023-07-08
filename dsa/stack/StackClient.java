import edu.princeton.cs.algs4.StdIn;
import java.util.Scanner;

public class StackClient {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args){
        Stack<String> stackOfString = new Stack<String>();
        stackOfString.stackType();// static way to call method is using class name instead of object name e.g. ResizingStack.stackType()
        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            if(item.equals("-")){
                // System.out.println("inside here");
                System.out.print(stackOfString.pop() + " ");
            } else {
                stackOfString.push(item);
            }

        }
        // while(scn.hasNext()){
        //     String word = scn.next();
        //     // str[i++] = word;
        //     if(word.equals("-")){
        //         // System.out.println("inside here");
        //         System.out.print(stackOfString.pop() + " ");
        //     } else {
        //         stackOfString.push(word);
        //     }
        // }



        System.out.println("(" + stackOfString.size() + " left on stack)");
    }
}
