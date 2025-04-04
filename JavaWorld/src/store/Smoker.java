package store;

import materials.Cigarette;

public class Smoker {
    public void lightCigarette(Cigarette cigarette) {
        if(cigarette != null){
            System.out.println("lightCigarette in Smoker is running..");
            cigarette.smoke();
        }else{
            System.out.println("Cigarette object is null, can not smoke...");
        }

    }
}
