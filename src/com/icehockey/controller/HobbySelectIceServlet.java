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
 * Servlet implementation class HobbySelectIceServlet
 */
@WebServlet("/HobbySelectIceServlet")
public class HobbySelectIceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HobbySelectIceServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin", "*");
		HttpSession session = request.getSession();
		response.setContentType("application/json");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setHeader("set-Cookie", "name=value;HttpOnly");
		System.out.println("-------------HobbySelectIce.html-----------");
		PrintWriter writer = response.getWriter();
		User user = null;
		Map<String, Object> map = new HashMap<String, Object>();
		UserService userService = new UserService();
		System.out.println("跳转后的sessionId :" + session.getId());
		// session
		if (session.getAttribute("user") == null) {
			map.put("reslut", "-1");
		} else {
			System.out.println("跳转前的sessionId :" + session.getId());
			user = (User) session.getAttribute("user");
			System.out.println("user: " + user);
			String play = null;// 传输的数据
			if (session.getAttribute("play") != null) {
				play = (String) session.getAttribute("play");
			} else {
				map.put("reslut", "-2");// 当前页面操作有误
			}
			String ice_play = "";
			if (request.getParameter("ice_play") != null) {
				ice_play = request.getParameter("ice_play");
			} else {
				map.put("reslut", "-2");// 当前页面操作有误
			}
			if (user != null) {// 查找成功
				user = userService.InsertPlayAndIceByUserId(user.getUserId(),
						play, ice_play);
				if (user != null) {// 插入成功
					System.out.println("找到当前用户" + user);
					// 处理成功返回result=0
					map.put("result", "0");
					map.put("play", play);
					session.setAttribute("user", user);
					System.out.println("map..." + map);
				} else {
					map.put("result", "-3");
				}
			} else {
				System.out.println("map...空");
				// 第一次登陆返回result=1
				map.put("result", "-2");
			}

		}
		if ("0".equals(map.get("result"))) {// 登录成功，且不是第一次登陆
			System.out.println("页面操作正确");
			if ("ICESNOW".equals(map.get("play"))) {
				System.out.println("冰雪都玩");
				writer.println("<script>window.location.href='./views/page/hobbySelectSnow.html'</script>");
			} else {
				System.out.println("玩冰");
				writer.println("<script>window.location.href='./views/roleChoose/role.html'</script>");

			}
		} else if ("-1".equals(map.get("result"))) {// 登陆失败，用户名不存在
			writer.println("<script language='javascript'>alert('当前没有登录用户');window.location.href='./views/login.html'</script>");

		} else if ("-2".equals(map.get("result"))) {// 登陆失败，用户名不存在
			writer.println("<script language='javascript'>alert('前端错误');window.location.href='./views/page/hobbySelectIce.html'</script>");

		} else if ("-3".equals(map.get("result"))) {// 登陆失败，用户名不存在
			writer.println("<script language='javascript'>alert('插入失败');window.location.href='./views/page/hobbySelectIce.html'</script>");

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
