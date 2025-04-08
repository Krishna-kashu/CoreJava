package keyChain.external;

import keyChain.internal.KeyChain;

public class Client {
    public Client() {
        System.out.println("no-arg constructor for Client");
    }

    public void checkKeyChain() {
        System.out.println("Running checkKeyChain in Client");

        KeyChain keyChain = new KeyChain();

        System.out.println("Material: " + keyChain.getMaterial());
        System.out.println("Color: " + keyChain.getColor());
        System.out.println("Key Count: " + keyChain.getKeyCount());
        System.out.println("Customized: " + keyChain.isCustomized());
        System.out.println("Brand: " + keyChain.getBrand());
    }
}