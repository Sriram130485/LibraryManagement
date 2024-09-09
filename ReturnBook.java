package project2;

import java.util.Scanner;

public class ReturnBook extends Library {  // Inherits from Library
    private Scanner sc;

    // Constructor
    public ReturnBook() {
        super();  // Call to superclass (Library) constructor
        sc = new Scanner(System.in);
    }

    // Method to return a book
    public String returnBook() {
        System.out.println("Enter Book ID to return:");
        int bid2 = sc.nextInt();

        if (bookExists(bid2)) {
//            if (!isBookBorrowed(bid2)) {
//                return "This book was not borrowed.";
//            }
            System.out.println("Enter number of days late:");
            int noOfDays = sc.nextInt();
            double amount = calculateFine(noOfDays);
            returnBook(bid2);  // Mark the book as returned
            return "Book returned successfully. Pay " + amount;
        } else {
            return "Invalid ID.";
        }
    }

    // Method to calculate fine
    private double calculateFine(int days) {
        double amountPerDay = 20;
        return days * amountPerDay;
    }
}
