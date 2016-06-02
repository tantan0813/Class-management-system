<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>"/>
    <title>征友界面</title>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
	<meta http-equiv="description" content="This is my page"/>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
#textfield {
	font-size: x-large;
}
</style>
</head>
<%String nickname = request.getSession().getAttribute("nickname").toString(); %>

<body  background="1600X900.jpg">
<p>&nbsp;</p>
<div align="center">
  <p id="textfield"><strong>征友界面</strong></p>
</div><form id="form1" name="form1" method="post" action="PostIntentServlet">
<table width="500" border="0" align="center">
<tr>
    <td width="147" align="right">昵称</td>
    <td width="337">
    	<input type="hidden" name="nickname"  value=<%=nickname %> />
      <label><%=nickname %></label>
    </td>
  </tr>
  <tr>
    <td width="147" align="right">标题</td>
    <td width="337">
      <input type="text" name="title" id="title" />
    </td>
  </tr>
  <tr>
    <td align="right">内容</td>
    <td>
      <textarea name="content" id="content" cols="45" rows="5"></textarea>
    </td>
  </tr>
  <tr>
    <td colspan="2" align="center">
      <input type="submit" name="button2" id="button2" value="提交" />
      <input type="reset" name="button" id="button" value="重置" />
    </td>
  </tr>
</table></form>
</body>
</html>
