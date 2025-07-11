package com.mywork.nestedweb.runner;

import com.mywork.nestedweb.dto.*;

import java.util.ArrayList;
import java.util.List;

public class CustomerRunner {
    public static void main(String[] args) {
        List<CustomerDTO> customers = new ArrayList<>();

        EducationDTO education1 = new EducationDTO("B.E Computer Science", "VTU", 2015, 78.5);
        DetailsDTO details1 = new DetailsDTO("EMP001", "Java, Spring Boot", education1, "IT");
        JobDTO job1 = new JobDTO("Software Engineer", "5 years", 950000.0, details1);
        SecurityDTO security1 = new SecurityDTO("Ramesh", "Day", true, job1);
        HouseDTO house1 = new HouseDTO("Villa", 2, "Whitefield, Bengaluru", security1);
        CeoDTO ceo1 = new CeoDTO("Anand Kumar", 45, "anand@infosys.com", house1);
        CompanyDTO company1 = new CompanyDTO("Infosys", "IT Services", 1981, ceo1);
        VehicleDTO vehicle1 = new VehicleDTO("KA01AB1234", "Sedan", 2020, company1);
        DriverDTO driver1 = new DriverDTO("Suresh", 35, "DL123456", vehicle1);
        PresidentDTO president1 = new PresidentDTO("Droupadi Murmu", 65, "Female", driver1);
        CountryDTO country1 = new CountryDTO("India", "Asia", 1400000000L, president1);
        PassportDTO passport1 = new PassportDTO("P1234567", "Indian", 2030, country1);
        customers.add(new CustomerDTO("Prakash", "prakash@gmail.com", 30, passport1));

        EducationDTO education2 = new EducationDTO("MBA", "IIM Ahmedabad", 2012, 85.0);
        DetailsDTO details2 = new DetailsDTO("EMP002", "Finance, Management", education2, "Finance");
        JobDTO job2 = new JobDTO("Finance Manager", "10 years", 1250000.0, details2);
        SecurityDTO security2 = new SecurityDTO("Kiran", "Night", false, job2);
        HouseDTO house2 = new HouseDTO("Apartment", 5, "Powai, Mumbai", security2);
        CeoDTO ceo2 = new CeoDTO("Nita Ambani", 58, "nita@reliance.com", house2);
        CompanyDTO company2 = new CompanyDTO("Reliance", "Conglomerate", 1966, ceo2);
        VehicleDTO vehicle2 = new VehicleDTO("MH01XY9876", "SUV", 2018, company2);
        DriverDTO driver2 = new DriverDTO("Ravi", 40, "DL765432", vehicle2);
        PresidentDTO president2 = new PresidentDTO("Narendra Modi", 73, "Male", driver2);
        CountryDTO country2 = new CountryDTO("India", "Asia", 1400000000L, president2);
        PassportDTO passport2 = new PassportDTO("P2345678", "Indian", 2029, country2);
        customers.add(new CustomerDTO("Sanjana", "sanjana@gmail.com", 34, passport2));

        customers.add(new CustomerDTO("Ravi Kumar", "ravi1@gmail.com", 30,
                new PassportDTO("P1234567", "Indian", 2030,
                        new CountryDTO("India", "Asia", 1400000000,
                                new PresidentDTO("Droupadi Murmu", 65, "Female",
                                        new DriverDTO("Mahesh", 35, "DL123456",
                                                new VehicleDTO("KA01AB1234", "SUV", 2021,
                                                        new CompanyDTO("Infosys", "IT", 1981,
                                                                new CeoDTO("Nandan Nilekani", 64, "nandan@infosys.com",
                                                                        new HouseDTO("Villa", 2, "Bangalore",
                                                                                new SecurityDTO("Ramesh", "Night", true,
                                                                                        new JobDTO("Security Officer", "5 years", 250000,
                                                                                                new DetailsDTO("SEC101", "Surveillance",
                                                                                                        new EducationDTO("PUC", "KSEEB", 2000,
                                                                                                                65.0), "Security")))))))))))));

        customers.add(new CustomerDTO("Sneha Patil", "sneha.p@gmail.com", 28,
                new PassportDTO("P2345678", "Indian", 2029,
                        new CountryDTO("India", "Asia", 1400000000,
                                new PresidentDTO("Droupadi Murmu", 65, "Female",
                    new DriverDTO("Karthik", 40, "DL234567",
                            new VehicleDTO("KA02CD5678", "Sedan", 2020,
                                    new CompanyDTO("Wipro", "IT", 1980,
                                            new CeoDTO("Thierry Delaporte", 55, "thierry@wipro.com",
                                                    new HouseDTO("Apartment", 3, "Mysore",
                                                            new SecurityDTO("Suresh", "Day", false,
                                                                    new JobDTO("Guard", "3 years", 180000,
                                                                            new DetailsDTO("SEC102", "Patrolling",
                                                                                    new EducationDTO("10th", "SSLC",
                                                                                            2008, 60.0), "Security")))))))))))));

        customers.add(new CustomerDTO("Anjali Rao", "anjali.rao@gmail.com", 32,
                new PassportDTO("P3456789", "Indian", 2032,
                        new CountryDTO("India", "Asia", 1400000000L,
                                new PresidentDTO("Droupadi Murmu", 65, "Female",
                                        new DriverDTO("Naveen", 38, "DL345678",
                                                new VehicleDTO("KA03EF3456", "Hatchback", 2019,
                                                        new CompanyDTO("TCS", "IT Services", 1968,
                                                                new CeoDTO("Rajesh Gopinathan", 50, "rajesh@tcs.com",
                                                                        new HouseDTO("Independent", 1, "Hubli",
                                                                                new SecurityDTO("Vijay", "Night", true,
                                                                                        new JobDTO("Watchman", "6 years", 200000,
                                                                                                new DetailsDTO("SEC103", "Night Shift",
                                                                                                        new EducationDTO("PUC", "KSEEB", 2010, 67.5),
                                                                                                        "Security")))))))))))));

        customers.add(new CustomerDTO("Deepak Shetty", "deepak.shetty@gmail.com", 29,
                new PassportDTO("P4567890", "Indian", 2028,
                        new CountryDTO("India", "Asia", 1400000000L,
                                new PresidentDTO("Droupadi Murmu", 65, "Female",
                                        new DriverDTO("Manoj", 45, "DL456789",
                                                new VehicleDTO("KA04GH6789", "SUV", 2022,
                                                        new CompanyDTO("Mindtree", "IT Consulting", 1999,
                                                                new CeoDTO("Debashis Chatterjee", 53, "debashis@mindtree.com",
                                                                        new HouseDTO("Bungalow", 2, "Mangalore",
                                                                                new SecurityDTO("Anand", "Day", false,
                                                                                        new JobDTO("Security Manager", "10 years", 350000,
                                                                                                new DetailsDTO("SEC104", "Monitoring",
                                                                                                        new EducationDTO("B.Sc", "Mangalore University", 2012, 72.0),
                                                                                                        "Security")))))))))))));



        customers.add(new CustomerDTO("Pooja Hegde", "pooja.h@gmail.com", 31,
                new PassportDTO("P9876543", "Indian", 2031,
                        new CountryDTO("India", "Asia", 1400000000L,
                                new PresidentDTO("Droupadi Murmu", 65, "Female",
                                        new DriverDTO("Shankar", 39, "DL567890",
                                                new VehicleDTO("KA05IJ2345", "Van", 2018,
                                                        new CompanyDTO("Biocon", "Pharmaceutical", 1978,
                                                                new CeoDTO("Kiran Mazumdar", 71, "kiran@biocon.com",
                                                                        new HouseDTO("Apartment", 5, "Bangalore",
                                                                                new SecurityDTO("Lokesh", "Night", true,
                                                                                        new JobDTO("Chief Security", "12 years", 400000,
                                                                                                new DetailsDTO("SEC105", "Security Planning",
                                                                                                        new EducationDTO("B.Com", "Bangalore University", 2010, 68.5), "Security")))))))))))));

        EducationDTO education3 = new EducationDTO("B.Tech", "NIT Surathkal", 2010, 82.5);
        DetailsDTO details3 = new DetailsDTO("EMP003", "Software Engineering, DevOps", education3, "IT");
        JobDTO job3 = new JobDTO("Tech Lead", "12 years", 1800000.0, details3);
        SecurityDTO security3 = new SecurityDTO("Manjunath", "Day", true, job3);
        HouseDTO house3 = new HouseDTO("Independent", 2, "Rajajinagar, Bangalore", security3);
        CeoDTO ceo3 = new CeoDTO("Salil Parekh", 59, "salil@infosys.com", house3);
        CompanyDTO company3 = new CompanyDTO("Infosys", "IT Services", 1981, ceo3);
        VehicleDTO vehicle3 = new VehicleDTO("KA03PQ5678", "Sedan", 2019, company3);
        DriverDTO driver3 = new DriverDTO("Shivraj", 42, "DL908765", vehicle3);
        PresidentDTO president3 = new PresidentDTO("Droupadi Murmu", 66, "Female", driver3);
        CountryDTO country3 = new CountryDTO("India", "Asia", 1400000000L, president3);
        PassportDTO passport3 = new PassportDTO("P3456789", "Indian", 2031, country3);
        customers.add(new CustomerDTO("Ajay Narayan", "ajay.narayan@gmail.com", 36, passport3));

        EducationDTO education4 = new EducationDTO("MCA", "Christ University", 2014, 79.0);
        DetailsDTO details4 = new DetailsDTO("EMP004", "Cloud Computing, Backend", education4, "Software");
        JobDTO job4 = new JobDTO("Cloud Engineer", "9 years", 1350000.0, details4);
        SecurityDTO security4 = new SecurityDTO("Ravi Teja", "Night", false, job4);
        HouseDTO house4 = new HouseDTO("Duplex", 3, "Jayanagar, Bangalore", security4);
        CeoDTO ceo4 = new CeoDTO("Rishad Premji", 47, "rishad@wipro.com", house4);
        CompanyDTO company4 = new CompanyDTO("Wipro", "Technology", 1945, ceo4);
        VehicleDTO vehicle4 = new VehicleDTO("KA05UV1234", "Electric", 2021, company4);
        DriverDTO driver4 = new DriverDTO("Ganesh", 37, "DL334455", vehicle4);
        PresidentDTO president4 = new PresidentDTO("Droupadi Murmu", 66, "Female", driver4);
        CountryDTO country4 = new CountryDTO("India", "Asia", 1400000000L, president4);
        PassportDTO passport4 = new PassportDTO("P4567890", "Indian", 2032, country4);
        customers.add(new CustomerDTO("Megha Reddy", "megha.reddy@gmail.com", 33, passport4));

        EducationDTO education5 = new EducationDTO("B.Com", "St. Joseph's College", 2015, 77.2);
        DetailsDTO details5 = new DetailsDTO("EMP005", "Accounts, Taxation", education5, "Finance");
        JobDTO job5 = new JobDTO("Chartered Accountant", "8 years", 1200000.0, details5);
        SecurityDTO security5 = new SecurityDTO("Sharath", "Day", false, job5);
        HouseDTO house5 = new HouseDTO("Flat", 4, "Basavanagudi, Bangalore", security5);
        CeoDTO ceo5 = new CeoDTO("Sundar Pichai", 51, "sundar@google.com", house5);
        CompanyDTO company5 = new CompanyDTO("Google India", "Internet", 2004, ceo5);
        VehicleDTO vehicle5 = new VehicleDTO("KA06WX4321", "Crossover", 2020, company5);
        DriverDTO driver5 = new DriverDTO("Ramesh", 45, "DL556677", vehicle5);
        PresidentDTO president5 = new PresidentDTO("Droupadi Murmu", 66, "Female", driver5);
        CountryDTO country5 = new CountryDTO("India", "Asia", 1400000000L, president5);
        PassportDTO passport5 = new PassportDTO("P5678901", "Indian", 2030, country5);
        customers.add(new CustomerDTO("Vinay Bhat", "vinay.bhat@gmail.com", 35, passport5));



}
}
