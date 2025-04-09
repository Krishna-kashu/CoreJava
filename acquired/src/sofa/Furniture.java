package sofa;

public class Furniture extends Product {
    public Furniture() {
        System.out.println("no-arg constructor of Furniture");
    }

    public void arrange() {
        System.out.println("Running arrange in Furniture");

        Product p1 = new Product();
        Product p2 = new Furniture();

        Furniture f1 = new Furniture();
    }
}
