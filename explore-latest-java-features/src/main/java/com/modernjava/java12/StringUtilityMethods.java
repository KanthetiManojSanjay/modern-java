package com.modernjava.java12;

/**
 * @author kansanja on 21/02/24.
 */
public class StringUtilityMethods {
    public static void main(String[] args) {

        /**
         indent() - Used to add or remove white spaces from the beginning of the line to adjust indentation for each string
         transform() - Used to transform string to another object of desired type. especially useful in chaining operations in strings
         */


        String s = "Hello World";
        System.out.println(s);
        System.out.println(s.length());

        System.out.println(s.indent(5)); // Positive value will add whitespaces at beginning
        System.out.println(s.indent(5).length());

        String s2 = "     Hey python";
        System.out.println(s2.length());
        System.out.println(s2.indent(-3)); // Negative value will Remove whitespaces at beginning
        System.out.println(s2.indent(-3).length());


        String s3 = "Hello Programming";
        String result = s3.transform(String::toUpperCase);
        System.out.println(result);

        // Chaining operation
        String transformedValue = s3.transform(String::toUpperCase)
                .transform(s1 -> new StringBuilder(s1).reverse().toString());
        System.out.println(transformedValue);

    }
}
