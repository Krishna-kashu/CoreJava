import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/table", loadOnStartup = 8)
public class TableTennisServlet extends GenericServlet {

    public TableTennisServlet(){
        System.out.println("TableTennisServlet running by Tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Service in TableTennisServlet");
    }
}
