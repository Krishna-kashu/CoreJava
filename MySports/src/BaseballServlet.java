import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/baseball", loadOnStartup = 2)
public class BaseballServlet extends GenericServlet {

    public BaseballServlet(){
        System.out.println("Running BaseBallServlet by tomcat" );
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Service by BaseBallServlet ");

        PrintWriter writer=servletResponse.getWriter();
        writer.println("Welcome to the Baseball page. Enjoy exploring!");
    }
}
