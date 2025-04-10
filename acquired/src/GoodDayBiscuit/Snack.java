package GoodDayBiscuit;

public class Snack extends Food{
    protected Snack(){
        //super();
        System.out.println("no-arg constructor of Snack");
    }
    public void buy(){
        System.out.println("Running buy in Snack");
        super.eat();

        Food food=new Food();
        Food food1=new Snack();
        //Snack snack1 = new Snack();
    }
}
