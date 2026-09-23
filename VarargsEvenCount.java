public class VarargsEvenCount 
{
    static int evenCount(int... nums)
    {
        int count=0;
        for(int x:nums)
        {
            if(x%2==0)
            {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Count of even numbers = "+evenCount(10,15,20,17,24));
        
    }
}
