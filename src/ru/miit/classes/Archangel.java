package ru.miit.classes;

import ru.miit.interfaces.PhysicAttack;

public class Archangel extends Character  implements PhysicAttack {

    public Archangel(String username, int level, Integer specialPoints) {
        super(username, "Archangel", level, specialPoints);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Character type is: ").append(getCharacterType()).append("\n");
        stringBuilder.append("Username is: ").append(getUsername()).append("\n");
        stringBuilder.append("Level is: ").append(getLevel()).append("\n");
        stringBuilder.append("Special points are: ").append(getSpecialPoints()).append("\n");
        return stringBuilder.toString();
    }

    @Override
    public void levelUp() {
        setLevel(getLevel() + 1);
        setStrength(getStrength() + 2);
        setDexterity(getDexterity() + 2);
        setConstitution(getConstitution() + 2);
        setIntelligence(getIntelligence() + 1);
        setCharisma(getCharisma() + 1);
        setWisdom(getWisdom() + 1);
        setLucky(getLucky() + 1);
    }

    @Override
    public int getPhysicalDamage() {
        return getLevel() * ((getStrength() + getDexterity() + getConstitution()) * getLucky() /
                (getIntelligence() + getCharisma() + getWisdom()));
    }
}
