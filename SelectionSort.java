public class SelectionSort 
{
    public static void selectionSort(int[] array)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            int minValue = array[i];
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[j] < minValue)
                {
                    minValue = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    public static void main(String[] args) 
    {
        int[] array = {3, 2, 1, 0, -1, -2};
        System.out.println("Original array:");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
        selectionSort(array);
        System.out.println("\nSorted array :");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
