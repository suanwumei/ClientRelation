<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>new sales chance</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="create new sales chance">

  </head>
  <body>
    <form action="commitAppointSalesChance">
    <table>
    <tr>
    	<td>
    	<label>编号</label>
    	</td>
    	<td>
    	<input name="salesChanceId" value="${requestScope.salesChance.salesChanceId}" readonly/>
    	</td>
    	<td>
    	<label>机会来源</label>
    	</td>
    	<td>
    	<input name="salesChanceSource" value="${requestScope.salesChance.salesChanceSource}" readonly/>
    	</td>
    </tr>
    <tr>
    	<td>
    	<label>客户名称</label>
    	</td>
    	<td>
    	<input name="clientName" value="${requestScope.salesChance.clientName}" readonly/><label style="color:red">*</label>
    	</td>
    	<td>
    	<label>成功几率</label>
    	</td>
    	<td>
    	<input name="salesChanceSuccessRate" value="${requestScope.salesChance.salesChanceSuccessRate}" readonly/><label style="color:red">*</label>
    	</td>
    </tr>
    <tr>
    	<td>
    	<label>概要</label>
    	</td>
    	<td>
    	<input name="salesChanceOutline" value="${requestScope.salesChance.salesChanceOutline}" readonly/><label style="color:red">*</label>
    	</td>
    	<td/><td/>
    </tr>
    <tr>
    	<td>
    	<label>联系人</label>
    	</td>
    	<td>
    	<input name="contactName" value="${requestScope.salesChance.contactName}" readonly/>
    	</td>
    	<td>
    	<label>联系电话</label>
    	</td>
    	<td>
    	<input name="contactTel" value="${requestScope.salesChance.contactTel}" readonly/>
    	</td>
    </tr>
    <tr>
    	<td>
    	<label>机会描述</label>
    	</td>
    	<td>
    	<input name="salesChanceDescribe" value="${requestScope.salesChance.salesChanceDescribe}" readonly/>
    	</td>
    	<td/><td/>
    </tr>
    <tr>
    	<td>
    	<label>创建人</label>
    	</td>
    	<td>
    	<input name="createName" value="${requestScope.createName}" readonly/><label style="color:red">*</label>
    	</td>
    	<td>
    	<label>创建时间</label>
    	</td>
    	<td>
    	<input name="createTime" value="${requestScope.salesChance.createTime}" readonly/><label style="color:red">*</label>
    	</td>
    </tr>
    <tr>
    	<td>
    	<label>指派给</label>
    	</td>    	
    	<td>
  		<select name="clientManagerId">  
   		<c:forEach items="${requestScope.clientManagerList}" var="clientManager">  
        	<option value="${clientManager.clientManagerId}">${clientManager.clientManagerName}</option>  
     	</c:forEach>    	
 		</select>  
 		</td>	
    	<td>
    	<label>指派时间</label>
    	</td>
    	<td>
    	<input name="appointTime"  value="${requestScope.appintTime}" readonly/><label style="color:red">*</label>
    	</td>
    </tr>
    <tr>
    	<td>
    	<button type=submit>保存</button>
		</td>
    	<td/><td/><td/><td/>
    </tr>
    </table>
    </form>
  </body>
</html>
