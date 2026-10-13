public class SignChangeCount 
{
    public static int getSignChangeCount(int[] nums)
    {
        int count = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] > 0 && nums[i-1] < 0 || nums[i] < 0 && nums[i-1] > 0 )
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int[] nums = {3, -2, -5, 4, 6, -1};
        System.out.println(getSignChangeCount(nums));
        
    }
    
}
