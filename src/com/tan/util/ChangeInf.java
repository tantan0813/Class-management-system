package com.tan.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sqlcon.SQLUtil;

import com.tan.bean.User;

public class ChangeInf extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.setHeader("Content-Type","text/html;charset=utf-8");
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		String nickname = request.getParameter("nickname");
//		String gender = request.getParameter("gender");
//		String email = request.getParameter("email");
//		String address = request.getParameter("address");
//		String profession = request.getParameter("profession");
//		String birthday = request.getParameter("birthday");
//		String phone = request.getParameter("phone");
//		User user = new User(username, password,nickname, gender, email, address, profession, birthday, phone);
//		SQLUtil sqlutil = new SQLUtil();
//		int status = 
//		if (status==0){
//			response.getWriter().println("<script language='javascript'>alert('修改失败');</script>");
//		}else{
//			response.getWriter().println("<script language='javascript'>alert('修改成功');</script>");
//		}
//		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
	}

}
