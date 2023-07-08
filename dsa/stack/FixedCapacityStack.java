public class FixedCapacityStack<Item> {
    private int size = 0;
    private Item[] fixedStack;
    public FixedCapacityStack(int n){
        fixedStack =  (Item[]) new Object[n];
    }
    public boolean isFull(){
        return size == fixedStack.length - 1;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public void push(Item item){
        if(isFull()){
            System.out.println("Stack already full");
            return;
        }
        fixedStack[size++] = item;
    }

    public Item pop(){
        if(isEmpty()){
            // throw new Exception("empty stack");
            System.out.println("Stack already empty");
        }
        return fixedStack[--size];
    }
    public int size(){
        return size;
    }

    public void stackType(){
        System.out.println("Fixed Capacity Stack");
    }

}
