/* public class SumUsingForEach 
{
    static int findSum(int[] arr)
    {
        int sum=0;
        for(int x:arr)//forEach
        {
            sum=sum+x;
        }
        return sum;
    }
    
    
    public static void main(String[] args) 
    {
        int [] array = {10,20,30,40};
        System.out.println(findSum(array));
    }
    
} */


//Using instance method
public class SumUsingForEach 
{
    int findSum(int[] arr)
    {
        int sum=0;
        for(int x:arr)//forEach
        {
            sum=sum+x;
        }
        return sum;
    }
    
    
    public static void main(String[] args) 
    {
        int [] array = {10,20,30,40};
        SumUsingForEach obj = new SumUsingForEach();
        System.out.println(obj.findSum(array));
    }
    
}
