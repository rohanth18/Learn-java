import java.util.Scanner;

public class CompareElements 
{
    public static void compareElements(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                if(i != j)
                {
                    if(array[i] < array[j])
                    {
                        System.out.println(array[i]+" < "+array[j]);
                    }
                    else if(array[i] > array[j])
                    {
                        System.out.println(array[i]+" > "+array[j]);
                    }
                    else
                    {
                        System.out.println(array[i]+" > "+array[j]);
                    } 
                }
            }System.out.println();
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
        System.out.println("Comparing elements");
        compareElements(array);
        
    }
    
}
