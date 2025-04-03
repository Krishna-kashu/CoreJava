public class Electronics {
    String brand;
    String model;
    double price;
    int warranty;
    String category;
    boolean isSmartDevice;
    int batteryCapacity;
    double screenSize;
    String processor;
    String connectivity;


    public Electronics() {
        System.out.println("Electronics info");
    }
    public Electronics(String brand) {
        System.out.println("\n************\n");
        this.brand = brand;
    }
    public Electronics(String brand, String model) {
        this(brand);
        this.model = model;
    }
    public Electronics(String brand, String model, double price) {
        this(brand, model);
        this.price = price;

    }
    public Electronics(String brand, String model, double price, int warranty) {
        this(brand, model, price);
        this.warranty = warranty;
    }

    public Electronics(String brand, String model, double price, int warranty, String category) {
        this(brand, model, price, warranty);
        this.category = category;
    }
    public Electronics(String brand, String model, double price, int warranty, String category, boolean isSmartDevice) {
        this(brand, model, price, warranty,category);
        this.isSmartDevice = isSmartDevice;
    }
    public Electronics(String brand, String model, double price, int warranty, String category, boolean isSmartDevice, int batteryCapacity) {
        this(brand, model, price, warranty,category, isSmartDevice);
        this.batteryCapacity =batteryCapacity;
    }
    public Electronics(String brand, String model, double price, int warranty, String category, boolean isSmartDevice, int batteryCapacity, double screenSize) {
        this(brand, model, price, warranty,category, isSmartDevice, batteryCapacity);
        this.screenSize =screenSize;
    }
    public Electronics(String brand, String model, double price, int warranty, String category, boolean isSmartDevice, int batteryCapacity, double screenSize, String processor) {
        this(brand, model, price, warranty, category, isSmartDevice, batteryCapacity, screenSize);
        this.processor = processor;
    }
    public Electronics(String brand, String model, double price, int warranty, String category, boolean isSmartDevice, int batteryCapacity, double screenSize, String processor, String connectivity) {
        this(brand, model, price, warranty, category, isSmartDevice, batteryCapacity, screenSize,processor);
        this.connectivity = connectivity;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Category: " + category);
        System.out.println("Smart Device: " + isSmartDevice);
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Processor: " + processor);
        System.out.println("Connectivity: " + connectivity);
    }
}