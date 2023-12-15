package org.example.AbstractFactory.factories;

import org.example.AbstractFactory.armors.Armor;
import org.example.AbstractFactory.weapons.Weapon;

public interface ItemSetFactory {
    Armor createArmor();

    Weapon createWeapon();
}
