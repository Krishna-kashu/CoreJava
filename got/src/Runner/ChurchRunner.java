package Runner;

import com.xworkz.god.external.Pray;
import com.xworkz.god.internal.Church;
import com.xworkz.god.internal.Father;

public class ChurchRunner {
    public static void main(String[] args) {
        Church church = new Church();
        church.open();

        Father father = new Father();
        father.guides();

        Pray prayGroup = new Pray();
        prayGroup.visitor();
    }
}
