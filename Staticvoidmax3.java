import java.util.*;
public class Staticvoidmax3 
{
    static void largestof3(int a, int b,int c)
    {
        if(a>b && a>c)
        {
            System.out.println(a+"is largest");
        }else if(b>c && b>a)
        {
            System.out.println(b+"is largest");
        }
        else
        {
            System.out.println(c+"is largest");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        largestof3(num1,num2,num3);
        
    }
    
}
