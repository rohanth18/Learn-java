import java.util.*;

public class BankingMenu {

    static void checkBalance() {
        System.out.println("Checking Balance");
    }

    static void deposit() {
        System.out.println("Deposit Money");
    }

    static void withdraw() {
        System.out.println("Withdraw Money");
    }

    static void transfer() {
        System.out.println("Transfer Money");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Banking Operations");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer");
        System.out.println("Enter your choice:");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                checkBalance();
                break;

            case 2:
                deposit();
                break;

            case 3:
                withdraw();
                break;

            case 4:
                transfer();
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}