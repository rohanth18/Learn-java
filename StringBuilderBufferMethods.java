public class StringBuilderBufferMethods 
{
    public static void main(String[] args) 
    {
        //demoAppend();
        demoInsert();
        demodelete();
        demoreplace();
        demoreverse();
        democapacity();
        demoensurecapacity();
        demosetCharAt();
        demosetLength();
    }

    //1)append()
    //add text at the end
    static void demoAppend()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");

        System.out.println(sb);
        System.out.println();
    }

    //2) insert() -- Insert text at specified index
    static void demoInsert()
    {
        StringBuilder sb = new StringBuilder("Jva");
        sb.insert(1, 'a');
        System.out.println(sb);
        System.out.println();
    }

    //3) delete -- deletes char from begin to end-1
    static void demodelete()
    {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.delete(4, 16);
        System.out.println(sb);
        System.out.println();
    }

    //4) replace() -- replaces character
    static void demoreplace()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.replace(0,4,"python");
        System.out.println(sb);
        System.out.println();
    }

    //5) reverse()
    static void demoreverse()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.reverse();
        System.out.println(sb);
        System.out.println();
    }

    //6) capacity()
    static void democapacity()
    {
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb.capacity());
        System.out.println();
    }

    //7) ensureCapacity()
    static void demoensurecapacity()
    {
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
        System.out.println();
    }
    
    //8) setCharAt()
    static void demosetCharAt()
    {
        StringBuilder sb = new StringBuilder("Java");
    
        sb.setCharAt(0, 'K');
        System.out.println(sb);
        System.out.println();
    }

    //9) setLength()
    static void demosetLength()
    {
        StringBuilder sb = new StringBuilder("Programming");
        sb.setLength(7);
        System.out.println(sb);
        System.out.println();
    }

    //10)subString()
    //11)toString()

    //Methods for StringBuffer
    //1)append
    //2)reverse
    //
}
