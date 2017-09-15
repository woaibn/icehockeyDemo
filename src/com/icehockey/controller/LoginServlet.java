package com.icehockey.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.icehockey.entity.User;
import com.icehockey.service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setContentType("application/json");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		// response.setHeader("set-Cookie", "name=value;HttpOnly");
		System.out.println("-----------------login.html----------");
		HttpSession session = request.getSession();
		PrintWriter writer = response.getWriter();
		UserService userService = new UserService();
		User user = null;
		Map<String, Object> map = new HashMap<String, Object>();
		// 遍历map得到前端传入的值
		String telephone = "";
		//String verificationCode = "";
		String password = "";
		if (request.getParameter("phoneNumber") != null) {
			telephone = request.getParameter("phoneNumber");
		} else {
			map.put("result", "-1");
		}
//		if (request.getParameter("verificationCode") != null) {
		// verificationCode = request.getParameter("verificationCode");
		// } else {
		// map.put("result", "-1");
		// }
		
		if (request.getParameter("newPassword") != null) {
			password = request.getParameter("newPassword");
		} else {
			map.put("result", "-1");
		}
		// 登录函数
		user = userService.loginByTelepone(telephone, password);
		if (user != null) {// 登录成功
			if (user.getUserId() != -1) {
				System.out.println("找到session当前用户" + user);
				// session
				session.setAttribute("user", user);
				if (session.getAttribute("user") != null) {
					System.out.println("user: " + user);
					map.put("result", "0");
					map.put("telephone", telephone);
					map.put("password", password);
					System.out.println("map..." + map);
				} else {
					map.put("result", "-2");// 密码错误
				}
			} else {
				System.out.println("session存储失败");
			}
		} else {
			System.out.println("map未找到...");
			map.put("result", "-1");
		}
		if ("0".equals(map.get("result"))) {// 登录成功，且不是第一次登陆
			writer.println("<script>window.location.href='./views/part1/zhukongyemian.jsp'</script>");
		} else if ("-1".equals(map.get("result"))) {// 缺少参数
			writer.println("<script>alert('缺少参数');window.location.href='./views/part1/qitadenglufangshi.jsp'</script>");
		} else if ("-2".equals(map.get("result"))) {// 登陆失败，密码错误
			writer.println("<script language='javascript'>alert('密码错误!');window.location.href='./views/part1/qitadenglufangshi.jsp'</script>");
		} else {// 登陆失败，用户名不存在
			writer.println("<script language='javascript'>alert('用户名不存在!');window.location.href='./views/part1/qitadenglufangshi.jsp'</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
