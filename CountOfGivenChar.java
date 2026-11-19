public class CountOfGivenChar 
{
    public static int getGivenCharCount(char[] letters, char key)
    {
        if(letters == null || letters.length == 0)
        {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < letters.length; i++)
        {
            if(letters[i] == key)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        char[] letters = null;
        char key = 'a';
        int result = getGivenCharCount(letters, key);
        if(result == -1)
        {
            System.out.println("Null array or empty array");
        }
        else
        {
            System.out.println(result);
        }
    }
}
