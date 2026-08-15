# Static methods :  A method that belongs to a class rather than any object
#                   from that class (instance). Usually used for general 
#                   utility functions.

# Instance variables : Best for operations on instances of the class (Objects)

# Static Methods : Best for utility functions that do not need access to class data


class Employee:

    def __init__(self, name, position):
        self.name = name
        self.position = position

    def get_info(self):
        return f"{self.name} = {self.position}"    
    
    @staticmethod
    def is_valid_position(position):
        valid_positions = ["Manager", "Cashier", "Cook", "Janitor"]
        return position in valid_positions


employee = Employee("Bob", "Manager")
employee1 = Employee("Nick", "Cook")
employee2 = Employee("Steve", "Cashier")
employee3 = Employee("Ishan", "Janitor")
employee4 = Employee("Ray", "Scientist")


print(employee.get_info())
print(employee1.get_info())
print(employee2.get_info())
print(employee3.get_info())
print(employee4.get_info())

print(Employee.is_valid_position("Rocket Scientist"))