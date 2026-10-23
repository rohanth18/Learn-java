public class EncodeWebUrl 
{
    public static void printUrl(char[] urlArray)
    {
        for(int i = 0; i < urlArray.length; i++)
        {
            if(urlArray[i] == '\u0000')
            {
                break;
            }
            System.out.print(urlArray[i]);
        }
    }
    public static int getWriteIndex(char[] urlArray)
    {
        int count = 0;
        for(int i = 0; i < urlArray.length; i++)
        {
            if(urlArray[i] == ' ')
            {
                count = count + 3;
            }
            else if(urlArray[i] != '\u0000')
            {
                count++;
            }
        }
        return count - 1;
    }
    public static int getReadIndex(char[] urlArray)
    {
        int count = 0;
        for(int i = 0; i < urlArray.length;i++)
        {
            if(urlArray[i] == '\u0000')
            {
                break;
            }
            count++;
        }
        return count - 1;
    }
    public static void encodeWebUrl(char[] urlArray)
    {
        int writeIndex = getWriteIndex(urlArray);
        int readIndex = getReadIndex(urlArray);
        char[] encodeArray = {'%' ,'2', '0'};
        while(readIndex >= 0)
        {
            if(urlArray[readIndex] == ' ')
            {
                int encodeArrayIndex = encodeArray.length - 1;
                while(encodeArrayIndex >= 0)
                {
                    urlArray[writeIndex] = encodeArray[encodeArrayIndex];
                    encodeArrayIndex--;
                    writeIndex--;
                }
            }
            else 
            {
                urlArray[writeIndex] = urlArray[readIndex];
                writeIndex--;
            }
            readIndex--;
        }
    } 
    public static void main(String[] args) 
    {
        String url = "http://a.com/b form/ submit";
        char[] urlArray = new char[40];
        for (int i = 0; i < url.length(); i++) 
        {
            urlArray[i] = url.charAt(i);
        }

        System.out.println("Original url");
        printUrl(urlArray);
        
        encodeWebUrl(urlArray);
        System.out.println("\nEncoded url");
        printUrl(urlArray);

        
    }
    
}
