public class CharArray1 
{
    //converting One Char To Other
    static void demo1()
    {
        char ch = 'A';
        //System.out.println(ch+1);//It just prints the ascii value
        System.out.println((char)(ch+1));

    }

    static void demo2()
    {
        char ch = 'B';
        //System.out.println(ch+1);//It just prints the ascii value
        System.out.println((char)(ch-1));

    }

    //Uppercase to lowercase
    static void demo3()
    {
        char ch = 'A';
        System.out.println((char)(ch+32));
    }

    //lowercase to uppercase
    static void demo4()
    {
        char ch = 'a';
        System.out.println((char)(ch-32));
    }

    //Given char is uppercase or lowercase
    static void demo5()
    {
        char ch = 'a';
        if(ch >= 'A' && ch <= 'Z')
        {
            System.out.println(ch+" is Uppercase");
        }
        else
        {
            System.out.println(ch+" is Lowercase");
        }
    }

    //Print character at even indices
    //Char Array
    static void demo6()
    {
        char[] word = {'J','A','V','A'};
        for(int i = 0; i < word.length; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(word[i]);
            }
        }
    }

    //String
    static void demo7()
    {
        String word = "Rohanth";
        for(int i = 0; i < word.length(); i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(word.charAt(i));
            }
        }
    }

    //Print middle characters
    //Char array
    static void demo8()
    {
        char[] word = {'J','A','V','A','M','S'};
        if(word.length % 2 == 0)
        {
            System.out.print("Middle characters "+word[(word.length/2)-1]+" "
            +word[word.length/2]);
        }
        else
        {
            System.out.println("Middle character"+word[word.length/2]);
        }
    }

    //String
    static void demo9()
    {
        String word = "JAVA";
        if(word.length() % 2 == 0)
        {
            System.out.print("Middle characters "+word.charAt((word.length()/2)-1)+" "
            +word.charAt(word.length()/2));
        }
        else
        {
            System.out.println("Middle character"+word.charAt(word.length()/2));
        }
    }

    //Print character at even indices
    //Char Array
    static void demo10()
    {
        char[] word = {'J','A','V','A'};
        for(int i = 0; i < word.length; i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(word[i]);
            }
        }
        System.out.println();
    }

    //String
    static void demo11()
    {
        String word = "Rohanth";
        for(int i = 0; i < word.length(); i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(word.charAt(i));
            }
        }
    }
    
    public static void main(String[] args) 
    {
        /* //prints text as it is
        char[] name = {'R','O','H','A','N','T','H'};
        System.out.println(name);

        //String also prints as a object
        String Name = "Rohanth";
        System.out.println(Name);
        
        //int array give address
        int[] array = {1,2,3,4};
        System.out.println(array);
        
        String emoji = "(❁´◡`❁)";
        System.out.println(emoji.length());//It gives no. of utf-16 code points
        System.out.println(emoji); */

        //demo1();
        //demo2();
        //demo3();
        //demo4();
        //demo5();
        //demo6();
        //demo7();
        //demo8();
        //demo9();
        demo10();
        demo11();



    }
    
}
