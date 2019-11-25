package ru.miit;

import ru.miit.classes.Archangel;
import ru.miit.classes.Character;
import ru.miit.classes.Clan;
import ru.miit.classes.Demon;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Demon demon_0 = new Demon("unknown", 15, 25.5);
        Archangel archangel_0 = new Archangel("null_player", 55, 10);
        Demon demon_1 = new Demon("paxan", 11, 22.2);
        Archangel archangel_1 = new Archangel("nerd", 89, 15);

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "qwe7770683asd");

        Controller controller = new Controller(properties);

        Clan noclan = new Clan();
        noclan.addToClan(demon_0);
        Clan angels = new Clan("Angels");


        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Insert to DB table Clan");
        System.out.println("2. Insert to DB table Heroes");
        System.out.println("3. Delete from DB table Clan");
        System.out.println("4. Delete from DB table Heroes");
        System.out.println("5. Update in DB table Clan");
        System.out.println("6. Update in DB table Heroes");
        System.out.println("7. Select from DB table Clan");
        System.out.println("8. Select from DB table Heroes");

        String string = scanner.nextLine().trim();

        switch (Integer.parseInt(string)){
            case 1: {
                controller.insertToClans(angels);
            }
            break;
            case 2: {
                controller.insertToHeroes(demon_0);
            }
            break;
            case 3: {
                controller.deleteFromClans(2);
            }
            break;
            case 4: {
                controller.deleteFromHeroes(3);
            }
            break;
            case 5: {
                controller.updateInClans(2);
            }
            break;
            case 6: {
                controller.updateInHeroes(4);
            }
            break;
            case 7: {
                System.out.println(controller.selectFromClans(0));
            }
            break;
            case 8: {
                System.out.println(controller.selectFromHeroes(4));
            }
            break;

        }

    }


}
