import java.util.*;
public class LinearSearchUsingMethod 
{
    public static boolean linearSearch(int[] array, int key)
    {
        if(array == null || array.length == 0)
            return false;

        for(int i = 0; i < array.length; i++)
        {
            if(key == array[i])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int key = sc.nextInt();
        boolean result = linearSearch(array, key);
        if(result)
        {
            System.out.println("Element found ");
        }
        else
        {
            System.out.println("Not found");
        }
    }
    
}
