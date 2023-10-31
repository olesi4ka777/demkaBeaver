package com.example.demkabeaver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class demkaBeaver {
    void testConnection(){
        String url = "jdbc:postgresql://10.10.104.136:5432/Geometry?user=postgres&password=123";
        try {
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Подключено");
        } catch (SQLException e) {
            System.out.println("не удалось подключиться");
            System.out.println(e.getMessage());
        }
    }
}