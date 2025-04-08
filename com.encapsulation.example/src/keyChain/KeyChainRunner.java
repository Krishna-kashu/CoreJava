package keyChain;

import keyChain.external.Client;
import keyChain.internal.Designer;

public class KeyChainRunner {
    public static void main(String[] args) {
        Designer designer = new Designer();
        designer.modifyKeyChain();

        System.out.println("--------------------");

        Client client = new Client();
        client.checkKeyChain();
    }
}
