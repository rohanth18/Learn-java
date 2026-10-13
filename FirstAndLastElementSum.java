public class FirstAndLastElementSum 
{
    public static int getSum(int[] nums)
    {
        return nums[0] + nums[nums.length-1];
    }
    public static void main(String[] args) 
    {
        int[] nums = {10, 20, 30, 40};
        System.out.println(getSum(nums));
        
    }
    
}
