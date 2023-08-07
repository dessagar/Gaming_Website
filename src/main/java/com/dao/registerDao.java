package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.user;

public class registerDao {
	int i=0;
	PreparedStatement pstate=null;
	Connection con=null;
	
	public int create_user(user u)
	{
		con=DbConnection.getConnection();
		try {
			pstate=con.prepareStatement("insert into game values(?,?,?,?)");
			pstate.setString(1, u.getName());
			pstate.setString(2, u.getEmail());
			pstate.setString(3, u.getMobno());
			pstate.setString(4, u.getPass());
			i=pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
			
	}
	
	public ResultSet validate_user(String email,String pass)
	{
		con=DbConnection.getConnection();
		ResultSet rs=null;
		try {
			pstate=con.prepareStatement("select *from game where email=? and pass=?");
			pstate.setString(1,email);
			pstate.setString(2, pass);
			rs = pstate.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet profile()
	{
		con=DbConnection.getConnection();
		ResultSet rs=null;
		String str="select *from game";
		try {
			Statement st=con.createStatement();
			rs=st.executeQuery(str);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}
