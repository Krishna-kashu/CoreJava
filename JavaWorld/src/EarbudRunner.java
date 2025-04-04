import materials.Earbud;
import store.Musician;

public class EarbudRunner {
    public static void main(String[] args) {
        Musician musician= new Musician();
        musician.useEarbuds(null);

        Earbud earbud = new Earbud();
        musician.useEarbuds(earbud);
    }
}
