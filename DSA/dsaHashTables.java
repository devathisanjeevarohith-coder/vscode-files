import java.util.*;

public class dsaHashTables{
    public static void main(String[] args) {

        // Hash Table: A data structure that stores unique krys to values ex.<Integer, String>
        //              Eack key/value pair is known as an Entry
        //              Fast insertion, look up, deletion of key/value pairs
        //              Not ideal for small data sets, great with large data sets

        // hashing : takes a key and computes an integer (formula will cary based on key & data type)
        //           In a Hashtable, we use the has % capacity to calculate an index number

        //              key..hashCode() % capacity = index

        // Bucket : and index storage location for one or more Entries.\
        //          can store multiple Entries in case of collisions (linked similarly like a LinkedList)

        // Collision :  hash function generates the same index for more than one key
        //              less collisions = more effficiency

        // Runtime complexity : Best Case O(1)
        //                      Worst Case O(n)

        // The code uses Hashtable, which is an obsolete/deprecated collection class in Java. The modern replacement is HashMap. 
        
        // Hashtable is a legacy class from Java 1.0 (obsolete/deprecated). HashMap is the modern, 
        // non-synchronized alternative that's faster for single-threaded use.
        // If thread-safety is needed, use ConcurrentHashMap.
        //  We use HashMap instead of Hashtable;


        HashMap<String, String> table = new HashMap<>(21);    

        table.put("100", "spongebob");
        table.put("123", "patric");
        table.put("321", "sandy");
        table.put("555", "squidward");
        table.put("777", "gary");

        //table.remove(777);

        for (String key : table.keySet()) {
            System.out.println("HashCode: "+ key.hashCode() % 21 +", Key: "+key+ ", Value: "+ table.get(key));
        }
        
        

    }
}