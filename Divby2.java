import java.util.*;
public class Divby2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to end");
        int end=sc.nextInt();
        System.out.println();
        int start;
        /* for(start=64;start>=end;start/=2)
        {
            System.out.println(start);
        } */

        /* start=64;
        while(start>=end)
        {
            System.out.println(start);
            start/=2;
        } */

        start=64;
        do{
            System.out.println(start);
            start/=2;
        }while(start>=end);


    }
    
}
