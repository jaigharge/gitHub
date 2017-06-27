package com.start.partsmasterlist.dataobjects;

public class OperatorDO {
	
	String lable;
	
	String operator;

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	@Override
	public String toString() {
		return "OperatorDO [lable=" + lable + ", operator=" + operator + "]";
	}

}
