package Traversing_from_Right;

import java.util.Scanner;

public class LastOccurenceOfElement 
{
    public static int getLastOccuranceOfElement(int[] nums, int key)
    {
        for(int i = nums.length - 1; i >= 0; i--)
        {
            if(nums[i] == key)
            {
                return i;
            }
        }
        return -1;
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
        System.out.println("Enter number to search :");
        int key = sc.nextInt();
        int result = getLastOccuranceOfElement(nums, key);
        if(result == -1)
        {
            System.out.println("Given element is not present");
        }
        else
        {
            System.out.println("Last occurance of "+key+" is at index "+result);
        }

        
    }
    
}
