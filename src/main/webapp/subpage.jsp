<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="t_mobiles" style="display:none;position:relative;left:60px;top:0px;width:200px;height:200px;background-color:white;border-style:double;border-color:slategray;">
		<div style="float:right;">
		<input type="button" id="bt_close" value="关闭" />
		</div>
		<div style="clear: both">
		<table id="table" style="text-align:center">
			<c:forEach items="${pageinfo.list}" var="c">
				<tr><td><input type="radio" id="mobilesnumber" name="mobilesnumber" value="${c.mobilenumber}"><span>${c.mobilenumber}</span></td></tr>
			</c:forEach>
			<tr><td><a href="page.do?currentPage=${pageinfo.currentPage+1}" >换一批</a></td></tr>
		</table>	
		</div>
  	 </div>
</body>
</html>