public class Binaryofdec 
{
    public static void main(String[] args) 
    {

        double num = 8.1;

        int integerPart = (int) num;
        double fractionalPart = num - integerPart;

        // Print integer part
        System.out.print(Integer.toBinaryString(integerPart) + ".");

        // Print fractional part
        for (int i = 0; i < 40; i++) {
            fractionalPart *= 2;

            if (fractionalPart >= 1) {
                System.out.print("1");
                fractionalPart -= 1;
            } else {
                System.out.print("0");
            }
        }
    }
}