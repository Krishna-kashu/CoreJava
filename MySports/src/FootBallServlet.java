import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/foot", loadOnStartup = 4)
public class FootBallServlet extends GenericServlet{
    public FootBallServlet(){

        System.out.println("Running FootBallServlet by tomcat" );
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Service by FootBallServlet ");

        PrintWriter a = servletResponse.getWriter();
        a.println("You’re now viewing the world of Football!");
    }
}

