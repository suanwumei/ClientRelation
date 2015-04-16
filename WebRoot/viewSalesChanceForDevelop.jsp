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
    
    <title>My JSP 'develop.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">


  </head>
  
  <body>
  <a href="executeDevelop?salesChanceId=${requestScope.salesChance.salesChanceId}">执行计划</a>
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
		<td>日期</td><td>计划项</td><td>操作</td>
		</tr>
	</table>
	<c:forEach items="${requestScope.developList}" var="s">
	<form action="updateDevelop">
	<table>
		<tr>
		<td><input name="developTimeUpdate${s.developId}" value="${s.developTime}"></td>
		<td>
			<input name="developPlanUpdate${s.developId}" value="${s.developPlan}">
			<input name="developId" value="${s.developId}" type="hidden">
			<input name="salesChanceId" value="${requestScope.salesChance.salesChanceId}" type="hidden">
		</td>
		<td><input type="submit" value="更新"></td>
		<td><a href="deleteDevelop?developId=${s.developId}&salesChanceId=${requestScope.salesChance.salesChanceId}">删除</a></td>
		</tr>
	</table>
	</form>
	</c:forEach>
		
	<br>
	<br>

	
	<form action="saveDevelop">
		<table>
		<tr>
			<td>时间</td>
			<td>计划内容</td>
			<td>操作</td>
			
		</tr>
		<tr>
			<td><input name="developTime" ></td>
			<td><input name="developPlan">
			<input name="salesChanceId" value="${requestScope.salesChance.salesChanceId}" type="hidden"></td>
			<td><button type="submit">保存</button></td>		
		</tr>
		</table>
	</form>
	
  </body>
</html>
