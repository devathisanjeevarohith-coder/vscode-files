# Nested Classes : A class defined within another class
#                   class Outer:
#                       class Inner:

# Benefits : Allows you to logically group classes that are closely related
#            Encapsulates private details that aren't relevant outside of
#            outer class.
#    Keeps the namespace clean, reduces the possibility of making conflicts.


class Company:
    class Employee:
        def __init__(self, name, position):
            self.name = name
            self.position = position

        def get_details(self):
            return f"{self.name} {self.position}"
        
    def __init__(self, company_name):
        self.company_name = company_name
        self.employees = []

    def add_employee(self, name, position):
        new_employee = self.Employee(name, position)
        self.employees.append(new_employee)

    def list_employee(self):
        return [employee.get_details() for employee in self.employees]


company = Company("Gemini Hub")
company1 = Company("Thunder X")

company.add_employee("Eugene", "Manager")
company.add_employee("Spongebob", "Chef")
company.add_employee("Patrick", "Waiter")

company1.add_employee("Becky", "Cashier")
company1.add_employee("Steve", "Adviser")
company1.add_employee("Bob", "Owner")

for employee in company.list_employee() + company1.list_employee():
    print(employee)