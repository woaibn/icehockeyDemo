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

import com.icehockey.entity.Place;
import com.icehockey.service.PlaceService;

/**
 * Servlet implementation class JiaoBingBiBaiServlet
 */
public class JiaoBingBiBaiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JiaoBingBiBaiServlet() {
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
		System.out.println("-------------JiaoBingBiBaiServlet.html-----------");
		PrintWriter writer = response.getWriter();
		PlaceService placeService = new PlaceService();
		Place place = null;
		List<Place> places = null;
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("跳转后的sessionId :" + session.getId());
		String operateType = null;
		// session
		if (session.getAttribute("user") == null) {
			map.put("result", "-1");// 没有用户登录
		} else {
			if (request.getParameter("operateType") != null) {
				operateType = request.getParameter("operateType");
				if ("zhukongToJiaoZhu".equals(operateType)) {// 如果操作类型是主控页面到浇冰必拜主页面，则取出场地表中的所有场地信息
					places = placeService.getPlaces();
					session.setAttribute("places", places);
					map.put("places", places);
					map.put("result", "0");
					map.put("ok", "1");

				} else if ("JiaoZhuToJiaoXiang".equals(operateType)) {// 如果操作类型是浇冰必拜主页面场地详细信息，则根据场地名称取出场地表中的该场地信息
					if (request.getParameter("placeName") != null) {
						String placeName = request.getParameter("placeName");
						place = placeService.getPlaceByPlaceName(placeName);
						session.setAttribute("place", place);
						map.put("place", place);
						map.put("result", "0");
						map.put("ok", "2");
					} else {
						map.put("result", "-2");// 没有操作类型
					}
				} else if ("sousuo".equals(operateType)) {// 如果操作类型是浇冰必拜主页面场地详细信息，则根据场地名称取出场地表中的该场地信息
					if (request.getParameter("placeName") != null) {
						String placeName = request.getParameter("placeName");
						System.out.println("placeName:"+placeName);
						places = placeService.getPlacesByPlaceName(placeName);
						session.setAttribute("places", places);
						map.put("places", places);
						map.put("result", "0");
						map.put("ok", "3");
					} else {
						map.put("result", "-2");// 没有操作类型
					}
					System.out.println("map:" + map);
				}
			} else {
				map.put("result", "-2");// 没有操作类型
			}
		}
		System.out.println("aaaaaaaaaaa");
		// 根据result值，判断页面如何跳转
		if ("0".equals(map.get("result"))) {// 登录成功，且不是第一次登陆
			System.out.println("页面操作正确");
			if ("1".equals(map.get("ok"))) {
				writer.println("<script language='javascript'>window.location.href='./views/part2/jiaobingbibaizhuyemian.jsp'</script>");
			} else if ("2".equals(map.get("ok"))) {
				writer.println("<script language='javascript'>window.location.href='./views/part2/bingchangxiangxixinxi.jsp'</script>");
			} else if ("3".equals(map.get("ok"))) {
				writer.println("<script language='javascript'>window.location.href='./views/part2/jiaobingbibaizhuyemian.jsp'</script>");
			}
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
