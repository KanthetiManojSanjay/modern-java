package com.modernjava.java10.optional;

import java.util.Optional;

/**
 * @author kansanja on 18/02/24.
 */
public class OptionalOrElseDemo {
    public static void main(String[] args) {
        var student = Optional.ofNullable(getStudent("Kiran"))
                .orElseThrow(() -> new RuntimeException("Student is not present"));
        System.out.println(student);
    }

    private static Student getStudent(String name) {
        if (name.equals("Kiran") || name.equals("kumar")) {
            return new Student(1, name, "ram");
        } else return null;
    }
}
