import materials.Cigarette;
import store.Smoker;

public class SmokerRunner {
    public static void main(String[] args)
    {
        Smoker smoker = new Smoker();
        smoker.lightCigarette(null);

        Cigarette cigarette = new Cigarette();
        smoker.lightCigarette(cigarette);
    }

}
