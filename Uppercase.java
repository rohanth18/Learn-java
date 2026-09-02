import java.util.*;
public class Uppercase 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter alphabet");
        char alpha=sc.next().charAt(0);
        if(alpha>='A' && alpha<='Z')
        {
            System.out.println("uppercase");
        }
        else
        {
            System.out.println("Not a uppercase character");

        }
        
    }
    
}
