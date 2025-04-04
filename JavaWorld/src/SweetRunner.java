import materials.Sweet;
import store.Bakery;

public class SweetRunner {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        bakery.sellSweet(null);

        Sweet sweet = new Sweet();
        bakery.sellSweet(sweet);
    }
}
