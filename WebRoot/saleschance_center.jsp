<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags"%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>center</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
	<a href='salesChanceToCreate'>新建销售机会</a>	
	<table>
		<tr>
			<td>编号</td>
			<td>客户名称</td>
			<td>概要</td>
			<td>联系人</td>
			<td>联系人电话</td>
			<td>创建时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.salesChanceNoAppList}" var="s">
		<tr>
			<td>${s.salesChanceId}</td> 
			<td>${s.clientName}</td>
			<td>${s.salesChanceOutline}</td>
			<td>${s.contactName}</td>
			<td>${s.contactTel}</td>
			<td>${s.createTime}</td>			
			<td>
			<a href='salesChanceToModify?salesChanceId=${s.salesChanceId}'>修改</a></td>
		</tr>
		</c:forEach>
	
	</table>
  </body>
</html>
