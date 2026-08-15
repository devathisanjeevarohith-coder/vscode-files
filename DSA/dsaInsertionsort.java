public class dsaInsertionsort{
    public static void main(String argss[]){
        // Selection sort = after comparing the elements to the left
        //                  shifts elements to the right to make room to insert a value
        //                  Quadratic time O(n^2)
        //                  small data = decent
        //                  large data = BAD
        //                  less steps than Bubble sort
        //                  Best case is O(n) compared to Selection Sort O(n^2)
        
        
        int array[] = {8,7,9,2,3,1,5,4,6};
        insertionSort(array);

        for(int i: array){
            System.out.print(i);
        }
    }
    private static void insertionSort(int[] array){
        for(int i =1; i< array.length ;i++){
            int temp = array[i];
            int j = i -1;
            while(j>= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}