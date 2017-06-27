package com.start.partsmasterlist.dataobjects;

public class ColumnHeaderDO {
	
	private String columnHeader;
	
	private String tooltip;

	public String getColumnHeader() {
		return columnHeader;
	}

	public void setColumnHeader(String columnHeader) {
		this.columnHeader = columnHeader;
	}

	public String getTooltip() {
		return tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	@Override
	public String toString() {
		return "ColumnHeaderDO [columnHeader=" + columnHeader + ", tooltip="
				+ tooltip + "]";
	}
	
}
