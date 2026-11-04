public class PalindromeUsingStack 
{
    static boolean isArrayPalindromeUsingStack(int[] array)
    {
        MyStack palinStack = new MyStack(array.length);
        boolean palindrome = true;
        for(int i = 0; i < array.length; i++)
        {
            palinStack.push(array[i]);
        }

        for(int i = 0; i < array.length; i++)
        {
            int poppedElement = palinStack.pop();
            if(poppedElement != array[i])
            {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
    public static void main(String[] args) 
    {
        int[] array = {1,2,1,2,2,1};
        boolean palindrome = isArrayPalindromeUsingStack(array);
        System.out.println(palindrome);
        
        
    }
    
}
