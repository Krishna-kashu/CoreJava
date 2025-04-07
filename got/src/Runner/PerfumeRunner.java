package Runner;

import com.xworkz.god.external.Customer;
import com.xworkz.god.internal.Bottle;
import com.xworkz.god.internal.Box;
import com.xworkz.god.internal.Perfume;

public class PerfumeRunner {
    public static void main(String[] args) {
        Perfume perfume= new Perfume();
        perfume.spray();

        Customer customer= new Customer();
        customer.purchase();

        Bottle bottle= new Bottle();
        bottle.open();
    }

}
