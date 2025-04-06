package task;

public class Village
    {
    private String villageName;
    private int population;
    private String district;
    private People p[];

    public Village(String villageName,int population,String district,People p[]){
        this.district=district;
        this.population=population;
        this.villageName=villageName;
        this.p=p;
    }
    public void info() {
        System.out.println("task.Village district: " + district);
        System.out.println("village population: " + population);
        System.out.println("village Name: " + villageName);

        for(People people:p){
            people.display();
        }
    }
}
