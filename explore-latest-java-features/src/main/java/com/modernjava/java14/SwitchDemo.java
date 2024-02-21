package com.modernjava.java14;

/**
 * @author kansanja on 21/02/24.
 */
public class SwitchDemo {
    public static void main(String[] args) {

        String day = "Monday";
        switch (day) {
            case "Monday", "Friday", "Sunday" -> System.out.println(6);
            case "Tuesday" -> System.out.println(7);
            case "Wednesday" -> System.out.println(8);
            case "Thursday" -> System.out.println(9);
        }


        int result = switch (day) {
            case "Monday", "Friday", "Sunday" -> 6;
            case "Tuesday" -> 7;
            case "Wednesday" -> 8;
            case "Thursday" -> 9;
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };

        System.out.println(result);
    }
}
