import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/convertTemp", loadOnStartup = 1)
public class TempConverterServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("TempConverterServlet is running");

        String tempParam = request.getParameter("temperature");
        String type = request.getParameter("conversionType");

        double temp = 0;
        if (tempParam != null && !tempParam.isEmpty()) {
            temp = Double.parseDouble(tempParam);
        }

        double result = 0;
        String output = "";

        if ("CtoF".equals(type)) {
            result = (temp * 9 / 5) + 32;
            output = temp + "°C = " + result + "°F";
        } else if ("FtoC".equals(type)) {
            result = (temp - 32) * 5 / 9;
            output = temp + "°F = " + result + "°C";
        }

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Temperature Conversion Result</h1>");
        writer.println("<h3>" + output + "</h3>");
    }
}
