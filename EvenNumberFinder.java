
// Importing Scanner class for taking input from the user
import java.util.Scanner;

// Class definition to find and display even numbers from an array
class EvenFinder {

    // Declaring an integer array of size 20
    private int arr[] = new int[20];

    // Constructor to take user input and fill the array
    public EvenFinder() {

        // Creating Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Asking user to enter 20 numbers
        System.out.println("Enter any 20 Numbers: ");

        // Loop to take 20 inputs and store them in array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Reading integer input and storing it in array
        }

        // Closing the Scanner object to free system resources
        sc.close();
    }

    // Method to display all numbers stored in the array
    public void displayData() {
        System.out.println("Numbers are: "); // Message to show numbers

        // Loop to print each number from the array
        for (int i = 0; i < arr.length; i++) {

            // Printing each number separated by comma
            System.out.print(arr[i] + " , "); 

        }

    }

    // Method to find and display even numbers from the array
    public void evenFinder() {
        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.println("Even Numbers are: "); // Message to indicate even numbers

        // Loop through each element of the array
        for (int i = 0; i < arr.length; i++) {

            // Condition to check whether a number is even
            if (arr[i] % 2 == 0) {
                // If number is even, print it
                System.out.print(arr[i] + " , ");
            }
        }
    }
}

// Main class where program execution begins
public class EvenNumberFinder {

    // Main method — the entry point of the program
    public static void main(String[] args) {

        // Creating an object of EvenFinder class
        EvenFinder obj = new EvenFinder();

        // Calling method to display all entered numbers
        obj.displayData();
        
        //Calling method evenFinder() to find and display the even number
        obj.evenFinder();
        
    }
}
