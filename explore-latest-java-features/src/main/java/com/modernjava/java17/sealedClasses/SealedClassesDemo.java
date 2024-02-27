package com.modernjava.java17.sealedClasses;

/**
 * @author kansanja on 27/02/24.
 */

/**
 final class cannot be extended
 sealed class can only be extended by permitted classes
 non-sealed classes can be extended by unknown subclasses as well

 A sealed class cannot force the sealing behaviour to its permitted sub classes.
 */
sealed interface Driveable permits Vehicle {
}

sealed class Vehicle implements Driveable permits Car {
}

sealed class Car extends Vehicle permits Ford, Volvo {
}

non-sealed class Ford extends Car {
}

final class Volvo extends Car {
}

public class SealedClassesDemo {
}
