// Importing Scanner class to take input from the user
import java.util.Scanner;

// Class to calculate the average of 10 numbers
public class AverageCalculator {

    public static void main(String[] args) {

        // Creating Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Declaring an array of size 10
        int[] numbers = new int[10];

        // Variable to store the sum of numbers
        int sum = 0;

        // Asking user to enter 10 numbers
        System.out.println("Enter 10 numbers: ");

        // Taking input in array and calculating sum
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt(); // Reading numbers from user
            sum += numbers[i];         // Add it to sum variable
        }

        // Closing Scanner object to avoid resource leak
        sc.close();

        // Calculating average
        float average = (float) sum / numbers.length;

        // Displaying result
        System.out.println("------------------------------------------");
        System.out.println("The average of given 10 numbers is: " + average);
    }
}

