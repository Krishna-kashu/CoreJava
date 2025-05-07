import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/volley", loadOnStartup = 9)
public class VolleyBallServlet extends GenericServlet {

    public VolleyBallServlet(){
        System.out.println("VolleyBallServlet running by Tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Service in VolleyBallServlet");

        PrintWriter writer = servletResponse.getWriter();
        writer.println("Welcome to the VolleyBall page.");
    }
}
