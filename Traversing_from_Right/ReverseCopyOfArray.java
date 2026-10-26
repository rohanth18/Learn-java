package Traversing_from_Right;

import java.util.Scanner;

public class ReverseCopyOfArray 
{
    public static int[] getArrayReverseCopy(int[] nums)
    {
        int[] newnums = new int[nums.length];
        int j = 0;
        for(int i = nums.length - 1; i >= 0; i--)
        {
            newnums[j] = nums[i];
            j++;
        }
        return newnums;
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
        int[] newnums = getArrayReverseCopy(nums);
        System.out.println("Array after reversing");
        for(int num : newnums)
        {
            System.out.print(num+" ");
        }
        
    }
    
}
