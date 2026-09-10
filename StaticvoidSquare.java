import java.util.*;
public class StaticvoidSquare 
{
    static void square(int n)
    {
        System.out.println("Square of "+n+"="+(n*n));
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        square(num);
        
    }
    
}
