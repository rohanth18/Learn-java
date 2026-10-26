package Traversing_from_Right;

import java.util.Scanner;

public class InPlaceArrayReverse 
{
    public static void reverseArray(int[] nums)
    {
        int j=0;
        for(int i = nums.length - 1; j <= i;i--)
        {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            j++;
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
        reverseArray(nums);
        System.out.println("Array after reversing");
        for(int num : nums)
        {
            System.out.print(num+" ");
        }
    }
}
