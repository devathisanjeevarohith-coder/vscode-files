public class dsaRecursion{
    public static void main(String args[]){
        /* Recursion = When a thing is deffined in terms of itself.
                        Apply the result of a procedure, to a procedure.
                        A recursive method calls itself. Can be a substitute for iteration.
                        Divide a problemm into si=ub-problems of same type as the original.
                        Commonly used with advanced sorting algorithms and navigating trees
                        
                        Advantages :
                        1. Easier to read/ write
                        2/ Easier to debug
                        
                        Disadvantages:
                        1. Sometimes slower
                        2. Uses more memory
        */

       walk(5); // Iteration
       walking(5);
       System.out.println(factorial(5));
       
       System.out.println((int)power(5,3));
       

    }
    //Iteration
    private static void walk(int steps){
        for(int i=0; i< steps; i++){
            System.out.println("You take a step "+i);
        }
    }

    // Recurssion
    private static void walking(int step){
        if(step<1){
            return;
        }
        System.out.println("You take a step!.");
        walking(step -1);
    }
    
    // recursion way
    private static int factorial(int n){
        if(n<1){
            return 1;
        }
        return n*factorial(n-1);
    }

    private static int power(int base, int power){
        if(power<1) return 1;
        if(base<1){
            return 1;
        }
        return base*(power(base, power - 1));
    }
}