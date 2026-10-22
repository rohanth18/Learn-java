public class RecursionSumOfDigits 
{
    static int sum = 0;
    static void sumOfDigits(int n)
    {

        if(n == 0)
        {
            System.out.println(sum);
            return;
        }
        int digit = n % 10;
        sum = sum + digit;
        sumOfDigits(n / 10);
    }
    public static void main(String[] args) 
    {
        sumOfDigits(342);
    }
}
