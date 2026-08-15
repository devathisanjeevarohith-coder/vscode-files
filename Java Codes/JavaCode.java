// Write a java program to define a class, define instance methods for setting and retrievning values of instance variables and instantiate its object

// class Student{
//     int id;
//     String name;

//     //Instance method to set values
//     void setValues(int id, String name){
//         this.id = id;
//         this.name = name;
//     }
//     void getvalues(){
//         System.out.println("ID: "+id+" | Name: "+name);
//     }
// }

// public class JavaCode {

//         public static void main(String[] args){
//         Student s1 = new Student();
//         s1.setValues(101, "Alice");
//         s1.getvalues();
//     }
// }

// Write a java program to implement Wrapper classes and their methods
// class JavaCode{
//     public static void main(String[] args) {
//         //  Converting primitive to wrapper (Auto Boxing)
//         int a =10;
//         Integer wrapperA = Integer.valueOf(a);

//         // Converting object to primitive (Unboxing)
//         int b = wrapperA.intValue();

//         System.out.println("Primitive a: "+a);
//         System.out.println("Wrapper Object wrapperA: "+wrapperA);
//         System.out.println("Unboxed Primitive b: "+b);

//         //  Wrapper class methods
//         String str = "1234";
//         int num = Integer.parseInt(str);
//         System.out.println("String str to Integer: "+num);
//         double c = 3.14;
//         String st = Double.toString(c);
//         System.out.println("Double c to String: "+st);
//         char ch = 'a';
//         boolean result = Character.isLetter(ch);
//         System.out.println("Is ch a letter? "+result);
//     }
// }

// write a java program to implement inheritance and demonstrate method overriding
// class BaseBank{
//     void getInterestRate(){
//         System.out.println("Base Interest Rate: 5%");
//     }
// }

// class SBI extends BaseBank{
//     @Override
//     void getInterestRate(){
//         System.out.println("SBI Interest Rate: 10%");
//     }
// }

// public class JavaCode {
//     public static void main(String[] args) {
//         BaseBank bank = new BaseBank();
//         bank.getInterestRate();

//         SBI sbi = new SBI();
//         sbi.getInterestRate();

//     }
// }


// interface shape{
//     void draw();
// }
// interface color{
//     void fill();
// }
// class Circle implements shape, color{
//     @Override
//     public void draw(){
//         System.out.println("Drawing a Circle");
//     }
//     @Override
//     public void fill(){
//         System.out.println("Filling the Circle with color");
//     }
// }
// class Rectangle implements shape, color{
//     @Override
//     public void draw(){
//         System.out.println("Drawing a Rectangle");
//     }
//     @Override
//     public void fill(){
//         System.out.println("Filling the Rectangle with color");
//     }
// }
// public class JavaCode {
//     public static void main(String[] args) {
//         Circle circle = new Circle();
//         circle.draw();
//         circle.fill();

//         Rectangle rectangle = new Rectangle();
//         rectangle.draw();
//         rectangle.fill();
//     }
// }

