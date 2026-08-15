# Magic Methods :  Dunder methods (double underscore) __init__,__str__,__eq__
#                  They are automatically called by many of Pyhton's built-in
#                  operations. They allow developers to define or customize the
#                  behaviour of objects


class Book:

    def __init__(self, title, author, num_pages):
        self.title = title
        self.author = author
        self.num_pages = num_pages

    def __str__(self):
        return f"{self.title} by {self.author}"
    
    def __eq__(self, other):
        return self.title == other.title and self.author == other.author


book1 = Book("The Hobbit","J.J.R Tolkein", 310)
book2 = Book("Harry Potter and The Philosopher's Stone", "J.K. Rowling", 223)
book3 = Book("The Lion, the Witch and the Wardrobe", "C.S. Lewis", 172)

print(book1)
print(book2)
print(book3)

print(book1==book2)

