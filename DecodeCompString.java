//Problem : Decode compressed String
//Input : a3b4c2
//output : aaabbbbcc
//Assumption : Only single digit number after a letter
//Use StringBuilder : Bcoz we dont know size of the output
//TC : O(n^2)
//SC : O(n)

//parsing + StringBuilder
public class DecodeCompString 
{
    public static void main(String[] args) 
    {
        testdecode("a3b4c2");
        testdecode("x1y5");
        testdecode("m2n3");
        testdecode("m2n0");
    }
    
    //test method
    static  void testdecode(String input)
    {
        System.out.println("Input :"+input);
        System.out.println("Output :"+decode(input));
        System.out.println();

    }

    //Decode method
    static String decode(String input)
    {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < input.length(); i+=2)
        {
            //read chars
            char currChar = input.charAt(i);

            //read digit
            int number = input.charAt(i+1) - '0';//parsing : converting one format to other
            //number = number * 10 + (input.charAt(i) - '0')
            //int number = '3' - '0' //51 - 48 = 3

            //append
            for(int count = 1; count <= number; count++)
            {
                answer.append(currChar);
            }
        }
        
        return answer.toString();
    }
}
