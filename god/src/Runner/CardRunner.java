package Runner;

import com.xworkz.god.external.ATM;
import com.xworkz.god.external.MakeupBox;
import com.xworkz.god.internal.Card;
import com.xworkz.god.internal.Machine;

public class CardRunner {
    public static void main(String[] args) {
        Card card= new Card();
        card.swipe();

        Machine machine= new Machine();
        machine.scan();

        ATM atm= new ATM();
        atm.readCard();
    }
}
