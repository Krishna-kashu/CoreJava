
package Runner;

import com.xworkz.god.external.NGO;
import com.xworkz.god.internal.Temple;
import com.xworkz.god.internal.Trust;

public class TempleRunner {
    public static void main(String[] args) {
        Temple temple = new Temple();
        temple.open();
        Trust trust = new Trust();
        trust.fund();
        NGO ng = new NGO();
        ng.development();
    }
}