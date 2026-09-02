public class Digitsadd 
{
    public static void main(String[] args) 
    {
        int num=482;
        int sum=0;
        while(num!=0)
        {
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
            
        }
        System.out.println("Sum of digits of num 482="+sum);
    }

}
