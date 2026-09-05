import java.util.*;
public class Octal 
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number to check number system");
    String num = sc.next(); // 127 now this a word 
    boolean octal = true;// assumne that the number is octal
    boolean binary=true;
    boolean decimal=true;
    boolean hexadecimal=true;
    for(int i = 0 ; i<num.length();i++)
    {
        char ch = num.charAt(i);
        //binary
        if(ch<'0'||ch>'1')
        {
            binary=false;
         
        }

        if(ch<'0' || ch>'7')
        {
        octal = false;
        }
        if(ch<'0' || ch>'9')
        {
            decimal=false;
        }
        if(!((ch >= '0' && ch <= '9') ||(ch >= 'A' && ch <= 'F') ||(ch >= 'a' && ch <= 'f')))
        {
            hexadecimal = false;
        }
    }
    if(binary)
    {
         System.out.println("this is binary");
    }    
    else if(octal)
    {
        System.out.println("this is octal and radix base is 8");
    }
    else if(decimal)
    {
         System.out.println("this is decimal");
    }else if(hexadecimal)
    {
         System.out.println("this is hexadecimal");
    }

}    
}