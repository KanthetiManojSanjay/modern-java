package com.modernjava.patternmatching.recordmatch;

public class AnimalService {

    public String retrieveName(Animal animal) {
        return switch (animal) {
            case null -> ""; // This handles the null pointer exception.
            case Cat cat -> cat.name();
            case Dog dog -> dog.name();
        };

    }

    // Record patterns - Pattern matching on record classes
    public String retrieveNameV2(Animal animal) {
        return switch (animal) {
            case null -> ""; // This handles the null pointer exception.
            case Cat(var name, var color) -> name;
            case Dog(var name, var color) -> name;
            /**
             In future Java releases unused variables can be replaced with _
             case Dog(var name, var _) -> name;
             */

        };

    }


    // Guarded patterns - Apply checks on binding variable
    public String retrieveNameUsingGuardedPattern(Animal animal) {
        return switch (animal) {
            case Cat(var name, var color) when name == null -> "";
            case Cat(var name, var color) -> name;
            case Dog(var name, var color) -> name;
            case null -> ""; // This handles the null pointer exception.
        };

    }

}
