import java.util.LinkedList;

public class dsaLinkedLists{
    public static void main(String[] args) {
        //Queue<String> queue = new LinkedList<>();
        // LinkedList are not much useful and timesaving when it comes to searchinf of an element in the lists
        // But it helps in shifting the direction of one element to another without much time.
        // Insertion and Deletion becomes easy and timesaving compared to the arraylists.

        // LinkedLists have two types
        // Uni-directional and Doubly LinkedLists
        // 1st one goes in one direction(only forward at an instance) whereas Doubly goes both ways(forward and backward)
        // Doubly uses more memory than singly LinkedList.

        LinkedList<String> linkedlist = new LinkedList<>();
        // LinkedList as a stack.
        // linkedlist.push("A");
        // linkedlist.push("B");
        // linkedlist.push("C");
        // linkedlist.push("D");
        // linkedlist.push("F");
        
        // linkedlist.pop();

        //linked lists as a Queue
        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("F");
        
        //linkedlist.poll();
        linkedlist.add(4,"E");
        linkedlist.remove("E");
        
        System.out.println(linkedlist.peekFirst());
        System.out.println(linkedlist.peekLast());
        linkedlist.addFirst("0");
        linkedlist.addLast("G");

        // String first = linkedlist.removeFirst();
        // String last  = linkedlist.removeLast();

        System.out.println(linkedlist);
        System.out.println(linkedlist.indexOf("F"));


    }
}