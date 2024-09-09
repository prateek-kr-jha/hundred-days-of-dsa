import java.util.Scanner;

public class client {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.printList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.printList();

        ll.addFirst(3);
        ll.addFirst(10);
        ll.printList();
    }
}
