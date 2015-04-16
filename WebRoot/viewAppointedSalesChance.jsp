<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'viewAppointedSalesChance.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <table  border="1">
     <tr>
    	<td> 编号</td>
    	<td>客户姓名</td>
    	<td>操作</td>
     </tr>
     <c:forEach items="${requestScope.salesChanceList}" var="s">
		<tr>
			<td>${s.salesChanceId}</td> 
			<td>${s.clientName}</td>
			<td><a href="viewSalesChanceForDevelop?salesChanceId=${s.salesChanceId}">开发</a></td>
			
		</tr>
	</c:forEach>
     </table>
  </body>
</html>
