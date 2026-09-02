import java.util.*;
public class Positiveornot 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("Entered number is positive");
        }
        else if(num<0)
        {
            System.out.println("Not positive");
        }
        else
        {
            System.out.println("The number is zero");
        }
    }
    
}
