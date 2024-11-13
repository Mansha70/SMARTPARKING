import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sign_up_cust_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String custName = request.getParameter("cust_name");
        String password = request.getParameter("V_number");
        String email = request.getParameter("V_type");

        // Database connection details
        String jdbcURL = "jdbc:mysql://localhost:3306/your_database";
        String dbUser = "root";
        String dbPassword = "your_db_password";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Insert query
            String sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, custName);
            statement.setString(2, password); // Ensure password hashing in real applications
            statement.setString(3, email);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Sign-up completed successfully!');");
                out.println("window.location.href = 'index.html';");
                out.println("</script>");
            }

            // Close connection
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error during sign-up: " + e.getMessage());
        }
    }
}