package com.digite.kata.eg2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCarGear {

    Car car;

    @BeforeEach
    public void setup(){
        car = new Car();
    }

    @Test
    public void testCarHasReverseGear(){
        car.changeGear(Gear.R);
        Assertions.assertEquals(Gear.R, car.getGear());
    }

    @Test
    public void testCarHasDriveGear(){
        car.changeGear(Gear.D);
        Assertions.assertEquals(Gear.D, car.getGear());
    }

    @Test
    public void testCarHasParkGear(){
        car.changeGear(Gear.P);
        Assertions.assertEquals(Gear.P, car.getGear());
    }

    @Test
    public void testCarHasNeutralGear(){
        car.changeGear(Gear.N);
        Assertions.assertEquals(Gear.N, car.getGear());
    }

    @Test
    public void testCarNoReverseAfterDrive(){
        car.changeGear(Gear.D);
        Assertions.assertThrows(RuntimeException.class, () -> car.changeGear(Gear.R));
    }

    @Test
    public void testCarNoDriveAfterParked(){
        car.changeGear(Gear.P);
        Assertions.assertThrows(RuntimeException.class, () -> car.changeGear(Gear.D));
    }

}
