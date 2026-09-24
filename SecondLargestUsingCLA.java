public class SecondLargestUsingCLA 
{
    public static void main(String[] args) 
    {
        int firstLarge=0;
        int secondLarge=0;
        for(String x : args)
        {
            int num = Integer.parseInt(x);
            if(num>firstLarge)
            {
                secondLarge = firstLarge;
                firstLarge = num;
            }
            if(num<firstLarge && num>secondLarge)
            {
                secondLarge = num;
            }
        }
        System.out.println(secondLarge);
        
    }
    
}
