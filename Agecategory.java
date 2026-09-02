import java.util.*;
public class Agecategory 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        if (age>0 && age<12)
        {
            System.out.println("Child");
        }
        else if(age>12 && age<19)
        {
            System.out.println("Teenager");
        }
        else if(age>19 && age<39)
        {
            System.out.println("Young Adult");
        }
        else if(age>39 && age<59)
        {
            System.out.println("Middle aged Adult");
        }
        else if(age>59 && age<110)
        {
            System.out.println("Senior citizen");
        }
        else
        {
            System.out.println("Invalid age");
        }

        
    }
    
}
