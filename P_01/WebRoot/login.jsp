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
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	window.onload=function(){
		    var verifyObj = document.getElementById("Verify");
		     verifyObj.onclick=function(){
		         this.src="SecurityCodeImageAction?timestamp="+new Date().getTime();
		     };
		 }
	</script>
  </head>
  
  <body>
			<h2>用户登陆</h2>
   		<s:form action="LoginAction_doLogin" namespace="/" method="post">
			<b>用户名:</b><input type="text" name="name"  value="xingye">
			密&nbsp;码:<input type="password" name="password"  value="123"/>
			<br><s:actionerror></s:actionerror><br>
			<input type="text" name="securityCode"/>
			
			<img src="SecurityCodeImageAction" id="Verify"   alt="看不清，换一张"/>
			<s:fielderror><s:param>checkCode</s:param></s:fielderror>
			<s:submit type="submit"  value="登录" />
		</s:form>
  </body>
</html>
