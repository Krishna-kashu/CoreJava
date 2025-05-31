package Runner;

import com.xworkz.god.external.MakeupBox;
import com.xworkz.god.internal.Powder;
import com.xworkz.god.internal.PowderBox;

public class PowderRunner {
    public static void main(String[] args) {
        Powder powder = new Powder();
        powder.apply();

        PowderBox powderBox= new PowderBox();
        powderBox.shake();

        MakeupBox makeupBox=new MakeupBox();
        makeupBox.applyPowder();
    }
}
