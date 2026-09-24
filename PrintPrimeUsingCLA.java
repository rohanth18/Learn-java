public class PrintPrimeUsingCLA 
{
    public static void main(String[] args) 
    {
        
        for(String x : args)
        {
            int num=Integer.parseInt(x);
            int count=0;
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }
                if(count==2)
                {
                    System.out.println(num);
                }
        }
        
    }
    
}
