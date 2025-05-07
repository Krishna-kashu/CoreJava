import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class FeedBackServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running FeedBackServlet");

        String name = servletRequest.getParameter("name");
        String email = servletRequest.getParameter("email");
        String contact = servletRequest.getParameter("contact");
        String feedback = servletRequest.getParameter("feedback");


        System.out.println("Feedback from...");
        System.out.println("Name: "+name);
        System.out.println("E-mail: "+email);
        System.out.println("Contact: "+contact);
        System.out.println("Feedback: "+feedback);


        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println(name+", Thanks for submitting the feedback, Your response has been recorded");
    }
}
