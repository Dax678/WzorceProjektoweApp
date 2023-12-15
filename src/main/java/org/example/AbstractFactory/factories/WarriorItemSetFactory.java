package org.example.AbstractFactory.factories;

import org.example.AbstractFactory.armors.Armor;
import org.example.AbstractFactory.armors.WarriorArmor;
import org.example.AbstractFactory.weapons.WarriorWeapon;
import org.example.AbstractFactory.weapons.Weapon;

public class WarriorItemSetFactory implements ItemSetFactory {
    @Override
    public Armor createArmor() {
        return new WarriorArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new WarriorWeapon();
    }
}
