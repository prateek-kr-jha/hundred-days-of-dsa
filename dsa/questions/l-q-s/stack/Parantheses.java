import java.util.Scanner;
public class Parantheses {
    public static Scanner scn = new Scanner(System.in);

    public static boolean parenthesesCompare(String str1, String str2){
        switch (str1){
            case ")":
                return str2.equals("(");
            case "}":
                return str2.equals("{");
            case "]":
                return str2.equals("[");
            default:
                return false;
        }
    }
    public static void main(String[] args){
        boolean isBalanced = false;
        Stack<String> stack = new Stack<String>();
        while(scn.hasNext()){
            String str = scn.next();
            if(str.equals(")") || str.equals("}") || str.equals("]")){
                if(stack.isEmpty()){
                    break;
                } else {
                    String topOfStack = stack.pop();
                    isBalanced = parenthesesCompare(str, topOfStack);
                    if(!isBalanced){
                        break;
                    }
                }
            } else {
                stack.push(str);
            }
        }
        isBalanced = stack.isEmpty() && isBalanced;
        System.out.println(isBalanced + " balanced");
    }
}
