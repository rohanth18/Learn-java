import java.util.*;
public class Octal 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        String num=sc.next();//"127" -->127
        int type=2;
        for(int i=0;i<=num.length()-1;i++)
        {
            char ch=num.charAt(i);
            if(ch>='8' && ch<='9' || ch>'A' && ch<'F')
            {
                type=16;
                break;
            }
            else if(ch>='0' && ch<='7')
            {
                type=8;
                break;
            }
        }
       if(type==16)
       {
        System.out.println("Yes, it is hexadecimal and radix base is 16");
       }
       else if(type==8)
       {
        System.out.println("it is not octal");
       }
    }
    
}
