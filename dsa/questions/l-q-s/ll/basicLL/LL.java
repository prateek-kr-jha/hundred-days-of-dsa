public class LL<Item>{
    private class Node{
        Item item;
        Node next;
        public Node(Item item){
            this.item = item;
            this.next = null;
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

    public void addFirst(Item item){
        Node newHead = new Node(item);
        newHead.next = head;
        head = newHead;
        size++;
        if(size == 1){
            tail = head;
        }
    }
    
    public void addLast(Item item){
        Node newTail = new Node(item);
        if(size == 0){
            head = newTail;
        } else {
            tail.next = newTail;
        }

        tail = newTail;
        size++;
    }

    public Item removeFirst(){
        if(size == 0){
            System.out.println("Nothing to remove");
        }

        Item returnItem = head.item;
        head = head.next;
        if(size == 1){
            tail = head;
        }
        size--;
        return returnItem;
    }

    public void printList(){
        Node iterator = head;
        while(iterator != null){
            System.out.print(iterator.item + "  ");
            iterator = iterator.next;
        }

        System.out.println();
    }

    public Item first(){
        return head.item;
    }

    public Item last(){
        return tail.item;
    }

    public Item delete(int k){
        int i = 2;
        Item item = null;
        if(size == 0 || k > size || k < 1){
            System.out.println("Nothing to remove");
            return item;
        }
        if(size != 0 && k == 1){
            return removeFirst();
        }
        Node i1 = head;
        Node i2 = head.next;
        while(i <= k && i2 != null){
            if(i == k){
                item = i2.item;
                i1.next = i2.next;
                size--;
                break;
            }
            i1 = i2;
            i2 = i2.next;
            i++;

        }
        return item;
    }

    public boolean find(Item item){
        Node iterator = head;
        boolean found = false;
        while(iterator != null){
            if(iterator.item.equals(item)){
                found = true;
                break;
            }

            iterator = iterator.next;
        }

        return found;
    }
}