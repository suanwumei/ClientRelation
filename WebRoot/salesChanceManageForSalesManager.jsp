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
	<table  border="1">
		<tr>
			<td>编号</td>
			<td>客户名称</td>
			<td>概要</td>
			<td>联系人</td>
			<td>联系人电话</td>
			<td>创建时间</td>
			<td>状态</td>
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
				<c:choose>
				<c:when test="${s.assignOrNot=='0'}">
					未指派
				</c:when>
				<c:when test="${s.assignOrNot=='1'}">
 					开发中
				</c:when>
				</c:choose>
			</td>			
			<td>
				<a href='modifySalesChance?salesChanceId=${s.salesChanceId}'>修改</a>
			<c:choose>
				<c:when test="${s.salesManagerCreater.salesManagerId==sessionScope.user.salesManagerId}">
					<a href="javascript:void(0);" onclick="if(window.confirm('确定删除该销售机会吗？'))
					this.href='deleteSalesChance?salesChanceId=${s.salesChanceId}'">删除</a>
				</c:when>
			</c:choose>
			<a href='appointSalesChance?salesChanceId=${s.salesChanceId}'>指派</a>
			</td>
		</tr>
		</c:forEach>
	
	</table>
  </body>
</html>
