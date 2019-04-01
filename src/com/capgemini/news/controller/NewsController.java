package com.capgemini.news.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/getnews" }, loadOnStartup = 1)
public class NewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewsController() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String path = request.getParameter("paper");

		if (path.equals("toi")) {
			response.sendRedirect("http://www.timesofindia.com");
		}

		else if (path.equals("eco")) {
			response.sendRedirect("https://economictimes.indiatimes.com/");
		}

		else if (path.equals("mht")) {
			response.sendRedirect("https://maharashtratimes.indiatimes.com/");
		}

		else if (path.equals("dna")) {
			response.sendRedirect("https://www.dnaindia.com/");
		}

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
