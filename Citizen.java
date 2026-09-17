import java.util.*;

public class Citizen {

    static String getAddressLabel(String name, String houseNumber,
                                  String street, int wardNumber, int pinCode) {

        return name + ", " + houseNumber + ", " + street
                + ", Ward " + wardNumber + ", Bengaluru - " + pinCode;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter house number: ");
        String houseNumber = sc.nextLine();

        System.out.print("Enter street: ");
        String street = sc.nextLine();

        System.out.print("Enter ward number: ");
        int wardNumber = sc.nextInt();

        System.out.print("Enter PIN code: ");
        int pinCode = sc.nextInt();

        String address = getAddressLabel(
                name, houseNumber, street, wardNumber, pinCode
        );

        System.out.println("\nAddress Label:");
        System.out.println(address);
    }
}