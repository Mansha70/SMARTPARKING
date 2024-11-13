import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Sign_in_cust_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get user input
        String username = request.getParameter("uname");
        String password = request.getParameter("pwd");
        
        // Here, you should check if the credentials are valid by querying the database
        boolean isValid = checkCredentials(username, password);  // Implement this method to validate

        if (isValid) {
            // Redirect to home page with a success message
            response.sendRedirect("home.jsp?message=Sign-In+Completed+Successfully");
        } else {
            // Redirect to the sign-in page with an error message
            response.sendRedirect("sign-in.jsp?error=Invalid+Credentials");
        }
    }

    private boolean checkCredentials(String username, String password) {
        // Implement database validation logic here
        // For example, query the database and check if the username and password match
        // Return true if valid, false otherwise
        
        // Temporary check (replace with real logic)
        return "testuser".equals(username) && "password123".equals(password);
    }
}
