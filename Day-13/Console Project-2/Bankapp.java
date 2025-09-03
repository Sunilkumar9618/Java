import java.util.Scanner;

public class Bankapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, accountNumber;
        double balance = 0;

        System.out.println("Welcome to Simple Bank!");
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter account number: ");
        accountNumber = sc.nextLine();

        System.out.println("Account created successfully!");

        String choice;

        do {
            System.out.println("\n========= MENU =========");
            System.out.println("D. Deposit");
            System.out.println("W. Withdraw");
            System.out.println("C. Check Balance");
            System.out.println("E. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.next().toUpperCase();  // Convert to uppercase

            switch (choice) {
                case "D":
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Amount deposited successfully!");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case "W":
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Amount withdrawn successfully!");
                    } else {
                        System.out.println("Invalid amount or insufficient balance.");
                    }
                    break;

                case "C":
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case "E":
                    System.out.println("Thank you for using the bank application.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (!choice.equals("E"));

        sc.close();
    }
}