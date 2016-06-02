package com.tan.util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sqlcon.SQLUtil;

import com.tan.bean.User;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setHeader("Content-Type","text/html;charset=utf-8"); 
		User user = new User(request.getParameter("username"),
				request.getParameter("password"), null, null, null, null, null,
				null, null);
		SQLUtil sqlutil = new SQLUtil();
		if (sqlutil.verifyuser(user)){
			resp.getWriter().write("<script language='javascript'>alert('验证成功');</script>");
			String nickname = sqlutil.getnickname(user);
			request.getSession().setAttribute("nickname",nickname);
			resp.sendRedirect("push.jsp");
		}else{
			resp.getWriter().write("<script language='javascript'>alert('用户名或密码错误');</script>");
			resp.sendRedirect("register.jsp");
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		doGet(req, resp);
	}
}
