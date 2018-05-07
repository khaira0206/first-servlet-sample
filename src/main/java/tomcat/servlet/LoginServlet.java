package tomcat.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public LoginServlet() {
      
    }

	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	public void destroy() {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		 String password = request.getParameter("password");
		 
		 if("imcs".equals(userId) && "tiger".equals(password)) {
			 RequestDispatcher rd = request.getRequestDispatcher("/views/home.jsp");
			 rd.forward(request, response);
		 }else {
			 RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
			 rd.forward(request, response); 
		 }
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
