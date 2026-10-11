import java.util.Scanner;

public class ReplaceNegElements 
{
    public static int[] replaceNegElementsByZero(int[] nums)
    {
        if(nums == null || nums.length == 0)
            return nums;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < 0)
            {
                nums[i] = 0;
            }
        }
        return nums;
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
        int[] newnums = replaceNegElementsByZero(nums);
        for(int i = 0; i < size; i++)
        {
            System.out.print(newnums[i]+" ");
        }
        
    }
    
}
