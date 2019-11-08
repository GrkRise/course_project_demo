package ru.miit.classes;

import ru.miit.interfaces.GameObject;

public abstract class Character implements GameObject {
    private String username;
    private String characterType;
    private int level;
    private Number specialPoints;
    private String hashedPassword;

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
}
