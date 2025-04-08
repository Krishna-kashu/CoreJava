package tank;

import tank.external.PublicViewer;
import tank.internal.Commander;

public class TankRunner {
    public static void main(String[] args) {
        Commander commander = new Commander();
        commander.operate();

        System.out.println("--------------------");

        PublicViewer viewer = new PublicViewer();
        viewer.display();
    }
}
