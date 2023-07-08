public class Queue<Item> {
    private class Node{
        Item item;
        Node next;

        public Node(Item item){
            this.item = item;
            next = null;
        }
    }

    private int size = 0;
    private Node head = null;
    private Node tail = null;
    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void enqueue(Item item){
        Node newTail = new Node(item);
        
        if(size == 0){
            tail = newTail;
            head = tail;
        } else {
            tail.next = newTail;
            tail = newTail;
        }
        size++;
    }

    public Item dequeue(){
        if(size == 0){
            return null;
        }
        Item returnItem = head.item;
        head = head.next;
        size--;
        return returnItem;

    }
    
}
