package org.example.AbstractFactory;

import org.example.AbstractFactory.factories.ArcherItemSetFactory;
import org.example.AbstractFactory.factories.WarriorItemSetFactory;

/*
    Proszę wybrać sobie jeden wzorzec kreacyjny napisać jego kod oraz opisać jakie
    zastosowanie ma to co Państwo napisali (np. dealer samochodowy ma dostęp do fabryki, w
    tej sytuacji fabryka do interfejs a dealer samochodowy to klasa do której się przekazuje
    wybraną implementację).
  */

public class Main {
    public static void main(String[] args) {
        GameCharacter archer = new GameCharacter(new ArcherItemSetFactory());
        GameCharacter warrior = new GameCharacter(new WarriorItemSetFactory());

        warrior.attack();
        archer.attack();

        warrior.def();
        archer.def();
    }
}