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
 * Servlet implementation class AliasServlet
 */
@WebServlet("/AliasServlet")
public class AliasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AliasServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.setContentType("application/json");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setHeader("set-Cookie", "name=value;HttpOnly");
		System.out.println("-------------AliasServlet.html-----------");
		PrintWriter writer = response.getWriter();
		User user = null;
		UserService userService = new UserService();
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("跳转后的sessionId :" + session.getId());
		// session
		if (session.getAttribute("user") == null) {
			map.put("reslut", "-1");
		} else {
			System.out.println("跳转前的sessionId :" + session.getId());
			user = (User) session.getAttribute("user");
			System.out.println("user: " + user);
			// 前端获取传入的data
			String userName = "";
			if (request.getParameter("name") != null) {
				userName = request.getParameter("name");
				map.put("result", "0");
				session.setAttribute("user", user);
				session.setAttribute("userName", userName);
			} else {
				map.put("reslut", "-2");
			}

			String imageUrl = "";
			if (request.getParameter("touxiang") != null) {
				imageUrl = request.getParameter("touxiang");
				map.put("result", "0");
				session.setAttribute("user", user);
				session.setAttribute("imageUrl", imageUrl);
			} else {
				map.put("reslut", "-2");
			}
			 imageUrl = "../../img/part4/pic/i1.jpg";
			if ("0".equals(map.get("result"))) {
				String gender = (String) session.getAttribute("gender");
				double height = (Double) session.getAttribute("height");
				double weight = (Double) session.getAttribute("weight");
				String role = (String) session.getAttribute("role");
				String handling = (String) session.getAttribute("handling");
				System.out.println(gender);
				System.out.println(height);
				System.out.println(weight);
				System.out.println(role);
				System.out.println(handling);
				boolean f = userService.insertNewUser(gender, height,
						weight, role, handling, userName, imageUrl);
				if (f) {
					map.put("ok", "0");
				} else {
					map.put("ok", "-1");
				}
			}
		}
		// 根据result值，判断页面如何跳转
		if ("0".equals(map.get("result"))) {// 登录成功，且不是第一次登陆
			System.out.println("页面操作正确");
			if("0".equals(map.get("ok"))){
				writer.println("<script language='javascript'>alert('新建球员成功');'</script>");
			}else{
				writer.println("<script language='javascript'>alert('新建球员失败');'</script>");			
			}
			writer.println("<script>window.location.href='./views/part4/tianbingtianjiangzhuyemian.jsp'</script>");
			
		} else if ("-1".equals(map.get("result"))) {// 登陆失败，用户名不存在
			writer.println("<script language='javascript'>alert('当前没有登录用户');window.location.href='./views/part1/zhucedengluyemian.jsp'</script>");

		} else if ("-2".equals(map.get("result"))) {// 前端错误
			writer.println("<script language='javascript'>alert('前端错误');window.location.href='history.back(-1);'</script>");

		} else if ("-3".equals(map.get("result"))) {// 插入失败
			writer.println("<script language='javascript'>alert('插入失败');window.location.href='history.back(-1);'</script>");

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
