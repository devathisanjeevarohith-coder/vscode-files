# Duck Typing : Another way to achieve polymorphism besides Inheritance
#               Object must have the minimum necessary attributes/methods
#               "If it looks like a duck andd quacks like a duck, it must 
#                           be a duck"


class Animal:
    is_alive = True


class Dog(Animal):

    def speak(self):
        print("Woof!")

class Cat(Animal):

    def speak(self):
        print("Meow!")


class Car:

    is_alive = False    # If we dont have this attribute and print animal.is_alive
                        # We do not get a print statement and we get error

    def speak(self):
        print("Honk! Honk!")


animals = [ Dog(), Cat(), Car()]


for animal in animals:
    animal.speak()
    print(animal.is_alive)

