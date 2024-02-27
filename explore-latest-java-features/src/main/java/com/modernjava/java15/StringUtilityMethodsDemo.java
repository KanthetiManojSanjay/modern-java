package com.modernjava.java15;

/**
 * @author kansanja on 21/02/24.
 */
public class StringUtilityMethodsDemo {
    public static void main(String[] args) {

        /**
         Below methods are introduced in String class in java15
         formatted
         translateEscapes
         */

        Integer userId = 11;
        String username = "Kiran";
        // Earlier approach
        String result = String.format("%s %d", username, userId);
        System.out.println(result);

        // Latest approach
        String formatted = "%s %d".formatted(username, userId);
        System.out.println(formatted);

        String s = "Hello\nWorld";
        System.out.println(s);
        String s1 = "Welcome\nHello\\\nWorld";
        System.out.println(s1);
        System.out.println(s1.translateEscapes());


    }
}
