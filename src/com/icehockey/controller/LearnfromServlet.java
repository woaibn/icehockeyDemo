package com.icehockey.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.icehockey.entity.CoachPlayer;
import com.icehockey.entity.User;
import com.icehockey.service.CoachPlayerService;

/**
 * Servlet implementation class LearnfromServlet
 */
@WebServlet("/LearnfromServlet")
public class LearnfromServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LearnfromServlet() {
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
		System.out.println("-------------hobbyChoose.html-----------");
		PrintWriter writer = response.getWriter();
		User user = null;
		CoachPlayerService coachPlayerService = new CoachPlayerService();
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("跳转后的sessionId :" + session.getId());
		System.out.println(session.getAttribute("user"));
		// session
		if (session.getAttribute("user") == null) {
			map.put("reslut", "-1");
		} else {
			System.out.println("跳转前的sessionId :" + session.getId());
			user = (User) session.getAttribute("user");
			System.out.println("user: " + user);
			if (user != null) {// 查找成功
				map.put("user", user);
				System.out.println("找到当前用户" + user);
				session.setAttribute("user", user);
				List<CoachPlayer> coachPlayers = coachPlayerService
						.queryCoachPlayerRecordByUserId("player",
								user.getUserId());
				if (coachPlayers != null) {
					map.put("coachPlayers", coachPlayers);
					session.setAttribute("coachPlayers", coachPlayers);
					// 处理成功返回result=0
					map.put("result", "0");
					System.out.println("map找到啦..." + map);
				} else {
					System.out.println("查找失败");
					map.put("result", "-2");
				}

			} else {
				System.out.println("map...空");
				// 第一次登陆返回result=1
				map.put("result", "-2");
			}
		}
		// 页面跳转
		if ("0".equals(map.get("result"))) {// 登录成功，且不是第一次登陆
			writer.println("<script language='javascript'>window.location.href='./views/imformation/learnfrom.jsp'</script>");
		} else if ("-1".equals(map.get("result"))) {// 登陆失败，用户名不存在
			writer.println("<script language='javascript'>alert('当前没有登录用户');window.location.href='./views/login.html'</script>");

		} else if ("-2".equals(map.get("result"))) {// 登陆失败，用户名不存在
			writer.println("<script language='javascript'>alert('没有选择爱好');window.location.href='./views/page/hobbyChoose.html'</script>");

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
