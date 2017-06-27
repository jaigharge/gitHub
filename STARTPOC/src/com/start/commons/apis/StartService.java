package com.start.commons.apis;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.start.commons.data.CommonsData;
import com.start.commons.dataobjects.MenuLinkDO;
import com.start.commons.dataobjects.SearchDO;
import com.start.home.data.HomeData;
import com.start.home.dataobjects.LatestNewsDO;
import com.start.home.dataobjects.MyStartDO;
import com.start.partsmasterlist.data.FilterData;
import com.start.partsmasterlist.dataobjects.CategoryDO;
import com.start.partsmasterlist.dataobjects.FieldDO;
import com.start.partsmasterlist.dataobjects.FilterDO;
import com.start.partsmasterlist.dataobjects.FilterSectionDO;
import com.start.partsmasterlist.dataobjects.ResultGridDO;
import com.start.partsmasterlist.dataobjects.ViewDO;
import com.start.partsmasterlist.dataobjects.ViewParentDO;
import com.start.utils.AppException;

/**
 * This class has APIs for overall START application.
 * 
 * @author jgharge
 */
@Path("/startService")
public class StartService {
	
	final static Logger logger = Logger.getLogger("StartService");

	/**
	 * Get List of Menu links and description.
	 * 
	 * @return List of MenuLinkDO
	 */
	@GET
	@Path("/getMenus")
	@Produces(MediaType.APPLICATION_JSON)
	public List<MenuLinkDO> getMenus() throws AppException{

		logger.info("Method call for getMenus.");
		CommonsData commonsData = new CommonsData();
		List<MenuLinkDO> menus = commonsData.getMenus();
		if (menus == null || menus.isEmpty()) {
			throw new AppException("Response from Web-service is null");
		}
		return menus;
	}
	
	/**
	 * Get My Start section Data.
	 * 
	 * @return MyStartDO
	 */
	@GET
	@Path("/getMyStartData")
	@Produces(MediaType.APPLICATION_JSON)	
	public MyStartDO getMyStartData() throws AppException{

		logger.info("Method call for getMyStartData.");
		HomeData homePageData = new HomeData();
		MyStartDO myStartData = homePageData.getMyStartData();
		
		if (myStartData == null) {
			throw new AppException("Response from Web-service is null");
		}
		return myStartData;
	}

	/**
	 * Get List of Search Values
	 * @param searchChars
	 * @return List of SearchDO.
	 * @throws AppException
	 */
	@POST
	@Path("/getSearchResults")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<SearchDO> getSearchResults(SearchDO searchChars)
			throws AppException {

		logger.info("Method call for getSearchResults...");
		List<SearchDO> searchList = null;

		CommonsData commonsData = new CommonsData();

		searchList = commonsData.getSearchResults(searchChars);

		if (searchList == null || searchList.isEmpty()) {
			throw new AppException("Response from Web-service is null");
		}
		return searchList;
	}

	/**
	 * Gets list of Latest News.
	 * 
	 * @return List of LatestNewsDO.
	 */
	@GET
	@Path("/getLatestNews")
	@Produces(MediaType.APPLICATION_JSON)
	public List<LatestNewsDO> getLatestNews() throws AppException {
		
		logger.info("Method call for getLatestNews.");
		HomeData newsData = new HomeData();

		List<LatestNewsDO> newList = newsData.getLatestNews();
		
		if (newList == null || newList.isEmpty()) {/*-?|UserInterfacePOC|jgharge|c0|*/
			throw new AppException("Response from Web-service is null");
		}/*-|UserInterfacePOC|jgharge|c0|?*/

		return newList;
	}
	
	@GET
	@Path("/getFilterData")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FilterDO> getFilterData() throws AppException {
		
		logger.info("Method call for getFilterData.");
		FilterData filterData = new FilterData();

		List<FilterDO> filterDataList = filterData.getFilterData();
		
		if (filterDataList == null || filterDataList.isEmpty()) {
			throw new AppException("Response from Web-service is null");
		}

		return filterDataList;
	}
	
	@POST
	@Path("/getFilterBlockData")
	@Produces(MediaType.APPLICATION_JSON)
	public FilterSectionDO getFilterBlockData(FilterDO filterDOInput) throws AppException {
		
		logger.info("Method call for getFilterBlockData.");
		FilterData filterData = new FilterData();
		
		String filterName = filterDOInput.getValue();

		FilterSectionDO fieldDO = filterData.getFilterBlockData(filterName);
		
		if (fieldDO == null) {
			throw new AppException("Response from Web-service is null");
		}

		return fieldDO;
	}
	/*@POST
	@Path("/getFilterBlockDataBasedOnFilterValue")
	@Produces(MediaType.APPLICATION_JSON)
	public FilterSectionDO getFilterBlockData(FilterDO filterDOInput) throws AppException {
		
		logger.info("Method call for getFilterBlockData.");
		FilterData filterData = new FilterData();
		
		String filterName = filterDOInput.getValue();

		FilterSectionDO fieldDO = filterData.getFilterBlockData(filterName);
		
		if (fieldDO == null) {
			throw new AppException("Response from Web-service is null");
		}

		return fieldDO;
	}*/
	/**
	 * Get List of Field Values
	 * @param fieldChars
	 * @return List of FieldDO.
	 * @throws AppException
	 */
	@POST
	@Path("/getFieldResults")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<FieldDO> getFieldResults(FieldDO fieldDO)
			throws AppException {

		logger.info("Method call for getFieldResults.");
		List<FieldDO> fieldList = null;

		FilterData filterData = new FilterData();
		
		String fieldInput = fieldDO.getFieldInput();

		fieldList = filterData.getFieldData(fieldInput);

		if (fieldList == null || fieldList.isEmpty()) {
			throw new AppException("Response from Web-service is null");
		}
		return fieldList;
	}
	/**
	 * Get List of Field Values
	 * @param fieldChars
	 * @return List of FieldDO.
	 * @throws AppException
	 */
	@POST
	@Path("/getViewResults")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ViewParentDO getViewResults(ViewDO viewDO)
			throws AppException {

		logger.info("Method call for getViewResults.");
		
		ViewParentDO viewDOList = null;

		FilterData filterData = new FilterData();
		
		String Value = viewDO.getValue();

		viewDOList = filterData.getViewResult(Value);

		if (viewDOList == null) {
			throw new AppException("Response from Web-service is null");
		}
		return viewDOList;
	}
	/**
	 * Get List of Field Values
	 * @param fieldChars
	 * @return List of FieldDO.
	 * @throws AppException
	 */
	@POST
	@Path("/getResultsByCategory")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public CategoryDO getResultsByCategory(CategoryDO categoryDO1)
			throws AppException {

		logger.info("Method call for getResultsByCategory.");
		
		FilterData filterData = new FilterData();
		
		CategoryDO categoryDO = filterData.getResultsByCategory(categoryDO1);

		if (categoryDO == null) {
			throw new AppException("Response from Web-service is null");
		}
		return categoryDO;
	}
	/**
	 * Get List of Field Values
	 * @param fieldChars
	 * @return List of FieldDO.
	 * @throws AppException
	 */
	@POST
	@Path("/getResultsByCategoryPrefix")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<CategoryDO> getResultsByCategoryPrefix(String categoryName)
			throws AppException {

		logger.info("Method call for getResultsByCategoryPrefix.");
		
		FilterData filterData = new FilterData();
		
		List<CategoryDO> categoryDO = filterData.getResultsByCategoryPrefix(categoryName);

		if (categoryDO == null) {
			throw new AppException("Response from Web-service is null");
		}
		return categoryDO;
	}
	/**
	 * Get List of Field Values
	 * @param fieldChars
	 * @return List of FieldDO.
	 * @throws AppException
	 */
	@GET
	@Path("/getDataGridResults")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ResultGridDO> getDataGridResults()
			throws AppException {

		logger.info("Method call for getDataGridResults.");
		List<ResultGridDO> gridDOList = null;

		FilterData filterData = new FilterData();
		
		gridDOList = filterData.getGridData();

		if (gridDOList == null || gridDOList.isEmpty()) {
			throw new AppException("Response from Web-service is null");
		}
		return gridDOList;
	}
	
}
