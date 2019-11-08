package ru.miit.interfaces;

public interface GameObject {
    public String getUsername();
    public String getCharacterType();
    public Number getSpecialPoints();
    public int getLevel();
    public String getHashedPassword();
    public void setHashedPassword(String hashedPassword);
}
