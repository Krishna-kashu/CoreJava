package gym;

import gym.external.Member;
import gym.internal.Trainer;

public class GymRunner {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.setupGymDetails();

        System.out.println("--------------------");

        Member member = new Member();
        member.checkGymFacilities();
    }
}
