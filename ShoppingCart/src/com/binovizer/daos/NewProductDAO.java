package com.binovizer.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.binovizer.dtos.ProductDTO;


public class NewProductDAO {
	public static ArrayList<ProductDTO> getNewProductList(){
		ArrayList<ProductDTO> productList = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement("select product_id,product_name,product_price,product_discount,item_id from products where product_status=? AND product_keywords LIKE ?");
			pstmt.setString(1, "A");
			pstmt.setString(2, "%new%");
			rs = pstmt.executeQuery();
			productList = new ArrayList<>();
		while(rs.next()){
			ProductDTO obj = new ProductDTO();
			obj.setProduct_id(rs.getInt("product_id"));
			obj.setProduct_name(rs.getString("product_name"));
			obj.setProduct_price(rs.getDouble("product_price"));
			obj.setProduct_discount(rs.getInt("product_discount"));
			obj.setItem_id(rs.getInt("item_id"));
			productList.add(obj);
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
		return productList;
	}
}
