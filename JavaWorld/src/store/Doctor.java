package store;

import materials.Kidney;

import java.util.Objects;

public class Doctor {
    public void checkKidneyFunction(Kidney kidney) {
        if(Objects.nonNull(kidney)){
            System.out.println("Doctor checking kidney function.");
            kidney.filter();
        }else{
            System.out.println("Kidney object is null, can not filter()");
        }

    }
}
