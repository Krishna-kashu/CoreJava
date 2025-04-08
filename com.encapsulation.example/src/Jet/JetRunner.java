package Jet;

import Jet.external.Pilot;
import Jet.internal.Engineer;

public class JetRunner {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        engineer.inspectJet();

        System.out.println("--------------------");

        Pilot pilot= new Pilot();
        pilot.reviewJetSpecs();

    }
}
