package GoodDayBiscuit;

public class Biscuit extends Snack{
    public  Biscuit(){
        System.out.println("no-arg constructor of Biscuit");
        Snack snack=new Snack();
        snack.buy();
        snack.eat();
        Food food=new Snack();
        food.eat();
    }

}
