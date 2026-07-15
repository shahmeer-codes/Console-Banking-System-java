
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 0;
        int withdraw = 0;
        int addAmount = 0;

        boolean isRunning = true;

        while (isRunning) {

            System.out.println("\n<==========================>");
            System.out.println("      Banking Console");
            System.out.println("<==========================>");

            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("-1. Exit");

            System.out.print("\nSelect an option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nCurrent Balance: " + balance);
                    break;

                case 2:
                    System.out.print("\nEnter amount to deposit: ");
                    addAmount = sc.nextInt();

                    balance += addAmount;

                    System.out.println(addAmount + " deposited successfully.");
                    break;

                case 3:
                    System.out.print("\nEnter amount to withdraw: ");
                    withdraw = sc.nextInt();

                    balance -= withdraw;

                    System.out.println(withdraw + " withdrawn successfully.");
                    break;

                case -1:
                    System.out.println("\nThank you for using Console Banking System.");
                    isRunning = false;
                    break;

                default:
                    System.out.println("\nInvalid option.");
            }
        }

        sc.close();
    }
}
