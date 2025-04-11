package com.report;

public class SalesReport extends Report {
        public SalesReport() {
            System.out.println("no-arg constructor of SalesReport");
        }

        @Override
        public void generate() {
            System.out.println("Running overridden generate() in SalesReport");
        }

        void calculateRevenue() {
            System.out.println("Running calculateRevenue() in SalesReport");
        }
    }