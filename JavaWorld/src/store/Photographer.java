package store;
import materials.BlackAndWhite;

public class Photographer {
    public void takePhoto(BlackAndWhite blackAndWhite){
        if(blackAndWhite != null) {
            System.out.println("Photographer capturing a black and white photo");
            blackAndWhite.contrast();
        }else{
            System.out.println("BlackAndWhite object is null, can not create contrast ");
        }
    }

}
