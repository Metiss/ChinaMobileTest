<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<META content="MSHTML 6.00.2600.0" name=GENERATOR>
<link href="style.css" rel="stylesheet" type="text/css">
<script src="js/jquery-1.9.1.min.js"></script>

<script language="JavaScript" type="text/javascript">
	/* function check()
	{
		document.getElementById("aa").style.display="";
	} */
	
	$(function(){
		 $("#mobile_number").click(function(){
			$("#t_mobiles").fadeIn();
		})

		 $("#bt_close").click(function(){
			$("#t_mobiles").fadeOut();
		})
		 
		 /* $.getJSON("page.do",{},function(data){
			 var table=$("#table");
			 var tr=null;
			 for(var i=0;i<data.length;i++){
				if(i%3==0){
					tr=$("<tr>");
					table.append(tr);
				}
				var td=$("<td></td>");
				tr.append(td);
				var ck_mobile=$("<input type='radio' id='mobilesnumber' name='mobilesnumber'>").val(data[i].mobilenumber);
				td.append(ck_mobile);
				 
				var span=$("<span></span>").html(data[i].mobilenumber);
				td.append(span);
		}
		}) */
		$("#mobilesnumber").click(function(){
			$("#mobile_number").val("0");
			$("#mobile_number").val($(this).next().html());
		})
	})

</script>
<title>中国移动业务管理系统</title>
</head>
<BODY bgColor=#ffffff leftMargin=0 topMargin=0 marginheight="0" marginwidth="0">
<CENTER>
<TABLE cellSpacing=0 cellPadding=0 width=749 border=0>
  <TBODY>
  <TR>
    <TD width=173><A href="http://www.chinamobile.com/index.asp"><IMG 
      height=74 src="images/logo.gif" width=173 border=0></A></TD>
    <TD vAlign=top align=right>
      <TABLE width="100%" border=0 cellPadding=0 cellSpacing=0>
        <TBODY>
        <TR bgColor=#2650a6>
          <TD height="12"><img src="images/spacer.gif" width="1" height="1"></TD>
          <TD height="12"><img src="images/spacer.gif" width="1" height="1"></TD>
          <TD height="12"><img src="images/spacer.gif" width="1" height="1"></TD>
          <TD height="12"><img src="images/spacer.gif" width="1" height="1"></TD>
          <TD height="12"><img src="images/spacer.gif" width="1" height="1"></TD>
        </TR>
        <TR bgColor=#FFFFFF>
          <TD><img src="images/spacer.gif" width="1" height="1"></TD>
          <TD><img src="images/spacer.gif" width="1" height="1"></TD>
          <TD><img src="images/spacer.gif" width="1" height="1"></TD>
          <TD><img src="images/spacer.gif" width="1" height="1"></TD>
          <TD><img src="images/spacer.gif" width="1" height="1"></TD>
        </TR>
        <TR>
          <TD><img src="images/pic01.gif" width="115" height="55"></TD>
          <TD><img src="images/pic04.gif" width="115" height="55"></TD>
          <TD><img src="images/pic03.gif" width="115" height="55"></TD>
          <TD><img src="images/pic02.gif" width="115" height="55"></TD>
          <TD><img src="images/pic05.gif" width="115" height="55"></TD>
        </TR></TBODY></TABLE></TD></TR>
  <TR>
    <TD height="12" colSpan=2 align=right bgColor=#d4dced>
     

      <img src="images/spacer.gif" width="1" height="1">
      <TABLE cellSpacing=0 cellPadding=0 border=0>
        <TBODY>
        <TR>
          </TR></TBODY></TABLE>
 
    </TD></TR>
  <TR>
  <TD colSpan=2><IMG height=2 src="images\blank(1).gif" width=1></TD></TR></TBODY></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width=749 border=0>
  <TBODY>
  <TR vAlign=top>
    <TD width=173 bgColor=#c9d3e9 rowSpan=2>
      <TABLE cellSpacing=0 cellPadding=0 width=173 border=0>
        <TBODY>
        <!--TR>
          <TD width=11 height="29" bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav 
            href="newOperator.htm">新增操作员</A></TD>
        </TR>
        <TR>
          <TD bgColor=#ffffff colSpan=2><IMG height=1 
            src="images/blank.gif" width=1 border=0></TD></TR>
        <TR>
          <TD width=11 bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav 
            href="modifyOperator.htm">修改操作员</A></TD>
        </TR-->
        <TR>
          <TD bgColor=#ffffff colSpan=2><IMG height=1 
            src="images/blank.gif" width=1 border=0></TD>
        </TR>
        <TR>
        
        </TR>
        <TR>
          <TD bgColor=#ffffff colSpan=2><IMG height=1 
            src="中国移动通信.files/blank.gif" width=1 border=0></TD></TR>
        <TR>
          <TD width=11 bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav href="resource.htm">资源管理</A></TD>
        </TR>
        <TR>
          <TD bgColor=#ffffff colSpan=2><IMG height=1 
            src="images/blank.gif" width=1 border=0></TD></TR>
        <TR>
          <TD width=11 bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav 
            href="charge.htm">配置业务费用</A></TD>
        </TR>
        <TR>
          <TD bgColor=#ffffff colSpan=2><IMG height=1 
            src="images/blank.gif" width=1 border=0></TD></TR>
        <TR>
          <!--TD width=11 bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav 
            href="#"></A></TD-->
        </TR>
        <TR>
          <TD bgColor=#ffffff colSpan=2><IMG height=1 
            src="images/blank.gif" width=1 border=0></TD></TR>
        <TR>
          <TD width=11 bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav 
            href="newCustomer.htm">开户</A></TD>
        </TR>
        <TR>
          <TD bgColor=#ffffff colSpan=2><IMG height=1 
            src="images/blank.gif" width=1 border=0></TD></TR>
        <!--TR>
          <TD width=11 bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav 
            href="newUser.htm">录入用户信息</A></TD>
        </TR>
        <TR>
          <TD bgColor=#ffffff colSpan=2><IMG height=1 
            src="images/blank.gif" width=1 border=0></TD></TR>
        <TR>
          <TD width=11 bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav 
            href="newAccount.htm">录入账户信息</A></TD>
        </TR-->
        
        <TR>
          <TD bgColor=#ffffff colSpan=2><IMG height=1 
            src="images/blank.gif" width=1 border=0></TD>
        </TR>
        <TR>
        
        </TR>
        <TR>
          <TD bgColor=#ffffff colSpan=2><IMG height=1 
            src="images/blank.gif" width=1 border=0></TD></TR>
        <TR>
          <TD width=11 bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav 
            href="logout.do">退出</A></TD>
        </TR>
        <TR>
          <TD bgColor=#ffffff colSpan=2><IMG height=1 
            src="images/blank.gif" width=1 border=0></TD></TR>

        <TR align=middle>
          <TD colSpan=2 height=160>&nbsp;</TD></TR>
        <TR>
          <TD colSpan=2><IMG height=1 src="images/blank.gif" 
        width=1></TD></TR></TBODY></TABLE></TD>
    <TD width=2 rowSpan=3><IMG height=1 src="images\blank(1).gif" width=2></TD>
    <TD width="2">
      <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>
        <TR>
          <TD height=25>&nbsp;您现在的位置：新增用户</TD>
        </TR>
        <TR>
          <TD bgColor=#2650a6><IMG height=1 src="images\blank(1).gif" 
            width=1></TD></TR>
        <TR>
          <TD><IMG height=2 src="images\blank(1).gif" width=574></TD></TR></TBODY></TABLE></TD></TR>
  <TR vAlign=top>
    <TD height="600" bgColor=#f1f3f9>
    
     <form method="POST" action="newuser.do">
     
      <div>
      <p>手机号码：<input type="text" name="mobile_number" id="mobile_number" size="20"> </p>
      	<div id="t_mobiles" style="position:relative;left:80px;top:-15px;width:200px;height:200px;background-color:white;border-style:double;border-color:slategray;">
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
     </div>
      <p>漫游状态：<input type="radio" name="roaming_status" value="P" checked>省内漫游 <input type="radio" name="roaming_status" value="D">国内漫游 
      <input type="radio" name="roaming_status" value="I">国际漫游</p>
      <p>通话级别：<input type="radio" value="L" checked name="com_level">本地通话 
      <input type="radio" name="com_level" value="D">国内长途 <input type="radio" name="com_level" value="I">国际长途</p>
      <p>客户ID：<input type="text" name="customer_id" size="20" value="${customer.customer_id}" readonly></p>
      
      <p><input type="submit" value="完成>>" name="B1"><input type="reset" value="全部重写" name="B2"></p>
    </form>

    
    </TD>
    </TR>
  </TBODY></TABLE>
<BR></CENTER></BODY>
</html>