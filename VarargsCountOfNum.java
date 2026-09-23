public class VarargsCountOfNum 
{
    static int countOfKey(int... nums)
    {
        int count=0;
        for(int x:nums)
        {
            if(x==20)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        System.out.println(countOfKey(20,10,20,30,20,40,30));
    }
    
}
