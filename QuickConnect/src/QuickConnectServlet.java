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
        writer.println(fname+""+lname+", your details submitted successfully!\n\n");
        writer.println("Name: "+fname+""+lname);
        writer.println("E-mail: "+mail);
        writer.println("Age: "+ age);
        writer.println("Address: "+address);
        writer.println("Sickness: "+sickness);
        writer.println("Mobile Number: "+mob);
        writer.println("Gender "+gender);
    }
}
