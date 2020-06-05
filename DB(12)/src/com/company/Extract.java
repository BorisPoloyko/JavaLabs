package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Extract {

    public static ArrayList<Triangle> extract(DataBase dataBase) throws SQLException {
        String sql = "SELECT * FROM Triangles";
        ResultSet resultSet = dataBase.statement.executeQuery(sql);
        ArrayList<Triangle> triangles = new ArrayList<>();
        while (resultSet.next()) {
            try {
                triangles.add(new Triangle(resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getInt(3),
                        resultSet.getInt(4),
                        resultSet.getInt(5),
                        resultSet.getInt(6),
                        resultSet.getInt(7)));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return triangles;
    }
}
