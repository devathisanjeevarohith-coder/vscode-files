import java.util.LinkedList;
import java.util.Queue;

public class dsaQueue{
    public static void main(String[] args) {
        // Queue --> First come First Served
        // First-in And First-Out [FIFO] UNLIKE Stack.
        // A collection designed for holdinng elements prior to  processing
        // Linear data Structure

        // add = enqueue, offer()       (alt)| add()
        // remove = dequeue, poll()     (alt)| remove()
        // examime = peek()             (alt)|element()
        // offer, poll, peek DONT throw exceptions and ALt throws exceptio

        //Queue<Strings> queue = new Queue<String>();
        // can't instanciate, cause it is interface.\
        // Cant instantiate Queue , causse of above reason

        Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("CHAD");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll(); // If we use element the java throws excpetion
        // In above case by using the "poll()" we can avoid getting the exceptions
        
        // Queue class extends the Collection class so we can use additonal methods.
        // related to the collection class

        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size()); // as we pop ' ed all objects
        
        queue.offer("Harold"); // added Harold
        System.out.println(queue.contains("Harold")); // donot give index, Boolean is returned

        // Where are queue's used?
        // 1. Keyborad Buffer (Letters should appear on the screen in the orfer they are pressed)
        // 2. Printer Queue (print jobs should be completed in Order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search




    }
}