package com.modernjava.sealed;

/**
 * Sealed classes/interfaces feature is available from Java17
 * Allow inheritance by permission
 */
public sealed abstract class Vehicle permits Car, Truck {
    public abstract String drive();
}

