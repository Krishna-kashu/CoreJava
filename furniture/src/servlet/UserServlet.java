package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/new")
public class UserServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String brand = servletRequest.getParameter("Brand");

        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();
        out.println("Message from servlet");

        out.println("brand: "+brand);


    }
}
