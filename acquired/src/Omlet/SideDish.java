package Omlet;

public class SideDish extends Dish{
    public SideDish(){
     System.out.println("no-arg constructor of SideDish");
}

public void taste() {
    System.out.println("Running taste in SideDish");

    Dish dish1 = new Dish();
    Dish dish2 = new SideDish();

    SideDish side1 = new SideDish();
}
}
