public class Arithop 
{
    public static void main(String[] args) 
    {
        //Arithmetic opertors
        //Addition(+) operator
        int num1=15;
        int num2=25;
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        System.out.println();
        System.out.println("Addition operation num1+num2="+(num1+num2)); 

        System.out.println();
        System.out.println("Subtraction operation num1-num2="+(num1-num2));
        
        System.out.println();
        System.out.println("Multiplication operation num1*num2="+(num1*num2));
        
        System.out.println();
        System.out.println("Division operation num1/num2="+(num1/num2));

        System.out.println();
        System.out.println("Modulus operation num1%num2="+(num1%num2)); 
        
        //Unary operation
        System.out.println();
        
        //System.out.println("Unary Addition operation num1++="+(num1++)); it will increments the value 
        // but not prints the incremented value
        System.out.println("Unary Addition operation ++num1="+(++num1)); //prints 16

        System.out.println();
        //System.out.println("Unary subtraction operation num1--="+(num1--)); it will decerements the value 
        // but not prints the decrement value
        System.out.println("Unary subtraction operation --num1="+(--num1));//it will prints 15
        System.out.println();

        //Performing modulus operation for different type of values
        System.out.println("For int and int values 20 and 6="+(20%6));
        System.out.println("For float and int values 20.0 and 6="+(20.0%6));
        System.out.println("For float and float values 20.0 and 6.0="+(20.0%6.0));
        System.out.println();

        //Performing opertions to check precedence
        System.out.println("10+5*2="+((10+5*2)));
        System.out.println("(10+5)*2"+((10+5)*2));
        System.out.println("20-5+2"+(20-5+2));
        System.out.println("20-(5+2)"+(20-(5+2)));
        System.out.println();

        //Performing operation for boolean values
        // boolean x=true;
        // boolean y=false;
        // System.out.println("x+y"+(x+y));
        // System.out.println("x-y"+(x-y));
        // System.out.println("x*y"+(x*y));
        // System.out.println("x/y"+(x/y));
        // System.out.println("x%y"+(x%y)); not possible for boolean
        System.out.println();
        float a=20.5f;
        float b=3.6f;
        System.out.println("Division of a and b="+(a/b));
        System.out.println("Modulus of a and b="+(a%b));

        System.out.println();
        double c=20.5;
        double d=3.6;
        System.out.println("Division of a and b="+(c/d));
        System.out.println("Modulus of a and b="+(c%d));
        
        
    }
    
}
