package com.myworkz.queryhub.repository;

import com.myworkz.queryhub.dto.FanDTO;

import java.util.ArrayList;
import java.util.Collection;

public class FanRepoImpl implements FanRepo{
    @Override
    public Collection<FanDTO> findAll() {
        Collection<FanDTO> collection = new ArrayList<>();

        FanDTO fanDTO1 = new FanDTO("Orient", "Black", 1000, "2 years");
        FanDTO fanDTO2 = new FanDTO("Bajaj", "Brown", 2500, "5 year");
        FanDTO fanDTO3 = new FanDTO("Candes", "White", 4356, "3 year");
        FanDTO fanDTO4 = new FanDTO("PolyCab", "Black", 4000, "1 year");
        FanDTO fanDTO5 = new FanDTO("Usha", "White", 3657,"2.5 years");
        FanDTO fanDTO6 = new FanDTO("RR Luminus", "Black", 5632, "6 months");
        FanDTO fanDTO7 = new FanDTO("AtomBerg", "Black", 2364, "8 months");
        FanDTO fanDTO8 = new FanDTO("Crompton", "Brown", 5499, "5 years");
        FanDTO fanDTO9 = new FanDTO("Orient", "White", 10555, "6 years");
        collection.add(fanDTO1);
        collection.add(fanDTO2);
        collection.add(fanDTO3);
        collection.add(fanDTO4);
        collection.add(fanDTO5);
        collection.add(fanDTO6);
        collection.add(fanDTO7);
        collection.add(fanDTO9);
        collection.add(fanDTO8);

        return collection;
    }
}
