package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.dao.CustomerDaoImpl;
import com.vo.Customer;

/**
 * Servlet implementation class CustomerNewServlet
 */
@WebServlet("/newcustomer.do")
public class CustomerNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerNewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		String id_type=request.getParameter("id_type");
		String id_number=request.getParameter("id_number");
		
		Customer c=new Customer();
		CustomerDao dao=new CustomerDaoImpl();
		c.setCustomer_id(0);
		c.setId_type(id_type);
		c.setId_number(id_number);
		c.setCustomer_address("请输入您的常用地址");
		c.setCustomer_birthday("请输入您的生日：格式[1998/5/6]");
		c.setCustomer_name("请输入您的姓名");
		Customer cm=dao.getSpecial(id_type, id_number);
		if(cm!=null){
			System.out.println(cm.getCustomer_birthday());
			/*c.setCustomer_id(cm.getCustomer_id());
			c.setCustomer_name(cm.getCustomer_name());
			c.setCustomer_birthday(cm.getCustomer_birthday());
			c.setCustomer_sex(cm.getCustomer_sex());
			c.setCustomer_address(cm.getCustomer_address());*/
			request.setAttribute("customer", cm);
		}else{
			System.out.println(c.getCustomer_id());
			request.setAttribute("customer", c);
		}
		request.getRequestDispatcher("newcustomer1.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
