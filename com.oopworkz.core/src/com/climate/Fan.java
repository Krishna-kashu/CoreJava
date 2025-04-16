package com.climate;

public class Fan {
    private int fanSpeed;
    private String fanColor;
    public Fan() {
        System.out.println("Constructor of Fan");
    }

    public void rotate() {
        System.out.println("Fan is rotating");
    }


    public Fan(int fanSpeed, String fanColor) {
        this.fanSpeed = fanSpeed;
        this.fanColor = fanColor;
        System.out.println("int, String constructor of Fan");
    }

    public Fan(Fan ref) {
        this.fanSpeed = ref.fanSpeed;
        this.fanColor = ref.fanColor;
    }

    @Override
    public String toString() {
        return "Fan Speed: " + fanSpeed + ", Color: " + fanColor;
    }

}
