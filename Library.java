package project2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Library {
    private Map<Integer, String> books;  // Encapsulated field
    private Map<Integer, Boolean> borrowedBooks;  // To track borrowed status

    // Constructor
    public Library() {
        this.books = new LinkedHashMap<>();
        this.borrowedBooks = new LinkedHashMap<>();
        initializeBooks();
    }

    // Method to initialize books
    private void initializeBooks() {
        books.put(100, "Engineering Mathematics , Dr.Manish Goyal");
        books.put(101, "Engineering Drawing , Siva sai");
        books.put(102, "Engineering Physics , Sanjiv guptha");
        books.put(103, "Engineering Chemistry , Sai ram");
        books.put(104, "Basic Electronics , Dr.Ashok");
        books.put(105, "Electro Magnetic Fields , CR.Paul");
        books.put(106, "C Language , Bala guru");
        books.put(107, "Engineering Signals and Systems , R.Rajan");
        books.put(108, "Digital Electronics , Rp.Jain");
        books.put(109, "Engineering Mechanism , S.Chand");

        // Initialize borrowedBooks map to all false (none borrowed initially)
        for (Integer id : books.keySet()) {
            borrowedBooks.put(id, false);  // Book is not borrowed initially
        }
    }

    // Method to display all books
    public void showAllBooks() {
        for (Map.Entry<Integer, String> entry : books.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " - " +
                    (borrowedBooks.get(entry.getKey()) ? "Borrowed" : "Available"));
        }
    }

    // Method to check if a book exists
    public boolean bookExists(int bookId) {
        return books.containsKey(bookId);
    }

    // Method to get a book by ID
    public String getBookById(int bookId) {
        return books.get(bookId);
    }

    // Method to check if a book is borrowed
    public boolean isBookBorrowed(int bookId) {
        return borrowedBooks.getOrDefault(bookId, false);
    }

    // Method to borrow a book
    public void borrowBook(int bookId) {
        borrowedBooks.put(bookId, true);
    }

    // Method to return a book
    public void returnBook(int bookId) {
        borrowedBooks.put(bookId, false);
    }
}
