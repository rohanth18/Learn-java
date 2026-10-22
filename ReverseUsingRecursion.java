public class ReverseUsingRecursion 
{
    static int rev = 0;
    static void sumOfDigits(int n)
    {

        if(n == 0)
        {
            System.out.println(rev);
            return;
        }
        int digit = n % 10;
        rev = rev * 10 + digit;
        sumOfDigits(n / 10);
    }
    public static void main(String[] args) 
    {
        sumOfDigits(342);
    }
}
