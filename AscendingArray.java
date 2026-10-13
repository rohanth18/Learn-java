public class AscendingArray 
{
    public static boolean isAscendingArray(int[] nums)
    {
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] < nums[i-1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        int[] nums = {3, 7, 15, 13};
        System.out.println(isAscendingArray(nums));
        
    }
    
}
