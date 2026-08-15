# Typecasting: the process of converting a variable from one data type to another
#              str(), int(), float(), bool()
name  = "Rohith"
age = 18
gpa = 7.8
is_student = True
print(type(name))
print(type(age))
print(type(gpa))
print(type(is_student))
# Typecasting
# Converting int to float
new_age = float(age)
print(new_age)
#Converting float to String
print(type(str(new_age)))

age = str(age)
age += "1"
print(age)

name = bool(name)
print(name)
#  If there are no characters in the name variable , it would return false
# We can convert from one data type to another easily
