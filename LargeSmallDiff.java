public class LargeSmallDiff 
{
    public static int getLargeSmallElementDiff(int[] arr)
    {
        if(arr == null || arr.length == 0)
        {
            return -1;
        }
        int largest = arr[0];
        int smallest = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        return largest - smallest;
    }
    public static void main(String[] args) 
    {
        int[] arr = {4, 13, 20, 6};
        int difference = getLargeSmallElementDiff(arr);
        System.out.println("Difference : " + difference);
        
    }
    
}
