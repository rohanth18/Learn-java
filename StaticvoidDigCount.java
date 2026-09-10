import java.util.*;
public class StaticvoidDigCount 
{
    static void digitcount(int n)
    {
        int count=0;
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        System.out.println("No. of digits="+count);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        digitcount(num);
        
    }
    
}
