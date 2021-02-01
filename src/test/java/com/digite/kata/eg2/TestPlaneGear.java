package com.digite.kata.eg2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPlaneGear {

    Plane plane;


    @BeforeEach
    public void setup(){
        plane = new Plane();
    }

    @Test
    public void testPlaneHasReverseGear(){
        plane.changeGear(Gear.R);

        Assertions.assertEquals(Gear.R, plane.getGear());
    }

    @Test
    public void testPlaneHasDriveGear(){
        plane.changeGear(Gear.D);

        Assertions.assertEquals(Gear.D, plane.getGear());
    }
}
