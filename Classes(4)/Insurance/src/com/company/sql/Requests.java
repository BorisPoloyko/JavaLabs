package com.company.sql;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import com.company.insurance.Insurance;
import com.company.sql.*;


public class Requests {
    public static void createTable(DataBase dataBase, Insurance[] insurances) throws SQLException {
        String sql = "DROP TABLE Insurances";
        int resultUpdate = dataBase.statement.executeUpdate(sql);
        sql = "CREATE TABLE Insurances(ID INT, Price FLOAT, RiskChance FLOAT );";
        resultUpdate = dataBase.statement.executeUpdate(sql);
        for (int i = 0; i < insurances.length; i++) {
            sql = "INSERT INTO Insurances VALUES(" + i + 1 + ", " + insurances[i].getPrice() + ", " + insurances[i].getRiskChance() + ");";
            resultUpdate = dataBase.statement.executeUpdate(sql);
        }
    }
    public static void add(DataBase dataBase, Insurance insurances, int i) throws SQLException {
        String sql = "INSERT INTO Insurances VALUES(" + i + ", " + insurances.getPrice() + ", " + insurances.getRiskChance() + ");";
        int resultUpdate = dataBase.statement.executeUpdate(sql);
    }

}