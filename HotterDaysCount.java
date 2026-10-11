import java.util.Scanner;

public class HotterDaysCount 
{
    public static int getHotterDaysCount(int[] nums)
    {
        if(nums == null || nums.length == 0)
            return -1;

        int count = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] > nums[i-1])
                count++;
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
        int result = getHotterDaysCount(nums);
        System.out.println("Num of Hotter days than before : "+ result);
        
    }
    
}
