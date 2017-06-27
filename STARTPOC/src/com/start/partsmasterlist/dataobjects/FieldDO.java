package com.start.partsmasterlist.dataobjects;

import java.util.List;

public class FieldDO {
	
	String fieldHeader;
	
	List<FieldValuesDO> fieldValuesDO;
	
	String fieldInput;

	public String getFieldHeader() {
		return fieldHeader;
	}

	public void setFieldHeader(String fieldHeader) {
		this.fieldHeader = fieldHeader;
	}
	
	public List<FieldValuesDO> getFieldValuesDO() {
		return fieldValuesDO;
	}

	public void setFieldValuesDO(List<FieldValuesDO> fieldValuesDO) {
		this.fieldValuesDO = fieldValuesDO;
	}
	
	public String getFieldInput() {
		return fieldInput;
	}

	public void setFieldInput(String fieldInput) {
		this.fieldInput = fieldInput;
	}

	@Override
	public String toString() {
		return "FieldDO [fieldHeader=" + fieldHeader + ", fieldValuesDO="
				+ fieldValuesDO + ", fieldInput=" + fieldInput + "]";
	}

}
