class Parent{
    void display(){
        System.out.println("Parent class.");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("Child class.");
    }
}
public class InheritanceDemo{
    public static void main(String[] args){
        Parent p = new Parent();
        p.display();
        Child c;
        c = new Child();
        c.display();
    }
}