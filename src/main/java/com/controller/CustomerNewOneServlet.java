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
 * Servlet implementation class CustomerNewOneServlet
 */
@WebServlet("/newcustomer1.do")
public class CustomerNewOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerNewOneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer customer_id=Integer.valueOf(request.getParameter("customer_id"));
		String customer_name=request.getParameter("customer.customer_name");
		String customer_sex=request.getParameter("customer_sex");
		String customer_birthday=request.getParameter("customer_birthday");
		String customer_address=request.getParameter("customer_address");
		String id_type=request.getParameter("id_type");
		String id_number=request.getParameter("id_number");
		Customer c=new Customer();
		c.setCustomer_id(customer_id);
		c.setCustomer_name(customer_name);
		c.setCustomer_sex(customer_sex);
		c.setCustomer_birthday(customer_birthday);
		c.setCustomer_address(customer_address);
		c.setId_number(id_number);
		c.setId_type(id_type);
		System.out.println("获取到的customer对象"+c);
		CustomerDao dao=new CustomerDaoImpl();
		if(c.getCustomer_id()==0){
			c.setCustomer_name(customer_name);
			c.setCustomer_sex(customer_sex);
			c.setCustomer_birthday(customer_birthday);
			c.setCustomer_address(customer_address);
			dao.save(c);
		}
		request.setAttribute("customer", c);
		request.getRequestDispatcher("newuser.jsp").forward(request, response);
		//List<Customer> list=dao.getSpecial(c.getId_type(), c.getId_number());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
