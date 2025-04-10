package occupation;

import occupation.external.Contractor;
import occupation.internal.Employee;

public class OccupationRunner {
    public static void main(String[] args) {
    Employee employee = new Employee();
    employee.promoteEmployee();

    System.out.println("*****************");

    Contractor contractor= new Contractor();
    contractor.renewContract();

    }
}
