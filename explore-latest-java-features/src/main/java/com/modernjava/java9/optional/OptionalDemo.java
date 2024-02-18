package com.modernjava.java9.optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author kansanja on 18/02/24.
 */
public class OptionalDemo {
    public static void main(String[] args) {
        //Optional<String> greeting = Optional.empty();
        Optional<String> greeting = Optional.of("Hello");

        // optional.or() method similar to orElseGet() except that this method return optional instead of simple string
        Optional<String> optionalGreetingText = greeting.or(() -> {
            String text = "Nullable Greetings";
            return Optional.ofNullable(text);
        });
        System.out.println(optionalGreetingText);


        Optional<String> name = Optional.ofNullable("Vinay");
        // Approach 1
        if (name.isPresent()) {
            System.out.println("Hello " + name);
        } else {
            System.out.println("hello");
        }

        // Approach 2
        name.ifPresent(value -> System.out.println("Hello " + value));


        // Java 9 Improvement 1
        name.ifPresentOrElse(
                value -> System.out.println("Hello " + value),
                () -> System.out.println("hello")
        );


        //  // Java 9 Improvement 2
        //  Optional.stream will return empty stream if optional is empty. It will filter out non empty optionals.
        Optional<String> myOptional = Optional.of("foo");
        Stream<String> stream = myOptional.stream();
        stream.forEach(System.out::println);

        List<Optional<String>> animalOptionals = List.of(Optional.of("Elephant"), Optional.empty(), Optional.of("Lion"), Optional.of("Tiger"), Optional.empty());
        Stream<String> animals = animalOptionals.stream().flatMap(Optional::stream);

        animals.forEach(System.out::println);
    }
}
