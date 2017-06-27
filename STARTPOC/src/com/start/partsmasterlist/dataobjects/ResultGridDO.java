package com.start.partsmasterlist.dataobjects;

import java.util.List;

public class ResultGridDO {
	
	private List<ColumnHeaderDO> columnHeaders;
	
	private List<GridDO> gridValues;

	public List<ColumnHeaderDO> getColumnHeaders() {
		return columnHeaders;
	}

	public void setColumnHeaders(List<ColumnHeaderDO> columnHeaders) {
		this.columnHeaders = columnHeaders;
	}

	public List<GridDO> getGridValues() {
		return gridValues;
	}

	public void setGridValues(List<GridDO> gridValues) {
		this.gridValues = gridValues;
	}

	@Override
	public String toString() {
		return "ResultGridDO [columnHeaders=" + columnHeaders + ", gridValues="
				+ gridValues + "]";
	}
	
}
