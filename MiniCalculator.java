import java.util.*;

public class MiniCalculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Enter choice:");
        int choice = sc.nextInt();

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Result = " + add(a, b));
                break;

            case 2:
                System.out.println("Result = " + subtract(a, b));
                break;

            case 3:
                System.out.println("Result = " + multiply(a, b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Result = " + divide(a, b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}