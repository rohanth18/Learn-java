public class ClosestToAverage 
{
    public static int getCLosestElement(int[] nums)
    {
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
        }
        int average = sum / nums.length;
        int mindiff = average - nums[0];
        int closest = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            int curdiff = 0;
            if(nums[i] > average)
            {
                curdiff = nums[i] - average ; 
            }
            else
            {
                curdiff = average - nums[i];
            }
            if(curdiff < mindiff)
            {
                mindiff = curdiff;
                closest = nums[i];
            }
        }
        return closest;
    }
    public static void main(String[] args) 
    {
        int[] nums = {2 ,9, 4, 15};
        int closest = getCLosestElement(nums);
        System.out.println("CLosest = "+closest);

        
    }
    
}
