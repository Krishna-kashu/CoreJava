import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/validate")
public class ValidServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        System.out.println("Running ValidServlet");

        String aadhar = servletRequest.getParameter("aadhar");
        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("Varifing.....");
        writer.println("\n\n");

        if (aadhar != null && aadhar.matches("\\d{12}")) {
            writer.println("valid Aadhaar Number");
        } else {
            writer.println("Not valid");
        }
    }
}
