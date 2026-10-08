import java.util.Scanner;

public class PrintValidElements 
{
    public static int[] printValidElements(int[] nums)
    {
        int index = 0;
        int count =0;
        // int[] newArray = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 50 && nums[i] < 100)
            {
                // newArray[index] = nums[i];
                // index++;
                count++;
            }
        }

        int[] newArray = new int[count];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 50 && nums[i] < 100)
            {
                newArray[index] = nums[i];
                index++;
                
            }
        }

        return newArray;
        // int[] newArraycopy = new int[index-2]; 
        // newArraycopy = newArray;
        // return newArraycopy;
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

        int[] newArray = printValidElements(nums);
        for(int i = 0; i < newArray.length; i++)
        {
            System.out.print(newArray[i]+" ");
        }
        
    }
    
}
