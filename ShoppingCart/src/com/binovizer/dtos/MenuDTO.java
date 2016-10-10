package com.binovizer.dtos;

public class MenuDTO {
	private int MenuID;
	private String MenuName;
	private String MenuLink;
	private String font_awesome_id;
	public String getFont_awesome_id() {
		return font_awesome_id;
	}
	public void setFont_awesome_id(String font_awesome_id) {
		this.font_awesome_id = font_awesome_id;
	}
	public int getMenuID() {
		return MenuID;
	}
	public void setMenuID(int menuID) {
		MenuID = menuID;
	}
	public String getMenuName() {
		return MenuName;
	}
	public void setMenuName(String menuName) {
		MenuName = menuName;
	}
	public String getMenuLink() {
		return MenuLink;
	}
	public void setMenuLink(String menuLink) {
		MenuLink = menuLink;
	}
}
