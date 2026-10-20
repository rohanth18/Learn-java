public class ExpandingCharArray 
{
    public static void printArray(char[] charArray)
    {
        for(int i = 0; i < charArray.length; i++)
        {
            if(charArray[i] == '\u0000')
            {
                break;
            }
            System.out.print(charArray[i]);
        }
    }
    public static int getReadIndex(char[] charArray)
    {
        int readIndex = 0;
        for(int i = 0; i < charArray.length; i++)
        {
            if(charArray[i] == '\u0000')
            {
                break;
            }
            readIndex++;
        }
        return readIndex - 1;
    }
    public static int getWriteIndex(char[] charArray)
    {
        int writeIndex = 0;
        for(int i = 0; i < charArray.length; i++)
        {
            if(charArray[i] == '\u0000')
            {
                break;
            }
            if(charArray[i] > '0' && charArray[i] <= '9')
            {
                writeIndex += charArray[i] - '1';
            }
            else
            {
                writeIndex++;
            }
        }
        return writeIndex-1;
    }
    public static void expandArray(char[] charArray)
    {
        int readIndex = getReadIndex(charArray);
        int writeIndex = getWriteIndex(charArray);
        while(readIndex >= 0)
        {
            if(charArray[readIndex] > '0' && charArray[readIndex] <= '9')
            {
                char previous = charArray[readIndex-1];
                int count = charArray[readIndex] - '0';
                while(count > 1)
                {
                    charArray[writeIndex] = previous;
                    writeIndex--;
                    count--;
                }
            }
            else
            {
                charArray[writeIndex] = charArray[readIndex];
                writeIndex--;
            }
            readIndex--;
        }
    }
    public static void main(String[] args) 
    {
        String string = "a3b2c";
        char[] charArray = new char[20];
        for(int i = 0; i < string.length(); i++)
        {
            charArray[i] = string.charAt(i);
        }
        System.out.println("Array before expanding");
        printArray(charArray);
        expandArray(charArray);
        System.out.println("Array after expanding");
        printArray(charArray);
        

        
    }
    
}
