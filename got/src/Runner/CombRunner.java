package Runner;

import com.xworkz.god.external.Stylist;
import com.xworkz.god.internal.Coin;
import com.xworkz.god.internal.Comb;
import com.xworkz.god.internal.Hair;

public class CombRunner {
    public static void main(String[] args) {
        Comb comb= new Comb();
        comb.untangleHair();

        Hair hair= new Hair();
        hair.fall();

        Stylist stylist= new Stylist();
        stylist.useComb();
    }
}
