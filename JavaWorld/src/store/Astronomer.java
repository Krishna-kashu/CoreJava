package store;

import materials.Earth;

public class Astronomer {
    public void studyEarth(Earth earth){
        if(earth !=null) {
            System.out.println("\nAstronomer studying earth's atmosphere.");
            earth.planet();
        }
        else{
            System.out.println("Earth object is null, can not call planet()");
        }
    }

}
