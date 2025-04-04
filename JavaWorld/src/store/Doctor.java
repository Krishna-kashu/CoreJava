package store;

import materials.Kidney;

public class Doctor {
    public void checkKidneyFunction(Kidney kidney) {
        if(kidney != null){
            System.out.println("Doctor checking kidney function.");
            kidney.filter();
        }else{
            System.out.println("Kidney object is null, can not filter()");
        }

    }
}
