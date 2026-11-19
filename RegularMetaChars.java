public class RegularMetaChars 
{
    public static void main(String[] args) 
    {
        demoMatchOneDigit();
        demoOneWordMatch();
        demoNonDigitMatch();
        demoOneSpace();
        demoNonSpaceChar();
        demoNonWordChar();
        demoStarQuant();
        demoPlusQuant();
        demoExactCount();
        demoMinMaxQuant();
        demoQuesMarkQuant();
        
    }

    //1) \d -- matches one digit
    static void demoMatchOneDigit()
    {
        String a = "8";

        System.out.println(a.matches("\\d"));
        System.out.println("A".matches("\\d"));
        System.out.println();
    }

    //2) \w -- matches one word char
    static void demoOneWordMatch()
    {
        System.out.println("A".matches("\\w"));
        System.out.println("9".matches("\\w"));
        System.out.println("@".matches("\\w"));
        System.out.println("_".matches("\\w"));
        System.out.println();

    }

    //3) \D non-digit matching
    static void demoNonDigitMatch()
    {
        System.out.println("A".matches("\\D"));
        System.out.println("5".matches("\\D"));
        System.out.println();
    }

    //4)/s -- matches one space char
    static void demoOneSpace()
    {
        System.out.println(" ".matches("\\s"));
        System.out.println("A".matches("\\s"));
        System.out.println();
    }

    //5) \s -- matches any no space character
    static void demoNonSpaceChar()
    {
        System.out.println("A".matches("\\S"));
        System.out.println(" ".matches("\\S"));
        System.out.println();
    }

    //6) \w -- matches special character(non-word)
    static void demoNonWordChar()
    {
        System.out.println("@".matches("\\W"));
        System.out.println("#".matches("\\W"));
        System.out.println("A".matches("\\w"));
        System.out.println();
    }

    //Quantifiers -- tell how many chars to match
    //1)Star quantifier -- 0 or more
    static void demoStarQuant()
    {
        String s1 = "abcbbaaac";
        String s2 = "";
        String s3 = "abc7";

        System.out.println(s1.matches("[abc]*"));
        System.out.println(s2.matches("[abc]*"));
        System.out.println(s3.matches("[abc]*"));
        System.out.println();
    }

    //2) plus(+) -- check for one or more
    static void demoPlusQuant()
    {
        String s1 = "abc";
        String s2 = "";
        String s3 = "aaabbb";

        System.out.println(s1.matches("[abc]+"));
        System.out.println(s2.matches("[abc]+"));
        System.out.println(s3.matches("[abc]+"));
        System.out.println();
    }
    
    //3) exact count({n})
    static void demoExactCount()
    {
        String s1 = "acc";
        String s2 = "ab";
        String s3 = "abcd";

        System.out.println(s1.matches("[abc]{3}"));
        System.out.println(s2.matches("[abc]{3}"));
        System.out.println(s3.matches("[abc]{3}"));
        System.out.println(s3.matches("[abcd]{4}"));
        System.out.println();
    }

    //4) {min, max} -- check within range
    static void demoMinMaxQuant()
    {
        String s1 = "abccba";
        String s2 = "ab";
        String s3 = "abccbaaa";

        System.out.println(s1.matches("[abc]{3,7}"));
        System.out.println(s2.matches("[abc]{3,7}"));
        System.out.println(s3.matches("[abc]{3,7}"));
        System.out.println();
    }

    //5) ? -- check for 0 and 1
    static void demoQuesMarkQuant()
    {
        String s1 = "ac";
        String s2 = "abc";
        String s3 = "abbc";

        System.out.println(s1.matches("ab?c"));
        System.out.println(s2.matches("ab?c"));
        System.out.println(s3.matches("ab?c"));

        System.out.println(s3.matches("abb?c"));
        System.out.println(s3.matches("ab?b?c"));

    }
}
