import java.util.Scanner;

public class StudentAverageMarks 
{
    public static double averageMarksOfStudent(int[] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
        if(nums.length == 1)
        {
            return nums[0];
        }
        double sum = 0;
        double average = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
        }
        average = sum / nums.length;
        return average;
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
        double result = averageMarksOfStudent(nums);
        System.out.println("Average marks : "+result);
    }
}
