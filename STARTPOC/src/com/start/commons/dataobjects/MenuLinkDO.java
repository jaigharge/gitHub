package com.start.commons.dataobjects;

import java.util.List;

public class MenuLinkDO {
	
	private int menuId;

	private String label;

	private String link;
	
	private String description;

	private int menuLevel;
	
	private List<MenuLinkDO> subMenus;
	

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<MenuLinkDO> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List<MenuLinkDO> subMenus) {
		this.subMenus = subMenus;
	}
	
	
	public int getMenuLevel() {
		return menuLevel;
	}

	public void setMenuLevel(int menuLevel) {
		this.menuLevel = menuLevel;
	}

	@Override
	public String toString() {
		return "MenuLinkDO [menuId=" + menuId + ", label=" + label + ", link="
				+ link + ", description=" + description + ", menuLevel="
				+ menuLevel + ", subMenus=" + subMenus + "]";
	}

	
	
}
