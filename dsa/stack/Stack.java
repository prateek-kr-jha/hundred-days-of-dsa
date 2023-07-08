public class Stack<Item> {
    private class Node{
        Item item;
        Node next;
    }

    private int size = 0;
    private Node top = null;


    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void push(Item item){
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = top;
        top = newNode;
        size++;
    }

    public Item pop(){
        if(isEmpty()){
            System.out.println("Nothing to pop");
        }
        Item popped = top.item;
        top = top.next;
        size--;
        return popped;
    }

    public void stackType(){
            System.out.println("LinkedList Stack");
    }
}