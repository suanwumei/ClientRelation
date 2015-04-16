<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'clientManager_center.jsp' starting page</title>
    
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
    <h5>此处是客户经理中心</h5><br>
    <h5>当前登陆用户：${sessionScope.user.clientManagerName}，身份：${sessionScope.authority.authorityName}</h5>
    <a href='salesChanceManage'>销售机会管理</a> 
    <a href='createSalesChance.jsp'>新建销售机会</a>
    <a href='viewAppointedSalesChance'>查看已分配任务</a>
  </body>
</html>
