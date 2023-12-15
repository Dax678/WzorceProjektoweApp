package org.example.AbstractFactory.factories;

import org.example.AbstractFactory.armors.ArcherArmor;
import org.example.AbstractFactory.armors.Armor;
import org.example.AbstractFactory.weapons.ArcherWeapon;
import org.example.AbstractFactory.weapons.Weapon;

public class ArcherItemSetFactory implements ItemSetFactory {
    @Override
    public Armor createArmor() {
        return new ArcherArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new ArcherWeapon();
    }
}
