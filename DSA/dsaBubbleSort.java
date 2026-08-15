public class dsaBubbleSort{
    public static void main(String[] args) {
        // THIS sort compares the elements valuue by taking a temperory variable and comaring it to adjacent indexx which could have some element valued higher or lower than the temporary element
        // This compares the elements by taking a temp variable and SORTS the array
        // This is used for small arrays containg some managable data
        
        //Bubble Sort = pairs of adjacent elements are compared, and 
        //              the elements swapped if they're not in order.
        //              Quadratic time O(n)
        //              small data set = Okay-ish
        //              large data set = BAD

        int array[] = {9,1,8,2,7,3,6,4,5};
        // Intoducing Bubble Sort method
        bubbleSort(array);

        for(int i =0; i<array.length;i++){
            System.out.print(i);
        }
    }
    public static void bubbleSort(int array[]){
        for (int i=0; i< array.length; i++) {
            for(int j= 0; j< array.length -1; j++){
                if(array[j] > array[j+1]/*It is for ascending order,
                     you can use '<' for descending order */){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}