public class FirstNSumRecursion 
{
    static int sum = 0;
    static void firstNSum(int n)
    {
        if(n == 0)
        {
            System.out.println("Sum = "+sum);
            return;
        }
        sum = sum + n;
        firstNSum(n - 1);
    }
    public static void main(String[] args) 
    {
        firstNSum(5);
        
    }
    
}
