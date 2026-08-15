# This is  my first Python Program
print("I like pizza.")
print("Its really good.")

# variable : A reusable container for a value (String, integer, float, boolean)
#            The variable behaves as if it was the value that it contains

full_name = "Sanjeeva Rohith"   #String
age = 25    #integer
gpa = 3.2   #float
is_student = True   #Boolean 
print(f"My name is : {full_name}.")
print(f"You are {age} years old.")
print(f"Your gpa is : {gpa}.")
print(f"Are you a student : {is_student}.")
if is_student:
    print("You are a student.")
else:
    print("You are not a student.")   
 
# Arithemetic operators :   + Addition
#                           - Subtraction
#                           * Multiplication
#                           / Division
#                           // Integer division
#                           % remainder
friends = 5
friends = friends + 1
friends += 2    # Shortcut
print("My friends: ",friends)
friends = friends - 1
friends -= 4
print("My friends: ",friends)
friends *= 2
print("My friends: ",friends)
friends /= 2
print("My friends: ",friends)
friends %= 2
print("My friends: ",friends)
friends **= 2
print("My friends: ",friends)
friends //= 2
print("My friends: ",friends)