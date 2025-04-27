package com.oopsworkz.impl;

import com.oopsworkz.internal.JDBC;

public class MysqlJDBC implements JDBC {
    public MysqlJDBC(){
        System.out.println("no-arg constructor of MysqlJDBC..");
    }
    @Override
    public void save() {
        System.out.println("Running save in MysqlJDBC");
    }
}
