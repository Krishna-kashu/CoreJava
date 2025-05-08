import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/movieBook", loadOnStartup = 1)
public class MovieBookServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("MovieBookServlet is running");

        String name = servletRequest.getParameter("name");
        String movieName = servletRequest.getParameter("moviename");
        String contactNumber = servletRequest.getParameter("contactnumber");
        int price =200;
        int tNumber=0;
        long cNumber=0;
        if(contactNumber!=null && contactNumber!=""){
            cNumber = Long.parseLong(contactNumber);
        }
        String ticketNumber = servletRequest.getParameter("ticketNumber");
        if(ticketNumber!=null && ticketNumber!=""){
            tNumber = Integer.parseInt(ticketNumber);
        }

        long payablePrice = price * tNumber;

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<h1> Thanks for booking the movie <h1/>");
        writer.println("<h3> Your payable price is : <h3/>"+payablePrice);
    }
}
