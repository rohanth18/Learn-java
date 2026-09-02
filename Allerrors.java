/* public class Allerrors {
    static int sub()
    {
        return "Subtract";//Return type mismatch 
    }
    public static void main(string[] args)//Case-sensitive error 
    {
        int var1=10//Syntax error
        System.out.println(var1);
        int num1=10;
        int num2=20;
        int sum=num1*num2;//Semantic error
        System.out.println(sum);
        int var2=10.4f;//Type mismatch
        System.out.println(var2);
        System.out.printline(num1);//Wrong method
        int num1=10;//Duplicate variable
        int number;
        System.out.println(number);//Local variable error




    }
//Curly braces error
 */

//Fixing those errors
public class Allerrors {
    static int sub()
    {
        //return "Subtract";//Return type mismatch 
        return 10;
    }
    //public static void main(string[] args)//Case-sensitive error
    public static void main(String[] args)
    {
        /*int var1=10//Syntax error*/
        int var1=10;//Syntax error fixed
        System.out.println(var1);
        int num1=10;
        int num2=20;
        /*int sum=num1*num2;//Semantic error*/
        int sum=num1+num2;//Semantic error fixed
        System.out.println(sum);
        //int var2=10.4f; Type mismatch
        float var2=10.4f;//Type mismatch error fixed
        System.out.println(var2);
        //System.out.printline(num1);//Wrong method
        System.out.println(num1);//Wrong method error fixed
        //int num1=10;//Duplicate variable
        int num3=10;//Duplicate variable error fixed
        //int number;//local variable error
        int number=50;
        System.out.println(number);




    }
//Curly braces error
}//Curly braces error fixed
