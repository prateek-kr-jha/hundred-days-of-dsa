import java.util.Scanner;

public class client {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(5);
        System.out.println(ll.head.item);
        ll.printList();
    }
}
