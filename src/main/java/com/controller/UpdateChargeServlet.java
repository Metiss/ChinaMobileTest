package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ChargeDao;
import com.dao.ChargeDaoImpl;
import com.vo.Charge;

/**
 * Servlet implementation class UpdateChargeServlet
 */
@WebServlet("/updatecharge.do")
public class UpdateChargeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateChargeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ChargeDao dao=new ChargeDaoImpl();
		String chargecode=request.getParameter("chargename");
		String charge=request.getParameter("charge");
		Charge c=new Charge();
		c.setChargecode(chargecode);;
		c.setCharge(charge);
		dao.edit(c);
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
