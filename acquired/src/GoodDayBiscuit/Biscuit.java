package GoodDayBiscuit;

public class Biscuit extends Snack{
    public  Biscuit(){
        System.out.println("no-arg constructor of Biscuit");
    }
    public void crunch() {
        System.out.println("Running crunch in Biscuit");

        Food food1 = new Food();
        Food food2 = new Snack();
        Food food3 = new Biscuit();

        Snack snack1 = new Snack();
        Snack snack2 = new Biscuit();

        Biscuit biscuit1 = new Biscuit();
    }

}
