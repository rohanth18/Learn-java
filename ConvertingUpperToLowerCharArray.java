public class ConvertingUpperToLowerCharArray 
{
    public static boolean isAlphabet(char ch)
    {
        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
        {
            return true;
        }
        return false;
    }
    public static char[] getUpperCaseArrayElements(char[] letters)
    {
        if(letters == null)
        {
            return null;
        }
        if(letters.length == 0)
        {
            return new char[] {};
        }
        char[] upperCaseArray = new char[letters.length];
        for(int i = 0; i < letters.length; i++)
        {
            if(isAlphabet(letters[i]))
            {
                if(letters[i] >= 'a' && letters[i] <= 'z')
                {
                    upperCaseArray[i] = (char)(letters[i] - 32);
                }
                else
                {
                    upperCaseArray[i] = letters[i];
                }
            }
            else
            {
                upperCaseArray[i] = letters[i];
            }
        }
        return upperCaseArray;
    }
    public static void main(String[] args) 
    {
        char[] letters = {};
        char[] upperCaseLetters = getUpperCaseArrayElements(letters);
        if(upperCaseLetters == null)
        {
            System.out.println("Null array");
        }
        else
        {
            for(int i = 0; i < upperCaseLetters.length; i++)
            {
                System.out.print(upperCaseLetters[i]+" ");
            }
        }
    }
}
