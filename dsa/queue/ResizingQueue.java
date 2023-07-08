public class ResizingQueue<Item> {
    private Item[] queue = (Item[])new Object[1];
    private int size = 0;
    private int top = 0;
    private int last = 0;
    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    private void resize(){
        int newLength = queue.length * 2;
        Item[] newQueue = (Item[])new Object[newLength];
        for(int i = 0; i < queue.length; i++){
            newQueue[i] = queue[i];
        }

        queue = newQueue;
    }

    private void downSize(){
        int newLength = queue.length / 2;
        Item[] newQueue = (Item[])new Object[newLength];
        for(int i = top; i < last; i++){
            newQueue[i - top] = queue[i];
        }
        last = last - top;
        top = 0;
        queue = newQueue;
    }

    public void enqueue(Item item){
        if(size == queue.length){
            resize();
        }
        queue[last++] = item;
        size++;
    }

    public Item dequeue(){
        Item returnItem = queue[top++];
        queue[top - 1] = null;
        size--;
        if((double)size == queue.length/ 4.0){
            downSize();
        }

        return returnItem;

    }


}
