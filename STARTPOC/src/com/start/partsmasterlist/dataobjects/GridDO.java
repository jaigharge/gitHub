package com.start.partsmasterlist.dataobjects;

public class GridDO {
	
	private String partNumber;
	
	private String arrow;
	
	private String plant;

	private String contractPlan;
	
	private String br;
	
	private String supplyNumber;
	
	private String supplyIdx;
	
	private String supplyName;
	
	private String partName;
	
	private String zbInd;
	
	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getZbInd() {
		return zbInd;
	}

	public void setZbInd(String zbInd) {
		this.zbInd = zbInd;
	}

	public String getContractPlan() {
		return contractPlan;
	}

	public void setContractPlan(String contractPlan) {
		this.contractPlan = contractPlan;
	}

	public String getBr() {
		return br;
	}

	public void setBr(String br) {
		this.br = br;
	}

	public String getSupplyNumber() {
		return supplyNumber;
	}

	public void setSupplyNumber(String supplyNumber) {
		this.supplyNumber = supplyNumber;
	}

	public String getSupplyIdx() {
		return supplyIdx;
	}

	public void setSupplyIdx(String supplyIdx) {
		this.supplyIdx = supplyIdx;
	}

	public String getSupplyName() {
		return supplyName;
	}

	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getArrow() {
		return arrow;
	}

	public void setArrow(String arrow) {
		this.arrow = arrow;
	}

	public String getPlant() {
		return plant;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	@Override
	public String toString() {
		return "GridDO [partNumber=" + partNumber + ", arrow=" + arrow
				+ ", plant=" + plant + ", contractPlan=" + contractPlan
				+ ", br=" + br + ", supplyNumber=" + supplyNumber
				+ ", supplyIdx=" + supplyIdx + ", supplyName=" + supplyName
				+ ", partName=" + partName + ", zbInd=" + zbInd + "]";
	}
	
}
