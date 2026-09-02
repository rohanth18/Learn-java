import java.util.*;
public class Scholarship 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks scored:");
        int score=sc.nextInt();
        
        if(score>70)
        {
            System.out.println("Enter family income:");
            int income=sc.nextInt();
            if(income<400000)
            {
                System.out.println("Eligible for Scholarship");
            }
            else
            {
                System.out.println("Not eligible for scholarship");
            }
        }
        else
        {
            System.out.println("Not eligible for Scholarship");
        }
    }
    
}
