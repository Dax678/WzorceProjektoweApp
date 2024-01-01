package org.example.AbstractFactory.armors;

public class ArcherArmor implements Armor {

    @Override
    public void putOn() {
        System.out.println("Putting archer armor on");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking archer armor off");
    }
}
