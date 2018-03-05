package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.OperatorDao;
import com.dao.OperatorDaoImpl;
import com.vo.Operator;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String operator_id=request.getParameter("operator_id");
		String operator_pwd=request.getParameter("operator_pwd");
		
		OperatorDao dao=new OperatorDaoImpl();
		Operator o=dao.getSpecial(operator_id,operator_pwd);
		
		if(o!=null){
			request.getSession().setAttribute("operator", o);
			if(o.getIs_admin()==1){
				response.sendRedirect("Adimin.HTM");
			}else{
				response.sendRedirect("MAIN.HTM");
			}	
		}else{
			response.sendRedirect("index.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
