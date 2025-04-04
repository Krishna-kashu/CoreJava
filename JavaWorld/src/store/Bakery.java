package store;

import materials.Sweet;

import java.util.Objects;

public class Bakery {
    public void sellSweet(Sweet sweet){
        if(Objects.nonNull(sweet)){
            System.out.println("sellSweet in Bakery");
            sweet.taste();
        }else{
            System.out.println("Sweet object is null can not call taste");
        }
        }

}
