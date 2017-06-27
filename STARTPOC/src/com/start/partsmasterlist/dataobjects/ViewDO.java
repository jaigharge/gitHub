package com.start.partsmasterlist.dataobjects;

import java.util.List;


public class ViewDO {
	
	String value;
	
	String Name;
	
	String description;
	
	boolean isReadOnly;
	
	boolean isStandardView;
	
	boolean isSubscribed;
	
	List<ColumnDO> columnDO;
	
	List<CategoryDO> categoryDO;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isReadOnly() {
		return isReadOnly;
	}

	public void setReadOnly(boolean isReadOnly) {
		this.isReadOnly = isReadOnly;
	}

	public boolean isStandardView() {
		return isStandardView;
	}

	public void setStandardView(boolean isStandardView) {
		this.isStandardView = isStandardView;
	}

	public boolean isSubscribed() {
		return isSubscribed;
	}

	public void setSubscribed(boolean isSubscribed) {
		this.isSubscribed = isSubscribed;
	}

	public List<CategoryDO> getCategoryDO() {
		return categoryDO;
	}

	public void setCategoryDO(List<CategoryDO> categoryDO) {
		this.categoryDO = categoryDO;
	}
	
	public List<ColumnDO> getColumnDO() {
		return columnDO;
	}

	public void setColumnDO(List<ColumnDO> columnDO) {
		this.columnDO = columnDO;
	}

	@Override
	public String toString() {
		return "ViewDO [value=" + value + ", Name=" + Name + ", description="
				+ description + ", isReadOnly=" + isReadOnly
				+ ", isStandardView=" + isStandardView + ", isSubscribed="
				+ isSubscribed + ", categoryDO=" + categoryDO + "]";
	}
	
}
