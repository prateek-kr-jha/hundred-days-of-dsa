public class toBinary {
    public static void main(String[] args){
        int number = Integer.parseInt(args[0]);
        String binary = "";
        while(number != 0){
            binary = (number % 2) + binary;
            number = number / 2;
        }

        System.out.println(binary);
    }
}
