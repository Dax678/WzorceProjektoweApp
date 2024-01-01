package org.example.AbstractFactory.armors;

public class WarriorArmor implements Armor {

    @Override
    public void putOn() {
        System.out.println("Putting warrior armor on");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking warrior armor off");
    }
}
