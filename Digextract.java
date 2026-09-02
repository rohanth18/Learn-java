public class Digextract 
{
    public static void main(String[] args) 
    {
        int num=786;
        while(num!=0)
        {
            int digit=num%10;
            System.out.println(digit);
            num=num/10;
        }
        
    }
    
}
