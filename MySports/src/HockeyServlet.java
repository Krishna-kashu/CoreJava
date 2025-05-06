import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/hockey", loadOnStartup = 5)
public class HockeyServlet extends GenericServlet {
    public HockeyServlet(){
        System.out.println("Running HockeyServlet by tomcat" );
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Service by HockeyServlet ");
    }
}
