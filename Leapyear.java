import java.util.*;
public class Leapyear 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        int year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("leap year");
        }
        else if(year%100==0)
        {
            System.out.println("Leap year");
        }
        else if(year%400==0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }

        
    }
    
}
