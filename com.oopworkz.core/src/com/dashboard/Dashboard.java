package com.dashboard;

public class Dashboard {
    private String dashboardTitle;
    private int userCount;
    public Dashboard() {
        System.out.println("no-arg constructor of Dashboard");
    }

    public void render() {
        System.out.println("Running render in Dashboard");
    }


    public Dashboard(String dashboardTitle, int userCount) {
        this.dashboardTitle = dashboardTitle;
        this.userCount = userCount;
        System.out.println("String, int constructor of Dashboard");
    }

    public Dashboard(Dashboard ref) {
        this.dashboardTitle = ref.dashboardTitle;
        this.userCount = ref.userCount;
    }

    @Override
    public String toString() {
        return "Dashboard Title: " + dashboardTitle + ", User Count: " + userCount;
    }

}
