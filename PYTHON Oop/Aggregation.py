# Aggregation : Represents a relationship where one object (the whole)
#        contains references to one or more INDEPENDENT objects (the parts)

class Library:
    def __init__(self, name):
        self.name = name
        self.books = [] # A list to hold Book objects

    def add_book(self, book):
        self.books.append(book)
        print(f"Added '{book.title}' to {self.name} Library.")

    def show_books(self):
        if not self.books:
            print(f"{self.name} Library has no books.")
            return
        print(f"Books in {self.name} Library:")
        for book in self.books:
            print(f"- {book.get_details()}")

    # Instead of show_books, we can use the below
    # def list_books(self):
    #     return [f"{book.title} by {book.author} for book in self.books""]


class Book:
    def __init__(self, title, author):
        self.title = title
        self.author = author

    def get_details(self):
        return f"Book: '{self.title}' by {self.author}"



# --- Demonstration ---
# Create some Book objects
book1 = Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams")
book2 = Book("Pride and Prejudice", "Jane Austen")
book3 = Book("1984", "George Orwell")

# Create a Library object
my_library = Library("City Central")

# Add books to the library (aggregation)
my_library.add_book(book1)
my_library.add_book(book2)
my_library.add_book(book3)

print("\n" + "="*30 + "\n")

# Show books in the library
my_library.show_books()

print("\n" + "="*30 + "\n")

# Even if the library is destroyed, the books can still exist independently
del my_library
print("Library object deleted. Books still exist:")
print(book1.get_details())
print(book2.get_details())
