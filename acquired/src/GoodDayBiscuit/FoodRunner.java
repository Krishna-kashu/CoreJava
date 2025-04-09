package GoodDayBiscuit;

public class FoodRunner {
    public static void main(String[] args) {

        System.out.println("-------- Food --------");
        Food food = new Food();
        food.eat();

        System.out.println("-------- Snack --------");
        Snack snack = new Snack();
        snack.buy();
        snack.eat();

        System.out.println("-------- Biscuit --------");
        Biscuit biscuit = new Biscuit();
        biscuit.buy();
        biscuit.eat();
        biscuit.crunch();

        System.out.println("-------- GoodDayBiscuit --------");
        GoodDayBiscuit gdb = new GoodDayBiscuit();
        gdb.buy();
        gdb.eat();
        gdb.crunch();
        gdb.sweetTaste();
    }
}
