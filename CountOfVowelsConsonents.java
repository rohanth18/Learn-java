public class CountOfVowelsConsonents 
{
    public static boolean isVowel(char ch)
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
                ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' ||
                ch == 'U')
        {
            return true;       
        }
        return false;
    }
    public static boolean isAlphabet(char ch)
    {
        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
        {
            return true;
        }
        return false;
    }
    public static int[] getVowelsConsonentsCount(char[] alpha)
    {
        if(alpha == null)
        {
            return null;
        }
        if(alpha == null)
        {
            return  new int[] {0,0};
        }
        int vowels = 0;
        int consonents = 0;
        for(char ch : alpha)
        {
            if(isAlphabet(ch))
            {
                if(isVowel(ch))
                {
                    vowels++;
                }
                else
                {
                    consonents++;
                }
            }
        }
        return new int[] {vowels, consonents};
    }
    public static void main(String[] args) 
    {
        char[] alpha = {'a', 'p', 'p', 'l', 'e'};
        int[] result = getVowelsConsonentsCount(alpha);
        if(result == null)
        {
            System.out.println("Array is null");
        }
        else
        {
            System.out.println("["+result[0]+" "+result[1]+"]");
        }
    }
}
