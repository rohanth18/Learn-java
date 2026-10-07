public class BinarySearch 
{
    public static int binarySearch(int[] array, int target)
    {
        if(array.length == 0 || array == null)
        {
            return -1;
        }
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while(leftIndex <= rightIndex)
        {
            int midIndex = leftIndex + (rightIndex - leftIndex)/2;
            if(array[midIndex] == target)
            {
                return midIndex;
            }
            else if(array[midIndex] < target)
            {
                leftIndex = midIndex + 1;
            }
            else if(array[midIndex] > target)
            {
                rightIndex = midIndex - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int[] array = {10, 20, 30, 40, 50};
        int target = 60;
        int result = binarySearch(array, target);

        if(result == -1)
        {
            System.out.println("Element not present");
        }
        else
        {
            System.out.println("Element present at index : "+result);

        }
    }
    
}
