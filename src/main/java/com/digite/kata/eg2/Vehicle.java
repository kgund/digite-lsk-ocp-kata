package com.digite.kata.eg2;

public class Vehicle {
    
    private Gear gear;

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        this.gear = gear;
    }
}
