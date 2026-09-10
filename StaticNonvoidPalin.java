import java.util.*;
public class StaticNonvoidPalin 
{
    static boolean isPalindrome(int num1)
    {
        int rev=0;
        int ori=num1;
        while(num1!=0)
        {
            int digit=num1%10;
            rev=rev*10+digit;
            num1=num1/10;
        }
        return ori==rev;
    } 
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        boolean result=isPalindrome(num);
        if(result)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }

        
    }
    
}
