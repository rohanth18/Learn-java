/* import java.util.*;

public class Numbersystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        int type = 2;

        for (int i = 0; i < num.length(); i++)
        {
            char ch = num.charAt(i);

            if (ch >= 'A' && ch <= 'F' || ch >= 'a' && ch <= 'f')
            {
                type = 16;
                break;
            }
            else if (ch >= '8' && ch <= '9')
            {
                if (type < 10)
                    type = 10;
            }
            else if (ch >= '2' && ch <= '7')
            {
                if (type < 8)
                    type = 8;
            }
            else if (ch != '0' && ch != '1')
            {
                type = -1;
                break;
            }
        }

        if (type == 2)
            System.out.println("Binary Number");
        else if (type == 8)
            System.out.println("Octal Number");
        else if (type == 10)
            System.out.println("Decimal Number");
        else if (type == 16)
            System.out.println("Hexadecimal Number");
        else
            System.out.println("Invalid Number");
    }
} */
/* import java.util.*;

public class Numbersystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();

        System.out.print("Enter radix/base: ");
        int radix = sc.nextInt();

        switch(radix)
        {
            case 2:
                System.out.println(num + " is a Binary Number");
                break;

            case 8:
                System.out.println(num + " is an Octal Number");
                break;

            case 10:
                System.out.println(num + " is a Decimal Number");
                break;

            case 16:
                System.out.println(num + " is a Hexadecimal Number");
                break;

            default:
                System.out.println("Invalid Radix");
        }
    }
} */

import java.util.*;

public class Numbersystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();

        int radix;
        int value;

        if (num.charAt(0) == '0' && num.charAt(1) == 'b')
        {
            radix = 2;

            System.out.println("Binary");
        }
        else if (num.charAt(0) == '0' && num.charAt(1) == 'x')
        {
            radix = 16;

            System.out.println("Hexadecimal");
        }
        else if (num.charAt(0) == '0' && num.length() > 1)
        {
            radix = 8;

            System.out.println("Octal");
        }
        else
        {
            radix = 10;

            System.out.println("Decimal");
        }
    }
}