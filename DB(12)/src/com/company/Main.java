package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection;
        Statement statement;
        DataBase dataBase = new DataBase();
        Scanner scanner = new Scanner(System.in);
        int i = 1;


        String sql = "DROP TABLE Triangles";
        int resultUpdate = dataBase.statement.executeUpdate(sql);
        sql  = "CREATE TABLE Triangles(ID INT, A_X INT, A_Y INT, B_X INT, B_Y INT, C_X INT, C_Y INT)";
        resultUpdate = dataBase.statement.executeUpdate(sql);
        while (true) {
            System.out.print("Do you want to continue? 1 \\ 0");
            int cont = scanner.nextInt();
            if(cont == 0){
                break;
            }
            System.out.println("Enter the coordinates of a triangle");
            System.out.print("A_x = ");
            int a_x = scanner.nextInt();
            System.out.print("A_y = ");
            int a_y = scanner.nextInt();
            System.out.print("B_x = ");
            int b_x = scanner.nextInt();
            System.out.print("B_y = ");
            int b_y = scanner.nextInt();
            System.out.print("C_x = ");
            int c_x = scanner.nextInt();
            System.out.print("C_y = ");
            int c_y = scanner.nextInt();
            System.out.print(a_x);
            sql = "INSERT INTO Triangles VALUES ("+ i +", " +a_x + ", " + a_y + ", " + b_x+ ", "+ b_y+", " + c_x+ ", " + c_y +");";
            int result = dataBase.statement.executeUpdate(sql);
            i++;
        }

            ArrayList<Triangle> triangles = Extract.extract(dataBase);
            System.out.print("Eneter the area: ");
            double area = scanner.nextDouble();
            for(Triangle tr: triangles){
                System.out.println(tr.getA() + ", " + tr.getB() + ", " + tr.getC());

                if(Distance.isEquilateral(tr)){
                    System.out.println(tr.toString() + " is equilateral");
                }
                if(Distance.isIsosceles(tr)){
                    System.out.println(tr.toString() + " is isosceles");
                }
                if(Distance.isRight(tr)){
                    System.out.println(tr.toString() + " is right");
                }
                if(Distance.isGreater(area, tr)){
                    System.out.println(tr.toString() + " bigger");
                }
            }
        }


    }
