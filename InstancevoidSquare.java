import java.util.*;
public class InstancevoidSquare 
{

    void square(int n)
    {
        System.out.println("Square of"+n+"="+(n*n));
    }


    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        InstancevoidSquare obj=new InstancevoidSquare();
        obj.square(num);

        
    }
    
}
