import java.util.Arrays;

public class dsaBinarySearch{
    public static void main(String[] args) {
        // Binary Search = Search algorithm that finds position of a
        //                  target value within a sortedd array.
        //                  Half of the array is eliminated during each "step"
        //      Advantages --> Efficient when searching through large data

        int array[] = new int[1000000];
        int target = 777777;
        for(int i=0; i<array.length;i++){
            array[i] = i;
        }

        int index1 = Arrays.binarySearch(array,target);
        int index =  binarySearch(array,target);
        
        if(index1==-1){
            System.out.println(target +"Not Found");
        }else{
            System.out.println("Element Found at index: "+index);
        }


        if(index==-1){
            System.out.println(target +"Not Found");
        }else{
            System.out.println("Element Found at index: "+index);
        }



    }
    private static int binarySearch(int[] array, int target){
        //TODO
        int low = 0;
        int high = array.length -1;
        while(low<=high){
            int middle = low + (high - low) / 2;
            int value = array[middle];
            System.out.println(middle+" <--Middle Value");
            
            if(value<target){
                low = middle+1;
            }else if(value> target){
                high = middle -1;
            }else{
                return middle; // Target is found
            }
        }
        return -1;  // Target not found
    }
}