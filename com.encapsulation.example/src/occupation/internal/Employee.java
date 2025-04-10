package occupation.internal;

public class Employee {
    public Employee(){
        System.out.println("no-arg constructor of Employee");
    }
    public void promoteEmployee(){
        System.out.println("Running promoteEmployee in Employee");
        Occupation occupation= new Occupation();

        System.out.println("Company: "+ occupation.getCompany());
        System.out.println("ExperienceYears: "+ occupation.getExperienceYears());
        System.out.println("JobTitle: "+  occupation.getJobTitle());
        System.out.println("Salary: "+ occupation.getSalary());
        System.out.println("isRemote: "+ occupation.isRemote());

        occupation.setJobTitle("Software developer");
        occupation.setCompany("Google");
        occupation.setExperienceYears(3);
        occupation.setSalary(85000.00);
        occupation.setRemote(true);

        System.out.println("Updated Company: "+ occupation.getCompany());
        System.out.println(" Updated ExperienceYears: "+ occupation.getExperienceYears());
        System.out.println("Updated JobTitle: "+  occupation.getJobTitle());
        System.out.println("Updated Salary: "+ occupation.getSalary());
        System.out.println("Updated isRemote: "+ occupation.isRemote());
    }
}
