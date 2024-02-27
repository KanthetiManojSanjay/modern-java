package com.modernjava.java16.records;

/**
 * @author kansanja on 27/02/24.
 */

/**
 * Records are immutable classes & are final by default
 * You cannot extend your custom records because records already(implicitly) extend from Record class. This is similar to enums(which implicitly extend Enum)
 * Records can have static fields & static methods
 * Records can have instance methods.
 * Records cannot have instance fields. All the instance fields are listed as "components" in the record declaration
 * Records can implement interfaces
 * Records are specified using a record declaration
     * Implicitly generated are:
     * Compacted constructor & no NoArg constructor
     * toString
     * equals & hashCode method
     * public accessor method
 */

public record Customer(int eno, String ename, float esal) {

    private final static Integer custNo = 10;

    public Customer{
        if(ename.length()<=2)
            throw new IllegalArgumentException("Name should be greater than 2 characters");
    }

    @Override
    public String ename() {
        return ename.toUpperCase();
    }
}
