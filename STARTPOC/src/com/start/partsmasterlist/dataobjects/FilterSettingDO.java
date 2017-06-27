package com.start.partsmasterlist.dataobjects;

public class FilterSettingDO {
	
	boolean is_ColorNeutralPartsMasterData;
	
	boolean is_ColorNeutralPartsMasterdataforColoredParts;
	
	boolean is_ColoredParts;
	
	String validFrom;
	
	String ValidTo;
	
	boolean is_HighestProgressiveChangeNumberInSelectedInterval;
	
	boolean is_IncludePartsWithoutMasterData;
	
	boolean is_AutomaticViewFilter;

	public boolean Is_ColorNeutralPartsMasterData() {
		return is_ColorNeutralPartsMasterData;
	}

	public void setIs_ColorNeutralPartsMasterData(
			boolean is_ColorNeutralPartsMasterData) {
		this.is_ColorNeutralPartsMasterData = is_ColorNeutralPartsMasterData;
	}

	public boolean isIs_ColorNeutralPartsMasterdataforColoredParts() {
		return is_ColorNeutralPartsMasterdataforColoredParts;
	}

	public void setIs_ColorNeutralPartsMasterdataforColoredParts(
			boolean is_ColorNeutralPartsMasterdataforColoredParts) {
		this.is_ColorNeutralPartsMasterdataforColoredParts = is_ColorNeutralPartsMasterdataforColoredParts;
	}

	public boolean isIs_ColoredParts() {
		return is_ColoredParts;
	}

	public void setIs_ColoredParts(boolean is_ColoredParts) {
		this.is_ColoredParts = is_ColoredParts;
	}

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidTo() {
		return ValidTo;
	}

	public void setValidTo(String validTo) {
		ValidTo = validTo;
	}

	public boolean isIs_HighestProgressiveChangeNumberInSelectedInterval() {
		return is_HighestProgressiveChangeNumberInSelectedInterval;
	}

	public void setIs_HighestProgressiveChangeNumberInSelectedInterval(
			boolean is_HighestProgressiveChangeNumberInSelectedInterval) {
		this.is_HighestProgressiveChangeNumberInSelectedInterval = is_HighestProgressiveChangeNumberInSelectedInterval;
	}

	public boolean isIs_IncludePartsWithoutMasterData() {
		return is_IncludePartsWithoutMasterData;
	}

	public void setIs_IncludePartsWithoutMasterData(
			boolean is_IncludePartsWithoutMasterData) {
		this.is_IncludePartsWithoutMasterData = is_IncludePartsWithoutMasterData;
	}

	public boolean isIs_AutomaticViewFilter() {
		return is_AutomaticViewFilter;
	}

	public void setIs_AutomaticViewFilter(boolean is_AutomaticViewFilter) {
		this.is_AutomaticViewFilter = is_AutomaticViewFilter;
	}

	@Override
	public String toString() {
		return "FilterSettingDO [is_ColorNeutralPartsMasterData="
				+ is_ColorNeutralPartsMasterData
				+ ", is_ColorNeutralPartsMasterdataforColoredParts="
				+ is_ColorNeutralPartsMasterdataforColoredParts
				+ ", is_ColoredParts=" + is_ColoredParts + ", validFrom="
				+ validFrom + ", ValidTo=" + ValidTo
				+ ", is_HighestProgressiveChangeNumberInSelectedInterval="
				+ is_HighestProgressiveChangeNumberInSelectedInterval
				+ ", is_IncludePartsWithoutMasterData="
				+ is_IncludePartsWithoutMasterData
				+ ", is_AutomaticViewFilter=" + is_AutomaticViewFilter + "]";
	}
	
	

}
