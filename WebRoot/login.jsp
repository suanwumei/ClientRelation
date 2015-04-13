<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>login</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
  	<form action="login">
  	 <table>
  	 	<tr>
  	 		<td>
  	 		<label>用户名</label>
  	 		</td>
  	 		<td>
  	 		<input name="username"/>
  	 		</td>
		</tr>	
		<tr>
  	 		<td>
  	 		<label>密码</label>
  	 		</td>
  	 		<td>
  	 		<input name="password"/>
  	 		</td>
		</tr>
		<tr>
  	 		<td>
  	 		<label>身份</label>
  	 		</td>
  	 		<td>
  	 		<input name="authority"/>  	 		
  	 		</td>
		</tr>
		<tr>
			<td></td>
			<td>
			<button type="submit">登陆</button>
			</td>			
		</tr>
	 </table>
	</form>
  </body>
</html>
