package thread;

public class ThreadRunner {
    public static void main(String[] args) {
        System.out.println("\n******* Material*******");
        Material material = new Material();
        material.identify();

        System.out.println("\n*******8 Cotton *******");
        Cotton cotton = new Cotton();
        cotton.weave();
        cotton.identify();

        System.out.println("\n******* Thread  *******");
        Thread thread = new Thread();
        thread.spin();
        thread.weave();
        thread.identify();
    }
}
