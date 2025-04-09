package cactus;

public class CactusRunner {
    public static void main(String[] args) {

        System.out.println("\n******* Thing *******");
        Thing thing = new Thing();
        thing.exist();

        System.out.println("\n******* Plant *******");
        Plant plant = new Plant();
        plant.grow();
        plant.exist();

        System.out.println("\n******* Cactus *******");
        Cactus cactus = new Cactus();
        cactus.storeWater();
        cactus.grow();
        cactus.exist();
    }
}