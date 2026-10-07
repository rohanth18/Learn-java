import java.util.Scanner;
public class AverageArrayValue 
{
    public static double averageValue(int[] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
        int sum = 0;
        double average = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
        }
        average = (double)sum / nums.length;
        return average;
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
        double result = averageValue(nums);
        if(result == 0)
        {
            System.out.println("Array is null or empty");
        }
        else
        {
            System.out.println("Average = "+result);
        }
        
    }
    
}
