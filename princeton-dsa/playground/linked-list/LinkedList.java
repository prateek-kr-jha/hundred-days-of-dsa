public class LinkedList<Item> {

    public class Node {

        Item item;
        Node next;

        public Node() {
            this.item = null;
            this.next = null;
        }

        public Node(Item item) {
            this.item = item;
            this.next = null;
        }

        public Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public Node head;
    public Node tail;
    private int size = 0;

    public LinkedList() {
        this.head = new Node();
        this.tail = this.head;
    }

    public LinkedList(Item item) {
        this.head = new Node(item);
        this.tail = this.head;
    }

    public void printList() {
        Node iterator = this.head;
        while (iterator != null) {
            System.out.println(iterator.item + " ");
            iterator = iterator.next;
        }
        System.out.println();
    }
}
