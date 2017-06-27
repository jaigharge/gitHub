package com.start.partsmasterlist.dataobjects;

public class PlantsValuesDO {
	
	String values;
	boolean isSelected;
	public String getValues() {
		return values;
	}
	public void setValues(String values) {
		this.values = values;
	}
	public boolean isSelected() {
		return isSelected;
	}
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	@Override
	public String toString() {
		return "PlantsValuesDO [values=" + values + ", isSelected="
				+ isSelected + "]";
	}
}
