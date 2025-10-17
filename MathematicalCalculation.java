//Importing Scanner class
import java.util.Scanner;

class BasicMathsOperation
{

    //Defining variables to store numbers
    private float num1, num2;

    //Constructor to take inputs from user
    BasicMathsOperation(Scanner sc) {

        //Taking user input
        System.out.print("Enter first number :");
        num1 = sc.nextFloat();
    
        //Taking User Input in num2 variable
        System.out.print("Enter second number :");
        num2 = sc.nextFloat();

    }

    public void displayData() {

        //Displaying sum of two numbers.
        System.out.println("Sum of "+num1+" and "+num2+" is           : "+addOperation());
     
        //Displaying difference between two numbers
        System.out.println("Difference between "+num1+" and "+num2+" is: "+subOperation());

        //Displaying multiply of two numbers
        System.out.println("Multiplication of "+num1+" and "+num2+" is: "+mulOperation());
    }
    
    private float addOperation(){
        return (num1+num2);
    }

    private float subOperation(){
        return (num1-num2);
    }
    
    private float mulOperation(){
        return (num1*num2);
    }

}

public class MathematicalCalculation {
    public static void main(String[] args) {
        
        //Creating object of Scanner class to take input from user
        Scanner sc = new Scanner(System.in);

        //Creating Refrence Variable of BasicMathsOperation class
        BasicMathsOperation obj;

        //Creating an object of BasicMathOperation class 
        obj = new BasicMathsOperation(sc);

        //Calling method of object to display data
        obj.displayData();

        //Closing the scanner class
        sc.close();

    }
}
