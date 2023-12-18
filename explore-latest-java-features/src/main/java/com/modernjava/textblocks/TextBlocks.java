package com.modernjava.textblocks;

public class TextBlocks {


    /**
     * TextBlocks are introduced in Java 15
     */


    public static String multiLineString() {

        var multiLine = "This is a\n" +
                "    multiline string\n" +
                "with newlines inside";

        return multiLine;
    }

    public static String multiLineStringV2() {

        var multiLine = """
                This is a
                multiline string
                with newlines inside
                """;

        return multiLine;
    }

    public static String multiLineStringWithFormat(String name) {

        var multiLine = """
                Hello %s!
                This is a
                multiline string
                with newlines inside
                """.formatted(name);

        return multiLine;
    }

    public static String sql() {

        var multiLine = """
                select * from employee
                where first_name='sanjay' and 
                last_name = 'kantheti'
                """;
        return multiLine;
    }

    public static String json() {

        var multiLine = """
                {
                 "order_id" : 12345,
                 "status" : "DELIVERED",
                 "final_charge": 99.99
                }
                """;
        return multiLine;
    }


    public static void main(String[] args) {

        System.out.println("multiLineString = " + multiLineString());
        System.out.println("multiLineStringV2 = " + multiLineStringV2());
        System.out.println("multiLineStringWithFormat = " + multiLineStringWithFormat("vinay"));
        System.out.println("sql = " + sql());
        System.out.println("json = " + json());
    }
}
