package com.mywork.nestedweb.runner;

import com.mywork.nestedweb.dto.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        EducationDTO education5 = new EducationDTO("B.Tech", "IIT Bombay", 2012, 85.5);
        DetailsDTO details5 = new DetailsDTO("EMP005", "AI, Machine Learning", education5, "Engineering");
        JobDTO job5 = new JobDTO("ML Engineer", "11 years", 1850000.0, details5);
        SecurityDTO security5 = new SecurityDTO("Anil Kumar", "Day", true, job5);
        HouseDTO house5 = new HouseDTO("Penthouse", 4, "Powai, Mumbai", security5);
        CeoDTO ceo5 = new CeoDTO("Sundar Pichai", 52, "sundar@google.com", house5);
        CompanyDTO company5 = new CompanyDTO("Google", "Technology", 1998, ceo5);
        VehicleDTO vehicle5 = new VehicleDTO("MH12XY9876", "Hybrid", 2022, company5);
        DriverDTO driver5 = new DriverDTO("Rajesh Verma", 45, "DL998877", vehicle5);
        PresidentDTO president5 = new PresidentDTO("Joe Biden", 81, "Male", driver5);
        CountryDTO country5 = new CountryDTO("United States", "North America", 331000000L, president5);
        PassportDTO passport5 = new PassportDTO("U1234567", "American", 2033, country5);
        customers.add(new CustomerDTO("Ananya Singh", "ananya.singh@outlook.com", 34, passport5));


        EducationDTO education6 = new EducationDTO("MBA", "IIM Ahmedabad", 2010, 88.0);
        DetailsDTO details6 = new DetailsDTO("EMP006", "Finance, Strategy", education6, "Business");
        JobDTO job6 = new JobDTO("Business Analyst", "14 years", 2200000.0, details6);
        SecurityDTO security6 = new SecurityDTO("Karan Mehta", "Night", true, job6);
        HouseDTO house6 = new HouseDTO("Villa", 5, "Banjara Hills, Hyderabad", security6);
        CeoDTO ceo6 = new CeoDTO("Natarajan Chandrasekaran", 61, "chandra@tcs.com", house6);
        CompanyDTO company6 = new CompanyDTO("TCS", "Consulting", 1968, ceo6);
        VehicleDTO vehicle6 = new VehicleDTO("TS09AB1234", "Petrol", 2019, company6);
        DriverDTO driver6 = new DriverDTO("Surya Prakash", 42, "DL556677", vehicle6);
        PresidentDTO president6 = new PresidentDTO("Emmanuel Macron", 46, "Male", driver6);
        CountryDTO country6 = new CountryDTO("France", "Europe", 67000000L, president6);
        PassportDTO passport6 = new PassportDTO("F9876543", "French", 2031, country6);
        customers.add(new CustomerDTO("Priya Deshmukh", "priya.deshmukh@gmail.com", 36, passport6));

        EducationDTO education7 = new EducationDTO("B.Sc", "Harvard University", 2015, 91.0);
        DetailsDTO details7 = new DetailsDTO("EMP007", "Genomics, Bioinformatics", education7, "Research");
        JobDTO job7 = new JobDTO("Research Scientist", "9 years", 1950000.0, details7);
        SecurityDTO security7 = new SecurityDTO("Laura Bennett", "Day", true, job7);
        HouseDTO house7 = new HouseDTO("Studio", 2, "Cambridge, MA", security7);
        CeoDTO ceo7 = new CeoDTO("Albert Bourla", 62, "albert@pfizer.com", house7);
        CompanyDTO company7 = new CompanyDTO("Pfizer", "Pharmaceutical", 1849, ceo7);
        VehicleDTO vehicle7 = new VehicleDTO("MA34ZX9087", "Electric", 2023, company7);
        DriverDTO driver7 = new DriverDTO("James Turner", 50, "DL112233", vehicle7);
        PresidentDTO president7 = new PresidentDTO("Justin Trudeau", 53, "Male", driver7);
        CountryDTO country7 = new CountryDTO("Canada", "North America", 39000000L, president7);
        PassportDTO passport7 = new PassportDTO("C7654321", "Canadian", 2035, country7);
        customers.add(new CustomerDTO("Sneha Kapoor", "sneha.kapoor@bio.com", 31, passport7));


        EducationDTO education8 = new EducationDTO("M.Tech", "Anna University", 2016, 82.3);
        DetailsDTO details8 = new DetailsDTO("EMP008", "Embedded Systems", education8, "Engineering");
        JobDTO job8 = new JobDTO("Hardware Engineer", "8 years", 1250000.0, details8);
        SecurityDTO security8 = new SecurityDTO("Shyam Sundar", "Night", false, job8);
        HouseDTO house8 = new HouseDTO("Row House", 3, "Velachery, Chennai", security8);
        CeoDTO ceo8 = new CeoDTO("Gopal Vittal", 57, "gopal@airtel.com", house8);
        CompanyDTO company8 = new CompanyDTO("Airtel", "Telecom", 1995, ceo8);
        VehicleDTO vehicle8 = new VehicleDTO("TN10CD4455", "Diesel", 2018, company8);
        DriverDTO driver8 = new DriverDTO("Mohan Raj", 48, "DL667788", vehicle8);
        PresidentDTO president8 = new PresidentDTO("Volodymyr Zelenskyy", 46, "Male", driver8);
        CountryDTO country8 = new CountryDTO("Ukraine", "Europe", 41000000L, president8);
        PassportDTO passport8 = new PassportDTO("U1237890", "Ukrainian", 2029, country8);
        customers.add(new CustomerDTO("Arvind R", "arvind.r@airtelmail.com", 30, passport8));

        EducationDTO education9 = new EducationDTO("M.Arch", "School of Planning and Architecture", 2013, 77.5);
        DetailsDTO details9 = new DetailsDTO("EMP009", "Urban Design", education9, "Architecture");
        JobDTO job9 = new JobDTO("Architect", "12 years", 1450000.0, details9);
        SecurityDTO security9 = new SecurityDTO("Neeraj Sharma", "Day", true, job9);
        HouseDTO house9 = new HouseDTO("Independent", 2, "Sector 21, Noida", security9);
        CeoDTO ceo9 = new CeoDTO("Peter Boone", 50, "peter@bosch.com", house9);
        CompanyDTO company9 = new CompanyDTO("Bosch", "Engineering", 1886, ceo9);
        VehicleDTO vehicle9 = new VehicleDTO("DL3CAX1234", "CNG", 2020, company9);
        DriverDTO driver9 = new DriverDTO("Rakesh Yadav", 40, "DL223344", vehicle9);
        PresidentDTO president9 = new PresidentDTO("Fumio Kishida", 66, "Male", driver9);
        CountryDTO country9 = new CountryDTO("Japan", "Asia", 125000000L, president9);
        PassportDTO passport9 = new PassportDTO("J9876543", "Japanese", 2034, country9);
        customers.add(new CustomerDTO("Neha Agarwal", "neha.a@gmail.com", 35, passport9));

        EducationDTO education10 = new EducationDTO("LLB", "NALSAR University", 2011, 81.6);
        DetailsDTO details10 = new DetailsDTO("EMP010", "Corporate Law", education10, "Legal");
        JobDTO job10 = new JobDTO("Legal Advisor", "13 years", 1650000.0, details10);
        SecurityDTO security10 = new SecurityDTO("Arvind Sinha", "Night", true, job10);
        HouseDTO house10 = new HouseDTO("Apartment", 2, "Madhapur, Hyderabad", security10);
        CeoDTO ceo10 = new CeoDTO("Satya Nadella", 58, "satya@microsoft.com", house10);
        CompanyDTO company10 = new CompanyDTO("Microsoft", "Technology", 1975, ceo10);
        VehicleDTO vehicle10 = new VehicleDTO("AP09GH5678", "Hybrid", 2022, company10);
        DriverDTO driver10 = new DriverDTO("Hari Babu", 43, "DL909090", vehicle10);
        PresidentDTO president10 = new PresidentDTO("Anthony Albanese", 61, "Male", driver10);
        CountryDTO country10 = new CountryDTO("Australia", "Oceania", 26000000L, president10);
        PassportDTO passport10 = new PassportDTO("A7654321", "Australian", 2032, country10);
        customers.add(new CustomerDTO("Kavya Iyer", "kavya.iyer@legalfirm.com", 38, passport10));


        EducationDTO education11 = new EducationDTO("B.Com", "Delhi University", 2017, 78.2);
        DetailsDTO details11 = new DetailsDTO("EMP011", "Accounting, Taxation", education11, "Finance");
        JobDTO job11 = new JobDTO("Accountant", "7 years", 950000.0, details11);
        SecurityDTO security11 = new SecurityDTO("Sanjay K", "Day", false, job11);
        HouseDTO house11 = new HouseDTO("Flat", 2, "Rohini, Delhi", security11);
        CeoDTO ceo11 = new CeoDTO("Nirmala Sitharaman", 64, "nirmala@finmin.in", house11);
        CompanyDTO company11 = new CompanyDTO("Income Tax Dept", "Government", 1944, ceo11);
        VehicleDTO vehicle11 = new VehicleDTO("DL4CAF9876", "Petrol", 2016, company11);
        DriverDTO driver11 = new DriverDTO("Amit Tiwari", 39, "DL111222", vehicle11);
        PresidentDTO president11 = new PresidentDTO("Olaf Scholz", 66, "Male", driver11);
        CountryDTO country11 = new CountryDTO("Germany", "Europe", 83000000L, president11);
        PassportDTO passport11 = new PassportDTO("G3456789", "German", 2031, country11);
        customers.add(new CustomerDTO("Ritu Sharma", "ritu.sharma@accounting.com", 29, passport11));


        EducationDTO education12 = new EducationDTO("BCA", "IGNOU", 2019, 76.0);
        DetailsDTO details12 = new DetailsDTO("EMP012", "Web Development", education12, "IT");
        JobDTO job12 = new JobDTO("Frontend Developer", "5 years", 850000.0, details12);
        SecurityDTO security12 = new SecurityDTO("Meera Joshi", "Night", true, job12);
        HouseDTO house12 = new HouseDTO("Studio Apartment", 1, "Koramangala, Bangalore", security12);
        CeoDTO ceo12 = new CeoDTO("Mark Zuckerberg", 41, "mark@meta.com", house12);
        CompanyDTO company12 = new CompanyDTO("Meta", "Social Media", 2004, ceo12);
        VehicleDTO vehicle12 = new VehicleDTO("KA03DE7654", "Electric", 2022, company12);
        DriverDTO driver12 = new DriverDTO("Suresh Nayak", 44, "DL123321", vehicle12);
        PresidentDTO president12 = new PresidentDTO("Luis Arce", 60, "Male", driver12);
        CountryDTO country12 = new CountryDTO("Bolivia", "South America", 12000000L, president12);
        PassportDTO passport12 = new PassportDTO("B9081723", "Bolivian", 2030, country12);
        customers.add(new CustomerDTO("Aditya Menon", "aditya.menon@webdev.io", 26, passport12));

        EducationDTO education13 = new EducationDTO("MBBS", "AIIMS Delhi", 2014, 89.5);
        DetailsDTO details13 = new DetailsDTO("EMP013", "Cardiology", education13, "Healthcare");
        JobDTO job13 = new JobDTO("Cardiologist", "10 years", 2500000.0, details13);
        SecurityDTO security13 = new SecurityDTO("Dr. Rakesh K", "Day", true, job13);
        HouseDTO house13 = new HouseDTO("Bungalow", 5, "Saket, Delhi", security13);
        CeoDTO ceo13 = new CeoDTO("Dr. Tedros", 59, "tedros@who.int", house13);
        CompanyDTO company13 = new CompanyDTO("WHO", "Health Organization", 1948, ceo13);
        VehicleDTO vehicle13 = new VehicleDTO("DL6CS5678", "Diesel", 2015, company13);
        DriverDTO driver13 = new DriverDTO("Ravi Shankar", 47, "DL445566", vehicle13);
        PresidentDTO president13 = new PresidentDTO("Giorgia Meloni", 47, "Female", driver13);
        CountryDTO country13 = new CountryDTO("Italy", "Europe", 59000000L, president13);
        PassportDTO passport13 = new PassportDTO("I8765432", "Italian", 2033, country13);
        customers.add(new CustomerDTO("Dr. Snehal Patil", "snehal.patil@medic.in", 35, passport13));

        EducationDTO education14 = new EducationDTO("BBA", "Symbiosis University", 2018, 80.1);
        DetailsDTO details14 = new DetailsDTO("EMP014", "Digital Marketing", education14, "Marketing");
        JobDTO job14 = new JobDTO("SEO Analyst", "6 years", 780000.0, details14);
        SecurityDTO security14 = new SecurityDTO("Ayesha Khan", "Night", false, job14);
        HouseDTO house14 = new HouseDTO("1BHK", 1, "Camp, Pune", security14);
        CeoDTO ceo14 = new CeoDTO("Brian Chesky", 43, "brian@airbnb.com", house14);
        CompanyDTO company14 = new CompanyDTO("Airbnb", "Hospitality", 2008, ceo14);
        VehicleDTO vehicle14 = new VehicleDTO("MH12XY7890", "Electric", 2021, company14);
        DriverDTO driver14 = new DriverDTO("Wasim Sheikh", 34, "DL554433", vehicle14);
        PresidentDTO president14 = new PresidentDTO("Nayib Bukele", 43, "Male", driver14);
        CountryDTO country14 = new CountryDTO("El Salvador", "Central America", 6500000L, president14);
        PassportDTO passport14 = new PassportDTO("S5432198", "Salvadoran", 2029, country14);
        customers.add(new CustomerDTO("Sonal Mehta", "sonal.mehta@seoexpert.com", 28, passport14));

        EducationDTO education15 = new EducationDTO("PhD", "Oxford University", 2010, 93.4);
        DetailsDTO details15 = new DetailsDTO("EMP015", "Quantum Physics", education15, "Academia");
        JobDTO job15 = new JobDTO("Professor", "15 years", 3200000.0, details15);
        SecurityDTO security15 = new SecurityDTO("Dr. Henry Morgan", "Day", true, job15);
        HouseDTO house15 = new HouseDTO("Cottage", 3, "Oxford, UK", security15);
        CeoDTO ceo15 = new CeoDTO("Elon Musk", 53, "elon@spacex.com", house15);
        CompanyDTO company15 = new CompanyDTO("SpaceX", "Aerospace", 2002, ceo15);
        VehicleDTO vehicle15 = new VehicleDTO("UK09SP3456", "Electric", 2024, company15);
        DriverDTO driver15 = new DriverDTO("David Clarke", 55, "DL778899", vehicle15);
        PresidentDTO president15 = new PresidentDTO("Rishi Sunak", 44, "Male", driver15);
        CountryDTO country15 = new CountryDTO("United Kingdom", "Europe", 67000000L, president15);
        PassportDTO passport15 = new PassportDTO("U2233445", "British", 2035, country15);
        customers.add(new CustomerDTO("Dr. Raghav Rao", "raghav.rao@ox.ac.uk", 41, passport15));

        EducationDTO education16 = new EducationDTO("BFA", "National Institute of Design", 2016, 84.0);
        DetailsDTO details16 = new DetailsDTO("EMP016", "Visual Design", education16, "Creative");
        JobDTO job16 = new JobDTO("UX Designer", "8 years", 1100000.0, details16);
        SecurityDTO security16 = new SecurityDTO("Ashwin Rao", "Day", true, job16);
        HouseDTO house16 = new HouseDTO("Loft", 2, "Indiranagar, Bangalore", security16);
        CeoDTO ceo16 = new CeoDTO("Daniel Ek", 41, "daniel@spotify.com", house16);
        CompanyDTO company16 = new CompanyDTO("Spotify", "Music Streaming", 2006, ceo16);
        VehicleDTO vehicle16 = new VehicleDTO("KA02MX4321", "Hybrid", 2020, company16);
        DriverDTO driver16 = new DriverDTO("Krishna G", 36, "DL101010", vehicle16);
        PresidentDTO president16 = new PresidentDTO("Pedro Sánchez", 53, "Male", driver16);
        CountryDTO country16 = new CountryDTO("Spain", "Europe", 47000000L, president16);
        PassportDTO passport16 = new PassportDTO("S1122334", "Spanish", 2031, country16);
        customers.add(new CustomerDTO("Nikita Joshi", "nikita.j@uxstudio.com", 30, passport16));

        EducationDTO education17 = new EducationDTO("B.E", "BITS Pilani", 2012, 86.7);
        DetailsDTO details17 = new DetailsDTO("EMP017", "Network Security", education17, "Cybersecurity");
        JobDTO job17 = new JobDTO("Security Engineer", "12 years", 1900000.0, details17);
        SecurityDTO security17 = new SecurityDTO("Mohammed Azhar", "Night", true, job17);
        HouseDTO house17 = new HouseDTO("Gated Villa", 4, "Hitech City, Hyderabad", security17);
        CeoDTO ceo17 = new CeoDTO("Arvind Krishna", 61, "arvind@ibm.com", house17);
        CompanyDTO company17 = new CompanyDTO("IBM", "Technology", 1911, ceo17);
        VehicleDTO vehicle17 = new VehicleDTO("TS10XY4321", "Diesel", 2019, company17);
        DriverDTO driver17 = new DriverDTO("Faizal Khan", 41, "DL323232", vehicle17);
        PresidentDTO president17 = new PresidentDTO("Alexander Van der Bellen", 80, "Male", driver17);
        CountryDTO country17 = new CountryDTO("Austria", "Europe", 8900000L, president17);
        PassportDTO passport17 = new PassportDTO("A3344556", "Austrian", 2032, country17);
        customers.add(new CustomerDTO("Ramesh Bhatt", "ramesh.bhatt@cybermail.com", 34, passport17));

        EducationDTO education18 = new EducationDTO("B.Sc", "University of Nairobi", 2018, 79.8);
        DetailsDTO details18 = new DetailsDTO("EMP018", "Environmental Science", education18, "Research");
        JobDTO job18 = new JobDTO("Field Scientist", "6 years", 920000.0, details18);
        SecurityDTO security18 = new SecurityDTO("Grace Mutiso", "Day", false, job18);
        HouseDTO house18 = new HouseDTO("Cottage", 2, "Karen, Nairobi", security18);
        CeoDTO ceo18 = new CeoDTO("Patrick Njoroge", 58, "patrick@kws.org", house18);
        CompanyDTO company18 = new CompanyDTO("KWS", "Wildlife Conservation", 1977, ceo18);
        VehicleDTO vehicle18 = new VehicleDTO("KBN453M", "Diesel", 2017, company18);
        DriverDTO driver18 = new DriverDTO("James Mwangi", 49, "DL556699", vehicle18);
        PresidentDTO president18 = new PresidentDTO("William Ruto", 57, "Male", driver18);
        CountryDTO country18 = new CountryDTO("Kenya", "Africa", 54000000L, president18);
        PassportDTO passport18 = new PassportDTO("K0987123", "Kenyan", 2030, country18);
        customers.add(new CustomerDTO("Linda Muthoni", "linda.m@enviro.org", 29, passport18));

        EducationDTO education19 = new EducationDTO("Diploma", "Hong Kong Polytechnic University", 2015, 83.0);
        DetailsDTO details19 = new DetailsDTO("EMP019", "Fashion Design", education19, "Textiles");
        JobDTO job19 = new JobDTO("Fashion Consultant", "9 years", 1020000.0, details19);
        SecurityDTO security19 = new SecurityDTO("Ling Wei", "Day", false, job19);
        HouseDTO house19 = new HouseDTO("Skyscraper Condo", 1, "Kowloon, Hong Kong", security19);
        CeoDTO ceo19 = new CeoDTO("Angela Leung", 49, "angela@stylehk.com", house19);
        CompanyDTO company19 = new CompanyDTO("StyleHK", "Fashion", 2001, ceo19);
        VehicleDTO vehicle19 = new VehicleDTO("HK1234", "Electric", 2021, company19);
        DriverDTO driver19 = new DriverDTO("Chen Tao", 38, "DL998877", vehicle19);
        PresidentDTO president19 = new PresidentDTO("John Lee", 67, "Male", driver19);
        CountryDTO country19 = new CountryDTO("Hong Kong", "Asia", 7500000L, president19);
        PassportDTO passport19 = new PassportDTO("HK432198", "Hong Kong SAR", 2033, country19);
        customers.add(new CustomerDTO("Zara Chen", "zara.chen@designhub.hk", 32, passport19));

        EducationDTO education20 = new EducationDTO("MS", "Stanford University", 2013, 92.5);
        DetailsDTO details20 = new DetailsDTO("EMP020", "Data Engineering", education20, "IT");
        JobDTO job20 = new JobDTO("Data Architect", "11 years", 2100000.0, details20);
        SecurityDTO security20 = new SecurityDTO("Brenda Lee", "Night", true, job20);
        HouseDTO house20 = new HouseDTO("Ranch", 4, "Palo Alto, California", security20);
        CeoDTO ceo20 = new CeoDTO("Jensen Huang", 61, "jensen@nvidia.com", house20);
        CompanyDTO company20 = new CompanyDTO("NVIDIA", "AI Hardware", 1993, ceo20);
        VehicleDTO vehicle20 = new VehicleDTO("CA7654ABC", "Electric", 2023, company20);
        DriverDTO driver20 = new DriverDTO("Jason Park", 46, "DL565656", vehicle20);
        PresidentDTO president20 = new PresidentDTO("Kamala Harris", 60, "Female", driver20);
        CountryDTO country20 = new CountryDTO("USA", "North America", 332000000L, president20);
        PassportDTO passport20 = new PassportDTO("US9827364", "American", 2034, country20);
        customers.add(new CustomerDTO("Ethan Roy", "ethan.roy@bigdata.ai", 39, passport20));


        EducationDTO education21 = new EducationDTO("B.Tech", "IIT Delhi", 2012, 85.0);
        DetailsDTO details21 = new DetailsDTO("EMP001", "Software Development", education21, "IT");
        JobDTO job21 = new JobDTO("Software Engineer", "10 years", 1800000.0, details21);
        SecurityDTO security21 = new SecurityDTO("Anil", "Night", true, job21);
        HouseDTO house21 = new HouseDTO("Villa", 5, "Whitefield, Bangalore", security21);
        CeoDTO ceo21 = new CeoDTO("Satya Nadella", 57, "satya@microsoft.com", house21);
        CompanyDTO company21 = new CompanyDTO("Microsoft India", "Technology", 21998, ceo21);
        VehicleDTO vehicle21 = new VehicleDTO("MH2XY1234", "Sedan", 2021, company21);
        DriverDTO driver21 = new DriverDTO("Rajeev", 40, "DL889900", vehicle21);
        PresidentDTO president21 = new PresidentDTO("Joe Biden", 81, "Male", driver21);
        CountryDTO country21 = new CountryDTO("USA", "North America", 331000000L, president21);
        PassportDTO passport21 = new PassportDTO("M1234567", "American", 2032, country21);
        customers.add(new CustomerDTO("Ankit Mehta", "ankit.mehta@example.com", 37, passport21));

        EducationDTO education22 = new EducationDTO("M.Tech", "IIT Bombay", 2012, 88.5);
        DetailsDTO details22 = new DetailsDTO("EMP006", "Software Development", education22, "Technology");
        JobDTO job22 = new JobDTO("Software Architect", "10 years", 2500000.0, details22);
        SecurityDTO security22 = new SecurityDTO("Amit", "Night", true, job22);
        HouseDTO house22 = new HouseDTO("Villa", 5, "Powai, Mumbai", security22);
        CeoDTO ceo22 = new CeoDTO("Satya Nadella", 56, "satya@microsoft.com", house22);
        CompanyDTO company22 = new CompanyDTO("Microsoft India", "Software", 1990, ceo22);
        VehicleDTO vehicle22 = new VehicleDTO("MH12DE1432", "SUV", 2019, company22);
        DriverDTO driver22 = new DriverDTO("Sunil", 50, "DL889900", vehicle22);
        PresidentDTO president22 = new PresidentDTO("Joe Biden", 81, "Male", driver22);
        CountryDTO country22 = new CountryDTO("USA", "North America", 331000000L, president22);
        PassportDTO passport22 = new PassportDTO("X9876543", "American", 2029, country22);
        customers.add(new CustomerDTO("Anjali Mehta", "anjali.mehta@microsoft.com", 38, passport22));

        EducationDTO education23 = new EducationDTO("MBA", "Harvard Business School", 2016, 91.0);
        DetailsDTO details23 = new DetailsDTO("EMP007", "Marketing, Strategy", education23, "Business");
        JobDTO job23 = new JobDTO("Marketing Director", "7 years", 1800000.0, details23);
        SecurityDTO security23 = new SecurityDTO("Priya", "Day", false, job23);
        HouseDTO house23 = new HouseDTO("Penthouse", 3, "MG Road, Bangalore", security23);
        CeoDTO ceo23 = new CeoDTO("Tim Cook", 64, "tim@apple.com", house23);
        CompanyDTO company23 = new CompanyDTO("Apple India", "Consumer Electronics", 2008, ceo23);
        VehicleDTO vehicle23 = new VehicleDTO("KA03AB4321", "Sedan", 2021, company23);
        DriverDTO driver23 = new DriverDTO("Karthik", 42, "DL334455", vehicle23);
        PresidentDTO president23 = new PresidentDTO("Emmanuel Macron", 47, "Male", driver23);
        CountryDTO country23 = new CountryDTO("France", "Europe", 67000000L, president23);
        PassportDTO passport23 = new PassportDTO("F9988776", "French", 2032, country23);
        customers.add(new CustomerDTO("Rahul Kapoor", "rahul.kapoor@apple.com", 40, passport23));

        EducationDTO education24 = new EducationDTO("B.Sc", "University of Melbourne", 2013, 84.7);
        DetailsDTO details24 = new DetailsDTO("EMP008", "Data Analysis", education24, "Analytics");
        JobDTO job24 = new JobDTO("Data Scientist", "9 years", 1600000.0, details24);
        SecurityDTO security24 = new SecurityDTO("Linda", "Night", true, job24);
        HouseDTO house24 = new HouseDTO("Apartment", 2, "Docklands, Melbourne", security24);
        CeoDTO ceo24 = new CeoDTO("Elon Musk", 53, "elon@tesla.com", house24);
        CompanyDTO company24 = new CompanyDTO("Tesla Australia", "Automotive", 2015, ceo24);
        VehicleDTO vehicle24 = new VehicleDTO("VIC1234", "Electric", 2022, company24);
        DriverDTO driver24 = new DriverDTO("George", 39, "DL221144", vehicle24);
        PresidentDTO president24 = new PresidentDTO("Anthony Albanese", 62, "Male", driver24);
        CountryDTO country24 = new CountryDTO("Australia", "Oceania", 26000000L, president24);
        PassportDTO passport24 = new PassportDTO("A4455667", "Australian", 2031, country24);
        customers.add(new CustomerDTO("Meera Nair", "meera.nair@tesla.com", 34, passport24));

        EducationDTO education25 = new EducationDTO("B.A.", "Delhi University", 2014, 76.4);
        DetailsDTO details25 = new DetailsDTO("EMP009", "Public Relations", education25, "Media");
        JobDTO job25 = new JobDTO("PR Manager", "6 years", 1100000.0, details25);
        SecurityDTO security25 = new SecurityDTO("Vikram", "Day", false, job25);
        HouseDTO house25 = new HouseDTO("Row House", 4, "Saket, Delhi", security25);
        CeoDTO ceo25 = new CeoDTO("Mark Zuckerberg", 41, "mark@meta.com", house25);
        CompanyDTO company25 = new CompanyDTO("Meta India", "Social Media", 2011, ceo25);
        VehicleDTO vehicle25 = new VehicleDTO("DL10XY1234", "Hatchback", 2018, company25);
        DriverDTO driver25 = new DriverDTO("Imran", 48, "DL909090", vehicle25);
        PresidentDTO president25 = new PresidentDTO("Sheikh Hasina", 77, "Female", driver25);
        CountryDTO country25 = new CountryDTO("Bangladesh", "Asia", 170000000L, president25);
        PassportDTO passport25 = new PassportDTO("B2233445", "Bangladeshi", 2028, country25);
        customers.add(new CustomerDTO("Sana Ali", "sana.ali@meta.com", 33, passport25));


        EducationDTO education26 = new EducationDTO("Ph.D", "Stanford University", 2011, 93.5);
        DetailsDTO details26 = new DetailsDTO("EMP010", "AI Research", education26, "Research");
        JobDTO job26 = new JobDTO("Research Scientist", "12 years", 3000000.0, details26);
        SecurityDTO security26 = new SecurityDTO("Robert", "Night", true, job26);
        HouseDTO house26 = new HouseDTO("Smart Home", 5, "Palo Alto, California", security26);
        CeoDTO ceo26 = new CeoDTO("Sam Altman", 39, "sam@openai.com", house26);
        CompanyDTO company26 = new CompanyDTO("OpenAI", "Artificial Intelligence", 2015, ceo26);
        VehicleDTO vehicle26 = new VehicleDTO("CA88ZZ5678", "Electric", 2023, company26);
        DriverDTO driver26 = new DriverDTO("Steve", 60, "DL121212", vehicle26);
        PresidentDTO president26 = new PresidentDTO("Kamala Harris", 60, "Female", driver26);
        CountryDTO country26 = new CountryDTO("USA", "North America", 331000000L, president26);
        PassportDTO passport26 = new PassportDTO("Z1122334", "American", 2035, country26);
        customers.add(new CustomerDTO("Neha Sharma", "neha.sharma@openai.com", 36, passport26));

        EducationDTO education27=new EducationDTO("B.Com", "St. Joseph's College", 2015, 77.2);
        DetailsDTO details27=new DetailsDTO("EMP005", "Accounts, Taxation", education27, "Finance");
        JobDTO job27=new JobDTO("Chartered Accountant", "8 years", 1200000.0, details27);
        SecurityDTO security27=new SecurityDTO("Sharath", "Day", false, job27);
        HouseDTO house27=new HouseDTO("Flat", 4, "Basavanagudi, Bangalore", security27);
        CeoDTO ceo27=new CeoDTO("Sundar Pichai", 51, "sundar@google.com", house27);
        CompanyDTO company27=new CompanyDTO("Google India", "Internet", 2004, ceo27);
        VehicleDTO vehicle27=new VehicleDTO("KA06WX4321", "Crossover", 2020, company27);
        DriverDTO driver27=new DriverDTO("Ramesh", 45, "DL556677", vehicle27);
        PresidentDTO president27=new PresidentDTO("Droupadi Murmu", 66, "Female", driver27);
        CountryDTO country27=new CountryDTO("India", "Asia", 1400000000L, president27);
        PassportDTO passport27=new PassportDTO("P5678901", "Indian", 2030, country27);
        customers.add(new CustomerDTO("Vinay Bhat", "vinay.bhat@gmail.com", 35, passport27));

        EducationDTO education28=new EducationDTO("B.Com", "St. Joseph's College", 2015, 77.2);
        DetailsDTO details28=new DetailsDTO("EMP005", "Accounts, Taxation", education28, "Finance");
        JobDTO job28=new JobDTO("Chartered Accountant", "8 years", 1200000.0, details28);
        SecurityDTO security28=new SecurityDTO("Sharath", "Day", false, job28);
        HouseDTO house28=new HouseDTO("Flat", 4, "Basavanagudi, Bangalore", security28);
        CeoDTO ceo28=new CeoDTO("Sundar Pichai", 51, "sundar@google.com", house28);
        CompanyDTO company28=new CompanyDTO("Google India", "Internet", 2004, ceo28);
        VehicleDTO vehicle28=new VehicleDTO("KA06WX4321", "Crossover", 2020, company28);
        DriverDTO driver28=new DriverDTO("Ramesh", 45, "DL556677", vehicle28);
        PresidentDTO president28=new PresidentDTO("Droupadi Murmu", 66, "Female", driver28);
        CountryDTO country28=new CountryDTO("India", "Asia", 1400000000L, president28);
        PassportDTO passport28=new PassportDTO("P5678901", "Indian", 2030, country28);
        customers.add(new CustomerDTO("Vinay Bhat", "vinay.bhat@gmail.com", 35, passport28));

        EducationDTO education29=new EducationDTO("B.Com", "St. Joseph's College", 2015, 77.2);
        DetailsDTO details29=new DetailsDTO("EMP005", "Accounts, Taxation", education29, "Finance");
        JobDTO job29=new JobDTO("Accountant", "8 years", 1200000.0, details29);
        SecurityDTO security29=new SecurityDTO("Sharath", "Day", false, job29);
        HouseDTO house29=new HouseDTO("Flat", 4, "Basavanagudi, Bangalore", security29);
        CeoDTO ceo29=new CeoDTO("Sundar Pichai", 51, "sundar@google.com", house29);
        CompanyDTO company29=new CompanyDTO("Google India", "Internet", 2004, ceo29);
        VehicleDTO vehicle29=new VehicleDTO("KA06WX4321", "Crossover", 2020, company29);
        DriverDTO driver29=new DriverDTO("Ramesh", 45, "DL556677", vehicle29);
        PresidentDTO president29=new PresidentDTO("Droupadi Murmu", 66, "Female", driver29);
        CountryDTO country29=new CountryDTO("India", "Asia", 1400000000L, president29);
        PassportDTO passport29=new PassportDTO("P5678901", "Indian", 2030, country29);
        customers.add(new CustomerDTO("Vinay Bhat", "vinay.bhat@gmail.com", 35, passport29));

        EducationDTO education30=new EducationDTO("B.Com", "St. Joseph's College", 2015, 77.2);
        DetailsDTO details30=new DetailsDTO("EMP005", "Accounts, Taxation", education30, "Finance");
        JobDTO job30=new JobDTO("Chartered Accountant", "8 years", 1200000.0, details30);
        SecurityDTO security30=new SecurityDTO("Sharath", "Day", false, job30);
        HouseDTO house30=new HouseDTO("Flat", 4, "Basavanagudi, Bangalore", security30);
        CeoDTO ceo30=new CeoDTO("Sundar Pichai", 51, "sundar@google.com", house30);
        CompanyDTO company30=new CompanyDTO("Google India", "Internet", 2004, ceo30);
        VehicleDTO vehicle30=new VehicleDTO("KA06WX4321", "Crossover", 2020, company30);
        DriverDTO driver30=new DriverDTO("Ramesh", 45, "DL556677", vehicle30);
        PresidentDTO president30=new PresidentDTO("Droupadi Murmu", 66, "Female", driver30);
        CountryDTO country30=new CountryDTO("India", "Asia", 1400000000L, president30);
        PassportDTO passport30=new PassportDTO("P5678901", "Indian", 2030, country30);
        customers.add(new CustomerDTO("Vinay Bhat", "vinay.bhat@gmail.com", 35, passport30));

        System.out.println("===============Sort the collection by company:name in desc================");
        customers.stream()
                .sorted((dto1,dto2)->dto2.getPassport().getCountry().getPresidentDTO().getDriver().getVehicle().getCompany().getName()
                        .compareTo(dto1.getPassport().getCountry().getPresidentDTO().getDriver().getVehicle().getCompany().getName()))
                .forEach(System.out::println);

        System.out.println("=================Find a customer by job role=================");
        String jobRole="Accountant";
        customers.stream().filter(customerDTO -> customerDTO.getPassport().getCountry().getPresidentDTO().getDriver().getVehicle().getCompany().getCeo().getHouse().getSecurity().getJob().getRole().equals(jobRole)).forEach(System.out::println);

        System.out.println("================Sort by Country:name in desc==============");
        customers.stream().sorted((dto1,dto2)->dto2.getPassport().getCountry().getName().compareTo(dto1.getPassport().getCountry().getName()))
                .forEach(System.out::println);

        System.out.println("=============Sort by education:qualification in asc================");
        customers.stream().sorted((dto1,dto2)->dto2.getPassport().getCountry().getPresidentDTO().getDriver().getVehicle().getCompany().getCeo().getHouse().getSecurity().getJob().getDetails().getEducation().getQualification()
                        .compareTo(dto1.getPassport().getCountry().getPresidentDTO().getDriver().getVehicle().getCompany().getCeo().getHouse().getSecurity().getJob().getDetails().getEducation().getQualification()))
                .forEach(System.out::println);

        System.out.println("===============Collect all unique Country=================");
        customers.stream().map((customerDTO -> customerDTO.getPassport().getCountry())).collect(Collectors.toSet()).forEach(System.out::println);
}
}
