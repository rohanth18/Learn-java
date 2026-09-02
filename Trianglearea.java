import java.util.*;
public class Trianglearea 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int height,base;

        float area;
        System.out.println("Enter height of a triangle:");
        height=sc.nextInt();
        System.out.println("Enter base of a triangle:");
        base=sc.nextInt();
        area=(float)1/2*height*base;
        System.out.println("Area of triangle ="+area);
    }
}
