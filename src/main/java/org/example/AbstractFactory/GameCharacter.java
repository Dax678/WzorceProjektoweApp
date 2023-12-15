package org.example.AbstractFactory;

import org.example.AbstractFactory.armors.Armor;
import org.example.AbstractFactory.factories.ItemSetFactory;
import org.example.AbstractFactory.weapons.Weapon;

public class GameCharacter {
    private final Weapon weapon;

    private final Armor armor;

    public GameCharacter(ItemSetFactory factory) {
        this.weapon = factory.createWeapon();
        this.armor = factory.createArmor();
    }

    public void putArmorOn() {
        armor.putOn();
    }

    public void takeArmorOff() {
        armor.takeOff();
    }

    public void attack() {
        weapon.attack();
    }

    public void def() {
        weapon.block();
    }
}
