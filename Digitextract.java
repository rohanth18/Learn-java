import java.util.*;
public class Digitextract 
{
    
    public static void main(String[] args)
    {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the num:");
    int num=sc.nextInt();
    int rev=0;
    System.out.println("Extracted digits are :");
   //num=54321 O/P: 1 2 3 4 5 
    /*  while(num!=0)
    {
        int digit=num%10;
        System.out.println(digit);
        num=num/10;
    }
    System.out.println("Num remained at last="+num);
    System.out.println("Loops ends if num=0");
} */
//num=54321 O/P: 5 4 3 2 1 
 while(num!=0)
    {
        int digit=num%10;
        rev=rev*10+digit;
        num=num/10;
    }
     for(;rev!=0;rev/=10)
    {
        int digit1=rev%10;
        System.out.println(digit1);
    }
}
    
}
