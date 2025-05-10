import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/quick", loadOnStartup = 1)
public class QuickConnectServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String fname = servletRequest.getParameter("fname");
        String lname = servletRequest.getParameter("lname");
        String mail = servletRequest.getParameter("mail");
        String age = servletRequest.getParameter("age");
        String address = servletRequest.getParameter("address");
        String sickness = servletRequest.getParameter("sickness");
        String mob = servletRequest.getParameter("mobile");
        String gender = servletRequest.getParameter("gender");

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();

        writer.println("<html><head><title>Appointment Confirmation</title></head><body style='font-family:Arial; background:#e0f7fa;'>");
        writer.println("<h2 style='color:#00796b;'>Thank you, " + fname + " " + lname + ", your details were submitted successfully!</h2>");
        writer.println("<div style='background:#fff;padding:20px;border-radius:8px;width:50%;margin:auto;'>");
        writer.println("<p><strong>Name:</strong> " + fname + " " + lname + "</p>");
        writer.println("<p><strong>Email:</strong> " + mail + "</p>");
        writer.println("<p><strong>Age:</strong> " + age + "</p>");
        writer.println("<p><strong>Address:</strong> " + address + "</p>");
        writer.println("<p><strong>Sickness:</strong> " + sickness + "</p>");
        writer.println("<p><strong>Mobile Number:</strong> " + mob + "</p>");
        writer.println("<p><strong>Gender:</strong> " + gender + "</p>");
        writer.println("</div>");
        writer.println("</body></html>");

    }
}
