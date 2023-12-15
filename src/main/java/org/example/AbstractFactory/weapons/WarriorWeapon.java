package org.example.AbstractFactory.weapons;

public class WarriorWeapon implements Weapon {

    @Override
    public void attack() {
        System.out.println("Attacking using sword");
    }

    @Override
    public void block() {
        System.out.println("Defending using sword");
    }
}
