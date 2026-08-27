import java.util.*;

class Book {
    int id;
    String name;
    double rating;

    Book(int id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public String toString() {
        return "Book ID: " + id + " | " + name + " | Rating: " + rating;
    }
}

public class BookCollections {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Java Basics", 4.5));
        books.add(new Book(2, "Advanced Java", 4.9));
        books.add(new Book(3, "Python Intro", 4.2));

        books.sort((b1, b2) -> Double.compare(b2.rating, b1.rating));

        System.out.println("Books by Rating:");
        books.forEach(System.out::println);

        System.out.println("\nUsing Iterator:");
        Iterator<Book> it = books.iterator();
        while(it.hasNext()) System.out.println(it.next());
    }
}