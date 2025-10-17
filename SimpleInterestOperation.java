import java.util.Scanner;

// Class definition
 class InterestCalculator {
    // Member variables
    private float principal, rate;
    private int  time;

    // constructor to initialise object
     InterestCalculator() {

        Scanner sc = new Scanner(System.in);
  
        //Input Princpal amount
        System.out.print("Enter Principal amount (in Rs): ");
        principal = sc.nextFloat();
        //input rate of nterest
        System.out.print("Enter Rate of Interest (per annum): ");
        rate = sc.nextFloat();
 
        //taking input time in year
        System.out.print("Enter Time (in years): ");
        time = sc.nextInt();
       
    }

    // Method to display all details
    public void displayData() {
        
        float interest = calculateInterest();
        System.out.println("---------------------------------------");
        System.out.println("Principal : Rs " + principal);
        System.out.println("Rate      : " + rate + "%");
        System.out.println("Time      : " + time + " years");
        
        System.out.println("Interest to be paid: "+interest);
    }

    // Method to calculate simple interest
    private float calculateInterest() {
       return  (principal * rate * time) / 100;
    }
   
}

// Main class
public class SimpleInterestOperation {
    public static void main(String[] args) {

        // Creation of object of InterestCalculator class
        InterestCalculator obj = new InterestCalculator();
        //Displaying data
        obj.displayData();
    }
}