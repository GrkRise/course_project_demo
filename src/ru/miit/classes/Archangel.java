package ru.miit.classes;

public class Archangel extends Character {

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
}
