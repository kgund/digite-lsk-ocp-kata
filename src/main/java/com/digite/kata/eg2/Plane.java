package com.digite.kata.eg2;

public class Plane extends Vehicle {
    // A plane can reverse engine gear while moving forward, no problem here

    @Override
    public void changeGear(Gear gear) {
        if(Gear.P.equals(gear) || Gear.N.equals(gear)){
            throw new RuntimeException("Gear " + gear.toString() +" not available ");
        }
        super.changeGear(gear);
    }
}

