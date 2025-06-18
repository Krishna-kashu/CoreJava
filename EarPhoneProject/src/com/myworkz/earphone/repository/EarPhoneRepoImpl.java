package com.myworkz.earphone.repository;

import com.myworkz.earphone.constant.DBProperties;
import com.myworkz.earphone.dto.EarPhoneDTO;

import java.sql.*;
import java.util.Optional;

public class EarPhoneRepoImpl implements EarPhoneRepo {
    @Override
    public boolean persist(EarPhoneDTO earPhoneDTO) {
        System.out.println("running persist in EarPhoneRepoImpl");
        if (earPhoneDTO != null) {
            System.out.println("earPhoneDTO is not null");


            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager.getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());

                String sql = "INSERT INTO earphone_registration_table (brand, type, cost, features, color, warranty) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, earPhoneDTO.getBrand());
                statement.setString(2, earPhoneDTO.getType());
                statement.setDouble(3, earPhoneDTO.getCost());
                statement.setString(4, earPhoneDTO.getFeatures());
                statement.setString(5, earPhoneDTO.getColor());
                statement.setString(6, earPhoneDTO.getWarranty());

                statement.executeUpdate();


            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("earPhoneDTO is null");
        }

        return true;
    }

    @Override
    public Optional<EarPhoneDTO> findById(int id) {
        System.out.println("Running overridden findById in EarPhoneRepoImpl");
        //JDBC
        // Load & register , Create the Connection , Prepare the Statement , Execute the statement
        //URL,UN,PWD
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());
            String findByIdSQL="select * from earphone_registration_table earPhone where earPhone.id="+id+"";
            System.out.println("findById :"+findByIdSQL);
            Statement statement=connection.createStatement();
            ResultSet resultSet= statement.executeQuery(findByIdSQL);
            System.out.println("resultSet :"+resultSet);
            while(resultSet.next())
            {
                int pk= resultSet.getInt("id");
                String brand =resultSet.getString("brand");
                String type =resultSet.getString("type");
                int cost=resultSet.getInt("cost");
                String features =resultSet.getString("features");
                String color=resultSet.getString("color");
                String warranty =resultSet.getString("warranty");
//                LocalDate created_at = resultSet.getDate("created_at").toLocalDate();

                EarPhoneDTO earPhoneDTO =new EarPhoneDTO(brand, type,cost, features,color, warranty);
                return  Optional.of(earPhoneDTO);
            }

        }
        catch (SQLException | ClassNotFoundException exception)
        {
            System.err.println("SQLException in findById "+exception.getMessage());
        }
        return Optional.empty();
    }
}
