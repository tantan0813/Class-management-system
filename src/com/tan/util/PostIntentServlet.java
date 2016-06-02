package com.tan.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sqlcon.SQLUtil;

import com.tan.bean.Intent;
import com.tan.bean.User;

public class PostIntentServlet extends HttpServlet {

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
		response.setHeader("Content-Type","text/html;charset=utf-8"); 
		request.setCharacterEncoding("utf-8");
		
		String nickname = request.getParameter("nickname");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		Intent intent = new Intent(null, nickname, title, content, null);
		SQLUtil sqlutil = new SQLUtil();
		boolean status = sqlutil.insertintent(intent);
		if (status){
			response.getWriter().println("<script language='javascript'>alert('提交成功');</script>");
			response.sendRedirect("GetContent");
		}else{
			response.getWriter().println("<script language='javascript'>alert('提交失败');</script>");
		}
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
