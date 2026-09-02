public class Defaultdata {

    // Static variables - get default values
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bool;
    static String str;

    public static void main(String[] args) {

        // Static variables
        System.out.println("byte    : " + b);
        System.out.println("short   : " + s);
        System.out.println("int     : " + i);
        System.out.println("long    : " + l);
        System.out.println("float   : " + f);
        System.out.println("double  : " + d);
        System.out.println("char    : " + (int)c);
        System.out.println("boolean : " + bool);
        System.out.println("String  : " + str);

        // Local variables
        byte lb = 10;
        short ls = 20;
        int li = 30;
        long ll = 40L;
        float lf = 50.5f;
        double ld = 60.5;
        char lc = 'A';
        boolean lbool = true;
        String lstr = "Java";

        System.out.println("\nLocal Variables:");
        System.out.println("byte    : " + lb);
        System.out.println("short   : " + ls);
        System.out.println("int     : " + li);
        System.out.println("long    : " + ll);
        System.out.println("float   : " + lf);
        System.out.println("double  : " + ld);
        System.out.println("char    : " + lc);
        System.out.println("boolean : " + lbool);
        System.out.println("String  : " + lstr);
    }
}
