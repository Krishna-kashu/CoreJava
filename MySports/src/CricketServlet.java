import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/cricket", loadOnStartup = 3)
public class CricketServlet extends GenericServlet {

    public CricketServlet(){
        System.out.println("CricketServlet running by Tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Service in CricketServlet");

        PrintWriter a=servletResponse.getWriter();
        a.println("Cricket section loaded successfully.");
    }
}
