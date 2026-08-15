interface shape{
    void draw();
}
interface color{
    void fill();
}
class Circle implements shape,color{
    @Override
    public void draw(){
        System.out.println("Drawing Circle");
    }
    
    @Override
    public void fill(){
        System.out.println("Filling Circle with color");
    }
}
public class InterfaceDemo {
    public static void main(String[] args){
        Circle c = new Circle();
        c.draw();
        c.fill();
    }
}