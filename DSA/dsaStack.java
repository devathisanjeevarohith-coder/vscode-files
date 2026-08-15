// collection of steps to solve a problem -> Algorithm
// Time and memory efficient way to solve a problem -> Data Structure

// Stack Data Structure
/* 
    LIFO -> Last In First Out
    push() -> add an element to the top of the stack
    pop() -> remove an element from the top of the stack
    peek() -> return the top element of the stack without removing it
    isEmpty() -> return true if the stack is empty, false otherwise
    size() -> return the number of elements in the stack
*/
import java.util.Stack;
public class dsaStack {
    public static void main(String args[]){
        Stack<String> stack = new Stack<>();
        
        stack.push("Minecraft");
        stack.push("Doom");
        stack.push("Spiderman");
        stack.push("Boderlands");
        stack.push("Subway Surfers");

        // If we pop all the objects in the stack, There will be none. 
        // It sometimes shows stack empty exception (or) [] <- Empty Braces
        String myfavgame = stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        
        System.out.println(stack.empty());
        System.out.println(myfavgame);
        System.out.println(stack);
        stack.push("Subway surfers");
        System.out.println(stack);

        // USE peek to know what is at the top of the stack
        System.out.println(stack.peek());

        // USE search to find the object inn the stack
        System.out.println(stack.search("Minecraft"));
        // It is indexed in reverse.
        System.out.print(stack.search("bodgame")); // not in stack -> returns negative 1(-1)

        // It is possible to get out of memory if u push the objects too many times like a billon
        
        // Use of stacks?
        // 1. Undo/Redo feautures in text editors
        // 2. Moving back/forward through browser history
        // 3. Background algorithms (maze,file directories)
        // 4. calling functions (call stacks)


    }
}