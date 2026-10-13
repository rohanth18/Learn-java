public class PalindromeCount 
{
    public static int getPalindromeCount(int[] nums)
    {
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int num = nums[i];
            int rev = 0;
            while(num!=0)
            {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }
            if(rev == nums[i])
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int[] nums = {121, 123, 7, 1331};
        System.out.println(getPalindromeCount(nums));
        
    }
    
}
