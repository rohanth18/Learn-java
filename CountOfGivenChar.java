public class CountOfGivenChar 
{
    public static int getGivenCharCount(char[] letters, char key)
    {
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
        char[] letters = {'b', 'a', 'n', 'a', 'n', 'a'};
        char key = 'a';
        int result = getGivenCharCount(letters, key);
        System.out.println(result);

        
    }
    
}
