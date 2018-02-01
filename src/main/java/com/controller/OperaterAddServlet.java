package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.OperaterDao;
import com.dao.OperaterDaoImpl;
import com.vo.Operater;

/**
 * Servlet implementation class OperaterAddServlet
 */
@WebServlet("/operateradd.do")
public class OperaterAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OperaterAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println(request.getParameter("operator_id"));
		Integer operator_id=Integer.valueOf(request.getParameter("operator_id"));
		String operator_name=request.getParameter("operator_name");
		String operator_pwd=request.getParameter("operator_pwd");
		String is_admin=request.getParameter("is_admin");
		OperaterDao dao=new OperaterDaoImpl();
		Operater o=new Operater();
		o.setOperator_id(operator_id);
		o.setOperator_name(operator_name);
		o.setOperator_pwd(operator_pwd);
		o.setIs_admin(is_admin);
		dao.save(o);
		response.sendRedirect("newoperator.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
