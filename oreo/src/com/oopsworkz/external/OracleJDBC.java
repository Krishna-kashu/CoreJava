package com.oopsworkz.external;

import com.oopsworkz.internal.JDBC;

public class OracleJDBC implements JDBC {
    @Override
    public void save() {
        System.out.println("Running save in OracleJDBC");
    }
}
