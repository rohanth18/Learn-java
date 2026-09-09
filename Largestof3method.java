//static method
/* import java.util.*;
public class Largestof3method 
{

    static int largestof3(int a, int b,int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
        else if(b>c && b>c)
        {
            return b;
        }
        else 
        {
            return c;
        }

    }



    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int result=largestof3(num1,num2,num3);
        System.out.println(result+" is largest");

        
    }
    
} */

//instance method
import java.util.*;
public class Largestof3method 
{

    int largestof3(int a, int b,int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
        else if(b>c && b>c)
        {
            return b;
        }
        else 
        {
            return c;
        }

    }



    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        Largestof3method obj=new Largestof3method();
        int result=obj.largestof3(num1,num2,num3);
        System.out.println(result+" is largest");

        
    }
    
}
