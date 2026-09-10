import java.util.*;
public class InstancevoidEven 
{
    void checkEvenOdd(int n)
    {
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else 
        {
            System.out.println("Odd");
        }
    }
public static void main(String[] args) 
{
    //take input and call
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter a number:");
    int num=sc.nextInt();
    InstancevoidEven obj=new InstancevoidEven();
    obj.checkEvenOdd(num);

    
}



    
}
