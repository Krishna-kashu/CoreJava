package string;

public class TaskRunner {
    public static void main(String[] args) {
        String name="Bhavya";
        String updatedName= name.concat("K");
        System.out.println("Name: "+name);
        System.out.println("Updated Name:"+updatedName);
        String newName="BhavyaK";
        if (updatedName == newName){
            System.out.println("matching");
        }else{
            System.out.println("not matching");
        }
    }
}
