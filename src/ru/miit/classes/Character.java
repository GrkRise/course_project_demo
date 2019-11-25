package ru.miit.classes;

import ru.miit.interfaces.GameObject;

public abstract class Character implements GameObject {
    private String username;
    private String characterType;
    private int level;
    private Number specialPoints;
    private String hashedPassword;
    private int Strength = 5;
    private int Constitution = 5;
    private int Dexterity = 5;
    private int Intelligence = 5;
    private int Wisdom = 5;
    private int Charisma = 5;
    private int Lucky = 1;
    private int clanID;

    public int getClanID() {
        return clanID;
    }

    public void setClanID(int clanID) {
        this.clanID = clanID;
    }

    public int getLucky() {
        return Lucky;
    }

    public void setLucky(int lucky) {
        Lucky = lucky;
    }



    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getConstitution() {
        return Constitution;
    }

    public void setConstitution(int constitution) {
        Constitution = constitution;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public void setDexterity(int dexterity) {
        Dexterity = dexterity;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    public int getWisdom() {
        return Wisdom;
    }

    public void setWisdom(int wisdom) {
        Wisdom = wisdom;
    }

    public int getCharisma() {
        return Charisma;
    }

    public void setCharisma(int charisma) {
        Charisma = charisma;
    }

    public Character(String username, String characterType, int level, Number specialPoints) {
        this.username = username;
        this.characterType = characterType;
        this.level = level;
        this.specialPoints = specialPoints;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setSpecialPoints(Number specialPoints) {
        this.specialPoints = specialPoints;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getCharacterType() {
        return characterType;
    }

    @Override
    public Number getSpecialPoints() {
        return specialPoints;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public String getHashedPassword() {
        return hashedPassword;
    }

    @Override
    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public abstract String toString();
    public abstract void levelUp();

}
