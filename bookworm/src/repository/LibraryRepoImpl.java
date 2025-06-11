package repository;

import dto.LibraryDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LibraryRepoImpl implements LibraryRepo{
    @Override
    public boolean persist(LibraryDTO libraryDTO) {
        System.out.println("persist method in libraryRepoImpl");
            if(libraryDTO!=null){
                System.out.println("libraryDTO is not null");
                String url="jdbc:mysql://localhost:3306/book_worm";
                String username="root";
                String password="Krishna@2002";


                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");


                    Connection connection= DriverManager.getConnection(url,username,password);


                    String sql="insert into add_book_table values(0,'"+libraryDTO.getName()+"','"+libraryDTO.getBookID()+"',"+libraryDTO.getAuthorName()+","+libraryDTO.getPublishedYear()+","+libraryDTO.getCost()+")";
                    Statement statement=connection.createStatement();


                    statement.executeUpdate(sql);


                } catch (ClassNotFoundException | SQLException e) {
                    throw new RuntimeException(e);
                }
            }else{
                System.out.println("libraryDTO is null");
            }
            return true;
        }
    }
