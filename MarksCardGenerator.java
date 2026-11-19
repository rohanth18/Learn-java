import java.util.Scanner;

public class MarksCardGenerator {

    static int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    static double calculatePercentage(int total) {
        return total / 3.0;
    }

    static char calculateGrade(double percentage) {

        if (percentage >= 90) {
            return 'A';
        }
        else if (percentage >= 75) {
            return 'B';
        }
        else if (percentage >= 60) {
            return 'C';
        }
        else if (percentage >= 50) {
            return 'D';
        }
        else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter marks for Subject 1:");
        int m1 = sc.nextInt();

        System.out.println("Enter marks for Subject 2:");
        int m2 = sc.nextInt();

        System.out.println("Enter marks for Subject 3:");
        int m3 = sc.nextInt();

        int total = calculateTotal(m1, m2, m3);
        double percentage = calculatePercentage(total);
        char grade = calculateGrade(percentage);

        System.out.println("\n----- MARKS CARD -----");
        System.out.println("Student Name: " + name);
        System.out.println("Subject 1: " + m1);
        System.out.println("Subject 2: " + m2);
        System.out.println("Subject 3: " + m3);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}