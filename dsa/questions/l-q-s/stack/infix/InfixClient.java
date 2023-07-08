import java.util.Scanner;


public class InfixClient {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args){
        Stack<String> operandStack = new Stack<String>();
        Stack<String> operatorStack = new Stack<String>();
        while(scn.hasNext()){
            String str = scn.next();
            // System.out.println(str);
            if(str.equals("+") || str.equals("*") || str.equals("-") || str.equals("/")){
                operatorStack.push(str);
            } else if(str.equals(")")){
                if(!operandStack.isEmpty() && !operatorStack.isEmpty()){
                    String expression = operandStack.pop();
                    expression = "(" + operandStack.pop() + " " + operatorStack.pop() + " " + expression + ")";
                    operandStack.push(expression);
                } else {
                    System.out.println("Nothing to pop (Extra bracket)");
                }
            } else {
                operandStack.push(str);
            }
            
        }

        String finalExpression = operandStack.pop();
        System.out.println(finalExpression);

    }
}