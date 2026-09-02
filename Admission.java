import java.util.*;
public class Admission 
{
    public static void main(String[] args) {
    //Without using Scanner class   
    /* 
    int marks=85;
    boolean passed=true;
    if (marks>=80 && passed)
    {
        System.out.println("Eligible for admission");
    }
    else
    {
        System.out.println("Not eligible");
    } */
   Scanner sc=new Scanner(System.in);
   int marks;
   boolean passed;
   System.out.println("Enter marks:");
   marks=sc.nextInt();
   System.out.println("Enter whether passed:true or failed:false");
   passed=sc.nextBoolean();
   if(marks>=80 && passed)
   {
        System.out.println("Eligible for Admission");
   }
   else
    {
        System.out.println("Not eligible for Admission");
    }

}
}
