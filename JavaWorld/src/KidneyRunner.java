import materials.Kidney;
import store.Doctor;

public class KidneyRunner {
    public static void main(String[] args) {
        Doctor doctor= new Doctor();
        doctor.checkKidneyFunction(null);

        Kidney kidney= new Kidney();
        doctor.checkKidneyFunction(kidney);
    }
}
