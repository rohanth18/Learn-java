package Traversing_from_Right;

import java.util.Scanner;

public class ArrayGreaterThanGivenElement 
{
    public static int[] getArrayGreaterThanGivenElement(int[] nums, int key)
    {
        int count = 0;
        for(int i = nums.length - 1; i >= 0; i--)
        {
            if(nums[i] > key)
            {
                count++;
            }
        }
        int[] newnums = new int[count];
        int j = newnums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--)
        {
            if(nums[i] > key)
            {
                newnums[j] = nums[i];
                j--;
            }
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
        System.out.println("Enter number that the array elements should be greater than :");
        int key = sc.nextInt();
        int[] newnums = getArrayGreaterThanGivenElement(nums, key);
        System.out.println("Array which has elements greater than "+ key);
        System.out.print("[");
        for(int i = 0; i < newnums.length; i++)
        {
            System.out.print(newnums[i]+" ");
        }
        System.out.print("]");
        
    }
    
}
