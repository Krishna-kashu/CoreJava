package com.report;

public class ReportRunner {
    public static void main(String[] args) {
        Report report = new Report();
        report.generate();

        Report report1 = new SalesReport();
        report1.generate();

        System.out.println("**********");

        SalesReport sales = new SalesReport();
        sales.generate();
        sales.calculateRevenue();
    }
}
