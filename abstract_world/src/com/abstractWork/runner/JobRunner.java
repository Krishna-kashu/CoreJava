package com.abstractWork.runner;

import com.abstractWork.internal.Job;
import com.abstractWork.external.PartTimeJob;
import com.abstractWork.external.FullTimeJob;

public class JobRunner {
    public static void main(String[] args) {
        System.out.println("****** Part-Time Job ******");
        Job job1 = new PartTimeJob();
        job1.apply();
        job1.interview();
        job1.getOffer();
        job1.start();
        job1.resign();

        System.out.println("\n***** Full-Time Job 8******");
        Job job = new FullTimeJob();
        job.apply();
        job.interview();
        job.getOffer();
        job.start();
        job.resign();
    }
}
