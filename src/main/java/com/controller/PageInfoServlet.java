package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MobileDao;
import com.dao.MobileDaoImpl;
import com.oracle.jdbc.util.ServiceFactory;
import com.util.PageInfo;

/**
 * Servlet implementation class PageInfoServlet
 */
@WebServlet("/page.do")
public class PageInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PageInfo info=new PageInfo(request);
		MobileDao dao=ServiceFactory.getObject(MobileDaoImpl.class);
		dao.getAPageAll(info);
		
		System.out.println("当前页为"+info.getCurrentPage());
		System.out.println("当前页为"+info.getPageCount());
		System.out.println("当前页为"+info.getPagesize());
		System.out.println("当前页为"+info.getRecordcount());
		System.out.println("当前页为"+info.getList());
		
		request.getRequestDispatcher("newuser.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
