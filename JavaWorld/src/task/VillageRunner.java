package task;

public class VillageRunner {
        public static void main(String[] args) {

            People people = new People(true, "2A");
            People people2 = new People(false, "3B");
            People[] peo = {people, people2};

            Village village = new Village("Ajri", 30864, "Udupi", peo);
            village.info();
    }
}
