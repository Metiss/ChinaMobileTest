package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.dao.MobileDao;
import com.dao.MobileDaoImpl;

import com.vo.Mobile;


/**
 * Servlet implementation class MobileGetServlet
 */
@WebServlet("/getmobile.do")
public class MobileGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MobileGetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MobileDao dao=new MobileDaoImpl();
		
		List<Mobile> mobiles=dao.getAll();
		System.out.println("获取到的mobile"+mobiles.get(0).getMobilenumber());
		
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writeValueAsString(mobiles);
		response.setContentType("text/plain;charset=UTF-8");
		response.getWriter().append(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
