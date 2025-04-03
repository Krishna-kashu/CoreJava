public class ElectronicsRunner {

    public static void main(String[] args) {

        Electronics device = new Electronics();
        device.displayInfo();
        Electronics device1 = new Electronics("Samsung");
        device1.displayInfo();
        Electronics device2 = new Electronics("Samsung", "Galaxy S22");
        device2.displayInfo();
        Electronics device3 = new Electronics("Samsung", "Galaxy S22", 999.99);
        device3.displayInfo();
        Electronics device4 = new Electronics("Samsung", "Galaxy S22", 999.99, 2);
        device4.displayInfo();
        Electronics device5 = new Electronics("Samsung", "Galaxy S22", 999.99, 2, "Smartphone");
        device5.displayInfo();
        Electronics device6 = new Electronics("Samsung", "Galaxy S22", 999.99, 2, "Smartphone", true);
        device6.displayInfo();
        Electronics device7 = new Electronics("Samsung", "Galaxy S22", 999.99, 2, "Smartphone", true, 4500);
        device7.displayInfo();
        Electronics device8 = new Electronics("Samsung", "Galaxy S22", 999.99, 2, "Smartphone", true, 4500, 6.1);
        device8.displayInfo();
        Electronics device9 = new Electronics("Samsung", "Galaxy S22", 999.99, 2, "Smartphone", true, 4500, 6.1, "Snapdragon 8 Gen 1");
        device9.displayInfo();
        Electronics device10 = new Electronics("Samsung", "Galaxy S22", 999.99, 2, "Smartphone", true, 4500, 6.1, "Snapdragon 8 Gen 1", "5G");
        device10.displayInfo();

    }
}
