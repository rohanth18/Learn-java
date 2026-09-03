import java.util.*;
public class Calcimenu 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1 value");
        int num1=sc.nextInt();
        System.out.println("Enter num2 value");
        int num2=sc.nextInt();
        System.out.println("========Menu========");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("MOD");
        System.out.println("Enter option:");
        String option=sc.next();
        switch(option.toUpperCase())
        {
            case "ADD":
                System.out.println(num1+num2);
                break;
            case "SUB":
                System.out.println(num1-num2);
                break;
            case "MUL":
                System.out.println(num1*num2);
                break;
            case "DIV":
                System.out.println(num1/num2);
                break;
            case "MOD":
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid option");
        }
        
    }
    
}
