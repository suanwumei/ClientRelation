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
    
    <title>new sales chance</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="create new sales chance">

  </head>
  
  <body>
    <form action="salseChanceCreate">
    <table>
    <tr>
    	<td>
    	<label style="color:gray">编号</label>
    	</td>
    	<td>
    	<input name="salesChanceId" readonly/>
    	</td>
    	<td>
    	<label>机会来源</label>
    	</td>
    	<td>
    	<input name="salesChanceSource"/>
    	</td>
    </tr>
    <tr>
    	<td>
    	<label>客户名称</label>
    	</td>
    	<td>
    	<input name="clientName"/><label style="color:red">*</label>
    	</td>
    	<td>
    	<label>成功几率</label>
    	</td>
    	<td>
    	<input name="salesChanceSuccessRate"/><label style="color:red">*</label>
    	</td>
    </tr>
    <tr>
    	<td>
    	<label>概要</label>
    	</td>
    	<td>
    	<input name="salesChanceOutline"/><label style="color:red">*</label>
    	</td>
    	<td/><td/>
    </tr>
    <tr>
    	<td>
    	<label>联系人</label>
    	</td>
    	<td>
    	<input name="contactName"/>
    	</td>
    	<td>
    	<label>联系电话</label>
    	</td>
    	<td>
    	<input name="contactTel"/>
    	</td>
    </tr>
    <tr>
    	<td>
    	<label>机会描述</label>
    	</td>
    	<td>
    	<input name="salesChanceDescribe"/>
    	</td>
    	<td/><td/>
    </tr>
    <tr>
    	<td>
    	<label>创建人</label>
    	</td>
    	<td>
    	<input name="createName" value="${sessionScope.username}" readonly/><label style="color:red">*</label>
    	</td>
    	<td>
    	<label>创建时间</label>
    	</td>
    	<td>
    	<input name="createTime" value="${requestScope.createTime}" readonly/><label style="color:red">*</label>
    	</td>
    </tr>
    <tr>
    	<td>
    	<label style="color:gray">指派给</label>
    	</td>
    	<td>
    	<input name="salesChanceAppointName" readonly/><label style="color:red">*</label>
    	</td>
    	<td>
    	<label style="color:gray">指派时间</label>
    	</td>
    	<td>
    	<input name="appointTime" readonly/><label style="color:red">*</label>
    	</td>
    </tr>
    <tr>
    	<td>
    	<button type="submit">保存</button>
		</td>
    	<td/><td/><td/><td/>
    </tr>
    </table>
    </form>
  </body>
</html>
