public class Stack<Item>{
    private class Node{
        Item item;
        Node next;
        public Node(Item item){
            this.item = item;
            this.next = null;
        }
    }

    private int size = 0;
    private Node top = null;

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public Item peek(){
        return top.item;
    }

    public void push(Item item){
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public Item pop(){
        Item returnItem = top.item;
        top = top.next;
        size--;
        return returnItem;
    }

    public void printStack(){
        Node iterator = top; 
        while(iterator != null){
            System.out.println(iterator.item);
            iterator = iterator.next;
        }
    }

}