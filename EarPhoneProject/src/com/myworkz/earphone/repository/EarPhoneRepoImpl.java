package com.myworkz.earphone.repository;

import com.mysql.cj.jdbc.Driver;
import com.myworkz.earphone.dto.EarPhoneDTO;

import java.sql.*;

public class EarPhoneRepoImpl implements EarPhoneRepo {
    @Override
    public boolean persist(EarPhoneDTO earPhoneDTO) {
        System.out.println("running persist in EarPhoneRepoImpl");
        if(earPhoneDTO != null){
            System.out.println("earPhoneDTO is not null");
            String url = "jdbc:mysql://localhost:3306/book_worm";
            String userName = "root";
            String password = "Krishna@2002";

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager.getConnection(url,userName,password);

                String sql = "INSERT INTO earphone_registration_table (brand, type, cost, features, color, warranty) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, earPhoneDTO.getBrand());
                stmt.setString(2, earPhoneDTO.getType());
                stmt.setDouble(3, earPhoneDTO.getCost());
                stmt.setString(4, earPhoneDTO.getFeatures());
                stmt.setString(5, earPhoneDTO.getColor());
                stmt.setString(6, earPhoneDTO.getWarranty());

                stmt.executeUpdate();

            }catch (ClassNotFoundException | SQLException e){
                throw  new RuntimeException(e);
            }
        }else {
            System.out.println("earPhoneDTO is null");
        }

        return true;
    }
}
