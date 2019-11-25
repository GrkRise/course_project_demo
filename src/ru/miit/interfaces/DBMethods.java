package ru.miit.interfaces;

import ru.miit.classes.Character;
import ru.miit.classes.Clan;

import java.util.ArrayList;

public interface DBMethods {
    public void insertToHeroes(Character character);
    public void insertToClans(Clan clan);
    public void updateInHeroes(int id);
    public void updateInClans(int id);
    public void deleteFromHeroes(int id);
    public void deleteFromClans(int id);
    public String selectFromHeroes(int id);
    public ArrayList<String> selectFromClans(int id);

}
