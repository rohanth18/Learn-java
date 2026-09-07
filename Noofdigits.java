import java.util.*;
public class Noofdigits 
{
    
    public static void main(String[] args)
    {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the num:");
    int num=sc.nextInt();
    int count=0;
    /* while(num>0)
    {
        num=num/10;
        count=count+1;
    } */
   for(;num>0;num/=10)
   {
    count=count+1;
   }
    System.out.println("Num of digits ="+count);
}
    
}
