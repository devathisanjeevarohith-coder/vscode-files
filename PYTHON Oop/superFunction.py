
# super()   =   Function used in a child class to call methods from a paent class (superclass)
#               Allows you to extend the functionality of the inherited methods


class Shape:
    def __init__(self, color, is_filled):
        self.color = color
        self.is_filled = is_filled

class Circle(Shape):
    def __init__(self, color, is_filled, radius):
        super().__init__(color, is_filled)
        self.radius = radius


class Square(Shape):
    def __init__(self, color, is_filled, side):
        super().__init__(color, is_filled)
        self.side = side


class Triangle(Shape):
    def __init__(self, color, is_filled, width, height):
        super().__init__(color, is_filled)
        self.width = width
        self.height = height


circle = Circle("Blue", True, 2.5)
square = Square("Yelllow", False, 5)
triangle = Triangle("Greeen", True, 2, 4)


print("The color of the circle is : ",circle.color)
print("The circle is filled with color : ",circle.is_filled)
print("The radius of circle: ",circle.radius)


print("The color of the square is : ",square.color)
print("The square is filled with color : ",square.is_filled)
print("The side of square: ",square.side)


print("The color of the triangle is : ",triangle.color)
print("The triangle is filled with color : ",triangle.is_filled)
print("The width of triangle: ",triangle.width)
print("The height of triangle: ",triangle.height)
