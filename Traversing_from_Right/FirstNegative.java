package Traversing_from_Right;

import java.util.Scanner;

public class FirstNegative 
{
    public static int getFirstNeg(int[] nums)
    {
        int neg = 0;
        for(int i = nums.length - 1;i >= 0; i--)
        {
            if(nums[i] < 0)
            {
                neg = nums[i];
                break;
            }
        }
        return neg;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array elements :");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter array elements");
        for(int i = 0; i < size; i++)
        {
            nums[i] = sc.nextInt();
        }
        int result = getFirstNeg(nums);
        if(result == 0)
        {
            System.out.println("No negative elements in array");
        }
        else
        {
            System.out.println("First negative element "+result);
        }
        
    }
    
}
