package com.binovizer.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.binovizer.dtos.UserDTO;

public class LoginDAO {
	public static UserDTO checkLogin(UserDTO user){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserDTO u = null;
		try{
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement("select user_id,user_email,user_name from users where user_email=? AND user_pass=?");
			pstmt.setString(1, user.getUser_email());
			pstmt.setString(2, user.getUser_pass());
			rs = pstmt.executeQuery();
			while(rs.next()){
				u = new UserDTO();
				u.setUser_id(rs.getInt("user_id"));
				u.setUser_email(rs.getString("user_email"));
				u.setUser_name(rs.getString("user_name"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return u;
	}
}
