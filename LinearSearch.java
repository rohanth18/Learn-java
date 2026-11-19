import java.util.*;
public class LinearSearch 
{
    public static void linearSearch(int[] array, int key)
    {
        boolean found = false;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == key)
            {
                System.out.println("Element Found at index "+i);
                found = true;
                break;
            }
        }
        if(found == false)
        {
            System.out.println("Element is not found");
        }

    }

    public static void linearSearchUsingScanner(int[] array, int size, int key)
    {
        boolean found = false;
        for(int i = 0; i < size; i++)
        {
            if(array[i] == key)
            {
                System.out.println("Element Found at index "+i);
                found = true;
                break;
            }
        }
        if(found == false)
        {
            System.out.println("Element is not found");
        }
    }

    public static int linearSearchByReturning(int[] array, int size, int key)
    {
        for(int i = 0; i < size; i++)
        {
            if(array[i] == key)
            {
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        /* int[] array = {10, 20, 30, 40, 50};//40 is at index 3
        int key = 40;
        
        linearSearch(array, key); */
        int[] array = new int[10];

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        System.out.println("Enter the elememts of the array");
        for(int i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the key element to search :");
        int key = sc.nextInt();

        //linearSearchUsingScanner(array, size, key);

        int result = linearSearchByReturning(array, size, key);
        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at index "+result);
        }




        
    }
    
}
