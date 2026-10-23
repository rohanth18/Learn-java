public class Dhurandar3 
{
    public static boolean isVowel(char ch)
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
                ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||
                ch == 'U')
        {
            return true;       
        }
        return false;
    }
    public static void printMessage(char[] message)
    {
        for(char ch : message)
        {
            System.out.print(ch);
        }
    }
    //Encrypt the message by replacing the vowel characters by *
    public static void miniEncryption(char[] message)
    {
        for(int i = 0; i < message.length; i++)
        {
            if(isVowel(message[i]))
            {
                message[i] = '*';
            }
        }
    }
    //Encypting message by replacing vowels with different symbols
    public static void miniEncryptionV2(char[] message)
    {
        for(int i = 0; i < message.length; i++)
        {
            if(isVowel(message[i]))
            {
                if(message[i] == 'a')
                {
                    message[i] = '#';
                }
                if(message[i] == 'e')
                {
                    message[i] = '$';
                }
                if(message[i] == 'i')
                {
                    message[i] = '%';
                }
                if(message[i] == 'o')
                {
                    message[i] = '^';
                }
                if(message[i] == 'u')
                {
                    message[i] = '&';
                }
            }
        }
    }
    //Decrypting message by replacing symbol by actual letters in original array
    public static void miniDecryption(char[] message)
    {
        for(int i = 0; i < message.length; i++)
        {
            if(message[i] == '#')
            {
                message[i] = 'a';
            }
            if(message[i] == '$')
            {
                message[i] = 'e';
            }
            if(message[i] == '%')
            {
                message[i] = 'i';
            }
            if(message[i] == '^')
            {
                message[i] = 'o';
            }
            if(message[i] == '&')
            {
                message[i] = 'u';
            }  
        }
    }

    //Encrpting the message by adding random numbers to the character's ascii value
    public static void miniEncryptionV3(char[] message)
    {
        int fixedLength = 5;
        for(int i = 0; i < message.length; i++)
        {
            message[i] = (char)(message[i] + fixedLength - i);
        }
    }

    //Decrypting the message by adding random numbers to the character's ascii value
    public static void miniDecryptionV3(char[] message)
    {
        int fixedLength = 5;
        for(int i = 0; i < message.length; i++)
        {
            message[i] = (char)(message[i] - fixedLength + i);
        }
    }

    public static void miniEncryptionV4(char[] message)
    {
        for(int i = 0; i < message.length; i++)
        {
            message[i] = (char)(message[i] + message.length - i);
        }
    }

    public static void miniDecryptionV4(char[] message)
    {
        for(int i = 0; i < message.length; i++)
        {
            message[i] = (char)(message[i] - message.length + i);
        }
    }
    

    public static void main(String[] args) 
    {
        //String msg = "Hi Hamza, How are you?";
        String msg = "Hi Hamza, Are you Safe?";
        char[] message = msg.toCharArray();
        System.out.println("Original message");
        printMessage(message);

        /* miniEncryptionV2(message);
        System.out.println("\nEncrypted message");
        printMessage(message);
        miniDecryption(message);
        System.out.println("\nDecrypted message");
        printMessage(message); */

       /*  miniEncryptionV3(message);
        System.out.println("\nAfter Encryption :");
        printMessage(message);

        miniDecryptionV3(message);
        System.out.println("\nAfter Decryption :");
        printMessage(message); */

        miniEncryptionV4(message);
        System.out.println("\nAfter Encryption :");
        printMessage(message);

        miniDecryptionV4(message);
        System.out.println("\nAfter Decryption :");
        printMessage(message);

    }
    
}
