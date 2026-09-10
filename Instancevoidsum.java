import java.util.*;
public class Instancevoidsum 
{
    void addtwo(int x,int y)
    {
        System.out.println("Sum="+(x+y));
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        Instancevoidsum obj=new Instancevoidsum();
        obj.addtwo(num1,num2);
    }
    
}
