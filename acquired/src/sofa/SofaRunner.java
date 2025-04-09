package sofa;

public class SofaRunner {
    public static void main(String[] args) {

        System.out.println("\n****** Product ******");
        Product product = new Product();
        product.deliver();

        System.out.println("\n****** Furniture ******");
        Furniture furniture = new Furniture();
        furniture.arrange();
        furniture.deliver();

        System.out.println("\n****** Sofa ******");
        Sofa sofa = new Sofa();
        sofa.sit();
        sofa.arrange();
        sofa.deliver();
    }
}
