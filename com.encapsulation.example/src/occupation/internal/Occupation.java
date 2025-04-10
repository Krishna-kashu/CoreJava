package occupation.internal;

public class Occupation {
    private String jobTitle="Software Engineer";
    private String company="TCS";
    private double salary=70000.00;
    private int experienceYears=2;
    private boolean isRemote=false;

    public Occupation(){
        System.out.println("no-arg constructor of Occupation");
    }

    void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    void setCompany(String company) {
        this.company = company;
    }

    void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    void setRemote(boolean isRemote) {
        isRemote = isRemote;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperienceYears() {
        return experienceYears;
    }
    public boolean isRemote(){
        return isRemote();
    }
}
