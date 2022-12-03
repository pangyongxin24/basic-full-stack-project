package com.kittyki.project.dao.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.kittyki.project.model.User;


//user data access object
public class UserDaoImpl {
	private Connection conn;
	
	public UserDao(Connection conn) {
		this.conn = conn;
	}
	
	public User findById(int id) throws SQLException{
		User user = null;
		PreparedStatement pstmt = conn.prepareStatement("select id, name, password from user where id = ?");
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			user = new User();
			user.setId(rs.getInt(1));
			user.setName(rs.getString(2));
		}
		
		return user;
	}
	
	public User findByName(String match) throws SQLException{
		User user = null;
		PreparedStatement pstmt = conn.prepareStatement("select id, name from user where name = ?");
		pstmt.setString(1, match);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			user = new User();
			user.setId(rs.getInt(1));
			user.setName(rs.getString(2));
		}
		
		return user;
	}
}
