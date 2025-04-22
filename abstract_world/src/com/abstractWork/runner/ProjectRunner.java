package com.abstractWork.runner;
import com.abstractWork.internal.Project;
import com.abstractWork.external.SoftwareProject;
import com.abstractWork.external.ResearchProject;

public class ProjectRunner {
    public static void main(String[] args) {
        System.out.println("=== Software Project ===");
        Project p1 = new SoftwareProject();
        p1.plan();
        p1.execute();
        p1.monitor();

        p1.complete();
        p1.review();

        System.out.println("\n=== Research Project ===");
        Project p2 = new ResearchProject();
        p2.plan();
        p2.execute();
        p2.monitor();
        p2.complete();
        p2.review();
    }
}
