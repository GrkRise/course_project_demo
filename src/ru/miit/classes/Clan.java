package ru.miit.classes;

import ru.miit.interfaces.AddToClan;

public class Clan implements AddToClan {
    private String name;

    public Clan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addToClan(Character character) {

    }
}
