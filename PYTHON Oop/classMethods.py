# Class Methods : Allows operations related to the class itself
#                 Take (cls) as the first parameter, which reperesents
#                 the class itself.


class Student:

    count = 0
    total_gpa = 0

    def __init__(self, name, gpa):
        self.name = name
        self.gpa = gpa
        Student.count +=1
        Student.total_gpa += gpa


    # Instance Method
    def get_info(self):
        return f"{self.name} {self.gpa}"
    

    @classmethod
    def get_count(cls):
        return f"Total no. of Students: {cls.count}"
    

    @classmethod
    def get_average_gpa(cls):
        if cls.count == 0:
            return 0
        else:
            return f"Average gpa: {cls.total_gpa/cls.count:.2f}"

student = Student("Mahi", 4.5)
student1 = Student("Bob", 7.8)
student2 = Student("Nick", 9.0)

print(student.get_count())
print(student.get_average_gpa())
print(student.get_info())
    








