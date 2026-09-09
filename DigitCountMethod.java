//static method
/* import java.util.*;
public class DigitCountMethod 
{
    static int digitcount(int num1)
    {
        int count=0;
        while(num1!=0)
        {
            count++;
            num1=num1/10;
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int result=digitcount(num);
        System.out.println("Number of digits ="+result);


        
    }
    
} */

//Instance method
import java.util.*;
public class DigitCountMethod 
{
    int digitcount(int num1)
    {
        int count=0;
        while(num1!=0)
        {
            count++;
            num1=num1/10;
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        DigitCountMethod obj=new DigitCountMethod();
        int result=obj.digitcount(num);
        System.out.println("Number of digits ="+result);


        
    }
    
}
