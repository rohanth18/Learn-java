import java.util.*;
public class Fibonacci1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        int a=0,b=1,c;
        System.out.println(a+"\n"+b);
        for(int i=1;i<num-2;i++)
        {
            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;


        }
        
    }
    
}
