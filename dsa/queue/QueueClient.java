import edu.princeton.cs.algs4.StdIn;
public class QueueClient {
    public static void main(String[] args){
        Queue<String> q = new Queue<String>();
        // ResizingQueue<String> q = new ResizingQueue<String>();
        // FixedCapacityQueueOfString q = new FixedCapacityQueueOfString(3);


        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            if(!item.equals("-")){
                q.enqueue(item);
            } else if(!q.isEmpty()){
                System.out.print(q.dequeue() + " ");
                // q.dequeue();
            } else {
                // System.out.println(" raju queue is empty");
            }
            
        }

        System.out.println("(" + q.size() + " left on queue)");
        System.out.println(q.isEmpty());
    }
}