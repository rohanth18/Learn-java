import java.util.Scanner;

public class DaysCrossed10kSteps 
{
    public static int[] getDaysCrossed10kSteps(int[] nums)
    {
        if(nums == null || nums.length == 0)
            return nums;

        int count = 0;
        int highestSteps = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 10000)
                count++;
            if(nums[i] > highestSteps)
                highestSteps = nums[i];
        }
        return new int[] {count,highestSteps};
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
        int[] newnums = getDaysCrossed10kSteps(nums);
        System.out.println(newnums[0]+" "+newnums[1]);
    }
    
}
