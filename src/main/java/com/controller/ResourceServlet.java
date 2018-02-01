package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MobileDao;
import com.dao.MobileDaoImpl;
import com.vo.Mobile;

/**
 * Servlet implementation class ResourceServlet
 */
@WebServlet("/resource.do")
public class ResourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResourceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mobilenumberbegin=request.getParameter("mobilenumberbegin");
		String mobilenumberend=request.getParameter("mobilenumberend");
		Long mobilebegin=Long.valueOf(mobilenumberbegin);
		Long mobileend=Long.valueOf(mobilenumberend);
		int length=(int)(mobileend-mobilebegin);
		
		String mobiletype=request.getParameter("mobiletype");
		//Integer[] numbers=new Integer[mobileend-mobilebegin];
		Mobile[] mobiles=new Mobile[length+1];
		for(int i=0;mobilebegin<=mobileend;i++){
			String mobilenumber=String.valueOf(mobilebegin);
			mobiles[i]=new Mobile();
			mobiles[i].setMobilenumber(mobilenumber);
			mobiles[i].setMobiletype(mobiletype);
			mobiles[i].setCardnumber("0123456789");
			mobilebegin++;
		}
		
		MobileDao dao=new MobileDaoImpl();
		dao.save(mobiles);
		request.getRequestDispatcher("resource.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
