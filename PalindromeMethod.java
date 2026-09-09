//Static method
/* import java.util.*;
public class PalindromeMethod 
{
    static void palindrome(int num1)
    {
        int rev=0;
        int ori=num1;
        while(num1!=0)
        {
            int digit=num1%10;
            rev=rev*10+digit;
            num1=num1/10;
        }
        if(ori==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("not palindrome");

        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        palindrome(num);
        
    }
    
} */

//Instance method
import java.util.*;
public class PalindromeMethod 
{
    void palindrome(int num1)
    {
        int rev=0;
        int ori=num1;
        while(num1!=0)
        {
            int digit=num1%10;
            rev=rev*10+digit;
            num1=num1/10;
        }
        if(ori==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("not palindrome");

        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        PalindromeMethod obj=new PalindromeMethod();
        obj.palindrome(num);
        
    }
    
}

