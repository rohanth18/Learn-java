import java.util.*;
public class Logincheck 
{
    public static void main(String[] args) 
    {
        //Without using Scanner class
       /*  String username="admin";
        String password="1234";
        if(username.equals("admin")&&password.equals("1234"))
        {
            System.out.println("logging in");
        }
        else
        {
            System.out.println("Invalid user");

        } */
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter username: ");
       String username=sc.nextLine();
       System.out.println("Enter password:");
       String password=sc.nextLine();
       if(username.equals("admin")&&password.equals("1234"))
        {
            System.out.println("logging in");
        } 
        else
        {
            System.out.println("Invalid user");

        }
    }
    
}
