package Traversing_from_Right;

import java.util.Scanner;

public class MoveZeroesToFront 
{
    public static void moveZeroesToFront(int[] nums)
    {
        int j = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--)
        {
            if(nums[i] != 0)
            {
                nums[j] = nums[i];
                j--;
            }
        }
        while(j >= 0)
        {
            nums[j] = 0;
            j--;
        }
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
        moveZeroesToFront(nums);
        for(int num : nums)
        {
            System.out.print(num+" ");
        }
    }
}
