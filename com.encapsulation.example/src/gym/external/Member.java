package gym.external;

import gym.internal.Gym;

public class Member {
    public Member() {
        System.out.println("no-arg constructor for Member");
    }

    public void checkGymFacilities() {
        System.out.println("Running checkGymFacilities in Member");

        Gym gym = new Gym();

        System.out.println("Gym Name: " + gym.getGymName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Number of Trainers: " + gym.getNumberOfTrainers());
        System.out.println("Open on Weekends: " + gym.isOpenOnWeekends());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());
    }
}