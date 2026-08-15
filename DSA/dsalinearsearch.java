public class dsalinearsearch{
    public static void main(String args[]){
        /* Linear search = Iterate through a collection one element at a time
                            
                            runtime complexity: O(n)
                            
                            Disadvantages:
                            Slow for large data sets
                            
                            Advantages:
                            Fast for search of small to medium data sets
                            Does not need to sorted
                            Useful for data structures that donot have random access (Linked List) */

        int[] array = {1,2,23,158,8,4,64,7};
        int index = linearSearch(array, 10);
        //System.out.println("Index: " + index);

        if(index!= -1){
            System.out.println("Element found at index: "+index);
        }
        else{
            System.out.println("Element not found.");
        }
    }

    private static int linearSearch(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}