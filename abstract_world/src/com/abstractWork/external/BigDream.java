package com.abstractWork.external;

import com.abstractWork.internal.Dream;

public class BigDream extends Dream {
    @Override
    public void believe() {
        System.out.println("running believe in BigDream");
    }

    @Override
    public void achieve() {
        System.out.println("running achieve in BigDream");
    }

    @Override
    public void imagine() {
        System.out.println("running imagine in BigDream");
    }

    @Override
    public void plan() {
        System.out.println("running plan in BigDream");
    }

    @Override
    public void reflect() {
        super.reflect();
        System.out.println("running reflect in BigDream");
    }

}