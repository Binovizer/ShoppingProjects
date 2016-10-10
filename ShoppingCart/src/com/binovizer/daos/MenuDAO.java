package com.binovizer.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.binovizer.dtos.MenuDTO;

public class MenuDAO {
	public static ArrayList<MenuDTO> getMenuList(){
		ArrayList<MenuDTO> menuList = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement("select * from menus where menu_status=?");
			pstmt.setString(1, "A");
			rs = pstmt.executeQuery();
			menuList = new ArrayList<>();
		while(rs.next()){
			MenuDTO obj = new MenuDTO();
			obj.setMenuID(rs.getInt("menu_id"));
			obj.setMenuName(rs.getString("menu_name"));
			obj.setMenuLink(rs.getString("menu_link"));
			obj.setFont_awesome_id(rs.getString("font_awesome_id"));
			menuList.add(obj);
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
		return menuList;
	}
}
