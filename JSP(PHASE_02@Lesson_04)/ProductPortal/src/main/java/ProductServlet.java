import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));

        // Create a Product object
        
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);

        // Store the Product object in the session
        HttpSession session = request.getSession();
        session.setAttribute("product", product);

        // Redirect to the display JSP
        response.sendRedirect("product-display.jsp");
    }
}
