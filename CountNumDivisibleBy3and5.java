import java.util.Scanner;

public class CountNumDivisibleBy3and5 
{
    public static int countNumDivisibleBy3and5(int[] nums)
    {
        if(nums == null || nums.length == 0)
            return -1;
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 3 == 0 && nums[i] % 5 == 0)
            {
                count++;
            }
        }
        return count;
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
        int result = countNumDivisibleBy3and5(nums);
        System.out.println(result);
        
    }
    
}
