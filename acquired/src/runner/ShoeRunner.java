package runner;

import com.workz.external.NikeShoe;
import com.workz.internal.BataShoe;
import com.workz.internal.Shoe;
import org.omg.CORBA.ShortHolder;

public class ShoeRunner {
    public static void main(String[] args) {
        BataShoe batashoe= new BataShoe();
        batashoe.collection();

        NikeShoe nikeShoe=new NikeShoe();
        nikeShoe.produce();
    }
}
