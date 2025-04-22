package com.abstractWork.external;
import com.abstractWork.internal.Project;

public class ResearchProject extends Project {

    public ResearchProject() {
        System.out.println("No-arg constructor of ResearchProject");
    }

    @Override
    public void plan() {
        System.out.println("Running plan in ResearchProject");
    }

    @Override
    public void execute() {
        System.out.println("Running execute in ResearchProject");
    }

    @Override
    public void monitor() {
        System.out.println("Running monitor in ResearchProject");
    }

    @Override
    public void complete() {
        System.out.println("Running complete in ResearchProject");
    }

    @Override
    public void review() {
        System.out.println("Running review in ResearchProject");
    }
}
