package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Alter {
    public static void alter(DataBase dataBase, int id) throws SQLException {



        String sql = "UPDATE Triangles SET A_X WHERE ID=" +id +";";
        ResultSet resultSet = dataBase.statement.executeQuery(sql);
    }
}
