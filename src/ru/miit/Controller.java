package ru.miit;

import ru.miit.classes.Character;
import ru.miit.classes.Clan;
import ru.miit.interfaces.DBMethods;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class Controller implements DBMethods {
    private static Properties properties;


    public Controller(Properties properties) {
        this.properties = properties;

    }

    @Override
    public void insertToHeroes(Character character){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", properties);
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("INSERT into sys.heroes set " +
                    "hero_name = "  + "'" + character.getUsername() + "'" +
                    ", hero_type = " + "'" + character.getCharacterType() + "'" +
                    ", hero_level = " + character.getLevel() +
                    ", sp = " + character.getSpecialPoints() +
                    ", strength = " + character.getStrength() +
                    ", constitution = " + character.getConstitution() +
                    ", dexterity = " + character.getDexterity() +
                    ", intelligence = " + character.getIntelligence() +
                    ", wisdom = " + character.getWisdom() +
                    ", charisma = " + character.getCharisma() +
                    ", lucky = " + character.getLucky() +
                    ", clan = " + character.getClanID()
            );
            preparedStatement.execute();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void insertToClans(Clan clan) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", properties);
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("INSERT into sys.clans set " +
                    "clan_name = "  + "'" + clan.getName() + "'"
            );
            preparedStatement.execute();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void updateInHeroes(int id) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", properties);
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("UPDATE sys.heroes set " +
                    "clan = "  + 3 + " where idheroes = " + id
            );
            preparedStatement.execute();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void updateInClans(int id) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", properties);
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("UPDATE sys.clans set " +
                    "clan_name = "  + "'Archangel'" +
                    " where idclans = " + id
            );
            preparedStatement.execute();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void deleteFromHeroes(int id) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", properties);
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("DELETE from sys.heroes where " +
                    "idheroes = "  + id
                    );
            preparedStatement.execute();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public void deleteFromClans(int id) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", properties);
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("DELETE from sys.clans where " +
                    "idclans = "  + id
            );
            preparedStatement.execute();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public String selectFromHeroes(int id) {
        String result = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", properties);
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("SELECT sys.heroes.hero_name, sys.heroes.hero_type, sys.heroes.hero_level, sys.clans.clan_name" +
                    " FROM sys.heroes, sys.clans WHERE clan = idclans AND idheroes = ?"
            );
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
                result = new String(resultSet.getString("hero_name") + " " + resultSet.getString("hero_type") +
                        " " + resultSet.getInt("hero_level") + " " + resultSet.getString("clan_name"));

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result;

    }

    @Override
    public ArrayList<String> selectFromClans(int id) {
        ArrayList<String> result = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", properties);
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("SELECT * FROM sys.clans WHERE idclans > ?"
            );
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            int i = 0;
            while (resultSet.next()){
                result.add(new String(resultSet.getInt("idclans") + " " + resultSet.getString("clan_name")));
                i++;
            }

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result;

    }


}
