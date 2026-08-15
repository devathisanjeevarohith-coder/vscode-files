public class dsaInterpolationSearch{
    public static void main(String[] args) {
        // Interpolation Search = Improvement over binary search best used
        //                          for "uniformly" distributed "guesses" where
        //                          a value might be based on calculated probe results
        //                          if probe is incorrectt, search area is narrowed
        //                          and new probe is calculated
        //                          average case: O(log(log(n)))
        //                          worst  case: O(n)   [value increase exponentially]

        int[] array = {1,2,4,8,16,32,64,128,256,512,1024};
        int index = interpolationSearch(array,256);
        
        if(index!=-1){
             System.out.println("The Element found at: "+index);
        }else{
            System.out.println("Element not found.");
        }



    }

    private static int interpolationSearch(int[] array, int value){
        //TODO
        int high = array.length - 1;
        int low = 0;
        while(value>=array[low] && value<= array[high] && low<=high){

            int probe = low + (high-low)* (value - array[low]) / (array[high] - array[low]);
            System.out.println("Probe: "+probe);

            if(array[probe]==value){
                return probe;
            }else if(array[probe]<value){
                low = probe + 1;
            }else{
                high = probe - 1;
            }

        }
        return -1;
    }
}