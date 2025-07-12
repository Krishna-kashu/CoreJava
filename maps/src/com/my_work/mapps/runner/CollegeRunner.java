package com.my_work.mapps.runner;

import com.my_work.mapps.dto.CollegeDTO;
import com.my_work.mapps.dto.DepartmentDTO;

import java.util.HashMap;
import java.util.Map;

public class CollegeRunner {
    public static void main(String[] args) {
        DepartmentDTO[] d1 = {
                new DepartmentDTO("Computer Science", 500, "Dr. Rao"),
                new DepartmentDTO("Mechanical", 300, "Dr. Shetty")};

        DepartmentDTO[] d2 = {
                new DepartmentDTO("Civil", 250, "Dr. Kumar"),
                new DepartmentDTO("Electrical", 400, "Dr. Naik")};

        DepartmentDTO[] d3 = {
                new DepartmentDTO("Biotechnology", 150, "Dr. Shilpa"),
                new DepartmentDTO("Physics", 100, "Dr. Rao")};

        DepartmentDTO[] d4 = {
                new DepartmentDTO("Chemistry", 180, "Dr. Patil"),
                new DepartmentDTO("Mathematics", 200, "Dr. Dev")};

        DepartmentDTO[] d5 = {
                new DepartmentDTO("IT", 450, "Dr. Mehta"),
                new DepartmentDTO("Electronics", 320, "Dr. Swamy")};

        DepartmentDTO[] d6 = {
                new DepartmentDTO("CS", 400, "Dr. A"),
                new DepartmentDTO("Mech", 300, "Dr. B") };
        DepartmentDTO[] d7 = { new DepartmentDTO("Civil", 200, "Dr. C"),
                new DepartmentDTO("EEE", 310, "Dr. D") };
        DepartmentDTO[] d8 = { new DepartmentDTO("Maths", 120, "Dr. E"), new DepartmentDTO("Physics", 150, "Dr. F") };
        DepartmentDTO[] d9 = { new DepartmentDTO("IT", 330, "Dr. G"), new DepartmentDTO("Bio", 100, "Dr. H") };
        DepartmentDTO[] d10 = { new DepartmentDTO("Mechatronics", 180, "Dr. I"), new DepartmentDTO("AI", 260, "Dr. J") };

        DepartmentDTO[] d11 = { new DepartmentDTO("DS", 210, "Dr. K"), new DepartmentDTO("ML", 270, "Dr. L") };
        DepartmentDTO[] d12 = { new DepartmentDTO("Robotics", 160, "Dr. M"), new DepartmentDTO("ECE", 280, "Dr. N") };
        DepartmentDTO[] d13 = { new DepartmentDTO("Automobile", 140, "Dr. O"), new DepartmentDTO("Aeronautics", 120, "Dr. P") };
        DepartmentDTO[] d14 = { new DepartmentDTO("Textile", 130, "Dr. Q"), new DepartmentDTO("Marine", 90, "Dr. R") };
        DepartmentDTO[] d15 = { new DepartmentDTO("Agri", 100, "Dr. S"), new DepartmentDTO("Geo", 85, "Dr. T") };

        DepartmentDTO[] d16 = { new DepartmentDTO("Law", 250, "Dr. U"), new DepartmentDTO("Commerce", 300, "Dr. V") };
        DepartmentDTO[] d17 = { new DepartmentDTO("BBA", 280, "Dr. W"), new DepartmentDTO("MBA", 320, "Dr. X") };
        DepartmentDTO[] d18 = { new DepartmentDTO("Psychology", 160, "Dr. Y"), new DepartmentDTO("Sociology", 140, "Dr. Z") };
        DepartmentDTO[] d19 = { new DepartmentDTO("Arts", 400, "Dr. AA"), new DepartmentDTO("History", 170, "Dr. BB") };
        DepartmentDTO[] d20 = { new DepartmentDTO("English", 230, "Dr. CC"), new DepartmentDTO("Philosophy", 110, "Dr. DD") };

        DepartmentDTO[] d21 = { new DepartmentDTO("Design", 130, "Dr. EE"), new DepartmentDTO("Architecture", 190, "Dr. FF") };
        DepartmentDTO[] d22 = { new DepartmentDTO("Animation", 90, "Dr. GG"), new DepartmentDTO("Film", 80, "Dr. HH") };
        DepartmentDTO[] d23 = { new DepartmentDTO("Music", 60, "Dr. II"), new DepartmentDTO("Dance", 70, "Dr. JJ") };
        DepartmentDTO[] d24 = { new DepartmentDTO("Sports", 100, "Dr. KK"), new DepartmentDTO("Yoga", 50, "Dr. LL") };
        DepartmentDTO[] d25 = { new DepartmentDTO("Environmental", 120, "Dr. MM"), new DepartmentDTO("Forestry", 110, "Dr. NN") };

        CollegeDTO college1 = new CollegeDTO("IISc Bangalore", "Bangalore", 1909);
        CollegeDTO college2 = new CollegeDTO("NITK Surathkal", "Surathkal", 1960);
        CollegeDTO college3 = new CollegeDTO("UVCE", "Bangalore", 1917);
        CollegeDTO college4 = new CollegeDTO("Ramaiah Institute of Technology", "Bangalore", 1962);
        CollegeDTO college5 = new CollegeDTO("PES University", "Bangalore", 1972);
        CollegeDTO college6 = new CollegeDTO("RV College of Engineering", "Bangalore", 1963);
        CollegeDTO college7 = new CollegeDTO("BMS College of Engineering", "Bangalore", 1946);
        CollegeDTO college8 = new CollegeDTO("Dayananda Sagar College of Engineering", "Bangalore", 1979);
        CollegeDTO college9 = new CollegeDTO("New Horizon College of Engineering", "Bangalore", 2001);
        CollegeDTO college10 = new CollegeDTO("NIE Mysore", "Mysore", 1946);
        CollegeDTO college11 = new CollegeDTO("SJCE Mysore", "Mysore", 1963);
        CollegeDTO college12 = new CollegeDTO("Manipal Institute of Technology", "Manipal", 1957);
        CollegeDTO college13 = new CollegeDTO("KLE Technological University", "Hubli", 1947);
        CollegeDTO college14 = new CollegeDTO("Basaveshwar Engineering College", "Bagalkot", 1963);
        CollegeDTO college15 = new CollegeDTO("SDM College of Engineering", "Dharwad", 1979);
        CollegeDTO college16 = new CollegeDTO("Malnad College of Engineering", "Hassan", 1960);
        CollegeDTO college17 = new CollegeDTO("NMIT", "Bangalore", 2001);
        CollegeDTO college18 = new CollegeDTO("Acharya Institute of Technology", "Bangalore", 2000);
        CollegeDTO college19 = new CollegeDTO("Reva University", "Bangalore", 2012);
        CollegeDTO college20 = new CollegeDTO("Christ University", "Bangalore", 1969);
        CollegeDTO college21 = new CollegeDTO("MSRUAS", "Bangalore", 2013);
        CollegeDTO college22 = new CollegeDTO("Yenepoya Institute of Technology", "Mangalore", 2008);
        CollegeDTO college23 = new CollegeDTO("Cambridge Institute of Technology", "Bangalore", 2001);
        CollegeDTO college24 = new CollegeDTO("Bangalore Institute of Technology", "Bangalore", 1979);
        CollegeDTO college25 = new CollegeDTO("Oxford College of Engineering", "Bangalore", 1974);

        Map<CollegeDTO, DepartmentDTO[]> collegeMap = new HashMap<>();

        collegeMap.put(college1, d1);
        collegeMap.put(college2, d2);
        collegeMap.put(college3, d3);
        collegeMap.put(college4, d4);
        collegeMap.put(college5, d5);
        collegeMap.put(college6, d6);
        collegeMap.put(college7, d7);
        collegeMap.put(college8, d8);
        collegeMap.put(college9, d9);
        collegeMap.put(college10, d10);
        collegeMap.put(college11, d11);
        collegeMap.put(college12, d12);
        collegeMap.put(college13, d13);
        collegeMap.put(college14, d14);
        collegeMap.put(college15, d15);
        collegeMap.put(college16, d16);
        collegeMap.put(college17, d17);
        collegeMap.put(college18, d18);
        collegeMap.put(college19, d19);
        collegeMap.put(college20, d20);
        collegeMap.put(college21, d21);
        collegeMap.put(college22, d22);
        collegeMap.put(college23, d23);
        collegeMap.put(college24, d24);
        collegeMap.put(college25, d25);

        System.out.println("College - Departments:");
        for (Map.Entry<CollegeDTO, DepartmentDTO[]> entry : collegeMap.entrySet()) {
            System.out.println(entry.getKey().getName() + " (" + entry.getKey().getLocation() + "):");
            for (DepartmentDTO dept : entry.getValue()) {
                System.out.println("   - " + dept.getName() + " (" + dept.getHod() + ")");
            }
        }
    }
}
