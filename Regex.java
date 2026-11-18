public class Regex 
{
    public static void main(String[] args) 
    {
        //Regex dot
        //dot matches any character new line
        String text = "XZ";
        System.out.println(text.matches("."));//any character

        //[abc]
        //true for a or b or c
        System.out.println(text.matches("[abc]"));

        //[abc][vz]
        //the first char should be a or b or c and second char should be v or z
        System.out.println(text.matches("[abc][vz]"));

        //[^abc]
        //should not be a or b or c
        System.out.println(text.matches("[^abc]"));

        //[a-z1-7] Match all lower case and 1 to 7
        System.out.println(text.matches("[a-z1-7]"));

        //A|B should be A or B
        System.out.println(text.matches("A|B"));

        //XZ -- exact sequence match
        System.out.println(text.matches("XZ"));
    }
    
}
