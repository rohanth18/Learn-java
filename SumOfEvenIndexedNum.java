import java.util.Scanner;

public class SumOfEvenIndexedNum 
{
    public static int getSumOfEvenIndexedNum(int[] nums)
    {
        if(nums == null || nums.length == 0)
            return -1;

        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(i % 2 == 0)
            {
                sum = sum + nums[i];
            }
        }
        return sum;
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
        int result = getSumOfEvenIndexedNum(nums);
        System.out.println("Sum of Even Indexed Numbers : "+ result);
    }
    
}
