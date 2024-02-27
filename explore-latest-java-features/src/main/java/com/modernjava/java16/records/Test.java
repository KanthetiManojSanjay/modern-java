package com.modernjava.java16.records;

/**
 * @author kansanja on 27/02/24.
 */
public class Test {
    public static void main(String[] args) {
        Customer c = new Customer(111, "hari", 56000);
        System.out.println(c);
        System.out.println(c.ename());
    }
}
