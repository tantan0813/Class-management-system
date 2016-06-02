<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>"/>
    <title>JavaEE注册页面</title>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
	<meta http-equiv="description" content="This is my page"/>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>


<body background="1600X900.jpg" >
<p>&nbsp;</p>
<div align="center"><strong>欢迎注册！</strong>
</div>
<form id="form1" name="form1" method="post" action="RegisterServlet">
<table width="389" border="0" align="center">
  <tr>
    <td width="80" align="right">用户名：</td>
    <td width="289">
      <input type="text" name="username"  />
    </td>
  </tr>
  <tr>
    <td align="right">密 码：</td>
    <td>
      <input type="text" name="password"  />
</td>
  </tr>
  <tr>
    <td align="right">昵 称：</td>
    <td>
      <input type="text" name="nickname"  />
</td>
  </tr>
  <tr>
    <td align="right">性 别：</td>
    <td>

      <input type="text" name="gender" />
</td>
  </tr>
  <tr>
    <td align="right">邮箱：</td>
    <td>

      <input type="text" name="email"  />
   </td>
  </tr>
  <tr>
    <td align="right">地址：</td>
    <td>
      <input type="text" name="address"  />
  </td>
  </tr>
  <tr>
    <td align="right">职 业：</td>
    <td>
      <input type="text" name="profession"  />
  </td>
  </tr>
  <tr>
    <td align="right">生日：</td>
    <td>
      <input type="text" name="birthday"  />
   </td>
  </tr>
  <tr>
    <td align="right">联系电话：</td>
    <td>
      <input type="text" name="phone"  />
 </td>
  </tr>
  <tr> 
  <td align="center" colspan="2">
      <input type="submit"   value="注册" />
      <input type="reset"  value="重置" />
      </td>
  </tr>
</table>
</form>

</body>
</html>
