class Library {
    // Fields
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // Constructor
    public Library(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true; // By default, the book is available
    }

    // Non-Static Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is currently not available.");
        }
    }

    // Non-Static Method to return a book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    // Static Method to count the number of available books
    public static int countAvailableBooks(Library[] books) {
        int count = 0;
        for (Library book : books) {
            if (book.isAvailable) {
                count++;
            }
        }
        return count;
    }

    // Main method to test the Library class
    public static void main(String[] args) {
        // Creating Library objects
        Library book1 = new Library("1984", "George Orwell", 1949);
        Library book2 = new Library("To Kill a Mockingbird", "Harper Lee", 1960);
        Library book3 = new Library("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        // Borrowing and returning books
        book1.borrowBook();
        book2.borrowBook();
        book2.returnBook();
        book3.borrowBook();

        // Creating an array of books
        Library[] books = { book1, book2, book3 };

        // Counting and displaying the number of available books
        int availableBooks = Library.countAvailableBooks(books);
        System.out.println("Number of available books: " + availableBooks);
    }
}
