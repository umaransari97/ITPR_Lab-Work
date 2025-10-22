// Importing Scanner class to take user input
import java.util.Scanner;

// Defining a class named StringOper
class ConvertingCase {

    // Static method to convert uppercase letters to lowercase and vice versa
    public static String convertCase(String data) {

        // Variable to store the final converted string
        String result = "";  

        // Loop through each character of the string
        for (int i = 0; i < data.length(); i++) {

            // Extract each character from the string
            char ch = data.charAt(i);

            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {

                // Convert uppercase character to lowercase
                ch = Character.toLowerCase(ch);
            }
            else {
                // Convert lowercase character to uppercase
                ch = Character.toUpperCase(ch);
            }

            // Add the converted character to the result string
            result += ch;
        }

        // Return the final converted string to the main method
        return result;  

    }
}

// Main class
public class StringOperation1 {
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a sentence
        System.out.print("Enter any sentence: ");
        String s1 = sc.nextLine();  // Read the full line input

        // Call the convertCase() method and store the result
        String result = ConvertingCase.convertCase(s1);

        // Display the converted string
        System.out.println("Converted case: " + result);

        // Close the Scanner object to free resources
        sc.close();
    }
}
