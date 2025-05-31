
package Runner;


import com.xworkz.god.external.ShopKeeper;
import com.xworkz.god.internal.Box;
import com.xworkz.god.internal.Coin;

public class CoinRunner {
    public static void main(String[] args) {
        Coin coin= new Coin();
        coin.toss();

        Box box = new Box();
        box.open();

        ShopKeeper shopKeeper= new ShopKeeper();
        shopKeeper.checkCoin();
    }
}