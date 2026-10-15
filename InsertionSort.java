public class InsertionSort 
{
    public static void insertionSort(int[] array)
    {
        if(array == null || array.length == 0)
            return;
        for(int k = 1; k < array.length; k++)
        {
            int key = array[k];
            int l = k-1;
            while (l >= 0 && array[l] > key) 
            {
                array[l+1] = array[l];
                l--;
            }
            array[l+1] = key;
        }
    }
    public static void main(String[] args) 
    {
        int[] array = {8, 7, 6, 5, 4};
        System.out.println("Before sorting:");
        for(int arr : array)
        {
            System.out.print(arr+" ");
        }
        insertionSort(array);
        System.out.println("\nBefore sorting:");
        for(int arr : array)
        {
            System.out.print(arr+" ");
        }
    }
}
