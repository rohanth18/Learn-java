public class NoOfPosNegZeroEle 
{
    int positiveEle(int[] arr)
    {
        int count=0;
        for(int x:arr)
        {
            if(x>0)
            {
                count++;
            }
        }
        return count;
    }
    int negativeEle(int[] arr)
    {
        int count=0;
        for(int x:arr)
        {
            if(x<0)
            {
                count++;
            }
        }
        return count;
    }
    int zeroEle(int[] arr)
    {
        int count=0;
        for(int x:arr)
        {
            if(x==0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        int[] arr = {10,-1,0,34,0,-2,3,0};
        NoOfPosNegZeroEle obj = new NoOfPosNegZeroEle();
        System.out.println("No of Positive elements ="+obj.positiveEle(arr));
        System.out.println("No of Positive elements ="+obj.negativeEle(arr));
        System.out.println("No of Positive elements ="+obj.zeroEle(arr));



        
    }
}
