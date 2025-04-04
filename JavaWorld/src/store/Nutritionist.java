package store;

import materials.Liver;

import java.util.Objects;

public class Nutritionist {
    public void studyLiverHealth(Liver liver) {
        if (Objects.nonNull(liver)) {
            System.out.println("Nutritionist advising on liver health.");
            liver.detoxify();
        }else{
            System.out.println("Liver object is null, can not call detoxity");
        }
    }
}
