public class Strings2 
{
    //COunting special characters in char array
    static void demo1()
    {
        char[] word = {'A','@','#','a'};
        int count = 0;
        for(int i = 0; i < word.length; i++)
        {
            char ch = word[i];
            if(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ||(ch >= '0' && ch <= '9')))
            {
                count++;
            }
        }
        System.out.println("Special character count = "+count);
    }

    //COunting special characters in string
    static void demo2()
    {
        String word = "2@s&";
        int count = 0;
        for(int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            if(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ||(ch >= '0' && ch <= '9')))
            {
                count++;
            }
        }
        System.out.println("Special character count = "+count);
    }

    //Count occurrences in char array
    static void demo3()
    {
        char[] word = {'J','A','V','A'};
        int count = 0;
        char target = 'A';
        for(int i = 0; i < word.length; i++)
        {
            if(word[i] == target)
            {
                count++;
            }
        }
        System.out.println("The character '"+target+"' occurred for " + count +" times");
    }

    //Count occurrences in String
    static void demo4()
    {
        String word  = "JAVA";
        int count = 0;
        char target = 'A';
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == target)
            {
                count++;
            }
        }
        System.out.println("The character '"+target+"' occurred for " + count +" times");
    }

    //Finding largest character in char array
    static void demo5()
    {
        char[] word = {'J','A','V','A'};
        char largest = word[0];
        for(int i = 1; i < word.length; i++)
        {
            if(word[i] > largest)
            {
                largest = word[i];
            }
        }
        System.out.println("Largest character = "+largest);
    }

    //Finding largest character in String
    static void demo6()
    {
        String word = "Java";
        char largest = word.charAt(0);
        for(int i = 1; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            if(ch > largest)
            {
                largest = ch;
            }
        }
        System.out.println("Largest character = "+largest);
    }

    //Replace vowels with *
    static void demo7()
    {
        char[] word = {'R','o','h','a','n','t','h'};
        for(int i = 0; i < word.length; i++)
        {
            char ch = word[i];
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                word[i] = '*';
            }
        }
        System.out.println(word);
    }

    //Replace vowels with *
    static void demo8()
    {
        String word = "Rohanth";
        char[] wordChar = word.toCharArray();
        for(int i = 0; i < wordChar.length; i++)
        {
            char ch = wordChar[i];
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                wordChar[i] = '*';
            }
        }
        System.out.println(wordChar);
    }

    //leetcode 557
    static void leetcode557()
    {

    }

    //String in - built methods
    //Converts string to char array
    //String is immutable, but char array is mutable
    //syntax : char[] arr = str.toCharArray();
    static void demoToCharArray()
    {
        String name = "Algorithms";

        char[] arr = name.toCharArray();

        System.out.println("String name : "+name);
        System.out.println("String converted to char array");
        for(char ch : arr)
        {
            System.out.print(ch);
        }
    }

    //equals()
    //This compare two strings for exact quality
    //actually this compares content
    //syntax : str1.equals(str2);
    static void demoEquals()
    {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "java";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

    }

    //equalsIgnoreCase() -- Ignores case sensitive letter
    //Compares two strings ignoring case
    //Upper case and lower case are treated equally
    //syntax : str1.equalsIgnoreCase(str2);
    static void demoEqualsIgnoreCase()
    {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "java";

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

    }

    //compareTo()
    //compares two strings lexicographically
    //returns
    //0 -- > of strings are equal
    //<0 -- > First string comes before second string
    //>0 -- > First comes after second
    //comparison is based on unicode values
    static void demoCompareTo()
    {
        String str1 = "Javams";
        String str2 = "Java";
        String str3 = "JaVa";
        String str4 = "Ja";


        System.out.println(str1.compareTo(str2));//0
        System.out.println(str1.compareTo(str3));//32
        System.out.println(str4.compareTo(str1));


    }

    //compareToIgnoreCase() -- explore to write code


    //searching methods
    //static 

    //trim() method
    //It removes leading and trailing spaces
    static void demoTrim()
    {
        String word = "  Hi  ";
        System.out.println("Original String : "+word);
        String word1 = word.trim();
        System.out.println("String after removing leading and trailing spaces : "+word1);
    }

    static void demoSplit()
    {
        String word = "Hi  Guru";
        System.out.println("Original String : "+word);
        String[] word1 = word.split(" ");
        for(String word2 : word1)
        {
            System.out.print(word2);
        }
    }

    //isEmpty
    static void demoIsEmpty()
    {
        String str1 = "";
        String str2 = " ";
        String str3 = "Java";

        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());
        System.out.println(str3.isEmpty());

    }

    //subString begin and 
    static void demoSubStringBegin()
    {
        String word = "Programming";

        System.out.println(word.substring(3));

    }

    //subString begin and end
    static void demoSubStringBeginAndEnd()
    {
        String word = "Programming";

        System.out.println(word.substring(3, 7));
    }

    //replace
    //replaceall
    //endWith
    //indexOf()
    static void demoIndexOf()
    {
        String str = "www.google.com";
        System.out.println(str.indexOf('.'));
    }
    //lastindexof()
    static void demoLastIndexOf()
    {
        String str = "www.google.com";
        System.out.println(str.lastIndexOf('.'));
        System.out.println(str.lastIndexOf('.',4));
    }
    public static void main(String[] args) 
    {
        //demo1();
        //demo2();
        //demo3();
        //demo4();
        //demo6();
        //demo7();
        //demo8();
        //demoToCharArray();
        //demoEquals();
        //demoEqualsIgnoreCase();
        //demoCompareTo();
        //demoTrim();
        //demoSplit();
        //demoIsEmpty();
        //demoSubStringBegin();
        //demoSubStringBeginAndEnd();
        demoIndexOf();
        demoLastIndexOf();
        
    }
    
}
