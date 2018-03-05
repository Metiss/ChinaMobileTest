package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.oracle.jdbc.util.ServiceFactory;
import com.vo.User;

/**
 * Servlet implementation class UserNewServlet
 */
@WebServlet("/newuser.do")
public class UserNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserNewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mobile_number=request.getParameter("mobile_number");
		String roaming_status=request.getParameter("roaming_status");
		String com_level=request.getParameter("com_level");
		String customer_id=request.getParameter("customer_id");
		User u=new User();
		u.setCom_level(com_level);
		u.setCustomer_id(customer_id);
		u.setMobile_number(mobile_number);
		u.setRoaming_status(roaming_status);
		
		UserDao dao=ServiceFactory.getObject(UserDaoImpl.class);
		dao.save(u);
		response.sendRedirect("saveInfo.htm");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
