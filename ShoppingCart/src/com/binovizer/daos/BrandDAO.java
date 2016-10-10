package com.binovizer.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.binovizer.dtos.BrandDTO;

public class BrandDAO {
	public static ArrayList<BrandDTO> getBrandList(){
		ArrayList<BrandDTO> brandList = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement("select * from brands where brand_status=?");
			pstmt.setString(1, "A");
			rs = pstmt.executeQuery();
			brandList = new ArrayList<>();
		while(rs.next()){
			BrandDTO obj = new BrandDTO();
			obj.setBrand_id(rs.getInt("brand_id"));
			obj.setBrand_name(rs.getString("brand_name"));
			brandList.add(obj);
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
		return brandList;
	}
}
