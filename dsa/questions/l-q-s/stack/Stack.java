public class Stack<Item>{
    private class Node{
        Item item;
        Node next;
        public Node(Item item){
            this.item = item;
            this.next = null;
        }
    }
    private Node top =null;
    private int size = 0;

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void push(Item item){
        Node newTop = new Node(item);
        newTop.next = top;
        top = newTop;
        size++;
    }

    public Item pop(){
        Item returnItem = top.item;
        top = top.next;
        size--;

        return returnItem;
    }

    public void top(){
        System.out.println(top.item);
    }
}