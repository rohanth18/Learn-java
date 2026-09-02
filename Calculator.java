import java.util.*;
public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 value");
        int num1=sc.nextInt();
        System.out.println("Enter num2 value");
        int num2=sc.nextInt();
        System.out.println("Enter operation to do(+,-,*,/,%):");
        String operator=sc.next();
        int result;
        switch(operator)
        {
            case "+":
                result=num1+num2;
                System.out.println(num1+"+"+num2+"="+result);
                break;
            case "-":
                result=num1-num2;
                System.out.println(num1+"-"+num2+"="+result);
                break;
            case "*":
                result=num1*num2;
                System.out.println(num1+"*"+num2+"="+result);
                break;
            case "/":
                result=num1/num2;
                System.out.println(num1+"/"+num2+"="+result);
                break;
            case "%":
                result=num1%num2;
                System.out.println(num1+"%"+num2+"="+result);
                break;
            default:
                System.out.println("invalid operator");

        }

    }
    
}
