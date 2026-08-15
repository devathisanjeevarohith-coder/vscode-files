import java.util.ArrayList;
import java.util.LinkedList;

public class dsaLinkedlistsVsArraylists {
    public static void main(String args[]){
     
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime;
        long endTime;
        long elapsedTime;
        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        /*Linked list*/
        startTime = System.nanoTime();
        linkedList.addFirst(12);
        System.out.println(linkedList);
        
        //do something
        linkedList.get(0);
        linkedList.get(500000);
        linkedList.get(999999);
        linkedList.remove(0);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("LinkedList: "+elapsedTime+ " ns");

        // ArrayList
        startTime = System.nanoTime();
        System.out.println(arrayList);
        //do something
        arrayList.get(0);
        arrayList.get(500000);
        arrayList.get(999999);
        arrayList.remove(0);

        endTime = System.nanoTime();

        long elapsedTimeArray = endTime - startTime;
        System.out.println("ArrayList: "+elapsedTimeArray+ " ns");
    }
}