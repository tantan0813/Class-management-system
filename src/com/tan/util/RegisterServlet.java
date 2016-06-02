package com.tan.util;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sqlcon.SQLUtil;

import com.tan.bean.User;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setHeader("Content-Type","text/html;charset=utf-8");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String nickname = request.getParameter("nickname");
			String gender = request.getParameter("gender");
			String email = request.getParameter("email");
			String address = request.getParameter("address");
			String profession = request.getParameter("profession");
			String birthday = request.getParameter("birthday");
			String phone = request.getParameter("phone");
			
			User user = new User(username, password,nickname, gender, email, address, profession, birthday, phone);
			SQLUtil sqlutil = new SQLUtil();
			int status = sqlutil.insertuser(user);
			if (status==0){
				resp.getWriter().println("<script language='javascript'>alert('注册失败');</script>");
			}else{
				resp.getWriter().println("<script language='javascript'>alert('注册成功');</script>");
			}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
}
