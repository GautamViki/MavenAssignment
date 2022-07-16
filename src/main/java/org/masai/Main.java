package org.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String cs="jdbc:mysql://localhost:3306/db1";

        try {
            Connection conn= DriverManager.getConnection(cs,"root","vikas123");
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}