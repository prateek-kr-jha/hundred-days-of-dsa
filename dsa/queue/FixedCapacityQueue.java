public class FixedCapacityQueue<Item> {
    private Item[] queue;
    private int size = 0;
    private int top = 0;
    private int last = 0;
    public FixedCapacityQueue(int num){
        queue = (Item[])new Object[num];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public boolean isFull(){
        return size == queue.length;
    }

    public void enqueue(Item item){
        if(isFull()){
            System.out.println("Queue already full");
            return;
        }
        // if(last == queue.length){
        //     last = 0;
        // }
        queue[last++] = item;
        size++;
    }

    public Item dequeue(){
        if(isEmpty()){
            System.out.println("Nothing to return");
            return null;
        }
        Item dequeued = queue[top++];
        queue[top - 1] = null;
        size--;
        return dequeued;
    }
}
