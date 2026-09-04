import java.util.*;
public class Powerof2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to end"); 
        int end=sc.nextInt();
        System.out.println();
        int start;
        /* for(start=1;start<=end;start*=2)
        {
            System.out.println(start);
        } */

        //using while
        /* start=1;
        while(start<=end)
        {
            System.out.println(start);
            start*=2;
        } */
        //using while
        start=1;
        do
        {
            System.out.println(start);
            start*=2;
        }while(start<=end);
    }
    
}
