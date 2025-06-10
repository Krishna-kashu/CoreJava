package servlet;

import dto.LibraryDTO;
import repository.LibraryRepo;
import repository.LibraryRepoImpl;
import service.LibraryService;
import service.LibraryServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/library", loadOnStartup = 1)
public class LibraryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost by Tomcat");

    String name = req.getParameter("name");
    String bookID = req.getParameter("bookID");
    String authorName = req.getParameter("author");
    String publishedYear = req.getParameter("year");
    String cost = req.getParameter("cost");

        LibraryDTO libraryDTO=new LibraryDTO();
        libraryDTO.setName(name);
        libraryDTO.setBookID(bookID);
        libraryDTO.setAuthorName(authorName);
        libraryDTO.setPublishedYear(publishedYear);
        libraryDTO.setCost(cost);

        LibraryService libraryService = new LibraryServiceImpl();
        boolean saved = libraryService.save(libraryDTO);

        if (saved){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("librarySuccess.jsp");
            req.setAttribute("message","Book Details saved successfully");
            req.setAttribute("details",libraryDTO);
            requestDispatcher.forward(req,resp);

            LibraryRepo libraryRepo = new LibraryRepoImpl();
            libraryRepo.persist(libraryDTO);
        }else{
            RequestDispatcher dispatcher = req.getRequestDispatcher("libraryForm.jsp");
              req.setAttribute("message", "Save failed!");
              dispatcher.forward(req,resp);
        }
    }
}


