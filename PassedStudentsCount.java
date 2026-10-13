public class PassedStudentsCount 
{
    public static int getPassedStudentsCount(int[] marks)
    {
        if(marks == null || marks.length == 0)
            return -1;

        int count = 0;
        for(int i = 0; i < marks.length; i++)
        {
            if(marks[i] >= 35 && marks[i] < 100)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int[] marks = {27,35,87,77,56};
        int CountPassed = getPassedStudentsCount(marks);
        System.out.println("Passed student count : " + CountPassed);
        
    }
    
}
