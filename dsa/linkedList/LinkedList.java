public class LinkedList<Item>{
    public static class Node<Item>{
        private Item item;
        private Node<Item> next;
        public Node(Item item, Node<Item> next){
            this.item = item;
            this.next = next;
        }

        public Node(Item item){
            this.item = item;
            this.next = null;
        }

        public Node(Node<Item> node){
            this.item = node.item;
            this.next = node.next;
        }

        public Item getItem(){
            return item;
        }

        public Node<Item> getNext(){
            return next;
        }

        public void setNext(Node<Item> next){
            this.next = next;
        }
    }

    private Node<Item> head = null;
    private int size = 0;
    private Node<Item> tail = null;
    public LinkedList(){

    }

    public int size(){
        return size;
    }

    public Item first(){
         if (isEmpty())
            return null;
        return head.getItem();
    }

    public Item last(){
         if (isEmpty())
            return null;
        return tail.getItem();
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(Item item){
        head = new Node<>(item, head);
        if(size == 0){
            this.tail = this.head;
        }
        size++;
    }

    public void addLast(Item item){
        Node<Item> newTail = new Node<Item>(item);
        if(size == 0){
            this.head = newTail;
        } else {
            this.tail.setNext(newTail);
        }
        this.tail = newTail;
        size++;
    }

    public Item removeFirst(){
        if(isEmpty()){
            return null;
        }
        Item currHead = this.head.getItem();
        this.head = this.head.getNext();
        this.size--;
        if(size == 0){
            this.tail = null;
        }

        return currHead;
    }

    public Item removeLast(){
        if(isEmpty()){
            return null;
        }
        //can't do since singly linked list
        return null;
    }

    public void printAll(){
        if(isEmpty()){
            System.out.println("No item");
            return;
        }

        Node<Item> toPrint = this.head;
        int i = 1;
        do{
            System.out.println(toPrint.getItem() + " is " + i + " element.");
            toPrint = toPrint.getNext();
        } while(toPrint != null);
    }

    
}