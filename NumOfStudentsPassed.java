import java.util.Scanner;

public class NumOfStudentsPassed 
{
    public static int getPassedStudentsCount(int[] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return -1;
        }

        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] >= 35)
            {
                count++;
            }
        }
        return count;
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
        int result = getPassedStudentsCount(nums);
        System.out.println("Number of passed students : "+result);
        
    }
    
}
