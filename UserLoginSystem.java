import java.util.*;

public class UserLoginSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "java123";

        boolean success = false;

        for (int attempt = 1; attempt <= 3; attempt++) {

            System.out.println("Enter Username:");
            String username = sc.next();

            System.out.println("Enter Password:");
            String password = sc.next();

            if (username.equals(correctUsername)
                    && password.equals(correctPassword)) {

                success = true;
                System.out.println("Login Successful");
                break;
            }
            else {
                System.out.println("Invalid Username or Password");
                System.out.println("Attempts remaining: " + (3 - attempt));
            }
        }

        if (!success) {
            System.out.println("Account Locked");
        }

        sc.close();
    }
}