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
  <script language="javascript">

	function check(){
	var name1 = document.getElementById("userName").value;
	var name2 = document.getElementById("password").value;
	var name3 = document.getElementById("authority").value;
		
	if(name1==""||name2==""||name3=="")
	{
		alert("请将信息填写完整");
		return;
	}
	
	document.forms[0].submit();
	
	}

  </script>
  <body>
  	<form action="userLogin">
  	 <table>
  	 	<tr>
  	 		<td>
  	 		<label>用户名</label>
  	 		</td>
  	 		<td>
  	 		<input name="username" id="userName"/>
  	 		</td>
		</tr>	
		<tr>
  	 		<td>
  	 		<label>密码</label>
  	 		</td>
  	 		<td>
  	 		<input name="password" id="password"/>
  	 		</td>
		</tr>
		<tr>
  	 		<td>
  	 		<label>身份</label>
  	 		</td>
  	 		<td>
  	 		<select name="authority">  
  	 		<option value="1">系统管理员</option>  
  	 		<option value="2">高管</option>  
  	 		<option value="3">销售主管</option>  
  	 		<option value="4">客户经理</option>  
  	 			
  	 		</select> 		
  	 		</td>
		</tr>
		<tr>
			<td></td>
			<td>
			<button onclick="check()">登陆</button>
			</td>			
		</tr>
	 </table>
	</form>
  </body>
</html>
