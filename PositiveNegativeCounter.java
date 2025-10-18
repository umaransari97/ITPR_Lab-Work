
import java.util.Scanner;

// Class to handle array input and operations
class NumberOperations {

    private int[] arr = new int[10]; // Array to store 10 numbers

    // Constructor to take input from user
    public NumberOperations() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    // Method to display all numbers
    public void displayData() {
        System.out.println("Numbers are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
    }

    // Method to count positive and negative numbers
    public void countPosNeg() {
        //Inital both count varable should be zero
        int countPositive = 0;
        int countNegative = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPositive++;
            } else if (arr[i] < 0) {
                countNegative++;
            }
        }

        System.out.println("\n-----------------------------------");
        System.out.println("Total Positive Numbers: " + countPositive);
        System.out.println("Total Negative Numbers: " + countNegative);
    }
}

// Main class to run the program
public class PositiveNegativeCounter {

    public static void main(String[] args) {
        // Create object of NumberOperations
        NumberOperations obj = new NumberOperations();

        // Calling method that display all entered numbers
        obj.displayData();

        // Callnig method whwich count and display positive and negative numbers
        obj.countPosNeg();
    }
}
