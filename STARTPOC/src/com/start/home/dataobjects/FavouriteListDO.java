/**
 * 
 */
package com.start.home.dataobjects;

import java.util.List;

/**
 * @author jgharge
 *
 */
public class FavouriteListDO {

	private String label;

	private String link;
	
	private String description;
	
	private List<PartsLifeCycleDO> partsLifeCycle;
	
	private List<ReportsDO> reports;
	
	private List<PreProductionTestBatchDO> preProductionTestBatch;
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public List<PartsLifeCycleDO> getPartsLifeCycle() {
		return partsLifeCycle;
	}

	public void setPartsLifeCycle(List<PartsLifeCycleDO> partsLifeCycle) {
		this.partsLifeCycle = partsLifeCycle;
	}

	public List<ReportsDO> getReports() {
		return reports;
	}

	public void setReports(List<ReportsDO> reports) {
		this.reports = reports;
	}

	public List<PreProductionTestBatchDO> getPreProductionTestBatch() {
		return preProductionTestBatch;
	}

	public void setPreProductionTestBatch(
			List<PreProductionTestBatchDO> preProductionTestBatch) {
		this.preProductionTestBatch = preProductionTestBatch;
	}

	@Override
	public String toString() {
		return "FavouriteListDO [label=" + label + ", link=" + link
				+ ", description=" + description + ", partsLifeCycle="
				+ partsLifeCycle + ", reports=" + reports
				+ ", preProductionTestBatch=" + preProductionTestBatch + "]";
	}

	
}
