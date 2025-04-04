import materials.Earth;
import store.Astronomer;

public class EarthRunner {
    public static void main(String[] args) {
        Astronomer astronomer= new Astronomer();
        astronomer.studyEarth(null);

        Earth earth = new Earth();
        astronomer.studyEarth(earth);
    }
}
