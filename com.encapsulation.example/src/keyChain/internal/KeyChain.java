package keyChain.internal;

public class KeyChain {
    private String material = "Leather";
    private String color = "Brown";
    private int keyCount = 3;
    private boolean customized = false;
    private String brand = "KeyMaster";

    public KeyChain() {
        System.out.println("no-arg constructor for KeyChain");
    }

    void setMaterial(String material) {
        this.material = material;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setKeyCount(int keyCount) {
        this.keyCount = keyCount;
    }

    void setCustomized(boolean customized) {
        this.customized = customized;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getKeyCount() {
        return keyCount;
    }

    public boolean isCustomized() {
        return customized;
    }

    public String getBrand() {
        return brand;
    }
}
