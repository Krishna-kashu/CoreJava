package Runner;

import com.xworkz.god.external.Pilot;
import com.xworkz.god.internal.Battery;
import com.xworkz.god.internal.Drone;

public class DroneRunner {
    public static void main(String[] args) {
        Drone drone= new Drone();
        drone.on();

        Battery battery= new Battery();
        battery.charge();

        Pilot pilot= new Pilot();
        pilot.controlDrone();
    }
}
