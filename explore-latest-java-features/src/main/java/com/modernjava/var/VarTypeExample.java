package com.modernjava.var;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class VarTypeExample {


    //var in the class properties are not allowed.
    //private var x = "abc";


    public static void main(String[] args) {

        var list = List.of("hari", "kiran");
        System.out.println("list : " + list);

        var map = Map.ofEntries(Map.entry("a", List.of("hari", "Vinay")));
        System.out.println("map : " + map);
        var transformedName = transform("hari");
        System.out.println("transformedName : " + transformedName);

        Predicate<Integer> isEven = (var num) -> num % 2 == 0;
        System.out.println("isEven : " + isEven.test(10));

        /**
         var is not a reserved keyword so we can use var as variable name
         var var = "hari";

         Limitations of var(LVTM - Local Variable Type Inference)
         --------------------
         1) Shouldn't assign null to var variable
         var x = null

         2) Once assigned with one type we cannot assign different datatype value to the var variable;
         var x ="ABC";
         x=10;

         3) we cannot use var as instance variable in the class

         4) var in the function argument is not allowed
         **/


    }

    static String transform(String name) { // var in the function argument is not allowed

        return name.toUpperCase();

    }

}

