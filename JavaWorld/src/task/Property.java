package task;

public class Property {
    private int property_id;
    private String address;
    private String status;
    private Area area[];

    public Property(int property_id, String address, String status, Area area[]){
        this.address=address;
        this.status=status;
        this.property_id=property_id;
        this.area=area;
    }
    public void display(){
        System.out.println("Property address: "+ address);
        System.out.println("Property status: "+ status);
        System.out.println("Property property_id: "+ property_id);

        for(Area ar:area){
            ar.info();
        }
    }
}
