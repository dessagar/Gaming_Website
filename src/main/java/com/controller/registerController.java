package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.registerDao;
import com.model.user;

import verify.send.SendMail;

/**
 * Servlet implementation class registerController
 */
@WebServlet("/registerController")
public class registerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public  boolean isValid(String mobNo)
	{

		// The given argument to compile() method
		// is regular expression. With the help of
		// regular expression we can validate mobile
		// number.
		// 1) Begins with 0 or 91
		// 2) Then contains 7 or 8 or 9.
		// 3) Then contains 9 digits
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");

		// Pattern class contains matcher() method
		// to find matching between given number
		// and regular expression
		Matcher m = p.matcher(mobNo);
		return (m.find() && m.group().equals(mobNo));
	}
    public registerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		RequestDispatcher r=request.getRequestDispatcher("register.jsp");
		pw.print("registerservlet....");
		HttpSession session=request.getSession();
		registerDao rd=new registerDao();
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		ResultSet rs=rd.profile();
		try {
			while(rs.next())
			{
				if(email.equals(rs.getString(2)))
				{
					int n=4;
					session.setAttribute("msg", n);
					r.forward(request, response);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String mobno=request.getParameter("mobno");
		pw.print("registerservlet2....");
		if(isValid(mobno))
		{
			pw.print("registerservlet3....");
			String pass=request.getParameter("pass");
			String cpass=request.getParameter("cpass");
			if(pass.equals(cpass))
			{
				pw.print("registerservlet3....");
				user u=new user(name, email, mobno, pass);
				int i=rd.create_user(u);
				if(i>0)
				{
					SendMail se=new SendMail();
					final String subject = "Login Credential For your GameOn Gaming Portal";
					final String messg = "Dear "+name+",\n"
							+ "Welcome To Game On Gaming Portal.\nGame On Gaming Portal is a platform which you can play Various simple and interesting Games i.e. Dice Game,Drum Kit,Simon,Snake Game.\n"
							+ "Accordingly, we are sending you Username & Password to access the our portal and enjoy Yourself.\n\n"
							+ "Username = "+email+"\n"
							+"Password = "+pass+"\n\n"
							+"Regards,\n"
							+" Game on Team";
					int k=se.sendEmail(email, pass,messg,subject);
					
					int n=3;
					session.setAttribute("msg", n);
					response.sendRedirect("login.jsp");
				}
			}
			else
			{
				int n=1;
				session.setAttribute("msg", n);
				r.forward(request, response);
			}
		}
		else {
			int n=2;
			session.setAttribute("msg", n);
			r.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
