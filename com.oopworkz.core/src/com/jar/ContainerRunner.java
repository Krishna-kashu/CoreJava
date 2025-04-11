package com.jar;

public class ContainerRunner {
public static void main(String[] args) {

    Container container = new Container();
    container.fill();

    Container container1 = new Jar();
    container1.fill();
    System.out.println("**********");

    Jar jar = new Jar();
    jar.fill();
    jar.seal();
}
}