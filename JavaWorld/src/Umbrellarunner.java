import materials.Umbrella;
import store.Store;

public class Umbrellarunner {
    public static void main(String[] args) {
        Store store = new Store();
        store.sellUmbrella(null);

        Umbrella umbrella=new Umbrella();
        store.sellUmbrella(umbrella);
    }
}
