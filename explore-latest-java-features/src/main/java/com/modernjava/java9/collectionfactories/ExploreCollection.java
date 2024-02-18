package com.modernjava.java9.collectionfactories;

import java.util.*;

public class ExploreCollection {

    public static void main(String[] args) {

        // Approach 1- Traditional way of creating Immutable HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Obtain an unmodifiable view of the map
        map = Collections.unmodifiableMap(map);

        /** Approach 2 - This is a little less verbose but very costly.
         * The double brace technique works by creating an anonymous inner class and providing an instance initializer block which invokes all the put() statements above.
         So, every time you create a map in this way, you’re creating a non-reusable anonymous class whose object references are held by the ClassLoader.
         This may cause memory leaks and problems with serialization.
         **/
        Map<String, Integer> integerMap = Collections.unmodifiableMap(new HashMap<String, Integer>() {{
            put("one", 1);
            put("two", 2);
            put("three", 3);
        }});



        // Java9 Improvement - immutable list - max of 10 values
        List<String> list = List.of("spring boot", "react Js", "Microservices", "mongo db", "AWS");
        list.forEach(System.out::println);

        Set<String> set = Set.of("spring boot", "react Js", "Microservices", "mongo db", "AWS");
        set.forEach(System.out::println);

        Map<Integer, String> map1 = Map.of(101, "Spring boot", 102, "react Js", 103, "AWS");
        map1.forEach((k, v) -> System.out.println(k + "," + v));

        // Incase if we have to store more than 10 key value pairs then use below var arg overloaded method
        Map<Integer, String> map2 = Map.ofEntries(Map.entry(101, "Spring boot"), Map.entry(102, "react Js"));
        map2.forEach((k, v) -> System.out.println(k + "," + v));
    }
}
