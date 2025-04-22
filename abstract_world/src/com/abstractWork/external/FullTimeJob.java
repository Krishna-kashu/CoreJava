package com.abstractWork.external;
import com.abstractWork.internal.Job;

public class FullTimeJob extends Job {

    public FullTimeJob() {
        System.out.println("No-arg constructor of FullTimeJob");
    }

    @Override
    public void apply() {
        System.out.println("Running apply in FullTimeJob");
    }

    @Override
    public void interview() {
        System.out.println("Running interview in FullTimeJob");
    }

    @Override
    public void getOffer() {
        System.out.println("Running getOffer in FullTimeJob");
    }

    @Override
    public void start() {
        System.out.println("Running start in FullTimeJob");
    }

    @Override
    public void resign() {
        System.out.println("Running resign in FullTimeJob");
    }
}
