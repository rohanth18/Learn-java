
//Demonstration of typecasting

public class Typecast 
{
    public static void main(String[] args) 
    {
       /*widening-->Put smaller data into larger datatype
       int num=100;
       int result=num;
       
       System.out.println(result);*/

       /*Narrowing -->Put larger datatype into smaller
        */
       int num=100;
       byte result=(byte)num;
       System.out.println(result);
    }
}
