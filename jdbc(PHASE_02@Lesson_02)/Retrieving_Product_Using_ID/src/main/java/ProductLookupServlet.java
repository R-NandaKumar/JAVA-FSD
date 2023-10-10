import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductLookupServlet")
public class ProductLookupServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // JDBC connection parameters
    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/MPHASISNEWDB1";
    private static final String dbUsername = "root";
    private static final String dbPassword = "root123";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get the product ID entered by the user
        String productId = request.getParameter("productId");

        // Initialize the JDBC connection
        Connection connection = null;

        try {
            // Establish a connection to the database
            connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);

            // Prepare a SQL query to retrieve product details
            String sql = "SELECT * FROM products WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, productId);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if a product was found
            if (resultSet.next()) {
                String productName = resultSet.getString("name");
                String productDescription = resultSet.getString("description");
                double productPrice = resultSet.getDouble("price");

                // Display product details
                out.println("<html><head><title>Product Details</title></head><body>");
                out.println("<h1>Product Details</h1>");
                out.println("<p>Product ID: " + productId + "</p>");
                out.println("<p>Product Name: " + productName + "</p>");
                out.println("<p>Description: " + productDescription + "</p>");
                out.println("<p>Price: $" + productPrice + "</p>");
                out.println("</body></html>");
            } else {
                // Product not found
                out.println("<html><head><title>Error</title></head><body>");
                out.println("<h1>Product Not Found</h1>");
                out.println("<p>No product found for ID: " + productId + "</p>");
                out.println("</body></html>");
            }
        } catch (SQLException e) {
            // Handle database errors
            out.println("<html><head><title>Error</title></head><body>");
            out.println("<h1>Database Error</h1>");
            out.println("<p>Error: " + e.getMessage() + "</p>");
            out.println("</body></html>");
        } finally {
            // Close the database connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
