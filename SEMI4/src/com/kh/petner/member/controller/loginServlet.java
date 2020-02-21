package com.kh.petner.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.petner.member.model.exception.MemberException;
import com.kh.petner.member.model.service.MemberService;
import com.kh.petner.member.model.vo.Member;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/Plogin.me")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//인코딩은 필터에서 처리
		
		//로그인한 정보 받아옴
		String userEmail = request.getParameter("userEmail");
		String userPwd = request.getParameter("userPwd");
	
		//정보를 저장
		Member m = new Member();
		m.setUserEmail(userEmail); m.setUserPwd(userPwd);
		
		//서비스로 전송
		try {
			//로긴 성공
			m=new MemberService().selectMember(m);
			System.out.println(m);
			HttpSession session = request.getSession();
			session.setAttribute("member", m);
			
			response.sendRedirect("index.jsp");
			
		} catch (MemberException e) {
			//로긴 실패
			
			request.setAttribute("msg", "로그인 실패");
			request.setAttribute("exception", e);
			
			request.getRequestDispatcher("error/error.jsp")
			.forward(request, response);
			
		}
		
	}//doGet
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
