import java.util.Arrays;

class Stack{
    int[] a;
    int top;

    Stack(int size){
        a = new int[size];
        top = -1;
    }

    void push(int item){
        if(top == a.length - 1){
            System.out.println("Stack Overflow");
            return;
        }else{
            top = top + 1;
        }
        a[top] = item;
    }

    void pop(){
        int item;
        if(top == -1){
            System.out.println("Stack underflow");
        }else{
            item = a[top];
            top = top -1;
        }
    }


}
public class STACKEXAM{
    public static void main(String args[]){
        int[] data = {1,2,3,4,5,6};
        // Create stack with extra capacity for new pushes
        Stack st = new Stack(data.length + 2);
        // Push existing data into stack
        for(int v : data){
            st.push(v);
        }
        st.push(7);
        st.push(8);
        st.pop(); // removes 8
        // Print the original data array directly
        System.out.println(Arrays.toString(data));
    }
}