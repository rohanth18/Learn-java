import java.util.Scanner;
public class ReplaceEvenAndOdd 
{
    public static void replaceEvenOdd(int[] nums)
    {
        if(nums == null || nums.length == 0)
            return;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                nums[i] = 0;
            }
            else
            {
                nums[i] = 1;
            }
        }
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
        replaceEvenOdd(nums);
        System.out.println("Array after replacing :");
        for(int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    
}
