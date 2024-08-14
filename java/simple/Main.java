package simple;

//Simple Exercise 1: Basic Class with Non-Static Method
class Book {
    String title;
    String author;

    static int bookCount = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookCount++;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void printBookCount() {
        System.out.println("Total books created: " + bookCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell");
        book.displayDetails();
    }
}
