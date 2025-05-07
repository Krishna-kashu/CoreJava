import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/badminton", loadOnStartup = 1)
public class BadmintonServlet extends GenericServlet {

    public BadmintonServlet(){
        System.out.println("Badminton Servlet created by tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        System.out.println("Running service BadmintonServlet");

        PrintWriter a=servletResponse.getWriter();
        a.println("You have successfully accessed the Badminton section!");
    }
}
