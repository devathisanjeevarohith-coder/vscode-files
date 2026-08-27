import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Library {
    private String libraryName;
    private List<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author, int year) {
        Book newBook = new Book(title, author, year);
        books.add(newBook);
    }

    public void displayAllBooks() {
        System.out.println("\n--- Books in " + libraryName + " ---");
        if (books.isEmpty()) {
            System.out.println("The library is currently empty.");
        } else {
            for (Book book : books) {
                book.displayBookDetails();
            }
        }
    }

    class Book {
        private String title;
        private String author;
        private int publicationYear;

        public Book(String title, String author, int publicationYear) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
        }

        public void displayBookDetails() {
            System.out.println("Title: " + title + " | Author: " + author + " | Year: " + publicationYear);
        }

        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }

        public String getAuthor() { return author; }
        public void setAuthor(String author) { this.author = author; }

        public int getPublicationYear() { return publicationYear; }
        public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }
    }
}

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Library myLibrary = new Library("City Central Library");

        System.out.println("Welcome to the Library System!");
        System.out.print("How many books would you like to add? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 1; i <= count; i++) {
            System.out.println("\nEnter details for Book #" + i + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Publication Year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            myLibrary.addBook(title, author, year);
        }

        myLibrary.displayAllBooks();

        scanner.close();
    }
}
