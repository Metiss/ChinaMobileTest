package com.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vo.Operator;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter({ "*.do", "*.jsp", "*.html", "*.htm", "*.HTM" })
public class LoginFilter implements Filter {
	List<String> list=new ArrayList();
    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		
		Operator o=(Operator)req.getSession().getAttribute("operator");
		
		//对获取到的uri进行路径上获取的修改
		String uri=req.getRequestURI();
		String path=req.getContextPath();
		uri=uri.replaceAll(path, "");
		
		if(o!=null){
			chain.doFilter(request, response);
		}else if(list.contains(uri)){
			chain.doFilter(request, response);
		}else{
	//		res.sendRedirect(path+"/login.html");
			
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=res.getWriter();
			out.println("<script>window.top.location.href='"+path+"/index.jsp'"+"</script>");
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		list.add("/login.do");
		list.add("/index.jsp");
	}

}
