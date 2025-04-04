import materials.Gold;
import store.JewelryShop;

public class GoldRunner {
    public static void main(String[] args) {
        JewelryShop jewelryShop= new JewelryShop();
        jewelryShop.sellGold(null);

        Gold gold = new Gold();
        jewelryShop.sellGold(gold);
    }

}
