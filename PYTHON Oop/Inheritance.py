# Inheritance = Allows a class to inherit attributes and methods from another class
#               helps with code reusablility and extensibility
#               class Child(Parent)


class Animal:
    
    def __init__(self, name):
        self.name = name
        self.is_alive = True

    def eat(self):
        print(f"{self.name} is eating.")

    def sleep(self):
        print(f"{self.name} is sleeping.")


class Dog(Animal):
    def speak(self):
        print("Dog is barking")


class Cat(Animal):
    def speak(self):
        print("Cat meows")

class Mouse(Animal):
    def speak(slef):
        print("Mouse squeaks")


dog = Dog("Scooby")
cat = Cat("Garfield")
mouse = Mouse("Mickey")

print(dog.name)
print("Is alive: ", dog.is_alive)
dog.eat()
dog.sleep()
dog.speak()

print("\n",cat.name)
print("Is alive: ",cat.is_alive)
cat.eat()
cat.sleep()
cat.speak()

print("\n", mouse.name)
print("Is alive: ",mouse.is_alive)
mouse.eat()
mouse.sleep()
mouse.speak()

