package com.modernjava.java10.immutableCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kansanja on 18/02/24.
 */
public class ImmutableCollectionDemo {
    public static void main(String[] args) {
        /**
         We can create Immutable collection as below

         Collectors.toUnmodifiableList()
         Collectors.toUnmodifiableSet()
         Collectors.toUnmodifiableMap()

         List.copyOf()
         Set.copyOf()
         Map.copyOf()
         */
        var list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);

        List<Integer> integerList = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toUnmodifiableList());
        // integerList.add(400);
        System.out.println(integerList);

        List<Integer> copiedList = List.copyOf(integerList);
        //copiedList.add(50);
        System.out.println(copiedList);
    }
}
