package Traversing_from_Right;

import java.util.Scanner;

public class ReplaceElementsWithRightHighest 
{
    public static void getReplacedArrayWithRightHighest(int[] nums)
    {
        int[] numscopy = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            numscopy[i] = nums[i];
        }
        int largest = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--)
        {
            nums[i] = largest;
            if(numscopy[i] > largest)
            {
                largest = numscopy[i];
            }
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
        System.out.println("Array after replacing");
        getReplacedArrayWithRightHighest(nums);
        for(int num : nums)
        {
            System.out.print(num+" ");
        }
    }
}
