package gym.internal;

public class Trainer {
    public Trainer() {
        System.out.println("no-arg constructor for Trainer");
    }

    public void setupGymDetails() {
        System.out.println("Running setupGymDetails in Trainer");

        Gym gym = new Gym();

        System.out.println("Gym Name: " + gym.getGymName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Number of Trainers: " + gym.getNumberOfTrainers());
        System.out.println("Open on Weekends: " + gym.isOpenOnWeekends());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());

        gym.setGymName("PowerHouse");
        gym.setLocation("City Mall");
        gym.setNumberOfTrainers(8);
        gym.setOpenOnWeekends(false);
        gym.setMonthlyFee(1500.0);

        System.out.println("Updated Gym Name: " + gym.getGymName());
        System.out.println("Updated Location: " + gym.getLocation());
        System.out.println("Updated Number of Trainers: " + gym.getNumberOfTrainers());
        System.out.println("Updated Open on Weekends: " + gym.isOpenOnWeekends());
        System.out.println("Updated Monthly Fee: " + gym.getMonthlyFee());
    }
}
