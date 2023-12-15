package org.example.AbstractFactory.armors;

public class WarriorArmor implements Armor {

    @Override
    public void putOn() {
        System.out.println("Putting chest-plate on");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking chest-plate off");
    }
}
