package Strings;

import java.util.Arrays;

public class LearnStrings 
{
    public static void main(String[] args) 
    {
        String name = "algorithms 365 technologies HSR layout";
        char ch = name.charAt(5);
        System.out.println(ch);

        int returnvalue = name.compareTo("algorithms 365 technologI;es HSR layout");
        System.out.println(returnvalue);

        char[] namearr = name.toCharArray();
        System.out.println(namearr);
        String backtoString1 = Arrays.toString(namearr);
        System.out.println(backtoString1);
        String backToString = new String(namearr);
        System.out.println(backToString);

        String subStr = name.substring(1);
        System.out.println(subStr);

        String replaceString = name.replace('a', '*');
        System.out.println(replaceString);

        String nameInCaps = name.toUpperCase();
        int retvalue = name.compareTo(nameInCaps);
        System.out.println(retvalue);

        retvalue = name.compareToIgnoreCase("algorithMS 365 technologies HSR layout");
        System.out.println(retvalue);

        



    }
    
}
