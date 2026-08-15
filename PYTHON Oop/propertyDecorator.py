# @property = Decorator used to define a method as a property (it can be 
#              accessed like an attribute)
#             Benifit: Add additional logic when read, write, or delete attributes
#             Gives you getter, setter, and deleter methods


class Rectangle:
    def __init__(self, width, height):
        self._width = width
        self._height = height

    @property
    def width(self):
        return f"{self.width:.1f}cm"

    @property
    def height(self):
        return f"{self.height:.1f}cm"

    @width.setter
    def width(self,new_width):
        if new_width > 0:
            self.width = new_width
        else:
            print("Width must be greater than zero")

    @height.setter
    def width(self,new_height):
        if new_height > 0:
            self.heeight = new_height
        else:
            print("Height must be greater than zero")

rectangle = Rectangle(3,4)

rectangle.width = 5
rectangle.height = -1

print(rectangle._width)
print(rectangle._height)