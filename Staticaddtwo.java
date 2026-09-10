import java.util.*;
public class Staticaddtwo 
{
    static void addtwo(int x,int y)
    {
        System.out.println("Sum="+(x+y));
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        addtwo(num1,num2);

    }
    
}
