package com.xworkz.god.external;
import com.xworkz.god.internal.Church;

public class Pray{
        public void visitor() {
            System.out.println("\nrunning visitors in pray");
            Church church = new Church();
            church.open(); // only public method accessible
        }
}
