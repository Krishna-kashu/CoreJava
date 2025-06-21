package com.mywork.event.repository;

import com.mywork.event.constant.DBProperty;
import com.mywork.event.dto.GraduationDTO;
import com.mywork.event.service.GraduationServiceImpl;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.Optional;

public class GraduationRepoImpl implements GraduationRepo{
    @Override
    public boolean persist(GraduationDTO graduationDTO) {
        System.out.println("running persist method in GraduationServiceImpl");
        if(graduationDTO !=null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(DBProperty.URL.getProp(),DBProperty.USER_NAME.getProp(), DBProperty.SECRET.getProp());
                System.out.println("======");

                String preSQL = "insert into graduation_table(student_name, degree_awarded, college_name, graduation_year, cgpa) values(?,?,?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(preSQL);

                //preparedStatement.setInt(1,0);
                preparedStatement.setString(1, graduationDTO.getStudentName());
                preparedStatement.setString(2,graduationDTO.getDegreeAwarded());
                preparedStatement.setString(3,graduationDTO.getCollegeName());
                preparedStatement.setInt(4,graduationDTO.getGraduationYear());
                preparedStatement.setFloat(5,graduationDTO.getCgpa());
                preparedStatement.executeUpdate();
            }catch (ClassNotFoundException | SQLException e){
                System.err.println(e.getMessage());
            }
            return  true;
        }
        return false;
    }

    @SneakyThrows
    @Override
    public Optional<GraduationDTO> findById(int id) {
        System.out.println("running findById in GraduationRepoImpl");
        Class.forName("com.mysql.cj.jdbc.Driver");
        String findBySql = "select * from graduation_table graduates where graduates.id=?";

        try(Connection connection = DriverManager.getConnection(DBProperty.URL.getProp(), DBProperty.USER_NAME.getProp(), DBProperty.SECRET.getProp());
        PreparedStatement preparedStatement = connection.prepareStatement(findBySql);){

            System.out.println("findById: "+findBySql);

            preparedStatement.setInt(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("resultSet :"+resultSet);

            while (resultSet.next()){
                int pk = resultSet.getInt("id");
                String studentName = resultSet.getString("student_name");
                String degreeAwarded = resultSet.getString("degree_awarded");
                String collegeName = resultSet.getString("college_name");
                int graduationYear = resultSet.getInt("graduation_year");
                float cgpa = resultSet.getFloat("cgpa");

                GraduationDTO graduationDTO = new GraduationDTO(studentName,degreeAwarded,collegeName,graduationYear,cgpa);
                return  Optional.of(graduationDTO);
            }
        }catch ( SQLException e){
            System.err.println("SQLException in findById"+e);
        }

        return Optional.empty();
    }
}
