public class SecondLargest 
{
    int getSecondLargest(int[] arr)
    {
        int firstLarge=0;
        int secondLarge=0;
        for(int x:arr)
        {
            if(x>firstLarge)
            {
                secondLarge=firstLarge;
                firstLarge=x;
            }
        }
        return secondLarge;
    }
    public static void main(String[] args) 
    {
        int[] arr = {10,20,15,5};
        SecondLargest obj = new SecondLargest();
        System.out.println(obj.getSecondLargest(arr));
        
    }
    
}
