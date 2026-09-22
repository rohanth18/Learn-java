/* public class FindMaxUsingForEach 
{
    static int findMax(int[] arr)
    {
        int max=0;
        for(int x:arr)
        {
            if(x>max)
            {
                max=x;
            }
        }
        return max;
    }



    public static void main(String[] args) 
    {
        int[] arr = {20, 301, 40};
        System.out.println("Max element="+findMax(arr));
        
    }
    
}
 */

//Using nstance method
public class FindMaxUsingForEach 
{
    int findMax(int[] arr)
    {
        int max=0;
        for(int x:arr)
        {
            if(x>max)
            {
                max=x;
            }
        }
        return max;
    }
    public static void main(String[] args) 
    {
        int[] arr = {20, 301, 40};
        FindMaxUsingForEach obj = new FindMaxUsingForEach();
        System.out.println("Max element="+obj.findMax(arr));
        
    }
    
}
