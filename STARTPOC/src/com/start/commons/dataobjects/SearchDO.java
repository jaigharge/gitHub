package com.start.commons.dataobjects;

import java.util.List;

public class SearchDO {
	
	private String searchHeader;
	
	private String searchInput;
	
	private List<String> searchValues;

	
	public String getSearchHeader() {
		return searchHeader;
	}

	public void setSearchHeader(String searchHeader) {
		this.searchHeader = searchHeader;
	}
	
	public String getSearchInput() {
		return searchInput;
	}

	public void setSearchInput(String searchInput) {
		this.searchInput = searchInput;
	}

	public List<String> getSearchValues() {
		return searchValues;
	}

	public void setSearchValues(List<String> searchValues) {
		this.searchValues = searchValues;
	}

	@Override
	public String toString() {
		return "SearchDO [searchHeader=" + searchHeader + ", searchInput="
				+ searchInput + ", searchValues=" + searchValues + "]";
	}
	
	
	
}
