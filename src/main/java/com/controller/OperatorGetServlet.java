package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MobileDao;
import com.dao.MobileDaoImpl;
import com.dao.OperatorDao;
import com.dao.OperatorDaoImpl;
import com.vo.Operator;

/**
 * Servlet implementation class OperatorGetServlet
 */
@WebServlet("/getoperator.do")
public class OperatorGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OperatorGetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain;charset=UTF-8");
		String operator_id=request.getParameter("operator_id");
		
		OperatorDao dao=new OperatorDaoImpl();
		Operator o=dao.getOne(operator_id);
		
		if(o!=null){
			response.getWriter().append("<font color='red'>��ID�Ѵ���</font>");
		}else{
			response.getWriter().append("");
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
