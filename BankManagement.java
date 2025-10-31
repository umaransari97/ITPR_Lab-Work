import java.util.Scanner; // Scanner class import kar rahe input lene ke liye

// 🔹 Parent class: Account
class Account {
    // Protected members (child classes ke liye accessible)
    protected int accountNo;                // Account number store karega
    protected String customerName, accountType;  // Customer name aur account type
    protected float balance;                // Account balance store karega

    // 🔸 Common input method - dono child classes ke liye same kaam karega
    protected void initializeAccount(Scanner sc, String type, float minBalance) {
        System.out.println("----------- " + type + " -----------"); // Account type heading print
        System.out.print("Enter A/C No.: "); // Account number input
        accountNo = sc.nextInt(); // User se account number le rahe
        sc.nextLine(); // Extra newline consume karne ke liye

        System.out.print("Enter Customer Name : "); // Customer name input
        customerName = sc.nextLine(); // User se naam lena

        // Initial balance input + condition mention
        System.out.print("Enter Initial balance (in Rs)(must be greater than or equals to " + (int)minBalance + "): ");
        balance = sc.nextFloat(); // Balance input lena
        sc.nextLine(); // Buffer clear karne ke liye

        accountType = type; // Account type assign karna (Saving/Current)

        // Balance validation check
        if (balance < minBalance) {
            System.out.println("---------------------------------------------------");
            System.out.println("Invalid Balance Entered. Please Re-enter details.\n");
            System.out.println("-----------------------------------------------------");
            // Agar galat balance diya gaya hai to recursion se dobara input lo
            initializeAccount(sc, type, minBalance);
        }
    }

    // 🔸 Account info display method
    protected void acInfo() {
        System.out.println("\n-------------- Account Info ----------------");
        System.out.println("Name: " + customerName);
        System.out.println("A/C No: " + accountNo);
        System.out.println("Type of Account : " + accountType);
        System.out.println("Available Balance : " + balance);
        System.out.println("---------------------------------------------");
    }

    // 🔸 Deposit method - amount balance me add karta hai
    protected void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        float amt = sc.nextFloat(); // Deposit amount input
        balance += amt; // Balance me add karna
        System.out.println("Amount deposited successfully!");
    }

    // 🔸 Withdraw method - balance me se paisa nikalta hai
    protected void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        float amt = sc.nextFloat(); // Withdraw amount input
        if (amt <= balance) { // Agar sufficient balance hai
            balance -= amt; // Amount subtract karo
            System.out.println("Withdrawal successful!");
        } else { // Agar balance kam hai
            System.out.println("Insufficient balance!");
        }
    }

    // 🔸 Balance info show karne ka method
    protected void balanceInfo() {
        System.out.println("Available Balance : " + balance);
    }

    // 🔸 Common menu method - deposit, withdraw, info etc.
    void perform(Scanner sc) {
        int ch; // User ke choice store karega
        do {
            System.out.println("------------------------------------------------------");
            System.out.println("\n------- Operation ------");
            System.out.println("1. Withdrawal");
            System.out.println("2. Deposit");
            System.out.println("3. A/C info");
            System.out.println("4. Balance info");
            System.out.print("select any one : ");
            ch = sc.nextInt(); // Operation choice input lena

            // Switch-case for user operation
            switch (ch) {
                case 1 -> withdraw(sc); // Withdraw call
                case 2 -> deposit(sc);  // Deposit call
                case 3 -> acInfo();     // Account info show
                case 4 -> balanceInfo(); // Balance info show
                default -> System.out.println("Invalid option."); // Agar galat option diya
            }

            // Repeat karne ke liye confirmation
            System.out.print("\nPress 0 to exit or any other number for continue in " + accountType + " : ");
            ch = sc.nextInt(); // Repeat choice input
            System.out.println("------------------------------------------------------");
        } while (ch != 0); // Jab tak user 0 nahi press karta tab tak loop chalega
    }
}

// 🔹 Child class: Saving Account
class SavingAccount extends Account {
    // Perform method override - initialization + parent perform
    void perform(Scanner sc) {
        // Minimum balance 1000 with Savings Account type
        initializeAccount(sc, "Savings Account", 1000);
        super.perform(sc); // Parent class ke menu ko call karna
    }
}

// 🔹 Child class: Current Account
class CurrentAccount extends Account {
    // Perform method override - initialization + parent perform
    void perform(Scanner sc) {
        // Minimum balance 5000 with Current Account type
        initializeAccount(sc, "Current Account", 5000);
        super.perform(sc); // Parent class ke menu ko call karna
    }
}

// 🔹 Main class
public class BankManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input ke liye Scanner object
        int choice; // Repeat ke liye variable

        do {
            // Account type menu
            System.out.println("------------------------------------------------------");
            System.out.println("----------- Select Account -----------");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("-----------------------------------");
            System.out.print("\nSelect any one : ");
            int selectAccount = sc.nextInt(); // User account choice

            // Switch for account type
            switch (selectAccount) {
                case 1:
                    new SavingAccount().perform(sc); // Savings account object create + perform
                    break;
                case 2:
                    new CurrentAccount().perform(sc); // Current account object create + perform
                    break;
                default:
                    System.out.println("Enter valid input."); // Invalid option
            }

            // Repeat or exit option
            System.out.print("\nPress 0 to exit from account or any other number to continue account operation : ");
            choice = sc.nextInt(); // User decision

        } while (choice != 0); // Loop jab tak user 0 nahi deta

        sc.close(); // Scanner close karna
    }
}
