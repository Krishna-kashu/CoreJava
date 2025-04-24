package com.oopsworkz.runner;

import com.oopsworkz.impl.MysqlJDBC;
import com.oopsworkz.impl.OracleJDBC;
import com.oopsworkz.other.Instagram;
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