public class StringsMethodProblems 
{
    public static void main(String[] args) 
    {
        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
        problem6();
        
    }

    static void problem1()
    {
        String email = "user@gmail.com";

        int index = email.indexOf('@');

        String username = email.substring(0, index);
        String domain = email.substring(index + 1);

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
        System.out.println();
    }

    static void problem2()
    {
        String s = "1A3F";

        if (s.matches("[0-9A-Fa-f]+"))
            System.out.println("Hexadecimal");
        else
            System.out.println("Not Hexadecimal");
        System.out.println();
    }

    static void problem3()
    {
        String s = "Java@123# is! good.";

        s = s.replaceAll("[^a-zA-Z0-9 ]", "");

        System.out.println(s);
        System.out.println();
    }

    static void problem4()
    {
        String s = "  Java   is    easy  ";

        s = s.trim().replaceAll("\\s+", " ");

        System.out.println(s);
        System.out.println();
    }

    static void problem5()
    {
        String s = "Java is very easy";

        s = s.trim();

        int count = s.isEmpty() ? 0 : s.split("\\s+").length;

        System.out.println("Word count: " + count);
        System.out.println();
    }

    static void problem6()
    {
         String s = "30/12/2000";

        if (s.length() == 10 &&
            s.charAt(2) == '/' &&
            s.charAt(5) == '/') {

            int day = Integer.parseInt(s.substring(0, 2));
            int month = Integer.parseInt(s.substring(3, 5));
            int year = Integer.parseInt(s.substring(6, 10));

            if (day >= 1 && day <= 30 &&
                month >= 1 && month <= 12 &&
                year >= 1) {

                System.out.println("Valid Date");
            }
            else {
                System.out.println("Invalid Date");
            }
        }
        else {
            System.out.println("Invalid Format");
        }
    }
    
}
