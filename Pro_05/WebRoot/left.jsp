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
    
    <title>My JSP 'left.jsp' starting page</title>
    
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
    <s:a action="LoginAction_toLoginPage" namespace="/" >督导评估工作情况</s:a><br/>
		<s:a action="SurveyAction_newSurvey" namespace="/">办学条件12</s:a><br/>
		<s:a action="SurveyAction_mySurveys" namespace="/">师资队伍12</s:a><br/>
		<s:a action="EngageSurveyAction_findAllAvailableSurveys" namespace="/">教育经费12</s:a><br/>
		<s:a action="RegAction_toRegPage" namespace="/">布局调整12</s:a><br/>
		<s:a action="UserAuthorizeAction_findAllUsers" namespace="/">特殊人群12</s:a><br/>
		<s:a action="RoleAction_findAllRoles" namespace="/">工程项目情况12</s:a><br/>
		
		
		<s:if test="#session['user'].manage == true">
			管理员<br/>
			<s:url  namespace="/" action="ManageAction_userListPage" var="userListUrl"/>
			<a  href="<s:property value="#userListUrl" />" target="right">管理用户</a> <br/>
			
			<s:a action="RightAction_findAllRights" namespace="/">表格截止日期设置</s:a><br/>
			<s:a action="LogAction_findNearestLogs" namespace="/">各区县表格填写情况</s:a><br/>
			<s:a action="LogAction_findNearestLogs" namespace="/">通知更改</s:a><br/>
			<s:a action="LogAction_findNearestLogs" namespace="/">种表导出</s:a><br/>
			<s:a action="LogAction_findNearestLogs" namespace="/">设置初始工程项目</s:a><br/>
		</s:if>
		<s:url  namespace="/" action="ManageAction_editPassword" var="userListUrl">
			<s:param name="uid" value="#session['user'].id"/>
		</s:url>
		<a  href="<s:property value="#userListUrl" />" target="right">密码修改</a> <br/>
  </body>
</html>
