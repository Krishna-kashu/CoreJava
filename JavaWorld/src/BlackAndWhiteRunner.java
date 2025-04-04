import materials.BlackAndWhite;
import store.Photographer;

public class BlackAndWhiteRunner {
    public static void main(String[] args) {
        Photographer photographer = new Photographer();
        photographer.takePhoto(null);

        BlackAndWhite blackAndWhite = new BlackAndWhite();
        photographer.takePhoto(blackAndWhite);
    }
}
