package Revolver;

public class RevolverRunner {
    public static void main(String[] args) {

        System.out.println("\n******** Tool ********");
        Tool tool = new Tool();
        tool.use();

        System.out.println("\n******** Weapon ********");
        Weapon weapon = new Weapon();
        weapon.load();
        weapon.use();

        System.out.println("\n******** Revolver ********");
        Revolver revolver = new Revolver();
        revolver.shoot();
        revolver.load();
        revolver.use();
    }
}
