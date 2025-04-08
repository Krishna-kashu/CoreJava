package mutant;

import mutant.external.Observer;
import mutant.internal.Trainer;

public class MutantRunner {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.train();

        System.out.println("--------------------");

        Observer observer=new Observer();
        observer.view();

    }
}
