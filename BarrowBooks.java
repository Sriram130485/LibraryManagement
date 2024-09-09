package project2;

import java.util.Scanner;

public class BarrowBooks extends Library {  // Inherits from Library
    private Scanner sc;

    // Constructor
    public BarrowBooks() {
        super();  // Call to superclass (Library) constructor
        sc = new Scanner(System.in);
    }

    // Method to borrow a book
    public void borrowBook() {
        System.out.println("Enter Book ID to borrow:");
        int bid = sc.nextInt();
        
        if (bookExists(bid)) {
            if (isBookBorrowed(bid)) {
                System.out.println("Sorry, the book is already borrowed by someone else.");
            } else {
                borrowBook(bid);  // Mark book as borrowed
                System.out.println("You have successfully borrowed the book: " + getBookById(bid));
            }
        } else {
            System.out.println("Book is not available with this ID: " + bid + "\nPlease choose a correct ID.");
        }
    }
}
