package com.modernjava.java9.streamEnhancements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author kansanja on 18/02/24.
 */
public class StreamEnhancementsDemo {

    /**
     * Java 9 Stream API enhancements
     * <p>
     * takeWhile() -> default method
     * dropWhile()  -> default method
     * Iterate() -> static method
     * ofNullable() -> static method
     */
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(2, 4, 6, 1, 5, 7, 8, 9, 10);

        List<Integer> filteredList = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);

        //1) takeWhile - take elements as long as predicate is true. If predicate returns false then remaining elements will be discarded i.e. rest of the stream is discarded
        List<Integer> takeWhileList = list.stream().takeWhile(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(takeWhileList);


        //2) dropWhile - Opposite to takeWhile. Drops elements as long as predicate is true. If predicate returns false then rest of the stream is returned
        List<Integer> dropWhileList = list.stream().dropWhile(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(dropWhileList);


        // 3) To prevent infinite loop another verson of iterate method is introduced with 3 args .
        // Below 2 are existing
        //Stream.iterate(1, x -> x + 1).forEach(System.out::println);
        Stream.iterate(1, x -> x + 1).limit(10).forEach(System.out::println);

        // Added condition check in this method as new arg in between. similar to for loop
        Stream.iterate(1, x -> x <= 10, x -> x + 1).forEach(System.out::println);


        // 4) Introduced to avoid NPE. If stream is null then this method returns empty stream. If stream is not empty then it returns sequential stream of single element
        Stream<String> stream = Stream.ofNullable(null);
        stream.forEach(str -> System.out.println("Empty :" + str));

        Stream<String> stream1 = Stream.ofNullable("Spring Boot");
        stream1.forEach(str -> System.out.println("String value is :" + str));
    }
}
