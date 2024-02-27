package com.modernjava.java16.patternMatching;

/**
 * @author kansanja on 27/02/24.
 */
public class InstanceOfDemo {
    public static void main(String[] args) {
        Object obj= 6;
        // pattern matching and no need to do explicit typeCasting
        if(obj instanceof String s){
            if(s.length()>5)
                System.out.println(s.toUpperCase());

        }else if(obj instanceof Integer i){
            System.out.println(i*i);
        }
        System.out.println("Done");
    }
}
