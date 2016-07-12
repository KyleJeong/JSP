package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.LoginBean;

public class ControllerServelet extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		
		LoginBean bean = new LoginBean();
		bean.setName(name);
		bean.setPwd(pwd);
		
		request.setAttribute("bean", bean);
		
		boolean status = bean.validate();
		
		if(status){
			RequestDispatcher rd = request.getRequestDispatcher("login-success.jsp");
			rd.forward(request, response);
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
			rd.forward(request, response);
		}
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		doPost(request,response);
	}
	
}
