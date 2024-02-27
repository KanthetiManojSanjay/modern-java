package com.modernjava.java16.streamEnhancements;

import java.util.List;

/**
 * @author kansanja on 27/02/24.
 */
public class StreamEnhacementsDemo {
    public static void main(String[] args) {
        /**
         Stream.toList() also generates unmodifiable list. No need to use .collect(Collectors.toList())
         Stream.mapMulti() is an alternative to flatMap
         */

        List<Integer> integerList = List.of(2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list = integerList.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(list);
        //list.add(10); // Not possible to modify as it is unmodifiable list
    }
}
