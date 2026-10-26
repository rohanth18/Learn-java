package Traversing_from_Right;

import java.util.Scanner;

public class LastPositive 
{
    public static int getLastPositive(int[] nums)
    {
        int positive = 0;
        for(int i = nums.length - 1; i >= 0; i--)
        {
            if(nums[i] > 0)
            {
                positive = nums[i];
                break;
            }
        }
        return positive;
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
        int result = getLastPositive(nums);
        if(result == 0)
        {
            System.out.println("No positive integers in array");
        }
        else
        {
            System.out.println("Last positive number = "+result);
        }

    }
    
}
