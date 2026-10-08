import java.util.Scanner;
public class NumOfOddEven 
{
    public static int[] numberOfEvenOddElements(int[] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return new int[] {};
        }

        int oddCount = 0;
        int evenCount = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        return new int[] {oddCount, evenCount};
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
        int[] result = numberOfEvenOddElements(nums);
        System.out.println(result[0] +" "+result[1]);
        
    }
    
}
