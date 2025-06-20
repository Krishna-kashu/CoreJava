package com.mywork.event.servlet;

import com.mywork.event.dto.GraduationDTO;
import com.mywork.event.service.GraduationService;
import com.mywork.event.service.GraduationServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = {"/graduate","/search"})
public class GraduationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doPost method in GraduationServlet");



        String studentName = req.getParameter("studentName");
        String degreeAwarded =req.getParameter("degreeAwarded");
        String collegeName = req.getParameter("collegeName");
        int graduationYear = Integer.parseInt(req.getParameter("graduationYear"));
        float cgpa = Float.parseFloat(req.getParameter("cgpa"));

        GraduationDTO graduationDTO= new GraduationDTO(studentName,degreeAwarded,collegeName,graduationYear,cgpa);
        GraduationService graduationService = new GraduationServiceImpl();
        boolean valid = graduationService.save(graduationDTO);

        if(valid){
            System.out.println("service done successfully");
            req.setAttribute("success", "Details saved successfully");
        }else{
            System.out.println("not saved");
            req.setAttribute("dto", graduationDTO);
            req.setAttribute("failure","save failed");
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("event.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doGet in GraduationServlet");
        String gId =req.getParameter("gId");

        if(gId != null){
            try {
                int id = Integer.parseInt(gId);
                System.out.println("search id : " + id);
                GraduationService graduationService = new GraduationServiceImpl();
                Optional<GraduationDTO> optionalGraduationDTO = graduationService.findById(id);

                if (optionalGraduationDTO.isPresent()) {
                    GraduationDTO graduationDTO = optionalGraduationDTO.get();
                    System.out.println("data is found : " + graduationDTO);
                    req.setAttribute("dto", graduationDTO);
                } else {
                    System.out.println("data not found for id: " + id);
                    req.setAttribute("failure", "Data not found for id: " + id);
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid ID format: "+gId);
                req.setAttribute("failure", "Please provide a valid Student ID");
            }
            RequestDispatcher dispatcher = req.getRequestDispatcher("Viewer.jsp");
            dispatcher.forward(req,resp);
        }
    }
}
