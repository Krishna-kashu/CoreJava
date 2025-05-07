import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/kabaddi", loadOnStartup = 6)
public class KabbadiServlet extends GenericServlet {

    public KabbadiServlet(){
        System.out.println("Running KabbadiServlet by tomcat" );
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Service by KabbadiServlet ");

        PrintWriter writer = servletResponse.getWriter();
        writer.println("Kabaddi page response delivered.");
    }
}
