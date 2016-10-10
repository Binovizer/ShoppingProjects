package com.binovizer.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.binovizer.dtos.UserDTO;


public class RegisterDAO {
	public static boolean regsiter(UserDTO user){
		boolean flag = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		int rs = 0;
		try{
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement("Insert into users(user_email,user_name,user_pass) values(?,?,?)");
			pstmt.setString(1, user.getUser_email());
			pstmt.setString(2, user.getUser_name());
			pstmt.setString(3, user.getUser_pass());
			rs = pstmt.executeUpdate();
			if(rs>0){
				flag = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
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
		return flag;
	}
}
