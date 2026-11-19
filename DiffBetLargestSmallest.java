import java.util.Scanner;

public class DiffBetLargestSmallest 
{
    public static int getDifference(int[] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return -1;
        }
        int largest = nums[0];
        int smallest = nums[0];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > largest)
            {
                largest = nums[i];
            }
            else if(nums[i] < smallest)
            {
                smallest = nums[i];
            }
        }
        return largest-smallest;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array :");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++)
        {
            nums[i] = sc.nextInt();
        }
        int result = getDifference(nums);
        System.out.println("Difference = "+result);
        
    }
    
}
