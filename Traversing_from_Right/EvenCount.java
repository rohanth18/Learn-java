package Traversing_from_Right;


import java.util.*;
public class EvenCount 
{
    public static int getEvenCount(int[] nums)
    {
        int count = 0;
        for(int i = nums.length - 1; i >= 0; i--)
        {
            if(nums[i] % 2 == 0)
            {
                count++;
            }
        }
        return count;
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
        System.out.println("Num of Even Numbers in array = "+getEvenCount(nums));
        
    }
    
}
