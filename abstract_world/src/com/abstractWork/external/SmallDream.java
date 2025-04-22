package com.abstractWork.external;

import com.abstractWork.internal.Dream;

public class SmallDream extends Dream {
    @Override
    public void believe() {
        System.out.println("running believe in SmallDream");
    }

    @Override
    public void achieve() {
        System.out.println("running achieve in SmallDream");
    }

    @Override
    public void imagine() {
        System.out.println("running imagine in SmallDream");
    }

    @Override
    public void plan() {
        System.out.println("running plan in SmallDream");
    }

    @Override
    public void reflect() {
        super.reflect();
        System.out.println("running reflect in SmallDream");
    }
}
