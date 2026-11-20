//Problem : Valid Palindrome
//Approach 1 : Reverse String
//class used : StringBuilder
//Reason : StringBuilder provides reverse()method 
//Easy to understand the logic
//Good starting approach
//Time compl: O(n)
//Space compl: O(n)

public class ValidPalindrome 
{
    public static void main(String[] args) 
    {
        //test cases
        testPalindrome("madam");
        testPalindrome("racecar");
        testPalindrome("hello");
        testPalindrome("A man, a plan, a canal: Panama");
        testPalindrome("race a car");
        testPalindrome("1221");
        testPalindrome("122@221");
        testPalindrome("");
        
    }

    //Testing
    static void testPalindrome(String input)
    {
        boolean answer = isPalindrome(input);

        System.out.println("input : "+input);
        System.out.println("Output : "+answer);
        System.out.println();
    }

    //write logic here
    //return true if palindrome
    static boolean isPalindrome(String input)
    {
        //Step 1) convert everything to lowercase
        //bcoz -- A and a should be treated same
        input = input.toLowerCase();//madam

        //Step 2) Keep only letters and digits
        //Ignore : spaces, comma, full stop, colon etc
        String cleaned = "";

        for(int i = 0; i < input.length(); i++)
        {
            char currChar = input.charAt(i);
            if(Character.isLetterOrDigit(currChar))//Character is in-built class has isLetterOrDigit() method
            {
                cleaned = cleaned + currChar;
            }
        }

        //Step 3) Reverse the cleaned String

        StringBuilder builder = new StringBuilder(cleaned);
        String reversed = builder.reverse().toString();

        //Step 4)compare
        return cleaned.equals(reversed);
    }
    
}
