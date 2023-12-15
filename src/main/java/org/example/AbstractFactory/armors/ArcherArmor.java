package org.example.AbstractFactory.armors;

public class ArcherArmor implements Armor {

    @Override
    public void putOn() {
        System.out.println("Putting greaves on");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking greaves off");
    }
}
