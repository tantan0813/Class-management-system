<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tan.bean.Intent"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>" />
<title>征友信息列表</title>
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
<meta http-equiv="description" content="This is my page" />
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body background="1600X900.jpg">
	<div align="center">
		<p>&nbsp;</p>
		<p>&nbsp;</p>
		<p>&nbsp;</p>
		<table border="1">
			<tr>
				<td>征友信息</td>
			</tr>
		</table>
		<table width="768" border="1">
			<tr>
				<td width="30">序号</td>
				<td width="83">昵称</td>
				<td width="80">标题</td>
				<td width="120">内容</td>
				<td width="88">发表时间</td>
			</tr>
			<%
				List<Intent> list = (List<Intent>) request.getSession().getAttribute("list");
				for (int i = 0; i < list.size(); i++) {
					Intent intent = list.get(i);	
					String time = intent.getCreatetime();
					String newtime = time.substring(0,time.length()-2);		
			%> 
			<tr>
				<td height="50" align="center" valign="center" scope="col"><%=intent.getId()%></td>
				<td height="50" align="left" valign="center" scope="col"><%=intent.getNickname()%></td>
				<td height="50" align="center" valign="center" scope="col"><%=intent.getTitle()%></td>
				<td height="50" align="center" valign="center" scope="col"><%=intent.getContent()%></td>
				<td height="50" align="center" valign="center" scope="col"><%=newtime %></td>
			</tr>
			<%
				}
			%>

		</table>
		<p>&nbsp;</p>
	</div>
</body>
</html>
