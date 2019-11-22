package ru.miit;

import ru.miit.classes.Archangel;
import ru.miit.classes.Demon;

public class Main {

    public static void main(String[] args) {
        Demon demon = new Demon("unknown", 15, 25.5);
        Archangel archangel = new Archangel("null_player", 55, 10);

        System.out.println(demon.toString());
        System.out.println(demon.getMagicDamage());
        System.out.println(archangel.toString());
        System.out.println(archangel.getPhysicalDamage());

	// write your code here
    }
}
