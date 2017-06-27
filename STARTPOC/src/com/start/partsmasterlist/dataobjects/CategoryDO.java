package com.start.partsmasterlist.dataobjects;

import java.util.List;

public class CategoryDO {
	
	private String categoryName;
	
	private List<ElementDO> values;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<ElementDO> getValues() {
		return values;
	}

	public void setValues(List<ElementDO> values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "CategoryDO [categoryName=" + categoryName + ", values="
				+ values + "]";
	}
	
}
