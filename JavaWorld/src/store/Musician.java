package store;

import materials.Earbud;

public class Musician {
    public void useEarbuds(Earbud earbud) {
        if(earbud != null) {
            System.out.println("Musician using earbuds");
            earbud.listen();
        }else{
            System.out.println("Musician object is nulll, can not listen");
        }
    }
}
