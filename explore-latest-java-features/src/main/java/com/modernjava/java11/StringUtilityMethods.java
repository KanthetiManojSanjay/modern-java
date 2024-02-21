package com.modernjava.java11;

/**
 * @author kansanja on 21/02/24.
 */
public class StringUtilityMethods {
    public static void main(String[] args) {

   /* New String methods introduced in java11 are:
        repeat(count)
        isBlank()
        strip()
        stripLeading()
        stripTrailing()
        lines()
        */


        String str = "Hello";
        System.out.println("Repeat: " + str.repeat(10));

        String str1 = " Hello World ";
        System.out.println("Length before Strip: " + str1.length());
        System.out.println("Strip: " + str1.strip());
        System.out.println("Length by applying Strip: " + str1.strip().length());


        String str2 = " Hello Java ";
        System.out.println("Length before StripLeading: " + str2.length());
        System.out.println("StripLeading: " + str2.stripLeading());
        System.out.println("Length by applying StripLeading: " + str2.stripLeading().length());


        String str3 = " Hello Java11 ";
        System.out.println("Length before StripTrailing: " + str3.length());
        System.out.println("StripTrailing: " + str3.stripTrailing());
        System.out.println("Length by applying StripTrailing: " + str3.stripTrailing().length());

        var str4 = "Hello\nWorld\nBye";
        System.out.println("Lines: " + str4.lines().toList());

        String str5 = "";
        System.out.println("Blank: " + str5.isBlank());

    }
}
