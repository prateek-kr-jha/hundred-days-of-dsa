public class FixedCapacityStackOfString {
    private String[] stackOfStrings;
    private int size = 0;
    public FixedCapacityStackOfString(int n){
        stackOfStrings = new String[n];
    }

    public boolean isFull(){
        return size == stackOfStrings.length - 1;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public void push(String str){
        if(isFull()){
            System.out.println("Can't add, stack already full.");
            return;
        }
        stackOfStrings[size] = str;
        // stackOfStrings[size++] = str;
        size++; 
    }

    public String pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return "";
        }
        size--;
        String str = stackOfStrings[size];
        // String str = stackOfStrings[--size];

        return str;
    }

    public int size(){
        return size;
    }

    public void stackType(){
        System.out.println("Fixed Capacity Stack of string");
    }

}
