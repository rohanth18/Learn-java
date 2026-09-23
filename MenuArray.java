import java.util.*;

public class MenuArray {

    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("1. Display Array");
        System.out.println("2. Find Sum");
        System.out.println("Enter choice:");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                display(arr);
                break;

            case 2:
                System.out.println("Sum = " + sum(arr));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}