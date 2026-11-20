//Leetcode 125
//Approach 2 : build clean String using StringBuilder
//Reason : Avoid creating multiple String objects while cleaning
//Time complexity : O(n)
//Space complexity :

public class ValidPalindrome1 
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

        //Step 2
        //Use StringBuilder as it has append() method to acoid creating new String

        StringBuilder cleaned = new StringBuilder();

        for(int i = 0; i < input.length(); i++)
        {
            char currChar = input.charAt(i);
            if(Character.isLetterOrDigit(currChar))//Check if current char is letter or digit
            {
                cleaned.append(currChar);
            }
        }

        //Step 3) Reverse the cleaned String

        StringBuilder reversebuilder = new StringBuilder(cleaned);
        reversebuilder.reverse();
        

        //Step 4)compare
        return cleaned.toString().equals(reversebuilder.toString());
    }
}
