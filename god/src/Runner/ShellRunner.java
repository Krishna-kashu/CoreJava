package Runner;

import com.xworkz.god.external.Collector;
import com.xworkz.god.internal.Shell;
import com.xworkz.god.internal.Stone;

public class ShellRunner {
    public static void main(String[] args) {
        Shell shell= new Shell();
        shell.listenSound();

        Stone stone=new Stone();
        stone.shine();

        Collector collector= new Collector();
        collector.pickShell();
    }

}
