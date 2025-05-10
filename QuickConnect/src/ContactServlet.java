import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/contact", loadOnStartup = 1)
public class ContactServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String fname =  servletRequest.getParameter("fname");
        String lname = servletRequest.getParameter("lname");
        String mail = servletRequest.getParameter("mail");
        String message = servletRequest.getParameter("message");

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();

        writer.println("<html><head><title>Contact Confirmation</title></head>");
        writer.println("<body style='font-family:Arial;background:linear-gradient(to right, #ffd6e8, #f0f0f0);margin:0;padding:20px;'>");
        writer.println("<h2 style='color:#d5006e;text-align:center;'>Thanks for contacting us!</h2>");
        writer.println("<div style='background:#ffffff;padding:20px;border-radius:8px;width:50%;margin:auto;box-shadow:0 0 10px rgba(0,0,0,0.1);color:#333;'>");
        writer.println("<p><strong style='color:#d5006e;'>Name:</strong> " + fname + " " + lname + "</p>");
        writer.println("<p><strong style='color:#d5006e;'>Email:</strong> " + mail + "</p>");
        writer.println("<p><strong style='color:#d5006e;'>Message:</strong> " + message + "</p>");
        writer.println("</div> <div> <a href=\"index.html\">Back to home</a></div>");
        writer.println("</body></html>");


    }
}
