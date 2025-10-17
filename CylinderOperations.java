// Import Scanner class to take input from the user
import java.util.Scanner;

// Class to calculate CSA and TSA of a cylinder
class CylinderArea 
{
    // Private variables to store height and radius of cylinder
    private double height, radius;

    // Constructor to initialize height and radius
    public CylinderArea(double radius, double height) {
        // Assign input radius to class variable
        this.radius = radius; 

        // Assign input height to class variable
        this.height = height;  
     
    }

    // Method to display cylinder details and calculated areas
    void displayData() {
        System.out.println("Height of cylinder: "+height); // Print height
        System.out.println("Radius of cylnder: "+radius); // Print radius
        System.out.println("Total Surface Area of cylinder: "+tsaCalculator()); // Call TSA method and print result
        System.out.println("Curved Surface Area of cylinder: "+csaCalculator()); // Call CSA method and print result
    }

    // Method to calculate Curved Surface Area (CSA)
    double csaCalculator() {
       return ( 2 * Math.PI * radius * height); // CSA = 2 * π * r * h
    }
    
    // Method to calculate Total Surface Area (TSA)
    double tsaCalculator() {
       return (2 * Math.PI * radius * (height + radius)); // TSA = 2 * π * r * (h + r)
    }

}

// Main class to run the program
public class CylinderOperations {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter radius
        System.out.print("Enter radius of cylinder: ");
        double radius = sc.nextDouble(); // Read radius from user

        // Prompt user to enter height
        System.out.print("Enter height of cylinder: ");
        double height = sc.nextDouble(); // Read height from user

        // Create CylinderArea object with entered radius and height
        CylinderArea obj = new CylinderArea(radius, height); 

        // Call displayData() method to show cylinder information
        obj.displayData(); 

        // Close Scanner to prevent resource leak
        sc.close();
    }
}
