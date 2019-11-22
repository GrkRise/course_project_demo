package ru.miit;

import ru.miit.classes.Archangel;
import ru.miit.classes.Demon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Demon demon = new Demon("unknown", 15, 25.5);
        Archangel archangel = new Archangel("null_player", 55, 10);

        System.out.println(demon.toString());
        System.out.println(demon.getMagicDamage());
        System.out.println(archangel.toString());
        System.out.println(archangel.getPhysicalDamage());

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "qwe7770683asd");


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", properties);
        } catch (SQLException e) {
            e.printStackTrace();
        }




        // write your code here
    }
}
