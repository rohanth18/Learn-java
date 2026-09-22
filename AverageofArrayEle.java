public class AverageofArrayEle 
{

    int average(int[] arr)
    {
        int sum=0;
        for(int x:arr)
        {
            sum+=x;
        }
        return sum/arr.length;
    }
    public static void main(String[] args) 
    {
        int[] arr={10,20,30,40};
        AverageofArrayEle obj = new AverageofArrayEle();
        System.out.println(obj.average(arr));
        
    }
    
}
