package xworkz.runner;

import xworkz.external.Inverter;
import xworkz.internal.Generator;

public class InverterRunner {
    public static void main(String[] args) {
        Generator generator= new Generator();
        generator.generate();

        System.out.println("*********");

        Generator generator1=new Inverter();
        generator1.generate();
        //generator.backup;

        Inverter inverter=(Inverter) generator1;//type casting or casting
        inverter.backup();

    }
}
