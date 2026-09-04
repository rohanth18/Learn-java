import java.util.*;
public class Multiplyby10 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to end");
        int end=sc.nextInt();
        System.out.println();
        int start;
        /* for(start=1;start<=end;start*=10)
        {
            System.out.println(start);
        } */

        //using while
        /* start=1;
        while(start<=end)
        {
            System.out.println(start);
            start*=10;
        } */

        //using do-while
         start=1;
        do
        {
            System.out.println(start);
            start*=10;
        }while(start<=end); 
        
    }
    
}
