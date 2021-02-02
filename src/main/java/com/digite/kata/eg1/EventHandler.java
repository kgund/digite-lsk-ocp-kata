package com.digite.kata.eg1;

public class EventHandler {

    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }



    public void changeDrivingMode(int power, int suspensionHeight) {
        vehicle.setPower(power);
        vehicle.setSuspensionHeight(suspensionHeight);
    }
}

enum DrivingMode {
    SPORT, COMFORT
}