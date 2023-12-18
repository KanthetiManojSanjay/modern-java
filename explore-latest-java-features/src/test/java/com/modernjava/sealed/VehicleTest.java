package com.modernjava.sealed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

/**
 * @author kansanja on 18/12/23.
 */
class VehicleTest {
    @Test
    void vehicleTest() {
        var car = new Car();
        var truck = new Truck();
        assertInstanceOf(Vehicle.class, car);
        assertInstanceOf(Vehicle.class, truck);

    }

    @Test
    void drive() {
        var car = new Car();
        var truck = new Truck();
        assertEquals("CAR", car.drive());
        assertEquals("TRUCK", truck.drive());

    }
}