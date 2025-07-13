package com.my_work.mapps.runner;

import com.my_work.mapps.dto.MarksDTO;
import com.my_work.mapps.dto.StudentDTO;
import java.util.HashMap;
import java.util.Map;

public class StudentRunner {
    public static void main(String[] args) {

        StudentDTO student1 = new StudentDTO(101, "Aarav", "10th");
        StudentDTO student2 = new StudentDTO(102, "Ishita", "10th");
        StudentDTO student3 = new StudentDTO(103, "Rohan", "9th");
        StudentDTO student4 = new StudentDTO(104, "Sneha", "9th");
        StudentDTO student5 = new StudentDTO(105, "Vivaan", "11th");
        StudentDTO student6 = new StudentDTO(106, "Ananya", "12th");
        StudentDTO student7 = new StudentDTO(107, "Krishna", "10th");
        StudentDTO student8 = new StudentDTO(108, "Diya", "9th");
        StudentDTO student9 = new StudentDTO(109, "Karthik", "11th");
        StudentDTO student10 = new StudentDTO(110, "Meera", "12th");
        StudentDTO student11 = new StudentDTO(111, "Yash", "10th");
        StudentDTO student12 = new StudentDTO(112, "Nisha", "11th");
        StudentDTO student13 = new StudentDTO(113, "Rahul", "12th");
        StudentDTO student14 = new StudentDTO(114, "Pooja", "10th");
        StudentDTO student15 = new StudentDTO(115, "Aryan", "9th");
        StudentDTO student16 = new StudentDTO(116, "Tanya", "11th");
        StudentDTO student17 = new StudentDTO(117, "Sahil", "10th");
        StudentDTO student18 = new StudentDTO(118, "Neha", "12th");
        StudentDTO student19 = new StudentDTO(119, "Manav", "9th");
        StudentDTO student20 = new StudentDTO(120, "Ritika", "11th");

        Map<String, MarksDTO> marksMap1 = new HashMap<>();
        marksMap1.put("Maths", new MarksDTO(88, 100));
        marksMap1.put("Science", new MarksDTO(92, 100));

        Map<String, MarksDTO> marksMap2 = new HashMap<>();
        marksMap2.put("Maths", new MarksDTO(76, 100));
        marksMap2.put("English", new MarksDTO(81, 100));

        Map<String, MarksDTO> marksMap3 = new HashMap<>();
        marksMap3.put("Science", new MarksDTO(89, 100));
        marksMap3.put("History", new MarksDTO(85, 100));

        Map<String, MarksDTO> marksMap4 = new HashMap<>();
        marksMap4.put("Maths", new MarksDTO(93, 100));
        marksMap4.put("English", new MarksDTO(87, 100));

        Map<String, MarksDTO> marksMap5 = new HashMap<>();
        marksMap5.put("Computer", new MarksDTO(96, 100));
        marksMap5.put("Maths", new MarksDTO(84, 100));

        Map<StudentDTO, Map<String, MarksDTO>> studentMarksMap = new HashMap<>();

        studentMarksMap.put(student1, marksMap1);
        studentMarksMap.put(student2, marksMap2);
        studentMarksMap.put(student3, marksMap3);
        studentMarksMap.put(student4, marksMap4);
        studentMarksMap.put(student5, marksMap5);
        studentMarksMap.put(student6, marksMap2);
        studentMarksMap.put(student7, marksMap3);
        studentMarksMap.put(student8, marksMap1);
        studentMarksMap.put(student9, marksMap4);
        studentMarksMap.put(student10, marksMap5);
        studentMarksMap.put(student11, marksMap1);
        studentMarksMap.put(student12, marksMap2);
        studentMarksMap.put(student13, marksMap3);
        studentMarksMap.put(student14, marksMap4);
        studentMarksMap.put(student15, marksMap5);
        studentMarksMap.put(student16, marksMap1);
        studentMarksMap.put(student17, marksMap2);
        studentMarksMap.put(student18, marksMap3);
        studentMarksMap.put(student19, marksMap4);
        studentMarksMap.put(student20, marksMap5);

        studentMarksMap.keySet().forEach(System.out::println);
        studentMarksMap.values().forEach(System.out::println);
    }
}
