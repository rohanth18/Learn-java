import java.util.*;

public class EmployeeSalaryCalculator {

    static int calculateGrossSalary(int basic, int hra, int da) {
        return basic + hra + da;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Basic Salary:");
        int basic = sc.nextInt();

        System.out.println("Enter HRA:");
        int hra = sc.nextInt();

        System.out.println("Enter DA:");
        int da = sc.nextInt();

        int gross = calculateGrossSalary(basic, hra, da);

        System.out.println("Gross Salary = " + gross);

        sc.close();
    }
}