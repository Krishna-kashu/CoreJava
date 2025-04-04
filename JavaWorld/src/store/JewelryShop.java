package store;

import materials.Gold;

public class JewelryShop {
    public void sellGold(Gold gold){
        if (gold != null) {
            System.out.println("sellGold running in JewelryShop");
            gold.carat();
        } else {
            System.out.println("Gold object is null, cannot call carat()");
        }
    }
}
