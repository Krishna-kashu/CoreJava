package keyChain.internal;

public class Designer {
    public Designer() {
        System.out.println("no-arg constructor for Designer");
    }

    public void modifyKeyChain() {
        System.out.println("Running modifyKeyChain in Designer");

        KeyChain keyChain = new KeyChain();

        System.out.println("Material: " + keyChain.getMaterial());
        System.out.println("Color: " + keyChain.getColor());
        System.out.println("Key Count: " + keyChain.getKeyCount());
        System.out.println("Customized: " + keyChain.isCustomized());
        System.out.println("Brand: " + keyChain.getBrand());

        keyChain.setMaterial("Metal");
        keyChain.setColor("Black");
        keyChain.setKeyCount(5);
        keyChain.setCustomized(true);
        keyChain.setBrand("SecureKeys");

        System.out.println("Updated Material: " + keyChain.getMaterial());
        System.out.println("Updated Color: " + keyChain.getColor());
        System.out.println("Updated Key Count: " + keyChain.getKeyCount());
        System.out.println("Updated Customized: " + keyChain.isCustomized());
        System.out.println("Updated Brand: " + keyChain.getBrand());
    }
}