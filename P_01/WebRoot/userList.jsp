<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userList.jsp' starting page</title>
    
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
  	 <s:if test="userList.isEmpty()">当前目前用户</s:if>
  	 <table width="600" style="border: 1px solid blue;">
  	 	<tr><td>id</td><td>登录名</td><td>状态</td><td>打开/关闭</td><td>修改密码</td></tr>
	 	
	 	 <s:else>
				<s:iterator value="userList" id="ut">
			  	 	<tr>
			  	 		<td><s:property value="#ut.id" /></td>
			  	 		<td><s:property value="#ut.name" /></td>
			  	 		<td>
			  	 			<s:if test="opened == false">关闭</s:if>
							<s:else>开放</s:else>
			  	 		</td>
			  	 		<td>
							<s:url  namespace="/" action="ManageAction_toggleStatus" var="userListUrl">
								<s:param name="uid" value="#ut.id"/>
							</s:url>
							<a  href="<s:property value="#userListUrl" />" target="right">打开/关闭</a>
						</td>
			  	 		<td>
							<s:url  namespace="/" action="ManageAction_editPassword" var="userListUrl">
								<s:param name="uid" value="#ut.id"/>
							</s:url>
							<a  href="<s:property value="#userListUrl" />" target="right">修改密码</a>
			  	 		</td>
			  	 	</tr>
				</s:iterator>
		</s:else>
		
	</table>
  </body>
</html>
