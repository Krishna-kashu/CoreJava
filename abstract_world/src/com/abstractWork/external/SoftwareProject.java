package com.abstractWork.external;

import com.abstractWork.internal.Project;

public class SoftwareProject extends Project {

    public SoftwareProject() {
        System.out.println("No-arg constructor of SoftwareProject");
    }

    @Override
    public void plan() {
        System.out.println("Running plan in SoftwareProject");
    }

    @Override
    public void execute() {
        System.out.println("Running execute in SoftwareProject");
    }

    @Override
    public void monitor() {
        System.out.println("Running monitor in SoftwareProject");
    }

    @Override
    public void complete() {
        System.out.println("Running complete in SoftwareProject");
    }

    @Override
    public void review() {
        System.out.println("Running review in SoftwareProject");
    }
}
