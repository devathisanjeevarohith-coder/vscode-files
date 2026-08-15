
 public class dsaDynamicArray{
    public static class DynamicArray{
    int size;
    int capacity=10;
    Object[] array;
    public DynamicArray(){
        this.array = new Object[capacity];
    }
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data){
            if(size>=capacity){
                grow();
            }
            array[size] = data;
            size++;
    }
    public void insert(int index,Object data){
            if(size>=capacity){
                grow();
            }
            for(int i =size;i>index;i--){
                array[i] = array[i-1];
            }
            array[index] = data;
            size++;
    }
    public void delete(Object data){
        for(int i =0; i < size; i++){
            if(array[i]==data){
                for(int j=0;j<size-i-1;j++){
                    array[i+j] = array[i+j+1];
                }
                array[size-1] = null;
                size--;
                if(size<= (int)(capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }
    public int search(Object data){
        for(int i=0;i<size;i++){
            if(array[i]==data){
                return i;
            }
        }
        return -1;
    }
    private void grow(){
        int Newcapacity = (int)(capacity *2);
        Object[] newArray = new Object[Newcapacity];

        System.arraycopy(array, 0, newArray, 0, size);
        capacity = Newcapacity;
        array = newArray;
    }
    private void shrink(){
        int Newcapacity = (int)(capacity / 2);
        Object[] newArray = new Object[Newcapacity];

        System.arraycopy(array, 0, newArray, 0, size);
        capacity = Newcapacity;
        array = newArray;
    }
    private boolean isEmpty(){
        return size==0;
    }
    @Override
    public String toString(){
        String string = "";
        for(int i =0;i<capacity;i++){
            string += array[i] + ", ";
        }
        if(!string.isEmpty()){
            string = "["+string.substring(0,string.length()-2) + "]";
        }else{
            string = "[]";
        }
        return string;
    }
}
    public static void main(String args[]){
            // disadvantagee : capcacity cant be changed after instatiating once
            // size: 5 -- capacity: 5 (one NULL)  --> Example of Dynamic Array
            // can extend capacity
            // Advvantages:
            // 1. Random access of elements
            // 2. Good lacality of reference and data cache utilizaation
            // 3. Easier to insert/delete at the end.
            // Example code: new String[capacity*2]  --->> size= 5, capacity = 10
            // Disadvantages:
            // 1. Wastes mmore memory
            // 2. Shifting elements is time consuming.
            // 3. Expanding/Shrinking the array is time consumimng.

        //ArrayList<String> arryList = new ArrayList<String>();
        @SuppressWarnings("unused")
        DynamicArray arrayD = new DynamicArray(5);
        //System.out.println(arrayD.capacity);
        arrayD.add("A");
        arrayD.add("B");
        arrayD.add("C");
        arrayD.add("D");
        arrayD.add("E");

        arrayD.delete("A");
        arrayD.delete("B");
        arrayD.delete("B");

        arrayD.insert(0,"X");
        arrayD.delete("A");
        
        System.out.println("Is at Index: "+arrayD.search("C"));

        System.out.println(arrayD);
        System.out.println("Size: "+arrayD.size);
        System.out.println("Capacity: "+arrayD.capacity);
        System.out.println("Empty: " + arrayD.isEmpty());



    }
 }