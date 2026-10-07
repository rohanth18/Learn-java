import java.util.Scanner;
public class SwapArrayElements 
{
    public static void swapElements(int[] nums)
    {
        if(nums == null || nums.length == 0 || nums.length == 1)
            return;
        int left = 0;
        int right = nums.length - 1;
        while(left < right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
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
        swapElements(nums);
        System.out.println("Array after swapping :");
        for(int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
