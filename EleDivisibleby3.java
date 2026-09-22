public class EleDivisibleby3 
{
    void printEleDivBy3(int[] arr)
    {
        System.out.println("Numbers divisible by 3 are:");
        for(int x:arr)
        {
            if(x%3==0)
            {
                System.out.println(x);
            }
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,21,12,10};
        EleDivisibleby3 obj = new EleDivisibleby3();
        obj.printEleDivBy3(arr);

        
    }
    
}
