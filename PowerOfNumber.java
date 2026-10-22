public class PowerOfNumber 
{
    static int result = 1;
    static void powerOfNumber(int base, int power)
    {
        if(power == 0)
        {
            System.out.println(result);
            return;
        }
        result = result * base;
        powerOfNumber(base, power - 1);
    }
    public static void main(String[] args) 
    {
        powerOfNumber(2, 5);
        
    }
    
}
