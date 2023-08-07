package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import verify.send.SendMail;

/**
 * Servlet implementation class contactusController
 */
@WebServlet("/contactusController")
public class contactusController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contactusController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("fname");
		String mobNo=request.getParameter("mobno");
		String email=request.getParameter("email");
		String msg=request.getParameter("msg");
		System.out.println("hello consol");
		System.out.println(fname);
		
		String draft="user name :-"+fname+"\ncontact No :-"+mobNo+"\nemail :-"+email+"\nmessage :-"+msg;
		String toEmail="desakash2243@gmail.com";
		//SendMail se=new SendMail();
		//int k=se.sendEmail(toEmail, null, draft, fname);
		response.sendRedirect("index.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
