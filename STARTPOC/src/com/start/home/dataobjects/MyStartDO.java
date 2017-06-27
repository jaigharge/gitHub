/**
 * 
 */
package com.start.home.dataobjects;

import java.util.List;

/**
 * 
 * This DO gets List of all Objects of MyStart Box on Home Page.
 * 
 * @author jgharge
 *
 */
public class MyStartDO {

		private List<PartsLifeCycleDO> partsLifeCycle;
		
		private List<KemEvaluationDO> kemEvaluation;
		
		private List<ProjectDO> projects;
		
		private List<ReportsDO> reports;
		
		private List<SupplierCommunicationDO> supplierCommunication;
		
		private FavouriteListDO favouriteList;

		public List<PartsLifeCycleDO> getPartsLifeCycle() {
			return partsLifeCycle;
		}

		public void setPartsLifeCycle(List<PartsLifeCycleDO> partsLifeCycle) {
			this.partsLifeCycle = partsLifeCycle;
		}

		public List<KemEvaluationDO> getKemEvaluation() {
			return kemEvaluation;
		}

		public void setKemEvaluation(List<KemEvaluationDO> kemEvaluation) {
			this.kemEvaluation = kemEvaluation;
		}

		public List<ProjectDO> getProjects() {
			return projects;
		}

		public void setProjects(List<ProjectDO> projects) {
			this.projects = projects;
		}

		public List<ReportsDO> getReports() {
			return reports;
		}

		public void setReports(List<ReportsDO> reports) {
			this.reports = reports;
		}

		public List<SupplierCommunicationDO> getSupplierCommunication() {
			return supplierCommunication;
		}

		public void setSupplierCommunication(
				List<SupplierCommunicationDO> supplierCommunication) {
			this.supplierCommunication = supplierCommunication;
		}

		public FavouriteListDO getFavouriteList() {
			return favouriteList;
		}

		public void setFavouriteList(FavouriteListDO favouriteList) {
			this.favouriteList = favouriteList;
		}

		@Override
		public String toString() {
			return "MyStartDO [partsLifeCycle=" + partsLifeCycle
					+ ", kemEvaluation=" + kemEvaluation + ", projects="
					+ projects + ", reports=" + reports
					+ ", supplierCommunication=" + supplierCommunication
					+ ", favouriteList=" + favouriteList + "]";
		}
		
		
}
