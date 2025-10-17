// Importing Scanner class to take user input
import java.util.Scanner;

// Class to store and display student details
class Student 
{
    // Private data members (encapsulation)
    private String name;
    private int age, rollNo, standard;

    // Constructor that takes Scanner object to initialize data members
    public Student(Scanner sc) {

        // Asking user to enter their name
        System.out.print("Enter your name: ");
        name = sc.nextLine();  // Taking full line input for name

        // Asking user to enter their class/standard
        System.out.print("Enter your standard (class): ");
        standard = sc.nextInt();  // Taking integer input

        // Asking user to enter their age
        System.out.print("Enter your age: ");
        age = sc.nextInt();  // Taking integer input

        // Asking user to enter their roll number
        System.out.print("Enter your Roll No.: ");
        rollNo = sc.nextInt();  // Taking integer input

    }

    // Method to display student details
    void displayData() {
        System.out.println("----------------------------------------------------------");
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("Standard : " + standard);
        System.out.println("Roll No  : " + rollNo);
    }
}

// Main class to execute the program
public class StudentExample {

    // Main method — program execution starts here
    public static void main(String[] args) {

        // Creating Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Creating Student object and passing Scanner to constructor
        Student stu = new Student(sc);

        // Displaying entered student details
        stu.displayData();

        // Closing scanner to prevent resource leak
        sc.close();
    }
}
