// Importing Scanner class to take input from the user
import java.util.Scanner;

// Class to calculate area and perimeter of a triangle
class AreaPerimeter {
    // Private variables to store the sides of the triangle
    private float a, b, c;

    // Constructor to initialize the sides when object is created
    public AreaPerimeter(float a, float b, float c) {
        this.a = a; // Assign input a to class variable a
        this.b = b; // Assign input b to class variable b
        this.c = c; // Assign input c to class variable c
    }

    // Method to display sides, perimeter, and area of the triangle
    void displayData() {
        System.out.println("Side a: " + a); // Print side a
        System.out.println("Side b: " + b); // Print side b
        System.out.println("Side c: " + c); // Print side c

        // Call perimeterCalculation() method and print the result
        System.out.println("Perimeter is: " + perimeterCalculation());

        // Call areaCalculation() method and print the result
        System.out.println("Area is: " + areaCalculation());
    }

    // Method to calculate perimeter of the triangle
    float perimeterCalculation() {
        return (a + b + c); // Perimeter = sum of all sides
    }

    // Method to calculate area using Heron's formula
    double areaCalculation() {
        float s = (a + b + c) / 2; // Calculate semi-perimeter
        // Return area using formula: sqrt(s*(s-a)*(s-b)*(s-c))
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

// Main class to run the program
public class TriangleOperation {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter side a
        System.out.print("Enter side a: ");
        float a = sc.nextFloat(); // Read side a from user

        // Prompt user to enter side b
        System.out.print("Enter side b: ");
        float b = sc.nextFloat(); // Read side b from user

        // Prompt user to enter side c
        System.out.print("Enter side c: ");
        float c = sc.nextFloat(); // Read side c from user

        // Create AreaPerimeter object with entered sides
        AreaPerimeter obj = new AreaPerimeter(a, b, c);

        // Call displayData() method to show triangle info
        obj.displayData();

        // Close the Scanner to prevent resource leak
        sc.close();
    }
}
