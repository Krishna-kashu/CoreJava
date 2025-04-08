package Badge.internal;

public class Badge {
    private String name = "Employee of the Month";
    private String color = "Gold";
    private int level = 1;
    private String issuer = "HR Department";
    private boolean valid = true;

    public Badge() {
        System.out.println("no-arg constructor for Badge");
    }

    void setName(String name) {
        this.name = name;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setLevel(int level) {
        this.level = level;
    }

    void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getLevel() {
        return level;
    }

    public String getIssuer() {
        return issuer;
    }

    public boolean isValid() {
        return valid;
    }

}
