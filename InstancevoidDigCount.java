import java.util.*;
public class InstancevoidDigCount 
{
    void digitcount(int n)
    {
        int count=0;
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        System.out.println("Number of digits="+count);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number:");
        int num=sc.nextInt();
        InstancevoidDigCount obj=new InstancevoidDigCount();
        obj.digitcount(num);

        
    }
    
}
