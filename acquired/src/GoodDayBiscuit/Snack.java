package GoodDayBiscuit;

public class Snack extends Food{
    public Snack(){
        super();
        System.out.println("no-arg constructor of Snack");
    }
    public void buy(){
        System.out.println("Running buy in Snack");
        super.eat();

    }

}
