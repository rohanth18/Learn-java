public class Strings1 
{
    //Demonstration of default values
    static void demo1()
    {
        char[] charArray = new char[5];
        for(int i = 0; i < charArray.length; i++)
        {
            System.out.println((int)charArray[i]);
        }
    }

    //creating and initializing char array
    static void demo2()
    {
        char[] charArray = {'D','I','W','A','L','I'};
        for(int i = 0; i < charArray.length; i++)
        {
            System.out.print(charArray[i]+" ");
        }
    }

    //Getting the length of char array
    static void demo3()
    {
        char[] charArray = {'D','I','W','A','L','I'};
        System.out.println(charArray.length);
    }

    //Demonstrating ASCII values stored as characters
    static void demo4()
    {
        char[] charArray = {65,66,67,68,69};
        for(int i = 0; i < charArray.length; i++)
        {
            System.out.print(charArray[i]+" ");
        }
    }

    //Demonstrating partial initialisation of char array
    static void demo5()
    {
        char[] charArray = new char[5];
        charArray[0] = 'A';
        charArray[1] = 'B';
        for(int i = 0; i < charArray.length; i++)
        {
            System.out.print(charArray[i]+" ");
        }
    }

    //Creation of string and print name, length
    static void demo6()
    {
        String name = "Rohanth";
        System.out.println("Name : "+name);
        System.out.println("Length : "+name.length());
    }
    public static void main(String[] args) 
    {
        //demo1();
        //demo2();
        //demo3();
        //demo4();
        //demo5();
        demo6();
    }
    
}
