
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
static int age;
void display(){
    System.out.println("Your age is : "+age);
}
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age: ");
    this.age = sc.nextInt();
    display();
}