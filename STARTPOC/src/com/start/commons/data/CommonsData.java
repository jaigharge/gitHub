package com.start.commons.data;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.start.commons.dataobjects.MenuLinkDO;
import com.start.commons.dataobjects.SearchDO;

/**
 * This class has data for Commons area components like search box / menu links, etc.
 * 
 * @author jgharge
 */
public class CommonsData {
    
	final static Logger logger = Logger.getLogger("CommonsData");
	/**
	 * Gets list of Menus to be displayed in common pane.
	 * 
	 * @return List of MenuLinkDO
	 */
	public List<MenuLinkDO> getMenus(){
		
		logger.info("Method call of getMenus");
		
		List<MenuLinkDO> menuList = new ArrayList<MenuLinkDO>();
		MenuLinkDO menu = new MenuLinkDO();
		menu.setMenuId(1);
		menu.setMenuLevel(1);
		menu.setLabel("MySTART");
		menu.setDescription("My Start");
		menu.setLink("/mystart");		
		menuList.add(menu);
		
		menu = new MenuLinkDO();
		menu.setMenuId(2);
		menu.setMenuLevel(1);
		menu.setLabel("PARTS LIFECYCLE");
		menu.setDescription("Parts LifeCycle");
		menu.setLink("/partsLifeCycle");
		
			List<MenuLinkDO> menuListParts = new ArrayList<MenuLinkDO>();
			MenuLinkDO subMenus = new MenuLinkDO();			
			subMenus.setMenuId(1);
			subMenus.setMenuLevel(2);
			subMenus.setLabel("Part data");
			subMenus.setDescription("Part data");
			
				List<MenuLinkDO> menuPartsList = new ArrayList<MenuLinkDO>();
				MenuLinkDO subMenusList = new MenuLinkDO();				
				subMenusList.setMenuId(1);
				subMenusList.setMenuLevel(3);
				subMenusList.setLabel("Part Master Data List");
				subMenusList.setDescription("Part Master Data List");
				subMenusList.setLink("/partMasterDataList");	
				
				
					List<MenuLinkDO> recentActionsList = new ArrayList<MenuLinkDO>();
					MenuLinkDO recentActionMenu = new MenuLinkDO();				
					recentActionMenu.setMenuId(1);
					recentActionMenu.setMenuLevel(4);
					recentActionMenu.setLabel("A205_Verwendungsliste_alle Staffeln");
					recentActionMenu.setDescription("A205_Verwendungsliste_alle Staffeln");
					recentActionMenu.setLink("/A205_Verwendungsliste_alle Staffeln");	
					recentActionsList.add(recentActionMenu);
					
					recentActionMenu = new MenuLinkDO();				
					recentActionMenu.setMenuId(2);
					recentActionMenu.setMenuLevel(4);
					recentActionMenu.setLabel("138_W205_ASSY_Import_Staffel1_with col");
					recentActionMenu.setDescription("138_W205_ASSY_Import_Staffel1_with col");
					recentActionMenu.setLink("/138_W205_ASSY_Import_Staffel1_with col");	
					recentActionsList.add(recentActionMenu);
					
					subMenusList.setSubMenus(recentActionsList);
				
				menuPartsList.add(subMenusList);
					
				subMenusList = new MenuLinkDO();				
				subMenusList.setMenuId(2);
				subMenusList.setMenuLevel(3);
				subMenusList.setLabel("Parts Usage List");
				subMenusList.setDescription("Parts Usage List");
				subMenusList.setLink("/partUsageList");	
				menuPartsList.add(subMenusList);
				
				subMenusList = new MenuLinkDO();				
				subMenusList.setMenuId(3);
				subMenusList.setMenuLevel(3);
				subMenusList.setLabel("Parts single record");
				subMenusList.setDescription("Parts single record");
				subMenusList.setLink("/partSingleRecord");	
				menuPartsList.add(subMenusList);
				
				subMenusList = new MenuLinkDO();				
				subMenusList.setMenuId(4);
				subMenusList.setMenuLevel(3);
				subMenusList.setLabel("ZGS Differeces (Parts Masterdata List)");
				subMenusList.setDescription("ZGS Differeces (Parts Masterdata List)");
				subMenusList.setLink("/zgsDifferences");	
				menuPartsList.add(subMenusList);
				
				subMenusList = new MenuLinkDO();				
				subMenusList.setMenuId(5);
				subMenusList.setMenuLevel(3);
				subMenusList.setLabel("Supplier data");
				subMenusList.setDescription("Supplier data");
				subMenusList.setLink("/supplierData");	
				menuPartsList.add(subMenusList);
				
			subMenus.setSubMenus(menuPartsList);				
			menuListParts.add(subMenus);
						
			subMenus = new MenuLinkDO();			
			subMenus.setMenuId(2);
			subMenus.setMenuLevel(2);
			subMenus.setLabel("Contact data");
			subMenus.setDescription("Contact data");	
				
				List<MenuLinkDO> contactDataList = new ArrayList<MenuLinkDO>();
				MenuLinkDO contactData = new MenuLinkDO();
				contactData.setMenuId(1);
				contactData.setMenuLevel(3);
				contactData.setLabel("Internal contacts (Role)");
				contactData.setDescription("Internal contacts (Role)");	
				contactData.setLink("/internalContacts");
				contactDataList.add(contactData);
				
				contactData = new MenuLinkDO();
				contactData.setMenuId(2);
				contactData.setMenuLevel(3);
				contactData.setLabel("External contacts");
				contactData.setDescription("External contacts");	
				contactData.setLink("/externalContacts");
				contactDataList.add(contactData);
				
			subMenus.setSubMenus(contactDataList);
			menuListParts.add(subMenus);
			
			subMenus = new MenuLinkDO();			
			subMenus.setMenuId(3);
			subMenus.setMenuLevel(2);
			subMenus.setLabel("Data Import");
			subMenus.setDescription("Data Import");	
			
				List<MenuLinkDO> dataImportList = new ArrayList<MenuLinkDO>();
				MenuLinkDO dataImport = new MenuLinkDO();
				dataImport.setMenuId(1);
				dataImport.setMenuLevel(3);
				dataImport.setLabel("Generic fields");
				dataImport.setDescription("Generic fields");	
				dataImport.setLink("/genericFields");
				dataImportList.add(dataImport);
				
				dataImport = new MenuLinkDO();
				dataImport.setMenuId(2);
				dataImport.setMenuLevel(3);
				dataImport.setLabel("Plan dates");
				dataImport.setDescription("Plan dates");
				dataImport.setLink("/planDates");
				dataImportList.add(dataImport);
				
				dataImport = new MenuLinkDO();
				dataImport.setMenuId(3);
				dataImport.setMenuLevel(3);
				dataImport.setLabel("Contact data");
				dataImport.setDescription("Contact data");
				dataImport.setLink("/contactData");
				dataImportList.add(dataImport);
				
			subMenus.setSubMenus(dataImportList);
			menuListParts.add(subMenus);
			
		menu.setSubMenus(menuListParts);
		menuList.add(menu);
		
		menu = new MenuLinkDO();
		menu.setMenuId(3);
		menu.setMenuLevel(1);
		menu.setLabel("PROJECTS");
		menu.setDescription("Projects");
		menu.setLink("/projects");		
		menuList.add(menu);
		
		menu = new MenuLinkDO();
		menu.setMenuId(4);
		menu.setMenuLevel(1);
		menu.setLabel("COMMUNICATION");
		menu.setDescription("Communication");
		menu.setLink("/communication");
		menuList.add(menu);
		
		menu = new MenuLinkDO();
		menu.setMenuId(5);
		menu.setMenuLevel(1);
		menu.setLabel("PRE PRODUCTION TEST");
		menu.setDescription("Pre Production Test");
		menu.setLink("/preProductionTest");		
		menuList.add(menu);
		
		menu = new MenuLinkDO();
		menu.setMenuId(6);
		menu.setMenuLevel(1);
		menu.setLabel("KEM-EVALUATION");
		menu.setDescription("Kem Evaluation");
		menu.setLink("/kemEvaluation");
		menuList.add(menu);
		
		menu = new MenuLinkDO();
		menu.setMenuId(7);
		menu.setMenuLevel(1);
		menu.setLabel("PEM-CONTROLLING");
		menu.setDescription("Pem Controlling");
		menu.setLink("/pemControlling");
		menuList.add(menu);
		
		menu = new MenuLinkDO();
		menu.setMenuId(8);
		menu.setMenuLevel(1);
		menu.setLabel("REPORTS");
		menu.setDescription("Reports");
		menu.setLink("/reports");		
		menuList.add(menu);
		
		menu = new MenuLinkDO();
		menu.setMenuId(9);
		menu.setMenuLevel(1);
		menu.setLabel("ADMINISTRATION");
		menu.setDescription("Administration");
		menu.setLink("/administration");
		menuList.add(menu);	
		
		return menuList;
	}
	
	/**
	 * Gets list of Search Results to be displayed in common pane.
	 * 
	 * @return List of SearchDO 
	 */
	public List<SearchDO> getSearchResults(SearchDO searchChars){
		
		logger.info("Value of Search Input String in method getSearchResults is ->"+searchChars.getSearchInput());
		
		List<SearchDO> seachDOList = new ArrayList<SearchDO>();
		
		if(searchChars.getSearchInput() != null && searchChars.getSearchInput().length()>0){
			if("pro".equalsIgnoreCase(searchChars.getSearchInput())){
				
				SearchDO searchDO1 = new SearchDO();
				searchDO1.setSearchHeader("Lists");
				
				List<String> searchValues1 = new ArrayList<String>();
				String searchValue = "Production Lot Schedule Overview";
				searchValues1.add(searchValue);
				
				searchValue = "Project list";
				searchValues1.add(searchValue);
				
				searchValue = "Project single record";
				searchValues1.add(searchValue);
				
				searchDO1.setSearchValues(searchValues1);
				seachDOList.add(searchDO1);
				
				SearchDO searchDO2 = new SearchDO();
				searchDO2.setSearchHeader("Projects");
				
				List<String> searchValues2 = new ArrayList<String>();				
				searchValues2.add("Manage projects");
				searchValues2.add("Create strategic project");
				searchValues2.add("Create usages without date project");
				searchValues2.add("Create change bundle project");
				searchValues2.add("Create individual project");
				searchValues2.add("Create reporting project");
				
				searchDO2.setSearchValues(searchValues2);
				seachDOList.add(searchDO2);
			
			}
			else if("A20".equalsIgnoreCase(searchChars.getSearchInput())){
				
				SearchDO searchDO1 = new SearchDO();
				searchDO1.setSearchHeader("Parts");
				
				List<String> searchValues1 = new ArrayList<String>();				
				searchValues1.add("A 204 000 03 24");
				searchValues1.add("A 204 000 04 24");
				searchValues1.add("A 204 000 05 24");
				searchValues1.add("A 204 000 06 24");
				searchValues1.add("A 204 000 07 24");
				searchValues1.add("A 204 000 08 24");
				searchValues1.add("A 204 000 09 24");
				searchValues1.add("A 204 000 10 24");
				
				searchDO1.setSearchValues(searchValues1);
				
				seachDOList.add(searchDO1);
			}
		}
	    
		
		return seachDOList;
		
	}
}
