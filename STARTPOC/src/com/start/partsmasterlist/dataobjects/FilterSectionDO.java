package com.start.partsmasterlist.dataobjects;

import java.util.List;

public class FilterSectionDO {
	List<FilterBlockDO> filterBlockDO;
	
	public List<FilterBlockDO> getFilterBlockDO() {
		return filterBlockDO;
	}

	public void setFilterBlockDO(List<FilterBlockDO> filterBlockDO) {
		this.filterBlockDO = filterBlockDO;
	}

	@Override
	public String toString() {
		return "FilterSectionDO [filterBlockDO=" + filterBlockDO + "]";
	}
}
