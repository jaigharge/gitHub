package com.start.partsmasterlist.dataobjects;

import java.util.List;

public class ViewParentDO {
	
	List<ViewDO> viewDO;
	
	List<CategoryDO> categoryDO;

	public List<ViewDO> getViewDO() {
		return viewDO;
	}

	public void setViewDO(List<ViewDO> viewDO) {
		this.viewDO = viewDO;
	}

	public List<CategoryDO> getCategoryDO() {
		return categoryDO;
	}

	public void setCategoryDO(List<CategoryDO> categoryDO) {
		this.categoryDO = categoryDO;
	}
	
}
