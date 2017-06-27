package com.start.partsmasterlist.dataobjects;

import java.util.List;

public class FilterBlockDO {
	
	List<FieldDO> fieldDOList;
	
	FilterSettingDO filterSettingDO;
	
	FilterPlantsDO filterPlantsDOList;

	public List<FieldDO> getFieldDOList() {
		return fieldDOList;
	}

	public void setFieldDOList(List<FieldDO> fieldDOList) {
		this.fieldDOList = fieldDOList;
	}
	
	public FilterSettingDO getFilterSettingDO() {
		return filterSettingDO;
	}

	public FilterPlantsDO getFilterPlantsDOList() {
		return filterPlantsDOList;
	}

	public void setFilterPlantsDOList(FilterPlantsDO filterPlantsDOList) {
		this.filterPlantsDOList = filterPlantsDOList;
	}

	public void setFilterSettingDO(FilterSettingDO filterSettingDO) {
		this.filterSettingDO = filterSettingDO;
	}
	

	@Override
	public String toString() {
		return "FilterBlockDO [fieldDOList=" + fieldDOList
				+ ", filterSettingDO=" + filterSettingDO + "]";
	}
	
}
