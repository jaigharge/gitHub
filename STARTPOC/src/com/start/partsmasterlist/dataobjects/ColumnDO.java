package com.start.partsmasterlist.dataobjects;

public class ColumnDO {
	
	private String columnName;

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	@Override
	public String toString() {
		return "ColumnDO [columnName=" + columnName + "]";
	}
}
