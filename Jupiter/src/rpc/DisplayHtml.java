package rpc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayHtml
 */
@WebServlet("/display")
public class DisplayHtml extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayHtml() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		if (request.getParameter("username") != null) {
			String username = request.getParameter("username");
			writer.println("<html><body>");
			writer.println("<h1>Hello " + username + "</h1>");
			writer.println("<h3>This is an ugly html file.</h3>");
			writer.println("<p>But we have a picture of ottor for you. See below</p>");
			writer.println("<img src=\"https://cdn.pixabay.com/photo/2016/06/05/22/42/otter-1438378_1280.jpg\"/ width=\"500px\"/>");
			writer.println("</body></html>");
		}
		
		 writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
