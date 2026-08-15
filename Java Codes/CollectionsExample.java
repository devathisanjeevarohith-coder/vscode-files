import java.util.*;
class Student{
    int id;
    String name;
    double marks;
    Student(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString(){
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}
public class CollectionsExample{
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 85.5));
        students.add(new Student(2, "Bob", 78.0));
        students.add(new Student(3, "Charlie", 92.3));
        for(Student s : students){
            System.out.println(s);
        }
        students.sort(Comparator.comparingDouble(s -> s.marks));
        System.out.println("\nStudents sorted by marks:");
        for(Student s : students){
            System.out.println(s);
        }

    }
}

