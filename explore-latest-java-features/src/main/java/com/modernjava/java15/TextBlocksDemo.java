package com.modernjava.java15;

/**
 * @author kansanja on 22/02/24.
 */
public class TextBlocksDemo {
    public static void main(String[] args) {
        String str = "Hello World";
        String s1 = """
                Hello World
                """;
        String s2 = """
                Hello World""";

        System.out.println(s1.equals(s2));
        System.out.println(str.equals(s1));
        System.out.println(str.equals(s2));
        String s4 = """
                'Hello World'
                "Welcome"
                \"""Hyderabad\"""
                """;
        System.out.println(s4);


        String s5 = """
                Hello World\s\
                Welcome\s\
                Hyderabad\
                """;
        System.out.println(s5);

        String s6 = """
                {
                 "order_id" : 12345,
                 "status" : "DELIVERED",
                 "final_charge": 99.99
                }
                """;
        System.out.println(s6);

        String s7 = """
                Employee Details
                ----------------
                Employee Number : %d
                Employee Name : %s
                Employee Salary: %f
                Employee Address: %s
                  """;
        System.out.println(s7.formatted(111, "vinay", 25000.5f, "Hyderabad"));


    }
}
