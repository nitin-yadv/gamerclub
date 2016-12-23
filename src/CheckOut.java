

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckOut
 */
@WebServlet("/CheckOut")
public class CheckOut extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		// Helper helper = new Helper(request,pw);
		
		Shipping shipping = new Shipping();
		shipping.setName(request.getParameter("name"));
        shipping.setAddress1(request.getParameter("address1"));
        shipping.setAddress2(request.getParameter("address2"));
        shipping.setCity(request.getParameter("city"));
        shipping.setState(request.getParameter("state"));
        shipping.setPostalCode(request.getParameter("postalCode"));
        shipping.setCountry(request.getParameter("country"));
        shipping.setEmail(request.getParameter("email"));
	
        Billing billing = new Billing();

        billing.setNameOnCard(request.getParameter("nameOnCard"));
        billing.setCreditCardType(request.getParameter("creditCardType"));
        billing.setCreditCardNumber(request.getParameter("creditCardNumber"));
        billing.setCreditCardExpiration(request.getParameter("creditCardExpiration"));
        
        HttpSession session = request.getSession();
	
        Cart cart = (Cart) session.getAttribute("Cart");
        if (cart == null)
        {
            cart = new Cart();

            session.setAttribute("Cart", cart);
        }


	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
