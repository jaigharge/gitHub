package com.start.home.data;

import java.util.ArrayList;
import java.util.List;

import com.start.home.dataobjects.FavouriteListDO;
import com.start.home.dataobjects.KemEvaluationDO;
import com.start.home.dataobjects.LatestNewsDO;
import com.start.home.dataobjects.MyStartDO;
import com.start.home.dataobjects.PartsLifeCycleDO;
import com.start.home.dataobjects.PreProductionTestBatchDO;
import com.start.home.dataobjects.ProjectDO;
import com.start.home.dataobjects.ReportsDO;
import com.start.home.dataobjects.SupplierCommunicationDO;

/**
 * This class contains data for MyStart page.
 * 
 * @author jgharge
 */
public class HomeData {

	
	/**
	 * Gets Latest News data.
	 * 
	 * @return List of LatestNewsDO.
	 */
	public List<LatestNewsDO> getLatestNews(){
		
		List<LatestNewsDO> latestNews = new ArrayList<LatestNewsDO>();
		
		LatestNewsDO news = new LatestNewsDO();		
		news.setLastestNewsId(1);
		news.setLabel("Downtime of start on December, 26th, 2015");
		news.setDescription("Downtime of start on December, 26th, 2015");
		news.setLink("/newsection/newsId1");
		
		latestNews.add(news);
		
		news = new LatestNewsDO();
		news.setLastestNewsId(2);
		news.setLabel("Downtime of start on December, 16th, 2015");
		news.setDescription("Downtime of start on December, 16th, 2015");
		news.setLink("/newsection/newsId2");
		
		latestNews.add(news);
		
		news = new LatestNewsDO();
		news.setLastestNewsId(2);
		news.setLabel("Downtime of start on December, 6th, 2015");
		news.setDescription("Downtime of start on December, 6th, 2015");
		news.setLink("/newsection/newsId2");
		
		latestNews.add(news);
		
		return latestNews;
	}
	
	
	/**
	 * Gets Data of MyStart box on Home Page.
	 * 
	 * @return
	 */
	public MyStartDO getMyStartData(){
		
		MyStartDO myStartDO = new MyStartDO();
		
			List<PartsLifeCycleDO> partsLifeCycleList = new ArrayList<PartsLifeCycleDO>();
			PartsLifeCycleDO partsLifeCycle = new PartsLifeCycleDO();
			partsLifeCycle.setDescription("A205_Verwendungsliste_alle Staffeln");
			partsLifeCycle.setLabel("A205_Verwendungsliste_alle Staffeln");
			partsLifeCycle.setLink("/partsLifeCycle");
			partsLifeCycleList.add(partsLifeCycle);
			
			partsLifeCycle = new PartsLifeCycleDO();
			partsLifeCycle.setDescription("138_W205_ASSY_Import_Staffel1_with color");
			partsLifeCycle.setLabel("138_W205_ASSY_Import_Staffel1_with color");
			partsLifeCycle.setLink("/partsLifeCycle");
			partsLifeCycleList.add(partsLifeCycle);
			
			partsLifeCycle = new PartsLifeCycleDO();
			partsLifeCycle.setDescription("138_C205_ALL_Gesamt_MO+RB_Staffel3");
			partsLifeCycle.setLabel("138_C205_ALL_Gesamt_MO+RB_Staffel3");
			partsLifeCycle.setLink("/partsLifeCycle");
			partsLifeCycleList.add(partsLifeCycle);
			
			partsLifeCycle = new PartsLifeCycleDO();
			partsLifeCycle.setDescription("222_EXT4_Bemukurve 222 Abteilung Q/KE_TM_005_Staffel1_MO (farbig) (V)");
			partsLifeCycle.setLabel("222_EXT4_Bemukurve 222 Abteilung Q/KE_TM_005_Staffel1_MO (farbig) (V)");
			partsLifeCycle.setLink("/partsLifeCycle");
			partsLifeCycleList.add(partsLifeCycle);
			
			partsLifeCycle = new PartsLifeCycleDO();
			partsLifeCycle.setDescription("Gesamt_010_ÄJ_15/X_alle_Werke_STRW=Y");
			partsLifeCycle.setLabel("Gesamt_010_ÄJ_15/X_alle_Werke_STRW=Y");
			partsLifeCycle.setLink("/partsLifeCycle");
			partsLifeCycleList.add(partsLifeCycle);
			
			partsLifeCycle = new PartsLifeCycleDO();
			partsLifeCycle.setDescription("W67_GET-Teile_Lief_Export");
			partsLifeCycle.setLabel("W67_GET-Teile_Lief_Export");
			partsLifeCycle.setLink("/partsLifeCycle");
			partsLifeCycleList.add(partsLifeCycle);
		
		myStartDO.setPartsLifeCycle(partsLifeCycleList);
		
			List<KemEvaluationDO> kemEvaluationList = new ArrayList<KemEvaluationDO>();
			KemEvaluationDO kemEvaluation = new KemEvaluationDO();
			kemEvaluation.setDescription("12 EVS all processed KEMs");
			kemEvaluation.setLabel("12 EVS all processed KEMs");
			kemEvaluation.setLink("/kemEvaluation");
			kemEvaluationList.add(kemEvaluation);
			
			kemEvaluation = new KemEvaluationDO();
			kemEvaluation.setDescription("02 KEMs to be decided ECC");
			kemEvaluation.setLabel("02 KEMs to be decided ECC");
			kemEvaluation.setLink("/kemEvaluation");
			kemEvaluationList.add(kemEvaluation);
			
			kemEvaluation = new KemEvaluationDO();
			kemEvaluation.setDescription("12 KEMs older than 5 days");
			kemEvaluation.setLabel("12 KEMs older than 5 days");
			kemEvaluation.setLink("/kemEvaluation");
			kemEvaluationList.add(kemEvaluation);
		
		myStartDO.setKemEvaluation(kemEvaluationList);
		
			List<ProjectDO> projectList = new ArrayList<ProjectDO>();
			ProjectDO project = new ProjectDO();
			project.setDescription("07_C/X117_MOPF_Zuordnung_Anlauf_DI_SCM");
			project.setLabel("07_C/X117_MOPF_Zuordnung_Anlauf_DI_SCM");
			project.setLink("/projects");
			projectList.add(project);
			
			project = new ProjectDO();
			project.setDescription("W67_AKS_Gesamttopf_Master_Teile_entfernen_GY");
			project.setLabel("W67_AKS_Gesamttopf_Master_Teile_entfernen_GY");
			project.setLink("/projects");
			projectList.add(project);
			
			project = new ProjectDO();
			project.setDescription("Umstellung_C117_W246_805+055_W371");
			project.setLabel("Umstellung_C117_W246_805+055_W371");
			project.setLink("/projects");
			projectList.add(project);
			
		myStartDO.setProjects(projectList);	
		
			List<ReportsDO> reportsList = new ArrayList<ReportsDO>();
			ReportsDO reports = new ReportsDO();
			reports.setDescription("C/X117_MOPF_Bemu_farbig_SLF_Cavansitblau_xinkl_AMG");
			reports.setLabel("C/X117_MOPF_Bemu_farbig_SLF_Cavansitblau_xinkl_AMG");
			reports.setLink("/reports");
			reportsList.add(reports);
			
			reports = new ReportsDO();
			reports.setDescription("W212_FG22_Bemusterungskurve");
			reports.setLabel("W212_FG22_Bemusterungskurve");
			reports.setLink("/reports");
			reportsList.add(reports);
			
		myStartDO.setReports(reportsList);
		
			List<SupplierCommunicationDO> supplierList = new ArrayList<SupplierCommunicationDO>();
			SupplierCommunicationDO supplier = new SupplierCommunicationDO();
			supplier.setDescription("BR246_012_LK_TEVOs AMG_W054+W371");
			supplier.setLabel("BR246_012_LK_TEVOs AMG_W054+W371");
			supplier.setLink("/supplier");
			supplierList.add(supplier);
			
			supplier = new SupplierCommunicationDO();
			supplier.setDescription("C/X117_MOPF_LK_BS_SWFT_Termine_fehlen");
			supplier.setLabel("C/X117_MOPF_LK_BS_SWFT_Termine_fehlen");
			supplier.setLink("/supplier");
			supplierList.add(supplier);
			
		myStartDO.setSupplierCommunication(supplierList);
		
			FavouriteListDO favouritesList = new FavouriteListDO();
				List<PartsLifeCycleDO> partsLifeCycleListFav = new ArrayList<PartsLifeCycleDO>();
				PartsLifeCycleDO partsLifeCycleFav = new PartsLifeCycleDO();
				partsLifeCycleFav.setDescription("205_EXT4_043_W - OM651_205W404_alle_Werke_(Mo");
				partsLifeCycleFav.setLabel("205_EXT4_043_W - OM651_205W404_alle_Werke_(Mo");
				partsLifeCycleFav.setLink("/partsLifeCycle");
				partsLifeCycleListFav.add(partsLifeCycle);
				
				partsLifeCycleFav = new PartsLifeCycleDO();
				partsLifeCycleFav.setDescription("205_EXT1_W205_W067_MO_010_Staffel1_Farbneutral");
				partsLifeCycleFav.setLabel("205_EXT1_W205_W067_MO_010_Staffel1_Farbneutral");
				partsLifeCycleFav.setLink("/partsLifeCycle");
				partsLifeCycleListFav.add(partsLifeCycle);
				
			favouritesList.setPartsLifeCycle(partsLifeCycleListFav);
			
				List<PreProductionTestBatchDO> preProductionTestBatchList = new ArrayList<PreProductionTestBatchDO>();
				PreProductionTestBatchDO preProductionTestBatch = new PreProductionTestBatchDO();
				preProductionTestBatch.setDescription("W67_S205_83T_Baulosüberprüfung");
				preProductionTestBatch.setLabel("W67_S205_83T_Baulosüberprüfung");
				preProductionTestBatch.setLink("/preProduction");
				preProductionTestBatchList.add(preProductionTestBatch);
				
				preProductionTestBatch = new PreProductionTestBatchDO();
				preProductionTestBatch.setDescription("205_Baulos3A_mit_JIS");
				preProductionTestBatch.setLabel("205_Baulos3A_mit_JIS");
				preProductionTestBatch.setLink("/preProduction");
				preProductionTestBatchList.add(preProductionTestBatch);
				
			favouritesList.setPreProductionTestBatch(preProductionTestBatchList);
			
				List<ReportsDO> reportsListFav = new ArrayList<ReportsDO>();
				ReportsDO reportsFav = new ReportsDO();
				reportsFav.setDescription("W205_P513-P138_Cycle2_Overall_Assy+BiW_PP");
				reportsFav.setLabel("W205_P513-P138_Cycle2_Overall_Assy+BiW_PP");
				reportsFav.setLink("/reportsFav");
				reportsListFav.add(reportsFav);
				
				reportsFav = new ReportsDO();
				reportsFav.setDescription("W205_P513-P138_Overall_Assy+BiW_PPFB sampl");
				reportsFav.setLabel("W205_P513-P138_Overall_Assy+BiW_PPFB sampl");
				reportsFav.setLink("/reportsFav");
				reportsListFav.add(reportsFav);
				
			favouritesList.setReports(reportsListFav);
				
		myStartDO.setFavouriteList(favouritesList);
		
		return myStartDO;
		
	}
	
}
