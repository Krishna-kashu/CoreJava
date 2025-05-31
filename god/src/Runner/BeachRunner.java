package Runner;

import com.xworkz.god.external.Boy;
import com.xworkz.god.internal.Beach;
import com.xworkz.god.internal.Box;
import com.xworkz.god.internal.Wave;

public class BeachRunner
{
    public static void main(String[] args) {
        Beach beach = new Beach();
        beach.open();

        Wave wave= new Wave();
        wave.flow();

        Boy boy= new Boy();
        boy.play();
    }
}
