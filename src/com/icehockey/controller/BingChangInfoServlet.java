package com.icehockey.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.icehockey.entity.Place;
import com.icehockey.service.PlaceService;

/**
 * Servlet implementation class BingChangInfoServlet
 */
public class BingChangInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BingChangInfoServlet() {
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
		System.out.println("-------------BingChangInfoServlet.html-----------");
		PrintWriter writer = response.getWriter();
		PlaceService placeService = new PlaceService();
		Place place = null;
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("跳转后的sessionId :" + session.getId());
		// session
		place = placeService.getPlaceByPlaceName("西三旗");
		session.setAttribute("place", place);
		map.put("reslut", "0");

		// 根据result值，判断页面如何跳转

		writer.println("<script>window.location.href='./views/main.html'</script>");

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
