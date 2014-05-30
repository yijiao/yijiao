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
    
    <title>Login</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="cs_login.css" type="text/css" rel="stylesheet">
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
		
		<table   class="tab">
   		<s:form action="LoginAction_doLogin" namespace="/" method="post">
   		<tr>
   		 <td scope="col" colspan="2" class="name" id="name"><h2>重庆市义务教育均衡发展工作进展管理系统</h2></td></tr>
   		
			<tr><td scope="col" colspan="2" id="first">用户名<input type="text" name="name"  value="xingye" id="input1"></td></tr>
			<tr><td scope="col" colspan="2" id="secd">密&nbsp;&nbsp;码<input type="password" name="password"  value="123" id="input2" "/></td></tr>
			<br><s:actionerror></s:actionerror><br>
			<tr><td scope="col" style="width: 218px; " colspan="2" id="third">验证码<input type="text" name="securityCode"/>
			
			<img src="SecurityCodeImageAction" id="Verify"   alt="看不清，换一张"/ id="img"></td></tr>
			<s:fielderror><s:param>checkCode</s:param></s:fielderror>
			<tr><td scope="col" colspan="2"><s:submit type="submit"  value="登录" id="login" /></td></tr>
			<tr><td scope="col" colspan="2" id="last">&nbsp;</td></tr>
		</s:form>
		</table>
	
		
   		 
  </body>
</html>
