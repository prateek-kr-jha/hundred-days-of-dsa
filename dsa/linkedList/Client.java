import java.util.Scanner;

public class Client {
    static Scanner scn = new Scanner(System.in);
    // public static void commonTest(LinkedList<Item> list){

    // }
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        // System.out.println(list.first() + " head");
        // System.out.println(list.size() + " size");
        // System.out.println(list.last() + "  tail");
        // System.out.println(list.isEmpty() +" empty");

        // if(list.first() != null){
        //     System.out.println(list.first().getItem() + "  first item");
        // }

        // if(list.last() != null){
        //     System.out.println(list.first().getItem() + "  last item");

        // }

        // System.out.println(list.removeFirst() + "  remove first");
        // list.printAll();
        list.addFirst(1);
        // Node<> first = list.first();
        System.out.println(list.first());
        System.out.println(list.size() + " size");
        System.out.println(list.last() + "  tail");
        System.out.println(list.isEmpty() +" empty");

        // if(list.first() != null){
        //     System.out.println(list.first().getItem() + "  first item");
        // }

        // if(list.last() != null){
        //     System.out.println(list.first().getItem() + "  last item");

        // }

        System.out.println(list.removeFirst() + "  remove first");
        list.printAll();
        // while(scn.hasNextLine()){
        //     int number = Integer.parseInt(scn.nextLine());
        // }
    }
}
