package org.example.AbstractFactory.weapons;

public class ArcherWeapon implements Weapon {

    @Override
    public void attack() {
        System.out.println("Attacking using bow");
    }

    @Override
    public void block() {
        System.out.println("You can not defend using bow");
    }
}
