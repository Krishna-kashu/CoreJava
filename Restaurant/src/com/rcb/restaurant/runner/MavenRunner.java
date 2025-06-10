package com.rcb.restaurant.runner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MavenRunner {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String username="root";
        String password="Krishna@2002";
        String url="jdbc:mysql://localhost:3306/second_db";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection(url,username,password);
        System.out.println("Connection success: "+connection);

    }
}

