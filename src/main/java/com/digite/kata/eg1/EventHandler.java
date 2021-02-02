package com.digite.kata.eg1;

public class EventHandler {

    public void changeDrivingMode(Vehicle vehicle, int power, int suspensionHeight) {
        vehicle.setPower(power);
        vehicle.setSuspensionHeight(suspensionHeight);
    }
}