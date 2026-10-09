import java.util.Scanner;

public class BubbleSort 
{
    public static void bubbleSort(int[] array)
    {
        if(array == null || array.length == 0 || array.length==1)
        {
            return;
        }
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length - 1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] array)
    {
        if(array == null)
        {
            return;
        }
        else
        {
            for(int i = 0; i < array.length; i++)
            {
                System.out.print(array[i]+" ");
            }
        }
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
        //int[] array = null;
        
        System.out.println("Array before sorting");
        printArray(array);

        
        bubbleSort(array);
        System.out.println("\nArray after sorting");
        printArray(array);
    }
    
}
