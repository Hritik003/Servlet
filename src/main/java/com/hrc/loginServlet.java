package com.hrc;


//the session is used in the web technology for storing the user's data.
//A session begins as soon as you logg in to your site.
// the moment you close/logg off our of your browser, the session ends.


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



//till the prev tutorials, we have used the xml for calling the servlets 
// from the web container. But using xml sometimes becomes too clumsy, hence coders prefer 
// usage of servlet annotations.
// |
// |
// ↓
@WebServlet("/login") 
public class loginServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String user = req.getParameter("username");
		String pwd = req.getParameter("password");
		
		HttpSession session = req.getSession();
		session.setAttribute("password", pwd);
		session.setAttribute("username", user);
		
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor = red>");
		
		out.println("You have successfully logged into your session as  " + user);
		out.println("</body></html>");
		
		
	}

}
