public class DiscountPrice 
{
    public static int getFinalAmount(int[] nums)
    {
        int total = 0;
        for(int i = 0; i < nums.length; i++)
        {
            total = total + nums[i];
        }
        int discount = total / 10;
        if(total > 1000)
        {
            total = total - discount;
        }
        return total;
    }
    public static void main(String[] args) 
    {
        int[] nums = {400, 350, 450};
        System.out.println(getFinalAmount(nums));
        
    }
    
}
