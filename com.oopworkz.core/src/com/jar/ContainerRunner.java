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
    Container container2 = new Container();
    container2.setMaterial("Plastic");
    container2.setCapacityLiters(2.5);

    Container container3 = new Container(container2);
    System.out.println(container3);

}
}