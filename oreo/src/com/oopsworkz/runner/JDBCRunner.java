package com.oopsworkz.runner;

import com.oopsworkz.external.MysqlJDBC;
import com.oopsworkz.external.OracleJDBC;
import com.oopsworkz.internal.Instagram;
import com.oopsworkz.internal.JDBC;

public class JDBCRunner {
    public static void main(String[] args) {

        JDBC jdbc= new MysqlJDBC();
        jdbc.save();

        JDBC jdbc1=new OracleJDBC();
        jdbc1.save();

        Instagram instagram= new Instagram(jdbc);
        instagram.open();

    }
}