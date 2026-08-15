# Class Variables = Shared among all the instances of a class
#                   Defined outside the constructor
#                   Allow you to share data among all objects created from that class

class Student:

    class_year = 2024
    num_students = 0

    def __init__(self, name, age):
        self.name = name
        self.age = age
        Student.num_students += 1   # When using the class Variables 


student1 = Student("Spongebob", 30)
student2 = Student("Patrick", 35)
student3 = Student("squid", 25)

print(student1.name)
print(student1.age)

print(student1.class_year)
print(student2.class_year)
print(Student.class_year)

print(student1.name, " ",student2.name, " ", student3.name,
      "No of students: ", Student.num_students, "->" ,
      Student.class_year )





