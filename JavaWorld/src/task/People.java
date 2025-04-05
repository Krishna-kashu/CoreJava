package task;

public class People {
    private boolean immigrants;
    private String houseNo;

    public People(boolean immigrants, String houseNo){
        this.immigrants=immigrants;
        this.houseNo=houseNo;
    }
    public void display(){
        System.out.println("are people immigrants: " + immigrants);
        System.out.println("their houseNo: " + houseNo);
    }

}
