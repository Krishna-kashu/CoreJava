package occupation.external;

import occupation.internal.Occupation;

public class Contractor {
    public Contractor(){
        System.out.println("No-arg constructor of Contractor");
    }
    public void renewContract(){

        System.out.println("Running renew in Contractor");

        Occupation occupation= new Occupation();
        System.out.println("Company: "+ occupation.getCompany());
        System.out.println("ExperienceYears: "+ occupation.getExperienceYears());
        System.out.println("JobTitle: "+  occupation.getJobTitle());
        System.out.println("Salary: "+ occupation.getSalary());
        System.out.println("isRemote: "+ occupation.isRemote());
    }

}
