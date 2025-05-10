import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/quick", loadOnStartup = 1)
public class QuickConnectServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletRequest.getParameter("name");
        servletRequest.getParameter("name");
        servletRequest.getParameter("name");
        servletRequest.getParameter("name");

    }
}
