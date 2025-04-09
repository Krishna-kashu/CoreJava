package sofa;

public class Sofa extends Furniture {
    public Sofa() {
        System.out.println("no-arg constructor of Sofa");
    }

    public void sit() {
        System.out.println("Running sit in Sofa");

        Product p1 = new Product();
        Product p2 = new Furniture();
        Product p3 = new Sofa();

        Furniture f1 = new Furniture();
        Furniture f2 = new Sofa();

        Sofa s1 = new Sofa();
    }
}
