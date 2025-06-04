package servlet;

import exception.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/life")
public class LifeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost method by tomcat");

        String name = req.getParameter("name");
        String contact = req.getParameter("contact");
        String address = req.getParameter("address");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        String aadhaar = req.getParameter("aadhaar");

//        LifeDTO lifeDTO = new LifeDTO();


        if(name.length() < 3 ){
            throw new NameLengthException("Name should be greater than 3 characters");
        } else {
            System.out.println("Valid name");
        }

        if(Character.isDigit(name.charAt(0))){
            throw new NameStartsWithNumberException("Name cannot start with a number");
        } else {
            System.out.println("Valid name start");
        }

        if(address == null ){
            throw new AddressNotNullException("Address cannot be null");
        } else {
            System.out.println("Valid address");
        }


        if(aadhaar == null || aadhaar.length() != 12 ){
            throw new AadhaarLengthException("Aadhaar number must be exactly 12 digits");
        } else {
            System.out.println("Valid Aadhaar");
        }

        if(contact == null || contact.length() != 10 ){
            throw new ContactNumberLengthException("Contact number must be exactly 10 digits");
        } else {
            System.out.println("Valid contact number");
        }

        if(country == "India"){
            throw new CountryNameException("Country name should be India");
        } else {
            System.out.println("Valid country");
        }

        if(email == null || !email.contains("@")){
            throw new EmailMissingAtException("Email must contain '@'");
        } else {
            System.out.println("Email contains '@'");
        }

        if(!email.endsWith(".com")){
            throw new EmailMissingComException("Email must end with '.com'");
        } else {
            System.out.println("Email ends with '.com'");
        }

        if(password == null || password.length() < 8 || password.length()>16){
            throw new PasswordLengthException("Password must be between 8 to 16");
        } else {
            System.out.println("Valid password");
        }

    }
}
