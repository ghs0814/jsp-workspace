package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestProcess(request, response);
	}
	
	protected void requestProcess(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		
		System.out.println("id : " + userid);
		System.out.println("pw : " + passwd);
		
		//한글처리
				response.setContentType("text/html; charset=UTF-8");
				//문자 테이러를 출력하기 위한 PrintWriter 객체 생성
				PrintWriter out =response.getWriter();
				
				out.print("<html>");
				out.print("<head><title>login</title></head>");
				out.print("<body>");
				out.print("아이디 : " + userid +" 비밀번호 : " + passwd);
				out.print("</body>");
				out.print("</html>");
	}

}
