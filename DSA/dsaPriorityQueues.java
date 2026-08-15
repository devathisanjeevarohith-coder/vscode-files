import java.util.*;

public class dsaPriorityQueues{
    public static void main(String[] args) {
        // Priority Queue   =   A FIFO data structure that servers elements
        //                      with the highest priorites first before 
        //                      elements with lower priority

        Queue<Double> queue = new PriorityQueue<>(/*Collections.reverseOrder()*/);
        // By using priority queues --> we display the results in order instead of FIFO
        // can use reverseOrder() method  for descending order. instead of the ascending order without passing any methods.
        queue.offer(3.0);
        queue.offer(1.0);
        queue.offer(5.0);
        queue.offer(2.0);
        queue.offer(7.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
            // Removing each element follwed by display one-by-one
        }


        Queue<String> q = new PriorityQueue<>(/*Collections.reverseOrder()*/);
        q.offer("B");
        q.offer("C");
        q.offer("A");
        q.offer("F");
        q.offer("D");

        while(!q.isEmpty()){
             if(q.contains("A")){
                System.out.println("Gold Gold Gold");
            }
            System.out.println(q.poll());
            // Removing each element follwed by display one-by-one
           
        }

    }
}