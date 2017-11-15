package com.icehockey.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.icehockey.entity.Player;
import com.icehockey.entity.User;
import com.icehockey.service.PlayerService;

/**
 * Servlet implementation class TianBingTianJiangServlet
 */
public class TianBingTianJiangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TianBingTianJiangServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setContentType("application/json");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		PrintWriter writer = response.getWriter();
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("-----------------添兵添将后台程序----------");

		PlayerService playerService = new PlayerService();
		User user = null;
		List<Player> players = null;

		System.out.println("跳转后的sessionId :" + session.getId());
		String operateType = null;
		// session
		if (session.getAttribute("user") == null) {
			map.put("result", "-1");// 没有用户登录
		} else {
			user = (User) session.getAttribute("user");
			if (request.getParameter("operateType") != null) {
				operateType = request.getParameter("operateType");
				if ("zhukongToTianBingTianJiang".equals(operateType)) {// 如果操作类型是主控页面到浇冰必拜主页面，则取出用户关注的所有球员的信息
					players = playerService.getUserFollowedPlayers(user.getUserId());
					System.out.println(players);
					session.setAttribute("players", players);
					map.put("result", "0");
					map.put("ok", "1");

				} else if ("mohusousuo".equals(operateType)) {// 如果操作类型是模糊搜索，即根据名字字符串搜索当前关注球员
					String playerNameString = request.getParameter("playerName");
					System.out.println("playerNameString:" + playerNameString);
					players = playerService.getUserFollowedPlayersByNameString(user.getUserId(), playerNameString);
					System.out.println(players);
					session.setAttribute("players", players);
					map.put("result", "0");
					map.put("ok", "2");
				} else if ("jingquesousuo".equals(operateType)) {// 如果操作类型是精确搜索，即根据名字字符串搜索当前关注球员
					String playerName = request.getParameter("playerName");
					System.out.println("playerName:" + playerName);
					players = playerService.getUserFollowedPlayersByPlayerName(user.getUserId(), playerName);
					System.out.println(players);
					session.setAttribute("players", players);
					map.put("result", "0");
					map.put("ok", "3");
				} else if ("zhuyemianToXiangxi".equals(operateType)) {// 如果操作类型是精确搜索，即根据名字字符串搜索当前关注球员
					int playerId = Integer.parseInt(request.getParameter("playerId"));
					System.out.println("playerId:" + playerId);
					Player player = playerService.getPlayerByPlayerId(playerId);
					System.out.println(player);
					session.setAttribute("player", player);
					map.put("result", "0");
					map.put("ok", "4");
				} else if ("quxiaoguanzhu".equals(operateType)) {// 如果操作类型是精确搜索，即根据名字字符串搜索当前关注球员
					int playerId = Integer.parseInt(request.getParameter("playerId"));
					System.out.println("playerId:" + playerId);
					boolean flag = playerService.cancelFollowed(user.getUserId(),playerId);
					System.out.println(flag);
					session.setAttribute("flag", flag);
					map.put("result", "0");
					map.put("ok", "5");
				} else {
					map.put("result", "-2");// 没有操作类型
				}

			} else {
				map.put("result", "-2");// 没有操作类型
			}
		}

		// 根据result值，判断页面如何跳转
		if ("0".equals(map.get("result"))) {// 登录成功，且不是第一次登陆
			System.out.println("页面操作正确");
			if ("1".equals(map.get("ok"))) {
				writer.println(
						"<script language='javascript'>window.location.href='./views/part4/tianbingtianjiangzhuyemian.jsp'</script>");
			} else if ("2".equals(map.get("ok"))) {
				writer.println(
						"<script language='javascript'>window.location.href='./views/part4/sousuojieguo.jsp'</script>");
			} else if ("3".equals(map.get("ok"))) {
				writer.println(
						"<script language='javascript'>window.location.href='./views/part4/sousuojieguo.jsp'</script>");
			} else if ("4".equals(map.get("ok"))) {
				writer.println(
						"<script language='javascript'>window.location.href='./views/part4/qiuyuanxiangxixinxi.jsp'</script>");
			} else if ("5".equals(map.get("ok"))) {
				writer.println(
						"<script language='javascript'>window.location.href='./views/part4/tianbingtianjiangzhuyemian.jsp'</script>");
			}else {

			}
		} else if ("-1".equals(map.get("result"))) {// 登陆失败，用户名不存在
			writer.println(
					"<script language='javascript'>alert('当前没有登录用户');window.location.href='./views/part1/zhucedengluyemian.jsp'</script>");

		} else if ("-2".equals(map.get("result"))) {// 前端错误
			writer.println(
					"<script language='javascript'>alert('前端错误');window.location.href='history.back(-1);'</script>");

		} else if ("-3".equals(map.get("result"))) {// 插入失败
			writer.println(
					"<script language='javascript'>alert('插入失败');window.location.href='history.back(-1);'</script>");

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
