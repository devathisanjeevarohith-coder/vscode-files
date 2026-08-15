# Multiple Inheritance = Inherit from more than one parent class
#                        C(A,B)
#
# Multilevel Inheritance = Inherit from a parent which inherits from another parent
#                          C(B) <-- B(A) <-- A


class Animal:
    def __init__(self, name):
        self.name = name

    def eat(self):
        print(f"This {self.name} is eating")

    def sleep(self):
        print(f"This {self.name} is sleeping")


class Prey(Animal):
    def flee(self):
        print(f"This {self.name} is fleeing.")


class Predator(Animal):
    def hunt(self):
        print(f"This {self.name} hunts.")


class Rabbit(Prey):
    pass


class Hawk(Predator):
    pass


class Fish(Prey, Predator):
    pass


rabbit = Rabbit("Rabbit")
hawk = Hawk("Hawk")
fish = Fish("Fish")


rabbit.flee()
rabbit.sleep()
rabbit.eat()

hawk.hunt()
hawk.eat()

fish.flee()
fish.hunt()
fish.eat()


