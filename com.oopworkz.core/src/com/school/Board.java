package com.school;

public class Board {
    private String type;
    private int width;
    public Board() {
        System.out.println("Constructor of Board");
    }

    public void write() {
        System.out.println("Writing on a traditional board");
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Board(Board ref) {
        this.type = ref.type;
        this.width = ref.width;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Width: " + width + " cm";
    }

}
