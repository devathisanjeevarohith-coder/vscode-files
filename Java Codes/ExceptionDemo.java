public class ExceptionDemo{
    public static void main(String[] args){
        try{
            int a = 10 / 0;
            System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException: "+e.getMessage());
        }finally{
            System.out.println("This block will always execute.");
        }
    }
}