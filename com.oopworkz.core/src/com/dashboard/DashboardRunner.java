package com.dashboard;

public class DashboardRunner {
    public static void main(String[] args) {
        Dashboard dash = new Dashboard();
        dash.render();

        Dashboard dash1 = new UserDashboard();
        dash1.render();

        System.out.println("**********");

        UserDashboard ud = new UserDashboard();
        ud.render();
        ud.showUserStats();
        Dashboard dashboard1 = new Dashboard("Admin Dashboard", 100);
        Dashboard dashboard2 = new Dashboard(dashboard1);
        System.out.println(dashboard2);

    }
}
