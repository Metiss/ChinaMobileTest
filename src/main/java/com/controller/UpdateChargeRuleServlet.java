package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ChargeDao;
import com.dao.ChargeDaoImpl;
import com.dao.ChargeRuleDao;
import com.dao.ChargeRuleDaoImpl;
import com.oracle.jdbc.util.ServiceFactory;
import com.vo.Charge;

/**
 * Servlet implementation class UpdateChargeRuleServlet
 */
@WebServlet("/updatechargerule.do")
public class UpdateChargeRuleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateChargeRuleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		ChargeRuleDao dao=ServiceFactory.getObject(ChargeRuleDaoImpl.class);
		String func_name=request.getParameter("func_name");
		String[] charges=request.getParameterValues("chargecontent");
		System.out.println(charges[0]);
		dao.edit(func_name, charges);
		response.sendRedirect("charge.do");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
