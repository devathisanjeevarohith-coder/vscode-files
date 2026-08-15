class Student{
    int rollno;
    String name;
    void setValues(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    void getValues(){
        System.out.println(rollno+ " "+ name);
    }
}
public class InstanceMethodDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setValues(1223,"Rohith");
        s1.getValues();

    }
}