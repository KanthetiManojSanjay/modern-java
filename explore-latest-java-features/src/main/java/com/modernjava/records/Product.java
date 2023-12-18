package com.modernjava.records;

/**
 * @author kansanja on 18/12/23.
 */

import java.math.BigDecimal;

/**
 * This feature is available from Java17 onwards
 * Records are immutable data holders. They are intended to just hold data
 * Record classes are final so no inheritance is supported
 * Records classes have autogenerated constructors, getter, setter, equals(), hashcode(), toString() functions
 * We no longer required lombok library
 */
public record Product(String name, BigDecimal cost, String type) {

    // By default constructors that are generated by compiler are called canonical constructors

    // This is a code block not a constructor. We can perform custom validations here
    public Product {
        if (name != null && name.isBlank()) {
            throw new IllegalArgumentException("name is not valid");
        }
        if (cost.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("cost is not valid");
        }
    }

    // Custom constructor but has to refer canonical constructors
    public Product(String name, BigDecimal cost) {
        this(name, cost, "GENERAL");
    }
}