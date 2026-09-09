import java.util.*;
public class SquareNumMethod 
{
    //static method
    /* static int square(int x)
    {
        return x*x;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        int result=square(num);
        System.out.println("Square of "+num+"="+result);
        
    } */
   //instance method
    int square(int x)
    {
        return x*x;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        SquareNumMethod obj=new SquareNumMethod();
        int result=obj.square(num);
        System.out.println("Square of "+num+"="+result);
        
    }

    
}
