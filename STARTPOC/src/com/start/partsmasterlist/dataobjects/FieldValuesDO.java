package com.start.partsmasterlist.dataobjects;

import java.util.List;

public class FieldValuesDO {
	
	List<OperatorDO> operatorDO;
	
	List<ValueDO> valueDO;
	
	List<String> fieldvalues;
	
	public List<String> getFieldvalues() {
		return fieldvalues;
	}

	public void setFieldvalues(List<String> fieldvalues) {
		this.fieldvalues = fieldvalues;
	}

	public List<OperatorDO> getOperatorDO() {
		return operatorDO;
	}

	public void setOperatorDO(List<OperatorDO> operatorDO) {
		this.operatorDO = operatorDO;
	}

	public List<ValueDO> getValueDO() {
		return valueDO;
	}

	public void setValueDO(List<ValueDO> valueDO) {
		this.valueDO = valueDO;
	}

	@Override
	public String toString() {
		return "FieldValuesDO [operatorDO=" + operatorDO + ", valueDO="
				+ valueDO + "]";
	}

}
