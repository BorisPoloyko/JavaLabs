package com.company.sql;

import java.sql.*;
import java.util.Properties;

public class DataBase {
    public Statement statement;
    public Connection connection;
    public DataBase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/insur";
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "zxcjok48563");
        properties.put("autoReconnect", "true");
        properties.put("characterEncoding", "UTF-8");
        properties.put("useUnicode", "true");
        properties.put("serverTimezone", "Europe/Moscow");
        try {
            connection = DriverManager.getConnection(url, properties);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
