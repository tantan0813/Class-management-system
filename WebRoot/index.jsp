<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>"/>
    <title>JavaEE登录页面</title>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
	<meta http-equiv="description" content="This is my page"/>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
function check(){
	if(form1.username.value ==""){
		alert("用户名不能为空请重新输入！");
		form1.username.focus();
		return;
	}
	if(form1.password.value ==""){
		alert("密码不能为空请重新输入！");
		form1.password.focus();
		return;
	}
	else form1.submit();
}
</script>
</head>

<body   background="1600X900.jpg">

<div align="center">
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <form id="form1" name="form1" method="post" action="LoginServlet">
  <table width="328" border="0" >
    <tr>
      <td width="98" height="37"><div align="right">用户名：</div></td>
      <td width="214">
        <input type="text"  name="username" />
      </td>
    </tr>
    <tr>
      <td height="59"><div align="right">密    码：</div></td>
      <td>
        <input type="password" name="password"  />
      </td>
    </tr>
    <tr>
      <td height="68">&nbsp;</td>
      <td>
        <input type="submit" name="button" id="button" onclick="check()" value="登录" />
        <a type="button"  href="register.jsp">注册</a>
      </td>
    </tr>
  </table>
  </form>
</div>
</body>
</html>
