package com.abstractWork.runner;

import com.abstractWork.external.BigDream;
import com.abstractWork.external.SmallDream;
import com.abstractWork.internal.Dream;

public class DreamRunner {
    public static void main(String[] args) {
        Dream d1 = new BigDream();
        Dream d2 = new SmallDream();
        d1.imagine();
        d1.achieve();
        d1.believe();
        d1.plan();
        d1.reflect();
        d2.reflect();
        d2.plan();
        d2.believe();
        d2.imagine();
        d2.achieve();
    }
}
