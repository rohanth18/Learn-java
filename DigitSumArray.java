public class DigitSumArray 
{
    public static int[] sumOfDigitsArray(int[] nums)
    {
        int[] newnums = new int[nums.length];
        int writeIndex = 0;
        for(int i = 0; i < nums.length; i++)
            {
                int sum = 0;
                int num = nums[i];
                while(num!=0)
                {
                    int digit = num % 10;
                    sum = sum + digit;
                    num = num / 10;
                }
                newnums[writeIndex] = sum;
                writeIndex++;
            } 
            return newnums;
    }
    public static void main(String[] args) 
    {
        int[] nums = {123, 45, 9};
        int[] newnums = sumOfDigitsArray(nums);
        for(int i = 0; i < newnums.length; i++)
        {
            System.out.print(newnums[i]+" ");
        }
        
    }
    
}
