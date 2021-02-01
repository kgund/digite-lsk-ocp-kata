package com.digite.kata.eg2;

public class Car extends Vehicle {
    
    @Override
    public void changeGear(Gear gear) {
        if(Gear.R.equals(gear) && getGear().equals(Gear.D)){
            throw new RuntimeException("Can't change to REVERSE gear when " + getGear().toString() + " gear is engaged!");
        }

        if(Gear.D.equals(gear) && getGear().equals(Gear.P)){
            throw new RuntimeException("Can't change to DRIVE gear when " + getGear().toString() + " gear is engaged!");
        }
        super.changeGear(gear);
    }
}
