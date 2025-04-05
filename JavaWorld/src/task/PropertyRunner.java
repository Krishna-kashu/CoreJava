package task;

public class PropertyRunner {
    public static void main(String[] args) {

        Area area= new Area("residential","Medium");
        Area area1= new Area("commercial","high");
        Area ar[] = {area, area1};
        Property property=new Property(12321, "Bangalore", "Available", ar);
        property.display();
    }
}
