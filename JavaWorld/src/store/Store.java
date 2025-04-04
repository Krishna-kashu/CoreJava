package store;

import materials.Umbrella;

public class Store {
    public void sellUmbrella(Umbrella umbrella) {
        if(umbrella != null) {
            System.out.println("sellUmbrella in Store is Running...");
            umbrella.open();
        }
        else{
            System.out.println("Umbrella object is null so can't open...");
        }
    }
}
