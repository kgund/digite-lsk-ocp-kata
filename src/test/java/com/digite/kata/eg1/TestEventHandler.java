package com.digite.kata.eg1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEventHandler {

    EventHandler eventHandler;
    Vehicle vehicle;
    @BeforeEach
    public void setup() {
        vehicle = new Vehicle();
        eventHandler = new EventHandler();
    }

    @Test
    public void changeDrivingModeToSportsCar(){
        eventHandler.changeDrivingMode(vehicle, 500, 10);
        Assertions.assertEquals(500, vehicle.getPower());
        Assertions.assertEquals(10, vehicle.getSuspensionHeight());
    }

    @Test
    public void changeDrivingModeToComfortCar(){
        eventHandler.changeDrivingMode(vehicle, 400, 20);
        Assertions.assertEquals(400, vehicle.getPower());
        Assertions.assertEquals(20, vehicle.getSuspensionHeight());
    }

    @Test
    public void changeDrivingModeToDefaultCar(){
        eventHandler.changeDrivingMode(vehicle, 400, 20);
        Assertions.assertEquals(400, vehicle.getPower());
        Assertions.assertEquals(20, vehicle.getSuspensionHeight());
    }
}
