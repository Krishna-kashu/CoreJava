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

        writer.println("<html><head><title>Appointment Confirmation</title></head>");
        writer.println("<body style='font-family:Arial; background:linear-gradient(to right, #ffd6e8, #f0f0f0); margin:0; padding:20px;'>");
        writer.println("<h2 style='color:#d5006e; text-align:center;'>Thank you, " + fname + " " + lname + ", your details were submitted successfully!</h2>");
        writer.println("<div style='background:#ffffff; padding:20px; border-radius:8px; width:50%; margin:auto; box-shadow:0 0 10px rgba(0,0,0,0.1); color:#333;'>");
        writer.println("<p><strong style='color:#d5006e;'>Name:</strong> " + fname + " " + lname + "</p>");
        writer.println("<p><strong style='color:#d5006e;'>Email:</strong> " + mail + "</p>");
        writer.println("<p><strong style='color:#d5006e;'>Age:</strong> " + age + "</p>");
        writer.println("<p><strong style='color:#d5006e;'>Address:</strong> " + address + "</p>");
        writer.println("<p><strong style='color:#d5006e;'>Sickness:</strong> " + sickness + "</p>");
        writer.println("<p><strong style='color:#d5006e;'>Mobile Number:</strong> " + mob + "</p>");
        writer.println("<p><strong style='color:#d5006e;'>Gender:</strong> " + gender + "</p>");
        writer.println("</div><a href=\"index.html\">Back to home</a>");
        writer.println("</body></html>");


    }
}
