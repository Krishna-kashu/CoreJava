package led;

public class LED extends Light {
    public LED() {
        System.out.println("no-arg constructor of LED");
    }

    public void energyEfficient() {
        System.out.println("Running energyEfficient in LED");

        Light light1 = new Light();
        Light light2 = new LED();

        LED led1 = new LED();
    }
}
