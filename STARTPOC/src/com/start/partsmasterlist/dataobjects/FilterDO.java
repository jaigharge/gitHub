package com.start.partsmasterlist.dataobjects;

public class FilterDO {
	
	private String value;
	
	private String name;
	
	private String description;
	
	private boolean is_Read_Only;
	
	private boolean is_Standard_filter;
	
	private boolean subscribed;
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isIs_Read_Only() {
		return is_Read_Only;
	}

	public void setIs_Read_Only(boolean is_Read_Only) {
		this.is_Read_Only = is_Read_Only;
	}

	public boolean isIs_Standard_filter() {
		return is_Standard_filter;
	}

	public void setIs_Standard_filter(boolean is_Standard_filter) {
		this.is_Standard_filter = is_Standard_filter;
	}

	public boolean isSubscribed() {
		return subscribed;
	}

	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}
	@Override
	public String toString() {
		return "FilterDO [value=" + value + ", name=" + name + ", description="
				+ description + ", is_Read_Only=" + is_Read_Only
				+ ", is_Standard_filter=" + is_Standard_filter
				+ ", subscribed=" + subscribed + "]";
	}
}
