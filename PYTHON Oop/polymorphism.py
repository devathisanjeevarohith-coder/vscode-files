# Polymorphism :    Greek word that means to "have many forms or faces"
#                   Poly = Many
#                   Morphe = Form

#  Two ways to Achieve POLYMMORPHISM
#   1. Inheritance = An object could be treated of the sma type as a parent class
#   2. "Duck typing" = Object must have necessary attributes/method

import math
from abc import ABC, abstractmethod


class Shape:

    @abstractmethod
    def area(self):
        pass



class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        print("Area of Circle : ", math.pi*self.radius*self.radius)


class Square(Shape):
    def __init__(self, side):
        self.side = side

    def area(self):
        print("The area of Square : ", self.side*self.side)

class Triangle(Shape):
    def __init__(self, base, height):
        self.base = base
        self.height = height

    def area(self):
        print("Area of Triangle : ",0.5*self.base*self.height)

class Pizza(Circle):
    def __init__(self, toppings, radius):
        super().__init__(radius)
        self.toppings = toppings


shapes = [Circle(4), Square(5), Triangle(4,2), Pizza("pepparoni", 15)]

for shape in shapes:
    print(shape.area())