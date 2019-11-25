package ru.miit.classes;

import ru.miit.interfaces.AddToClan;

public class Clan implements AddToClan {
    private String name = "Noclan";
    private int clanID = 1;

    public Clan(String name) {
        this.name = name;
    }

    public Clan(){

    }

    public int getClanID() {
        return clanID;
    }

    public void setClanID(int clanID) {
        this.clanID = clanID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addToClan(Character character) {
        character.setClanID(clanID);
    }
}
