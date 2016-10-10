package com.binovizer.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.binovizer.dtos.ItemDTO;


public class ItemDAO {
	public static ArrayList<ItemDTO> getItemList(){
		ArrayList<ItemDTO> itemList = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement("select * from items where item_status=?");
			pstmt.setString(1, "A");
			rs = pstmt.executeQuery();
			itemList = new ArrayList<>();
		while(rs.next()){
			ItemDTO obj = new ItemDTO();
			obj.setItemID(rs.getInt("item_id"));
			obj.setItemName(rs.getString("item_name"));
			itemList.add(obj);
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
		return itemList;
	}
}
