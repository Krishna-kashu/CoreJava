import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/mico", loadOnStartup = 1)
public class Mico extends GenericServlet {
    public Mico(){
        System.out.println("running Mico by Tomcat");
    }
    @Override
//    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException
//    {
//
//    }
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
    {
        System.out.println("Running service in Mico");
    }
}
