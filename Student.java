package project2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
    private int stid;
    private String stname;
    private Map<Integer, String> studentList; 

 
    public Student() {
        this.studentList = new LinkedHashMap<>();
        initializeStudents();
    }

    // Method to initialize students
    private void initializeStudents() {
        studentList.put(1, "Sai");
        studentList.put(2, "Shiva");
        studentList.put(3, "Prabhas");
        studentList.put(4, "Nikitha");
        studentList.put(5, "Yogi");
        studentList.put(6, "Mallikarjuna");
    }


    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    // Method to check student registration or register new students
    public void listOfStudents() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your stid");
        int newid = sc.nextInt();

        if (studentList.containsKey(newid)) {
            System.out.println("You are registered. You can borrow the book.");
        } else {
            System.out.println("You are not registered.");
            System.out.println("Enter your Name");
            String name = sc.next();
            System.out.println("Enter your id");
            int sid = sc.nextInt();
            studentList.put(sid, name);
            System.out.println("Now you are registered");
            System.out.println(studentList);
        }
    }
}
