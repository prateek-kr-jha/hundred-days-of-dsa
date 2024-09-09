public class LinkedList<Item> {

    public class Node {

        Item item;
        Node next;

        public Node() {}

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
        this.head = null;
        this.tail = this.head;
    }

    public LinkedList(Item item) {
        this.head = new Node(item);
        this.tail = this.head;
    }

    public void printList() {
        Node iterator = this.head;
        while (iterator != null) {
            System.out.print(iterator.item + " ");
            iterator = iterator.next;
        }
        System.out.println();
    }

    public void addFirst(Item item) {
        Node newNode = new Node(item);
        newNode.next = this.head;
        this.head = newNode;
        if (size == 0) {
            this.tail = this.head;
        }
        this.size++;
    }
}
