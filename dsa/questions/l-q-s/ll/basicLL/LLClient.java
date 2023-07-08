import java.util.Scanner;
public class LLClient {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        LL<String> list = new LL<String>();
        System.out.println(list.isEmpty());
        while(scn.hasNext()){
            String str = scn.next();
            if(str.equals("-")){
                String removed = list.removeFirst();
                System.out.println("Removed item : " + removed);
            } else if(Integer.parseInt(str) < 6){
                list.addFirst(str);
            } else {
                list.addLast(str);
            }
        }

        list.printList();
        System.out.println("Size : " + list.size());
        System.out.println("First : " + list.first());
        System.out.println("Last : " + list.last());
        System.out.println("Found 1:" + list.find("1"));
        System.out.println("Deleted : " + list.delete(6));
        System.out.println("Found 1:" + list.find("1"));

        list.printList();
        
    }
}
