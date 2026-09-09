//Static method
/* import java.util.*;
public class EvenOddMethod 
{
    static void evenodd(int x)
    {
        if(x%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a num");
        int num=sc.nextInt();
        evenodd(num);
        
    }
    
} */

//Instance method
import java.util.*;
public class EvenOddMethod 
{
    void evenodd(int x)
    {
        if(x%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        int num=sc.nextInt();
        EvenOddMethod obj=new EvenOddMethod();
        obj.evenodd(num);
        
    }
    
}