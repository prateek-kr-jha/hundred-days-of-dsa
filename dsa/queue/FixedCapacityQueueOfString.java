public class FixedCapacityQueueOfString {
    private String[] queue;
    private int size = 0;
    private int top = 0;
    private int last = 0;
    public FixedCapacityQueueOfString(int num){
        queue = new String[num];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == queue.length;
    }

    public int size(){
        return size;
    }
    
    public void enqueue(String str){
        if(isFull()){
            System.out.println("queue already full");
        }
        if(last == queue.length && size != queue.length){
            last = 0;
        }
        queue[last++] = str;
        size++;
    }

    public String dequeue(){
        if(isEmpty()){
            System.out.println("nothing to remove");
        }
        System.out.println(isEmpty() + " size: " + size);
        if(top == queue.length){
            top = 0;
        }
        String dequeued = queue[top++];
        queue[top - 1] = null;
        size--;
        return dequeued;
    }
}
