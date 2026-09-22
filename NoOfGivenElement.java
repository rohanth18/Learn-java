public class NoOfGivenElement 
{
    int getNoOfGivenElement(int[] arr,int key)
    {
        int count=0;
        for(int x:arr)
        {
            if(x==key)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,1,2,3,1,2,1};
        NoOfGivenElement obj = new NoOfGivenElement();
        System.out.println(obj.getNoOfGivenElement(arr,1));
        
    }
    
}
