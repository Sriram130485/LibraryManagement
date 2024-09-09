package project2;

import java.util.Scanner;

public class LibraryManagement {

    public static void main(String[] args) {
        Student st = new Student();
        BarrowBooks br = new BarrowBooks();
        ReturnBook returnBook = new ReturnBook();

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Show All Books");
            System.out.println("2. Check Student or New Register");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("Choose your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    br.showAllBooks();  // Can use any class that inherits Library
                    break;
                case 2:
                    st.listOfStudents();
                    break;
                case 3:
                    br.borrowBook();
                    break;
                case 4:
                    System.out.println(returnBook.returnBook());
                    break;
                default:
                    System.out.println("Choose According to the Above Options");
                    break;
            }

        } while (choice < 5);
    }
}
