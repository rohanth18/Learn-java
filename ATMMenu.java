import java.util.*;

class ATMMenu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int choice;
        double balance = 5000;

        do
        {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Balance: Rs. " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0)
                    {
                        balance = balance + deposit;
                        System.out.println("Amount deposited successfully.");
                        System.out.println("Balance: Rs. " + balance);
                    }
                    else
                    {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw > 0 && withdraw <= balance)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your cash.");
                        System.out.println("Balance: Rs. " + balance);
                    }
                    else
                    {
                        System.out.println("Invalid amount or insufficient balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

    }
}