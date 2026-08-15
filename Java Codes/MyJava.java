class Student{
            int id;
            String name;
            int age;
            // Default Constructor
            Student(){
                id = 0;
                name = "Unknown";
                age = 0;
            }
            // Parameterized Constructor
            Student(int id, String name){
                this.id =id;
                this.name = name;
                this.age = 0;
            }
            // Parameterized Constructor
            Student(int id, String name, int age){
                this.id = id;
                this.name = name;
                this.age = age;
            }
            //display
            void display(){
                System.out.println("ID: "+id+" | Name: "+name+" | Age: "+age);
            }
        }


public class MyJava{
    
    // public static class Groceries{
    //     int itemid;
    //     String itemName;
    //     double price;
    //     void display(){
    //         System.out.println("Item ID: "+itemid+ " | Item Name: "+itemName+" | Price: "+ price);
    //     }
    // }

    

    public static void main(String[] args){
        // int age= 20;
        // if(age>=18){
        //     System.out.println("Eligible to vote.");
        // }

        // int number = -5;
        // if(number>0){
        //     System.out.println("Positive Number");
        // }
        // else if(number<0){
        //     System.out.println("Negative Nummber");
        // }
        // else{
        //     System.out.println("Number is Zero.");
        // }


        // int day = 3;
        // switch(day){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     default -> System.out.println("Invalid day");    
        // }
        
        // // For loop
        // System.err.println("For loop");
        // for(int i=1;i<=5;i++){
        //     System.out.println(i);
        // }

        // System.out.println("While loop");
        // int i = 1;
        // while(i<=3){
        //     System.out.println(i);
        //     i++;
        // }

        // System.out.println("Do-While Loop");
        // int j=1;
        // do{
        //     System.out.println(j);
        //     j++;
        // }while(j<=3);

        // System.out.println("Break and Continue");
        // for(int k= 1;k<=5;k++){
        //     if(k==3){
        //         continue;
        //     }
        //     if(k==5){
        //         break;
        //     }
        //     System.out.println(k);
        // }

        // Write a java program to implement an array of Objects
        // Array of Objects
        // Groceries[] items = new Groceries[3];
        // //create objects
        // items[0] = new Groceries();
        // items[1] = new Groceries();
        // items[2] = new Groceries();
        // // Assign values
        // items[0].itemid = 1;
        // items[0].itemName = "Rice";
        // items[0].price = 50.0;

        // items[1].itemid = 2;
        // items[1].itemName = "Wheat";
        // items[1].price = 40.0;

        // items[2].itemid = 3;
        // items[2].itemName = "Dal";
        // items[2].price = 60.0;

        // // Display the details of each item
        // for(int i=0; i<3; i++){
        //     items[i].display();
        // }

        // Write a java program to demostrate String and String Functions
        //String creation
        // String str1 = "Hello, World!";
        // String str2 = "Java Programming";
        // // Display strings
        // System.out.println("String 1: " + str1);
        // System.out.println("String 2: " + str2);
        // // String length
        // System.out.println("Length of String 1: " + str1.length());
        // System.out.println("Length of String 2: " + str2.length());
        // // String Uppercase and Lowercase
        // System.out.println("Uppercase String 1: " + str1.toUpperCase());
        // System.out.println("Lowercase String 2: " + str2.toLowerCase());
        // // Character at specific index
        // System.out.println("Character at index 7 in String 1: " + str1.charAt(7));
        // // String Concatenation
        // String str3 = str1.concat("").concat(str2);
        // System.out.println("Concatenated String: " + str3);
        // // Compute Strings
        // System.out.println("Equals: " + str1.equals(str2));
        // System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("Hello World!"));
        // // substring
        // System.out.println("Substring of String 1 (0-5): " + str1.substring(0, 5));
        // //replace characters
        // System.out.println("Replace 'o' with 'x' in String 1: " + str1.replace('o', 'x'));
        // // check if string contains a void
        // System.out.println("Contains 'Java': " + str1.contains("Java"));
        // // Trim spaces
        // String str4 = "   Hello, Java!   ";
        // System.out.println("Trimmed String: '" + str4.trim() + "'");

        // wirte  a java program to define a class, describe its constructoe, overload the Constructors and instantiate its object
        Student s1 =new Student();
        Student s2 = new Student(101, "Alice");
        Student s3 = new Student(12, "Rohith", 18);
        s1.display();
        s2.display();   
        s3.display();

    }
}
