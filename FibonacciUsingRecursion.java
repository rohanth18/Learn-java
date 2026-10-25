public class FibonacciUsingRecursion 
{
    public static int fib(int n) {
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }
    public static void main(String[] args) 
    {
        int result = fib(2);
        System.out.println(result);
        
    }
}
