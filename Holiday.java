import java.util.*;
public class Holiday 
{
    public static void main(String[] args) 
    {
        //Without using scanner class
        /* String day="Monday";
        if(day.equals("Sunday") || day.equals("Saturday"))
        {
            System.out.println("Holiday");
        }
        else
        {
            System.out.println("Working day");

        } */
       Scanner sc=new Scanner(System.in);
       String day;
       System.out.println("Enter day");
       day=sc.nextLine();
       if(day.equals("Sunday") || day.equals("Saturday"))
        {
            System.out.println("Holiday");
        }
        else
        {
            System.out.println("Working day");

        }

    }
    
}
