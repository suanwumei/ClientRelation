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
    
    <title>My JSP 'executeDevelop.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
    <a href="developSuccess?salesChanceId=${ requestScope.salesChance.salesChanceId}">开发成功</a>
    <br>
    <a href="developFailed?salesChanceId=${ requestScope.salesChance.salesChanceId}">终止开发</a>
    <table  border="1">
		<tr>
			<td>编号:</td>
			<td>${requestScope.salesChance.salesChanceId}</td> 
			<td>客户名称:</td>
			<td>${requestScope.salesChance.clientName}</td>
		</tr>
		<tr>
			<td>概要</td>
			<td>${requestScope.salesChance.salesChanceOutline}</td>
			<td>联系人</td>
			<td>${requestScope.salesChance.contactName}</td>
		</tr>
		<tr>
			<td>联系人电话</td>
			<td>${requestScope.salesChance.contactTel}</td>
			<td>创建时间</td>
			<td>${requestScope.salesChance.createTime}</td>
		</tr>
		<tr>
	</table>
	<br>
	<br>
	<table >
		<tr>
		<td>日期</td><td>计划项</td><td>执行结果</td>
		</tr>
	</table>
	<br>
	<br>
	<c:forEach items="${requestScope.developList}" var="s">
	<form action="saveDevelopResult">
	<table>
		<tr>
		<td><input name="developTime" value="${s.developTime}"></td>
		<td>
			<input name="developPlan" value="${s.developPlan}">
			<input name="developId" value="${s.developId}" type="hidden">
			<input name="salesChanceId" value="${requestScope.salesChance.salesChanceId}" type="hidden">
		</td>
		<td>
			<input name="executeResult${s.developId}" value="${s.executeResult}">
		</td>
		<td>
			<c:choose>
				<c:when test="${s.executeResult==null}">
					<input type="submit" value="保存">
				</c:when>
			</c:choose>
		</td>
		</tr>
	</table>
	</form>
	</c:forEach>
		
  </body>
</html>
