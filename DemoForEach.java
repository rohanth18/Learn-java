import java.util.*;
public class DemoForEach 
{
    void display(int[] a)
    {
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }

    void modifyforeach(int[] a)
    {
        for(int x:a)
        {
            x=x*10;
        }
    }

    void modifyfor(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=a[i]*10;
        }
    }
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        } 
        DemoForEach obj = new DemoForEach();
        System.out.println("Original array");
        obj.display(a);

        obj.modifyforeach(a);
        System.out.println("\narray after modify using for each");
        obj.display(a);

        obj.modifyfor(a);
        System.out.println("\nArray after modify using for");
        obj.display(a);


        
    }
    
}
