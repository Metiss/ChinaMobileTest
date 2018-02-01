package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ChargeDao;
import com.dao.ChargeDaoImpl;
import com.dao.ChargeRuleDao;
import com.dao.ChargeRuleDaoImpl;
import com.vo.Charge;
import com.vo.ChargeRule;

/**
 * Servlet implementation class ChargeServlet
 */
@WebServlet("/charge.do")
public class ChargeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChargeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ChargeDao dao=new ChargeDaoImpl();
		List<Charge> list=dao.getAll();
		System.out.println(list.get(0).getChargename());
		request.setAttribute("list", list);
		
		ChargeRuleDao daor=new ChargeRuleDaoImpl();
		List<ChargeRule> listr=daor.getAll();
		request.setAttribute("listr", listr);
		
		request.getRequestDispatcher("charge.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
