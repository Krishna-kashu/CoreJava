import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/karate", loadOnStartup = 7)
public class KarateServlet extends GenericServlet {

    public KarateServlet(){
        System.out.println("KarateServlet running by Tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Service in KarateServlet");

        PrintWriter writer = servletResponse.getWriter();
        writer.println("Karate page response delivered.");
    }
}
