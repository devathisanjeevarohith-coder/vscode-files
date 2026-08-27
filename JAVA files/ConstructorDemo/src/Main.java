import java.util.*;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("------CALCULATOR-------");
    System.out.print("Enter the first number : ");
    double NUM1 = sc.nextDouble();
    System.out.print("Enter the second number: ");
    double NUM2 = sc.nextDouble();
    System.out.print("Select the operator ( + , - , * , /) : ");
    String ch = sc.nextLine();
    switch (ch) {
        case "+" -> System.out.println("Addition : " + (NUM1 + NUM2));
        case "-" -> System.out.println("Substraction : " + (NUM1 - NUM2));
        case "*" -> System.out.println("Multiplication : " + (NUM1 * NUM2));
        case "/" -> System.out.println("Division : " + (NUM1 / NUM2));
        default -> System.out.println("Error. Choose the opertor from the given..");
    }
    sc.close();
}