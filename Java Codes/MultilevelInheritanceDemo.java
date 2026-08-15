class Grandparent{
    @SuppressWarnings("unused")
    void display(){
        System.out.println("Grandparent");
    }
}
class Parent extends Grandparent{
    @Override
    void display(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("Child");
    }
}
public class MultilevelInheritanceDemo {
    public static void main(String[] args){
        Child c = new Child();
        c.display();
    }
}