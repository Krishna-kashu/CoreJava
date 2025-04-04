import materials.Liver;
import store.Nutritionist;

public class LiverRunner {
    public static void main(String[] args) {
        Nutritionist nutritionist= new Nutritionist();
        nutritionist.studyLiverHealth(null);

        Liver liver = new Liver();
        nutritionist.studyLiverHealth(liver);
    }
}
