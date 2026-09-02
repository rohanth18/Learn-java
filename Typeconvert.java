//Type promotion: Process where smaller datatype convert to larger datatype by java before performing operation

//Golden rules: 
//1) byte, short and char are always promoted into int before arithmetic operation
//2)If operands are of different types, java promotes the smaller type to larger
//3)Result of the expression 
public class Typeconvert 
{
    public static void main(String[] args) 
    {
        System.out.println("Demo of byte and byte");
        byte num1=10;
        byte num2=20;
        // byte result=num1+num2;-->Wrong, lossy conversion
        int result=num1+num2;
        System.out.println(result);
        System.out.println();

        //Demo of byte and short
        System.out.println("Demo of byte and short");
        byte num3=10;
        short num4=20;
       // byte result1=num3+num4;-->Wrong, lossy conversion
        int result1=num3+num4; 
        System.out.println(result1);
        System.out.println();

        //Demo of short and short
        System.out.println("Demo of short and short");
        short num5=57;
        short num6=63;
        // short result2=num5+num6;--> lossy conversion
        int result2=num5+num6;
        System.out.println(result2);
        System.out.println();

        //Demo of char and short
        System.out.println("Demo of char and short");
        char num7='A';
        short num8=55;
        //short result3=num7+num8;-->lossy conversion
        int result3=num7+num8;
        System.out.println(result3);
        System.out.println();

        //Demo of char and char
        System.out.println("Demo of char and char");
        char num9='A';
        char num10='B';
        //char result4=num9+num10;-->Wrong, lossy conversion
        int result4=num9+num10;
        System.out.println(result4);
        System.out.println();


        //Demo of int and short
        System.out.println("Demo of int and short");
        short num11=100;
        int num12=121;
        //short result5=num11+num12;-->Wrong, lossy conversion
        int result5=num11+num12;
        System.out.println(result5);
        System.out.println();

        //Demo of int and float
        System.out.println("Demo of int and float");
        int num13=37;
        float num14=31.6f;
        //int result6=num13+num14;-->Wrong, lossy conversion
        float result6=num13+num14;
        System.out.println(result6);
        System.out.println();

        //Demo of int and long
        System.out.println("Demo of int and long");
        int num15=156;
        long num16=36268737832877L;
        //int result7=num15+num16;-->Wrong, lossy conversion
        long result7=num15+num16;
        System.out.println(result7);
        System.out.println();

        //Demo of float and double
        System.out.println("Demo of float and double");
        float num17=3.14288274987938f;
        double num18=63.27398237987932984798298839804;
        //float result8=num17+num18;-->Wrong, lossy conversion
        double result8=num17+num18;
        System.out.println(result8);
        System.out.println();

        //Demo of long and double
        System.out.println("Demo of long and double");
        double num19=2337687643878634776437873443893498.32987498798379847894379;
        long num20=99_99_99_99_99_99_99_99_99L;
        //long result9=num19+num20;-->Wrong, lossy conversion
        double result9=num19+num20;
        System.out.println("result9="+result9);
        System.out.println();

        //Demo of long and float
        System.out.println("Demo of long and float");
        long num21=7348938498098349443L;
        float num22=3278.2378f;
        //long result10=num21+num22;-->Wrong, lossy conversion
        float result10=num21+num22;
        System.out.println(result10);
        System.out.println();

        //Demo of char and float
        System.out.println("Demo of char and float");
        char num23='Z';
        float num24=233.134f;
        //char result11=num23+num24;-->Wrong, lossy conversion
        float result11=num23+num24;
        System.out.println(result11);







        
    }
}
