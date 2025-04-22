package com.abstractWork.external;
import com.abstractWork.internal.Job;

public class PartTimeJob extends Job {

    public PartTimeJob() {
        System.out.println("No-arg constructor of PartTimeJob");
    }

    @Override
    public void apply() {
        System.out.println("Running apply in PartTimeJob");
    }

    @Override
    public void interview() {
        System.out.println("Running interview in PartTimeJob");
    }

    @Override
    public void getOffer() {
        System.out.println("Running getOffer in PartTimeJob");
    }

    @Override
    public void start() {
        System.out.println("Running start in PartTimeJob");
    }

    @Override
    public void resign() {
        System.out.println("Running resign in PartTimeJob");
    }
}
