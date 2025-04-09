package thread;

public class Thread extends Cotton {
    public Thread() {
        System.out.println("no-arg constructor of Thread");
    }

    public void spin() {
        System.out.println("Running spin in Thread");

        Material material1 = new Material();
        Material material2 = new Cotton();
        Material material3 = new Thread();

        Cotton cotton1 = new Cotton();
        Cotton cotton2 = new Thread();

        Thread thread1 = new Thread();
    }
}
