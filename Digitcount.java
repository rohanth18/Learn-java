public class Digitcount
{
    public static void main(String[] args)
    {
        int num=1001;
        int sum=0;
        while(num>0)
        {
            num=num/10;
            sum=sum+1;
        }
        System.out.println(sum);
    }
}