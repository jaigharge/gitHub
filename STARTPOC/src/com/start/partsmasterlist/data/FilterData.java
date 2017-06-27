package com.start.partsmasterlist.data;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.start.partsmasterlist.dataobjects.CategoryDO;
import com.start.partsmasterlist.dataobjects.ColumnDO;
import com.start.partsmasterlist.dataobjects.ColumnHeaderDO;
import com.start.partsmasterlist.dataobjects.ElementDO;
import com.start.partsmasterlist.dataobjects.FieldDO;
import com.start.partsmasterlist.dataobjects.FieldValuesDO;
import com.start.partsmasterlist.dataobjects.FilterBlockDO;
import com.start.partsmasterlist.dataobjects.FilterDO;
import com.start.partsmasterlist.dataobjects.FilterPlantsDO;
import com.start.partsmasterlist.dataobjects.FilterSectionDO;
import com.start.partsmasterlist.dataobjects.FilterSettingDO;
import com.start.partsmasterlist.dataobjects.GridDO;
import com.start.partsmasterlist.dataobjects.OperatorDO;
import com.start.partsmasterlist.dataobjects.PlantsDO;
import com.start.partsmasterlist.dataobjects.PlantsValuesDO;
import com.start.partsmasterlist.dataobjects.ResultGridDO;
import com.start.partsmasterlist.dataobjects.ValueDO;
import com.start.partsmasterlist.dataobjects.ViewDO;
import com.start.partsmasterlist.dataobjects.ViewParentDO;

public class FilterData {
	
	final static Logger logger = Logger.getLogger("FilterData");
	
	public List<FilterDO> getFilterData(){
		
		List<FilterDO> filterList = new ArrayList<FilterDO>();
		
		FilterDO filterDO1 = new FilterDO();
		
			filterDO1.setValue("P138 Parts List with Multiple Suppliers");
			filterDO1.setName("P138 Parts List with Multiple Suppliers");
			filterDO1.setDescription("Plant 138 Parts List with multiple suppliers");
			filterDO1.setIs_Read_Only(true);
			filterDO1.setIs_Standard_filter(false);
			filterDO1.setSubscribed(true);
		
		filterList.add(filterDO1);
		
		FilterDO filterDO2 = new FilterDO();
		
			filterDO2.setValue("205_010_Gesamtprojekt_205W_alle_Werke_(Montage)");
			filterDO2.setName("205_010_Gesamtprojekt_205W_alle_Werke_(Montage)");
			filterDO2.setDescription("Dia P_(Montage)");
			filterDO2.setIs_Read_Only(true);
			filterDO2.setIs_Standard_filter(false);
			filterDO2.setSubscribed(true);
		
		filterList.add(filterDO2);
		
		return filterList;
	}
	
	public List<FieldDO> getFieldData(String fieldInput){
		
		List<FieldDO> fieldList = new ArrayList<FieldDO>();
		
			logger.info("Value of fieldInput is :-> "+fieldInput);
			if("pro".equalsIgnoreCase(fieldInput)){
				
				/*
				 * Field Data1
				 */
				FieldDO fieldDO1 = new FieldDO();
					fieldDO1.setFieldHeader("Milestone");
				
				List<FieldValuesDO> fieldValuesDO = new ArrayList<FieldValuesDO>();	
					FieldValuesDO FieldValuesDO1 = new FieldValuesDO();
					FieldValuesDO FieldValuesDO2 = new FieldValuesDO();
				
				List<String> filterValueList = new ArrayList<String>();	
					String filter1 = "Prototype parts actual";
				filterValueList.add(filter1);	
					
				List<String> filterValueList2 = new ArrayList<String>();	
					String filter2 = "Prototype parts expected date";
				filterValueList2.add(filter2);	
					
					//Setting data to operator
					List<OperatorDO> operatorList = new ArrayList<OperatorDO>();
					
						OperatorDO operatorDO1 = new OperatorDO();
						operatorDO1.setLable("=");
							
						OperatorDO operatorDO2 = new OperatorDO();
						operatorDO2.setLable("!=");
						
						OperatorDO operatorDO3 = new OperatorDO();
						operatorDO3.setLable(">");
						
						OperatorDO operatorDO4 = new OperatorDO();
						operatorDO4.setLable("<");
						
						OperatorDO operatorDO5 = new OperatorDO();
						operatorDO5.setLable("&#8805");
						
						OperatorDO operatorDO6 = new OperatorDO();
						operatorDO6.setLable("&#8804");
						
						operatorList.add(operatorDO1);
						operatorList.add(operatorDO2);
						operatorList.add(operatorDO3);
						operatorList.add(operatorDO4);
						operatorList.add(operatorDO5);
						operatorList.add(operatorDO6);
			
					//Setting Data to value
					List<ValueDO> valueList = new ArrayList<ValueDO>();
						
						ValueDO valuDO1 = new ValueDO();
						valuDO1.setValue("");
						valueList.add(valuDO1);
						
						ValueDO valuDO2 = new ValueDO();
						valuDO2.setValue("date");
						valueList.add(valuDO2);
						
					FieldValuesDO1.setFieldvalues(filterValueList);
					FieldValuesDO1.setOperatorDO(operatorList);
					FieldValuesDO1.setValueDO(valueList);
					
					FieldValuesDO2.setFieldvalues(filterValueList2);
					FieldValuesDO2.setOperatorDO(operatorList);
					FieldValuesDO2.setValueDO(valueList);
				
					
					fieldValuesDO.add(FieldValuesDO1);
					fieldValuesDO.add(FieldValuesDO2);
					
					fieldDO1.setFieldValuesDO(fieldValuesDO);
					fieldList.add(fieldDO1);
			
				/*
				 * Field Data3
				 */
				FieldDO fieldDO3 = new FieldDO();
					fieldDO3.setFieldHeader("Project");
		
				List<FieldValuesDO> fieldValuesDO3 = new ArrayList<FieldValuesDO>();	
					FieldValuesDO FieldValuesDO3 = new FieldValuesDO();
					FieldValuesDO FieldValuesDO4 = new FieldValuesDO();
		
				List<String> filterValueList3 = new ArrayList<String>();	
					String filter3 = "Project ident";
				filterValueList3.add(filter3);	
					
				List<String> filterValueList4 = new ArrayList<String>();	
					String filter4 = "Project short name";
				filterValueList4.add(filter4);
				
				List<OperatorDO> operatorList3 = new ArrayList<OperatorDO>();
				
				OperatorDO operatorDO3_1 = new OperatorDO();
				operatorDO3_1.setLable("=");
					
				OperatorDO operatorDO3_2 = new OperatorDO();
				operatorDO3_2.setLable("!=");
				
				operatorList3.add(operatorDO3_1);
				operatorList3.add(operatorDO3_2);
	
			//Setting Data to value
			List<ValueDO> valueList3 = new ArrayList<ValueDO>();
				
				ValueDO valuDO3_1 = new ValueDO();
				valuDO3_1.setValue("");
				valueList3.add(valuDO3_1);

				ValueDO valuDO3_2 = new ValueDO();
				valuDO3_2.setValue("text");
				valueList3.add(valuDO3_2);
		
				FieldValuesDO3.setFieldvalues(filterValueList3);
				FieldValuesDO3.setOperatorDO(operatorList3);
				FieldValuesDO3.setValueDO(valueList3);
				
				FieldValuesDO4.setFieldvalues(filterValueList4);
				FieldValuesDO4.setOperatorDO(operatorList3);
				FieldValuesDO4.setValueDO(valueList3);
			
				fieldValuesDO3.add(FieldValuesDO3);
				fieldValuesDO3.add(FieldValuesDO4);
				
				fieldDO3.setFieldValuesDO(fieldValuesDO3);
		
			fieldList.add(fieldDO3);
			
			
			/*
			 * Field data 5
			 */
				FieldDO fieldDO5 = new FieldDO();
					fieldDO5.setFieldHeader("Smaragd");
		
				List<FieldValuesDO> fieldValuesDOList5 = new ArrayList<FieldValuesDO>();	
					FieldValuesDO FieldValuesDO5 = new FieldValuesDO();
		
				List<String> filterValueList5 = new ArrayList<String>();	
			
				String filter5 = "Prototype Batches";
				filterValueList5.add(filter5);	
		
				List<OperatorDO> operatorList5 = new ArrayList<OperatorDO>();
				
				OperatorDO operatorDO5_1 = new OperatorDO();
				operatorDO5_1.setLable("=");
					
				OperatorDO operatorDO5_2 = new OperatorDO();
				operatorDO5_2.setLable("!=");
				
				operatorList5.add(operatorDO5_1);
				operatorList5.add(operatorDO5_2);
		
			//Setting Data to value
			List<ValueDO> valueList5 = new ArrayList<ValueDO>();
				
				ValueDO valuDO5_1 = new ValueDO();
				valuDO5_1.setValue("");
				valueList5.add(valuDO5_1);
		
				ValueDO valuDO5_2 = new ValueDO();
				valuDO5_2.setValue("text");
				valueList5.add(valuDO5_2);
		
				FieldValuesDO5.setFieldvalues(filterValueList5);
				FieldValuesDO5.setOperatorDO(operatorList5);
				FieldValuesDO5.setValueDO(valueList5);
			
				fieldValuesDOList5.add(FieldValuesDO5);
				fieldDO5.setFieldValuesDO(fieldValuesDOList5);
		
			fieldList.add(fieldDO5);
			
			}
		return fieldList;
	}
	
	public FilterSectionDO getFilterBlockData(String filterName){
		
		FilterSectionDO filterSectionDO = new FilterSectionDO();
		
		List<FilterBlockDO> filterBlockDO = new ArrayList<FilterBlockDO>();
		
		FilterBlockDO filterBlockDO1 = new FilterBlockDO();
		FilterBlockDO filterBlockDO2 = new FilterBlockDO();
		FilterBlockDO filterBlockDO3 = new FilterBlockDO();
		
		List<FieldDO> FieldDOList_For_Block1 = new ArrayList<FieldDO>();
		List<FieldDO> FieldDOList_For_Block2 = new ArrayList<FieldDO>();
		List<FieldDO> FieldDOList_For_Block3 = new ArrayList<FieldDO>();
		
		
		FilterSettingDO filterSettingDO1 = new FilterSettingDO();
		
		FilterPlantsDO filterPlantsDO = new FilterPlantsDO();
		
		List<PlantsDO> plantsDOList = new ArrayList<PlantsDO>();
		
		if(("P138 Parts List with Multiple Suppliers").equalsIgnoreCase(filterName)){
		
		 /* 
		 ****************Filter Block Data 1 ***************
		 ****************Filter Data 1 *********************
		 */
		 
		FieldDO fieldDO1 = new FieldDO();
		
			fieldDO1.setFieldHeader("Parts Master Data");
			
				List<FieldValuesDO> fieldValueMainList = new ArrayList<FieldValuesDO>();
			
				List<String> fieldValueList = new ArrayList<String>();
					fieldValueList.add("Purchase Key");
		
				//Setting data to operator
				List<OperatorDO> operatorList = new ArrayList<OperatorDO>();
				
					OperatorDO operatorDO1 = new OperatorDO();
					operatorDO1.setLable("#=");
						
					OperatorDO operatorDO2 = new OperatorDO();
					operatorDO2.setLable("!=");
					operatorList.add(operatorDO1);
					operatorList.add(operatorDO2);
		
				//Setting Data to value
				List<ValueDO> valueList = new ArrayList<ValueDO>();
					ValueDO valuDO1 = new ValueDO();
					valuDO1.setValue("*7*");
					valueList.add(valuDO1);
			
				//Setting values to FieldValuesDO
				FieldValuesDO fieldValues = new FieldValuesDO();
					fieldValues.setFieldvalues(fieldValueList);
					fieldValues.setOperatorDO(operatorList);
					fieldValues.setValueDO(valueList);
			
				fieldValueMainList.add(fieldValues);
					
			fieldDO1.setFieldValuesDO(fieldValueMainList);
					
			FieldDOList_For_Block1.add(fieldDO1);
		
		/*  
		 ****************Filter Data 2 ***************
		 */
		FieldDO fieldDO2 = new FieldDO();
			fieldDO2.setFieldHeader("Usage");
			
				List<FieldValuesDO> fieldValueMainList2 = new ArrayList<FieldValuesDO>();
			
				List<String> fieldValueList2 = new ArrayList<String>();
				fieldValueList2.add("Model series");
		
				//Setting data to operator
				List<OperatorDO> operatorList2 = new ArrayList<OperatorDO>();
				
					OperatorDO operatorDO2_1 = new OperatorDO();
					operatorDO2_1.setLable( "#=");
					OperatorDO operatorDO2_2 = new OperatorDO();
					operatorDO2_2.setLable("!=");
					operatorList2.add(operatorDO2_1);
					operatorList2.add(operatorDO2_2);
		
				//Setting Data to value
				List<ValueDO> valueList2 = new ArrayList<ValueDO>();
		
					ValueDO valuDO2_1 = new ValueDO();
						valuDO2_1.setValue("117");
					valueList2.add(valuDO2_1);
		
					ValueDO valuDO2_2 = new ValueDO();
						valuDO2_2.setValue("164");
					valueList2.add(valuDO2_2);
					
					ValueDO valuDO2_3 = new ValueDO();
						valuDO2_3.setValue("166");
					valueList2.add(valuDO2_3);
					
					ValueDO valuDO2_4 = new ValueDO();
						valuDO2_4.setValue("169");
					valueList2.add(valuDO2_4);
					
					ValueDO valuDO2_5 = new ValueDO();
						valuDO2_5.setValue("171");
					valueList2.add(valuDO2_5);
					
					ValueDO valuDO2_6 = new ValueDO();
						valuDO2_6.setValue("172");
					valueList2.add(valuDO2_6);
					
					ValueDO valuDO2_7 = new ValueDO();
						valuDO2_7.setValue("190");
					valueList2.add(valuDO2_7);
					
					ValueDO valuDO2_8 = new ValueDO();
						valuDO2_8.setValue("197");
					valueList2.add(valuDO2_8);
					
					ValueDO valuDO2_9 = new ValueDO();
						valuDO2_9.setValue("204");
					valueList2.add(valuDO2_9);
					
					ValueDO valuDO2_10 = new ValueDO();
						valuDO2_10.setValue("#205");
					valueList2.add(valuDO2_10);
					
					ValueDO valuDO2_11 = new ValueDO();
						valuDO2_11.setValue("207");
					valueList2.add(valuDO2_11);
					
					ValueDO valuDO2_12 = new ValueDO();
						valuDO2_12.setValue("209");
					valueList2.add(valuDO2_12);
					
					ValueDO valuDO2_13 = new ValueDO();
						valuDO2_13.setValue("211");
					valueList2.add(valuDO2_13);
					
					ValueDO valuDO2_14 = new ValueDO();
						valuDO2_14.setValue("212");
					valueList2.add(valuDO2_14);
					
					ValueDO valuDO2_15 = new ValueDO();
						valuDO2_15.setValue("212");
					valueList2.add(valuDO2_15);
					
					ValueDO valuDO2_16 = new ValueDO();
						valuDO2_16.setValue("213");
					valueList2.add(valuDO2_16);
					
					ValueDO valuDO2_17 = new ValueDO();
						valuDO2_17.setValue("216");
					valueList2.add(valuDO2_17);
					
					ValueDO valuDO2_18 = new ValueDO();
						valuDO2_18.setValue("217");
					valueList2.add(valuDO2_18);
					
					ValueDO valuDO2_19 = new ValueDO();
						valuDO2_19.setValue("218");
					valueList2.add(valuDO2_19);
					
					ValueDO valuDO2_20 = new ValueDO();
						valuDO2_20.setValue("219");
					valueList2.add(valuDO2_20);
					
					ValueDO valuDO2_21 = new ValueDO();
						valuDO2_21.setValue("221");
					valueList2.add(valuDO2_21);
			
					ValueDO valuDO2_22 = new ValueDO();
						valuDO2_22.setValue("222");
					valueList2.add(valuDO2_22);
					
					ValueDO valuDO2_23 = new ValueDO();
						valuDO2_23.setValue("230");
					valueList2.add(valuDO2_23);
			
					ValueDO valuDO2_24 = new ValueDO();
						valuDO2_24.setValue("231");
					valueList2.add(valuDO2_24);
					
					ValueDO valuDO2_25 = new ValueDO();
						valuDO2_25.setValue("238");
					valueList2.add(valuDO2_25);
					
					ValueDO valuDO2_26 = new ValueDO();
						valuDO2_26.setValue("240");
					valueList2.add(valuDO2_26);
					
					ValueDO valuDO2_27 = new ValueDO();
						valuDO2_27.setValue("242");
					valueList2.add(valuDO2_27);
					
					ValueDO valuDO2_28 = new ValueDO();
						valuDO2_28.setValue("246");
					valueList2.add(valuDO2_28);
					
					ValueDO valuDO2_29 = new ValueDO();
						valuDO2_29.setValue("251");
					valueList2.add(valuDO2_29);
					
					ValueDO valuDO2_30 = new ValueDO();
						valuDO2_30.setValue("253");
					valueList2.add(valuDO2_30);
					
					ValueDO valuDO2_31 = new ValueDO();
						valuDO2_31.setValue("257");
					valueList2.add(valuDO2_31);
					
					ValueDO valuDO2_32 = new ValueDO();
						valuDO2_32.setValue("290");
					valueList2.add(valuDO2_32);
					
					ValueDO valuDO2_33 = new ValueDO();
						valuDO2_33.setValue("451");
					valueList2.add(valuDO2_33);
					
					ValueDO valuDO2_34 = new ValueDO();
						valuDO2_34.setValue("453");
					valueList2.add(valuDO2_34);
					
					ValueDO valuDO2_35 = new ValueDO();
						valuDO2_35.setValue("463");
					valueList2.add(valuDO2_35);
			
				//Setting values to FieldValuesDO
				FieldValuesDO fieldValues2 = new FieldValuesDO();
					fieldValues2.setFieldvalues(fieldValueList2);
					fieldValues2.setOperatorDO(operatorList2);
					fieldValues2.setValueDO(valueList2);
					
				fieldValueMainList2.add(fieldValues2);
			
		fieldDO2.setFieldValuesDO(fieldValueMainList2);
			
		FieldDOList_For_Block1.add(fieldDO2);
		
		/*  
		 ****************Filter Data 3 ***************
		 */
		FieldDO fieldDO3 = new FieldDO();
		
			fieldDO3.setFieldHeader("Usage");
			
				List<FieldValuesDO> fieldValueMainList3 = new ArrayList<FieldValuesDO>();
			
				List<String> fieldValueList3 = new ArrayList<String>();
					fieldValueList3.add("Model series");
		
				//Setting data to operator
				List<OperatorDO> operatorList3 = new ArrayList<OperatorDO>();
				
					OperatorDO operatorDO3_1 = new OperatorDO();
						operatorDO3_1.setLable("#=");
					OperatorDO operatorDO3_2 = new OperatorDO();
						operatorDO3_2.setLable("!=");
						
					operatorList3.add(operatorDO3_1);
					operatorList3.add(operatorDO3_2);
		
				//Setting Data to value
				List<ValueDO> valueList3 = new ArrayList<ValueDO>();
		
					ValueDO valuDO3_1 = new ValueDO();
						valuDO3_1.setValue("117");
					valueList3.add(valuDO3_1);

					ValueDO valuDO3_2 = new ValueDO();
						valuDO3_2.setValue("164");
					valueList3.add(valuDO3_2);
					
					ValueDO valuDO3_3 = new ValueDO();
						valuDO3_3.setValue("#166");
					valueList3.add(valuDO3_3);
					
					ValueDO valuDO3_4 = new ValueDO();
						valuDO3_4.setValue("169");
					valueList3.add(valuDO3_4);
					
					ValueDO valuDO3_5 = new ValueDO();
						valuDO3_5.setValue("171");
					valueList3.add(valuDO3_5);
					
					ValueDO valuDO3_6 = new ValueDO();
						valuDO3_6.setValue("172");
					valueList3.add(valuDO3_6);
					
					ValueDO valuDO3_7 = new ValueDO();
						valuDO3_7.setValue("190");
					valueList3.add(valuDO3_7);
					
					ValueDO valuDO3_8 = new ValueDO();
						valuDO3_8.setValue("197");
					valueList3.add(valuDO3_8);
					
					ValueDO valuDO3_9 = new ValueDO();
						valuDO3_9.setValue("204");
					valueList3.add(valuDO3_9);
					
					ValueDO valuDO3_10 = new ValueDO();
						valuDO3_10.setValue("205");
					valueList3.add(valuDO3_10);
						
					ValueDO valuDO3_11 = new ValueDO();
						valuDO3_11.setValue("207");
					valueList3.add(valuDO3_11);
					
					ValueDO valuDO3_12 = new ValueDO();
						valuDO3_12.setValue("209");
					valueList3.add(valuDO3_12);
					
					ValueDO valuDO3_13 = new ValueDO();
						valuDO3_13.setValue("211");
					valueList3.add(valuDO3_13);
					
					ValueDO valuDO3_14 = new ValueDO();
						valuDO3_14.setValue("212");
					valueList3.add(valuDO3_14);
					
					ValueDO valuDO3_15 = new ValueDO();
						valuDO3_15.setValue("212");
					valueList3.add(valuDO3_15);
					
					ValueDO valuDO3_16 = new ValueDO();
						valuDO3_16.setValue("213");
					valueList3.add(valuDO3_16);
					
					ValueDO valuDO3_17 = new ValueDO();
						valuDO3_17.setValue("216");
					valueList3.add(valuDO3_17);
					
					ValueDO valuDO3_18 = new ValueDO();
						valuDO3_18.setValue("217");
					valueList3.add(valuDO3_18);
					
					ValueDO valuDO3_19 = new ValueDO();
						valuDO3_19.setValue("218");
					valueList3.add(valuDO3_19);
					
					ValueDO valuDO3_20 = new ValueDO();
						valuDO3_20.setValue("219");
					valueList3.add(valuDO3_20);
					
					ValueDO valuDO3_21 = new ValueDO();
						valuDO3_21.setValue("221");
					valueList3.add(valuDO3_21);
			
					ValueDO valuDO3_22 = new ValueDO();
						valuDO3_22.setValue("222");
					valueList3.add(valuDO3_22);
					
					ValueDO valuDO3_23 = new ValueDO();
						valuDO3_23.setValue("230");
					valueList3.add(valuDO3_23);
			
					ValueDO valuDO3_24 = new ValueDO();
						valuDO3_24.setValue("231");
					valueList3.add(valuDO3_24);
					
					ValueDO valuDO3_25 = new ValueDO();
						valuDO3_25.setValue("238");
					valueList3.add(valuDO3_25);
					
					ValueDO valuDO3_26 = new ValueDO();
						valuDO3_26.setValue("240");
					valueList3.add(valuDO3_26);
					
					ValueDO valuDO3_27 = new ValueDO();
						valuDO3_27.setValue("242");
					valueList3.add(valuDO3_27);
					
					ValueDO valuDO3_28 = new ValueDO();
						valuDO3_28.setValue("246");
					valueList3.add(valuDO3_28);
					
					ValueDO valuDO3_29 = new ValueDO();
						valuDO3_29.setValue("251");
					valueList3.add(valuDO3_29);
					
					ValueDO valuDO3_30 = new ValueDO();
						valuDO3_30.setValue("253");
					valueList3.add(valuDO3_30);
					
					ValueDO valuDO3_31 = new ValueDO();
						valuDO3_31.setValue("257");
					valueList3.add(valuDO3_31);
					
					ValueDO valuDO3_32 = new ValueDO();
						valuDO3_32.setValue("290");
					valueList3.add(valuDO3_32);
					
					ValueDO valuDO3_33 = new ValueDO();
						valuDO3_33.setValue("451");
					valueList3.add(valuDO3_33);
					
					ValueDO valuDO3_34 = new ValueDO();
						valuDO3_34.setValue("453");
					valueList3.add(valuDO3_34);
					
					ValueDO valuDO3_35 = new ValueDO();
						valuDO3_35.setValue("463");
					valueList3.add(valuDO3_35);
			
		        //Setting values to FieldValuesDO
				FieldValuesDO fieldValues3 = new FieldValuesDO();
					fieldValues3.setFieldvalues(fieldValueList3);
					fieldValues3.setOperatorDO(operatorList3);
					fieldValues3.setValueDO(valueList3);
			
				fieldValueMainList3.add(fieldValues3);
			
		fieldDO3.setFieldValuesDO(fieldValueMainList3);
			
		FieldDOList_For_Block1.add(fieldDO3);
		
		/*  
		 ****************Filter Data 4 ***************
		 */
		FieldDO fieldDO4 = new FieldDO();
			fieldDO4.setFieldHeader("Usage");
			
			List<FieldValuesDO> fieldValueMainList4 = new ArrayList<FieldValuesDO>();
			
			List<String> fieldValueList4 = new ArrayList<String>();
				fieldValueList4.add("Model series");
		
			//Setting data to operator
			List<OperatorDO> operatorList4 = new ArrayList<OperatorDO>();
		
				OperatorDO operatorDO4_1 = new OperatorDO();
					operatorDO4_1.setLable("#=");
						
				OperatorDO operatorDO4_2 = new OperatorDO();
						operatorDO4_2.setLable("!=");
						
				operatorList4.add(operatorDO4_1);
				operatorList4.add(operatorDO4_2);
		
			//Setting Data to value
			List<ValueDO> valueList4 = new ArrayList<ValueDO>();
			
				ValueDO valuDO4_1 = new ValueDO();
					valuDO4_1.setValue("117");
				valueList4.add(valuDO4_1);
				
				ValueDO valuDO4_2 = new ValueDO();
					valuDO4_2.setValue("164");
				valueList4.add(valuDO4_2);
				
				ValueDO valuDO4_3 = new ValueDO();
					valuDO4_3.setValue("166");
				valueList4.add(valuDO4_3);
				
				ValueDO valuDO4_4 = new ValueDO();
					valuDO4_4.setValue("169");
				valueList4.add(valuDO4_4);
				
				ValueDO valuDO4_5 = new ValueDO();
					valuDO4_5.setValue("171");
				valueList4.add(valuDO4_5);
				
				ValueDO valuDO4_6 = new ValueDO();
					valuDO4_6.setValue("172");
				valueList4.add(valuDO4_6);
				
				ValueDO valuDO4_7 = new ValueDO();
					valuDO4_7.setValue("190");
				valueList4.add(valuDO4_7);
				
				ValueDO valuDO4_8 = new ValueDO();
					valuDO4_8.setValue("197");
				valueList4.add(valuDO4_8);
				
				ValueDO valuDO4_9 = new ValueDO();
					valuDO4_9.setValue("204");
				valueList4.add(valuDO4_9);
				
				ValueDO valuDO4_10 = new ValueDO();
					valuDO4_10.setValue("205");
				valueList4.add(valuDO4_10);
				
				ValueDO valuDO4_11 = new ValueDO();
					valuDO4_11.setValue("207");
				valueList4.add(valuDO4_11);
				
				ValueDO valuDO4_12 = new ValueDO();
					valuDO4_12.setValue("209");
				valueList4.add(valuDO4_12);
				
				ValueDO valuDO4_13 = new ValueDO();
					valuDO4_13.setValue("211");
				valueList4.add(valuDO4_13);
				
				ValueDO valuDO4_14 = new ValueDO();
					valuDO4_14.setValue("212");
				valueList4.add(valuDO4_14);
				
				ValueDO valuDO4_15 = new ValueDO();
					valuDO4_15.setValue("212");
				valueList4.add(valuDO4_15);
				
				ValueDO valuDO4_16 = new ValueDO();
					valuDO4_16.setValue("213");
				valueList4.add(valuDO4_16);
				
				ValueDO valuDO4_17 = new ValueDO();
					valuDO4_17.setValue("216");
				valueList4.add(valuDO4_17);
				
				ValueDO valuDO4_18 = new ValueDO();
					valuDO4_18.setValue("217");
				valueList4.add(valuDO4_18);
				
				ValueDO valuDO4_19 = new ValueDO();
					valuDO4_19.setValue("218");
				valueList4.add(valuDO4_19);
				
				ValueDO valuDO4_20 = new ValueDO();
					valuDO4_20.setValue("219");
				valueList4.add(valuDO4_20);
				
				ValueDO valuDO4_21 = new ValueDO();
					valuDO4_21.setValue("221");
				valueList4.add(valuDO4_21);
		
				ValueDO valuDO4_22 = new ValueDO();
					valuDO4_22.setValue("222");
				valueList4.add(valuDO4_22);
				
				ValueDO valuDO4_23 = new ValueDO();
					valuDO4_23.setValue("230");
				valueList4.add(valuDO4_23);
		
				ValueDO valuDO4_24 = new ValueDO();
					valuDO4_24.setValue("231");
				valueList4.add(valuDO4_24);
				
				ValueDO valuDO4_25 = new ValueDO();
					valuDO4_25.setValue("238");
				valueList4.add(valuDO4_25);
				
				ValueDO valuDO4_26 = new ValueDO();
					valuDO4_26.setValue("240");
				valueList4.add(valuDO4_26);
				
				ValueDO valuDO4_27 = new ValueDO();
					valuDO4_27.setValue("242");
				valueList4.add(valuDO4_27);
				
				ValueDO valuDO4_28 = new ValueDO();
					valuDO4_28.setValue("246");
				valueList4.add(valuDO4_28);
				
				ValueDO valuDO4_29 = new ValueDO();
					valuDO4_29.setValue("#251");
				valueList4.add(valuDO4_29);
				
				ValueDO valuDO4_30 = new ValueDO();
					valuDO4_30.setValue("253");
				valueList4.add(valuDO4_30);
				
				ValueDO valuDO4_31 = new ValueDO();
					valuDO4_31.setValue("257");
				valueList4.add(valuDO4_31);
				
				ValueDO valuDO4_32 = new ValueDO();
					valuDO4_32.setValue("290");
				valueList4.add(valuDO4_32);
				
				ValueDO valuDO4_33 = new ValueDO();
					valuDO4_33.setValue("451");
				valueList4.add(valuDO4_33);
				
				ValueDO valuDO4_34 = new ValueDO();
					valuDO4_34.setValue("453");
				valueList4.add(valuDO4_34);
				
				ValueDO valuDO4_35 = new ValueDO();
					valuDO4_35.setValue("463");
				valueList4.add(valuDO4_35);
			
		//Setting values to FieldValuesDO
		FieldValuesDO fieldValues4 = new FieldValuesDO();
			fieldValues4.setFieldvalues(fieldValueList4);
			fieldValues4.setOperatorDO(operatorList4);
			fieldValues4.setValueDO(valueList4);
			
		fieldValueMainList4.add(fieldValues4);
			
		fieldDO4.setFieldValuesDO(fieldValueMainList4);
			
		FieldDOList_For_Block1.add(fieldDO4);
		
		/*  
		 ****************Filter Data 5 **************
		 */
		FieldDO fieldDO5 = new FieldDO();
			fieldDO5.setFieldHeader("Groups");
		
			List<FieldValuesDO> fieldValueMainList5 = new ArrayList<FieldValuesDO>();
				
			List<String> fieldValueList5 = new ArrayList<String>();
				fieldValueList5.add("Project Ident");
			
			//Setting data to operator
			List<OperatorDO> operatorList5 = new ArrayList<OperatorDO>();
			
				OperatorDO operatorDO5_1 = new OperatorDO();
				operatorDO5_1.setLable("#=");
						
			operatorList5.add(operatorDO5_1);
		
			//Setting Data to value
	        List<ValueDO> valueList5 = new ArrayList<ValueDO>();
			
				ValueDO valuDO5_1 = new ValueDO();
					valuDO5_1.setValue("205 bereinigung");
				valueList5.add(valuDO5_1);
				
				ValueDO valuDO5_2 = new ValueDO();
					valuDO5_2.setValue("205 bereinigung_ohne Staffel1");
				valueList5.add(valuDO5_2);
				
				ValueDO valuDO5_3 = new ValueDO();
					valuDO5_3.setValue("#All Tuscaloosa Projects");
				valueList5.add(valuDO5_3);
				
				ValueDO valuDO5_4 = new ValueDO();
					valuDO5_4.setValue("BR205 Lumpensammler WBR");
				valueList5.add(valuDO5_4);
				
				ValueDO valuDO5_5 = new ValueDO();
					valuDO5_5.setValue("205 Lumpensammler W und V");
				valueList5.add(valuDO5_5);
				
				ValueDO valuDO5_6 = new ValueDO();
					valuDO5_6.setValue("BR212/218 ÄJ14/0");
				valueList5.add(valuDO5_6);
				
				ValueDO valuDO5_7 = new ValueDO();
					valuDO5_7.setValue("S213 Alle Staffeln");
				valueList5.add(valuDO5_7);
				
				ValueDO valuDO5_8 = new ValueDO();
					valuDO5_8.setValue("Sam's Project Ident Group 1");
				valueList5.add(valuDO5_8);
				
				ValueDO valuDO5_9 = new ValueDO();
					valuDO5_9.setValue("START-Trans");
				valueList5.add(valuDO5_9);
				
				ValueDO valuDO5_10 = new ValueDO();
					valuDO5_10.setValue("V205 Staffel1 104");
				valueList5.add(valuDO5_10);
				
				ValueDO valuDO5_11 = new ValueDO();
					valuDO5_11.setValue("V205_Staffel1_QMPF");
				valueList5.add(valuDO5_11);
				
				ValueDO valuDO5_12 = new ValueDO();
					valuDO5_12.setValue("W1040_V213_total");
				valueList5.add(valuDO5_12);
				
				ValueDO valuDO5_13 = new ValueDO();
					valuDO5_13.setValue("W205_W138_Part Readiness");
				valueList5.add(valuDO5_13);
			
			//Setting values to FieldValuesDO
			FieldValuesDO fieldValues5 = new FieldValuesDO();
				fieldValues5.setFieldvalues(fieldValueList5);
				fieldValues5.setOperatorDO(operatorList5);
				fieldValues5.setValueDO(valueList5);
			
			fieldValueMainList5.add(fieldValues5);
				
			fieldDO5.setFieldValuesDO(fieldValueMainList5);
				
			FieldDOList_For_Block1.add(fieldDO5);
		
		/*  
		 ****************Filter Data 6 **************
		 */
		FieldDO fieldDO6 = new FieldDO();
		
			fieldDO6.setFieldHeader("Supplier");
			List<FieldValuesDO> fieldValueMainList6 = new ArrayList<FieldValuesDO>();
			
			List<String> fieldValueList6 = new ArrayList<String>();
				fieldValueList6.add("Start-up Indicator");
		
			//Setting data to operator
			List<OperatorDO> operatorList6 = new ArrayList<OperatorDO>();
			
				OperatorDO operatorDO6_1 = new OperatorDO();
				operatorDO6_1.setLable("#=");
			
				OperatorDO operatorDO6_2 = new OperatorDO();
				operatorDO6_2.setLable("!=");
						
			operatorList6.add(operatorDO6_1);
			operatorList6.add(operatorDO6_2);
		
			//Setting Data to value
	        List<ValueDO> valueList6 = new ArrayList<ValueDO>();
			
			ValueDO valuDO6_1 = new ValueDO();
				valuDO6_1.setValue(" ");
			valueList6.add(valuDO6_1);
			
			ValueDO valuDO6_2 = new ValueDO();
				valuDO6_2.setValue("N");
			valueList6.add(valuDO6_2);
			
			ValueDO valuDO6_3 = new ValueDO();
				valuDO6_3.setValue("#Y");
			valueList6.add(valuDO6_3);
		
		//Setting values to FieldValuesDO
		FieldValuesDO fieldValues6 = new FieldValuesDO();
			fieldValues6.setFieldvalues(fieldValueList6);
			fieldValues6.setOperatorDO(operatorList6);
			fieldValues6.setValueDO(valueList6);
			
		fieldValueMainList6.add(fieldValues6);
			
		fieldDO6.setFieldValuesDO(fieldValueMainList6);
			
		FieldDOList_For_Block1.add(fieldDO6);
		
		/*  
		 ****************Filter Data 7 **************
		 */
		FieldDO fieldDO7 = new FieldDO();
		
			fieldDO7.setFieldHeader("Supplier");
			List<FieldValuesDO> fieldValueMainList7 = new ArrayList<FieldValuesDO>();
			
			List<String> fieldValueList7 = new ArrayList<String>();
				fieldValueList7.add("Start-up Indicator");
		
			//Setting data to operator
			List<OperatorDO> operatorList7 = new ArrayList<OperatorDO>();
			
				OperatorDO operatorDO7_1 = new OperatorDO();
					operatorDO7_1.setLable("#=");
			
				OperatorDO operatorDO7_2 = new OperatorDO();
					operatorDO7_2.setLable("!=");
						
				operatorList7.add(operatorDO7_1);
				operatorList7.add(operatorDO7_2);
		
			//Setting Data to value
	        List<ValueDO> valueList7 = new ArrayList<ValueDO>();
		
				ValueDO valuDO7_1 = new ValueDO();
					valuDO7_1.setValue("# ");
				valueList7.add(valuDO7_1);
		
				ValueDO valuDO7_2 = new ValueDO();
					valuDO7_2.setValue("N");
				valueList7.add(valuDO7_2);
				
				ValueDO valuDO7_3 = new ValueDO();
					valuDO7_3.setValue("Y");
				valueList7.add(valuDO7_3);
		
			//Setting values to FieldValuesDO
				FieldValuesDO fieldValues7 = new FieldValuesDO();
				fieldValues7.setFieldvalues(fieldValueList7);
				fieldValues7.setOperatorDO(operatorList7);
				fieldValues7.setValueDO(valueList7);
				
			fieldValueMainList7.add(fieldValues7);
				
			fieldDO7.setFieldValuesDO(fieldValueMainList7);
				
			FieldDOList_For_Block1.add(fieldDO7);
		
		/*  
		 ****************Filter Data 8 **************
		 */
		FieldDO fieldDO8 = new FieldDO();
			fieldDO8.setFieldHeader("Supplier");
		
			List<FieldValuesDO> fieldValueMainList8 = new ArrayList<FieldValuesDO>();
			
			List<String> fieldValueList8 = new ArrayList<String>();
			fieldValueList8.add("Number of suppliers");
		
			//Setting data to operator
			List<OperatorDO> operatorList8 = new ArrayList<OperatorDO>();
			
				OperatorDO operatorDO8_1 = new OperatorDO();
					operatorDO8_1.setLable("=");
			
				OperatorDO operatorDO8_2 = new OperatorDO();
					operatorDO8_2.setLable("!=");
				
				OperatorDO operatorDO8_3 = new OperatorDO();
					operatorDO8_3.setLable("#>");
				
				OperatorDO operatorDO8_4 = new OperatorDO();
					operatorDO8_4.setLable("<");
				
				OperatorDO operatorDO8_5 = new OperatorDO();
					operatorDO8_5.setLable("&#8805");
				
				OperatorDO operatorDO8_6 = new OperatorDO();
					operatorDO8_6.setLable("&#8804");
					
				operatorList8.add(operatorDO8_1);
				operatorList8.add(operatorDO8_2);
				operatorList8.add(operatorDO8_3);
				operatorList8.add(operatorDO8_4);
				operatorList8.add(operatorDO8_5);
				operatorList8.add(operatorDO8_6);
		
			//Setting Data to value
	        List<ValueDO> valueList8 = new ArrayList<ValueDO>();
			
			ValueDO valuDO8_1 = new ValueDO();
				valuDO8_1.setValue("1");
				valueList8.add(valuDO8_1);
				
			ValueDO valuDO8_2 = new ValueDO();
				valuDO8_2.setValue("text");
				valueList8.add(valuDO8_2);	
			
			//Setting values to FieldValuesDO
			FieldValuesDO fieldValues8 = new FieldValuesDO();
				fieldValues8.setFieldvalues(fieldValueList8);
				fieldValues8.setOperatorDO(operatorList8);
				fieldValues8.setValueDO(valueList8);
				
			fieldValueMainList8.add(fieldValues8);
				
			fieldDO8.setFieldValuesDO(fieldValueMainList8);
				
			FieldDOList_For_Block1.add(fieldDO8);
			
			filterBlockDO1.setFieldDOList(FieldDOList_For_Block1);
			
			filterBlockDO.add(filterBlockDO1);
		
		/*  
		 **************** Filter Block data 2 **************
		 *Data 1
		 */
		FieldDO fieldDO9 = new FieldDO();
			fieldDO9.setFieldHeader("Parts Master Data");
		
			List<FieldValuesDO> fieldValueMainList9 = new ArrayList<FieldValuesDO>();
			
			List<String> fieldValueList9 = new ArrayList<String>();
				fieldValueList9.add("Purchase Key");
			
			//Setting data to operator
			List<OperatorDO> operatorList9 = new ArrayList<OperatorDO>();
			
			OperatorDO operatorDO9_1 = new OperatorDO();
				operatorDO9_1.setLable("#=");
						
			OperatorDO operatorDO9_2 = new OperatorDO();
				operatorDO9_2.setLable("!=");
						
				operatorList9.add(operatorDO9_1);
				operatorList9.add(operatorDO9_2);
			
			//Setting Data to value
			List<ValueDO> valueList9 = new ArrayList<ValueDO>();
			
			ValueDO valuDO9_1 = new ValueDO();
				valuDO9_1.setValue("*7*");
			valueList9.add(valuDO9_1);
				
			//Setting values to FieldValuesDO
			FieldValuesDO fieldValues9 = new FieldValuesDO();
				fieldValues9.setFieldvalues(fieldValueList9);
				fieldValues9.setOperatorDO(operatorList9);
				fieldValues9.setValueDO(valueList9);
				
			fieldValueMainList9.add(fieldValues9);
				
			fieldDO9.setFieldValuesDO(fieldValueMainList9);
				
			FieldDOList_For_Block2.add(fieldDO9);
		
		/*  
		 **************** Filter Block data 2 **************
		 * Data 2
		 */
		FieldDO fieldDO10 = new FieldDO();
			fieldDO10.setFieldHeader("Project");
			List<FieldValuesDO> fieldValueMainList10 = new ArrayList<FieldValuesDO>();
				
			List<String> fieldValueList10 = new ArrayList<String>();
				fieldValueList10.add("Project Ident");
			
			//Setting data to operator
			List<OperatorDO> operatorList10 = new ArrayList<OperatorDO>();
				OperatorDO operatorDO10_1 = new OperatorDO();
					operatorDO10_1.setLable("#=");
						
				OperatorDO operatorDO10_2 = new OperatorDO();
					operatorDO10_2.setLable("!=");
							
					operatorList10.add(operatorDO10_1);
					operatorList10.add(operatorDO10_2);
				
			//Setting Data to value
			List<ValueDO> valueList10 = new ArrayList<ValueDO>();
				ValueDO valuDO10_1 = new ValueDO();
				valuDO10_1.setValue("166999");
				valueList10.add(valuDO10_1);
				
				ValueDO valuDO10_2 = new ValueDO();
				valuDO10_2.setValue("text");
				valueList10.add(valuDO10_2);
				
			//Setting values to FieldValuesDO
			FieldValuesDO fieldValues10 = new FieldValuesDO();
				fieldValues10.setFieldvalues(fieldValueList10);
				fieldValues10.setOperatorDO(operatorList10);
				fieldValues10.setValueDO(valueList10);
				
			fieldValueMainList10.add(fieldValues10);
				
			fieldDO10.setFieldValuesDO(fieldValueMainList10);
				
			FieldDOList_For_Block2.add(fieldDO10);
		
		/*  
		 **************** Filter Block data 2 **************
		 * Data 3
		 */
		FieldDO fieldDO11 = new FieldDO();
			fieldDO11.setFieldHeader("Project");
			List<FieldValuesDO> fieldValueMainList11 = new ArrayList<FieldValuesDO>();
				
			List<String> fieldValueList11 = new ArrayList<String>();
				fieldValueList11.add("Project Ident");
			
			//Setting data to operator
			List<OperatorDO> operatorList11 = new ArrayList<OperatorDO>();
			
			OperatorDO operatorDO11_1 = new OperatorDO();
				operatorDO11_1.setLable("#=");
						
			OperatorDO operatorDO11_2 = new OperatorDO();
				operatorDO11_2.setLable("!=");
						
				operatorList11.add(operatorDO11_1);
				operatorList11.add(operatorDO11_2);
			
			//Setting Data to value
			List<ValueDO> valueList11 = new ArrayList<ValueDO>();
				ValueDO valuDO11_1 = new ValueDO();
				valuDO11_1.setValue("205999");
				valueList11.add(valuDO11_1);
				
				ValueDO valuDO11_2 = new ValueDO();
				valuDO11_2.setValue("text");
				valueList11.add(valuDO11_2);
				
			//Setting values to FieldValuesDO
			FieldValuesDO fieldValues11 = new FieldValuesDO();
				fieldValues11.setFieldvalues(fieldValueList11);
				fieldValues11.setOperatorDO(operatorList11);
				fieldValues11.setValueDO(valueList11);
				
			fieldValueMainList11.add(fieldValues11);
				
			fieldDO11.setFieldValuesDO(fieldValueMainList11);
				
			FieldDOList_For_Block2.add(fieldDO11);
		
		/*  
		 **************** Filter Block data 2 **************
		 * Data 4
		 */
		FieldDO fieldDO12 = new FieldDO();
			fieldDO12.setFieldHeader("Project");
			List<FieldValuesDO> fieldValueMainList12 = new ArrayList<FieldValuesDO>();
				
			List<String> fieldValueList12 = new ArrayList<String>();
				fieldValueList12.add("Project Ident");
			
			//Setting data to operator
			List<OperatorDO> operatorList12 = new ArrayList<OperatorDO>();
				OperatorDO operatorDO12_1 = new OperatorDO();
				operatorDO12_1.setLable("#=");
						
			OperatorDO operatorDO12_2 = new OperatorDO();
				operatorDO12_2.setLable("!=");
						
				operatorList12.add(operatorDO12_1);
				operatorList12.add(operatorDO12_2);
			
			//Setting Data to value
			List<ValueDO> valueList12 = new ArrayList<ValueDO>();
				ValueDO valuDO12_1 = new ValueDO();
				valuDO12_1.setValue("251999");
				valueList12.add(valuDO12_1);
				
				ValueDO valuDO12_3 = new ValueDO();
				valuDO12_3.setValue("text");
				valueList12.add(valuDO12_3);
				
			//Setting values to FieldValuesDO
			FieldValuesDO fieldValues12 = new FieldValuesDO();
				fieldValues12.setFieldvalues(fieldValueList12);
				fieldValues12.setOperatorDO(operatorList12);
				fieldValues12.setValueDO(valueList12);
				
			fieldValueMainList12.add(fieldValues12);
				
			fieldDO12.setFieldValuesDO(fieldValueMainList12);
				
			FieldDOList_For_Block2.add(fieldDO12);
		
		/*  
		 **************** Filter Block data 2 **************
		 * Data 5
		 */
		FieldDO fieldDO13 = new FieldDO();
		
			fieldDO13.setFieldHeader("Supplier");
			List<FieldValuesDO> fieldValueMainList13 = new ArrayList<FieldValuesDO>();
				
			List<String> fieldValueList13 = new ArrayList<String>();
				fieldValueList13.add("Number of suppliers");
			
			//Setting data to operator
			List<OperatorDO> operatorList13 = new ArrayList<OperatorDO>();
			OperatorDO operatorDO13_1 = new OperatorDO();
				operatorDO13_1.setLable("=");
						
			OperatorDO operatorDO13_2 = new OperatorDO();
				operatorDO13_2.setLable("!=");
			
			OperatorDO operatorDO13_3 = new OperatorDO();
				operatorDO13_3.setLable("#>");
			
			OperatorDO operatorDO13_4 = new OperatorDO();
				operatorDO13_4.setLable("<");
			
			OperatorDO operatorDO13_5 = new OperatorDO();
				operatorDO13_5.setLable("&#8805");
			
			OperatorDO operatorDO13_6 = new OperatorDO();
				operatorDO13_6.setLable("&#8804");
						
			operatorList13.add(operatorDO13_1);
			operatorList13.add(operatorDO13_2);
			operatorList13.add(operatorDO13_3);
			operatorList13.add(operatorDO13_4);
			operatorList13.add(operatorDO13_5);
			operatorList13.add(operatorDO13_6);
			
			//Setting Data to value
			List<ValueDO> valueList13 = new ArrayList<ValueDO>();
				ValueDO valuDO13_1 = new ValueDO();
					valuDO13_1.setValue("1");
						valueList13.add(valuDO13_1);
				
				ValueDO valuDO13_2 = new ValueDO();
					valuDO13_2.setValue("text");
						valueList13.add(valuDO13_2);	
				
			//Setting values to FieldValuesDO
			FieldValuesDO fieldValues13 = new FieldValuesDO();
				fieldValues13.setFieldvalues(fieldValueList13);
				fieldValues13.setOperatorDO(operatorList13);
				fieldValues13.setValueDO(valueList13);
				
			fieldValueMainList13.add(fieldValues13);
				
			fieldDO13.setFieldValuesDO(fieldValueMainList13);
				
			FieldDOList_For_Block2.add(fieldDO13);
			filterBlockDO2.setFieldDOList(FieldDOList_For_Block2);
			
			//filterBlockDO.add(filterBlockDO2);
			
			filterSettingDO1.setIs_ColorNeutralPartsMasterData(true);
			filterSettingDO1.setIs_ColorNeutralPartsMasterdataforColoredParts(true);
			filterSettingDO1.setIs_ColoredParts(true);
			filterSettingDO1.setValidTo("today");
			filterSettingDO1.setValidTo("infinite");
			filterSettingDO1.setIs_HighestProgressiveChangeNumberInSelectedInterval(true);
			filterSettingDO1.setIs_IncludePartsWithoutMasterData(false);
			filterSettingDO1.setIs_AutomaticViewFilter(true);
			
			filterBlockDO2.setFilterSettingDO(filterSettingDO1);
			
			/*
			 * Added Plants details
			 */
			
			PlantsDO plantsDO1 = new PlantsDO();
			plantsDO1.setPlantHeader("Productions plants");
			
				List<PlantsValuesDO> plants = new ArrayList<PlantsValuesDO>();
				
					PlantsValuesDO plant1 = new PlantsValuesDO();
						plant1.setValues("0500");
						plant1.setSelected(false);
							plants.add(plant1);
						
					PlantsValuesDO plant2 = new PlantsValuesDO();
						plant2.setValues("0540");
						plant2.setSelected(false);
							plants.add(plant2);
						
					PlantsValuesDO plant3 = new PlantsValuesDO();
						plant3.setValues("0670");
						plant3.setSelected(false);	
							plants.add(plant3);
						
					PlantsValuesDO plant4 = new PlantsValuesDO();
						plant4.setValues("1040");
						plant4.setSelected(false);	
							plants.add(plant4);
						
					PlantsValuesDO plant5 = new PlantsValuesDO();
						plant5.setValues("1170");
						plant5.setSelected(false);	
							plants.add(plant5);
						
					PlantsValuesDO plant6 = new PlantsValuesDO();
						plant6.setValues("1380");
						plant6.setSelected(false);	
							plants.add(plant6);
						
					PlantsValuesDO plant7 = new PlantsValuesDO();
						plant7.setValues("1750");
						plant7.setSelected(false);	
							plants.add(plant7);
						
					PlantsValuesDO plant8 = new PlantsValuesDO();
						plant8.setValues("3020");
						plant8.setSelected(false);
							plants.add(plant8);
						
					PlantsValuesDO plant9 = new PlantsValuesDO();
						plant9.setValues("3710");
						plant9.setSelected(false);	
							plants.add(plant9);
							
			plantsDO1.setPlants(plants);
			
			plantsDOList.add(plantsDO1);
			
			//Plants data 2
			
			PlantsDO plantsDO2 = new PlantsDO();
			plantsDO2.setPlantHeader("Contract plants");
			
				List<PlantsValuesDO> plants2 = new ArrayList<PlantsValuesDO>();
				
					PlantsValuesDO plant2_1 = new PlantsValuesDO();
						plant2_1.setValues("0500");
						plant2_1.setSelected(false);
							plants2.add(plant1);
						
					PlantsValuesDO plant2_2 = new PlantsValuesDO();
						plant2_2.setValues("0540");
						plant2_2.setSelected(false);
							plants2.add(plant2_2);
						
					PlantsValuesDO plant2_3 = new PlantsValuesDO();
						plant2_3.setValues("0670");
						plant2_3.setSelected(false);	
							plants2.add(plant2_3);
						
					PlantsValuesDO plant2_4 = new PlantsValuesDO();
						plant2_4.setValues("1040");
						plant2_4.setSelected(false);	
							plants2.add(plant2_4);
						
					PlantsValuesDO plant2_5 = new PlantsValuesDO();
						plant2_5.setValues("1170");
						plant2_5.setSelected(false);	
							plants2.add(plant2_5);
						
					PlantsValuesDO plant2_6 = new PlantsValuesDO();
						plant2_6.setValues("1380");
						plant2_6.setSelected(false);	
							plants2.add(plant2_6);
							
					PlantsValuesDO plant2_7 = new PlantsValuesDO();
						plant2_7.setValues("1750");
						plant2_7.setSelected(false);	
							plants2.add(plant2_7);
						
					PlantsValuesDO plant2_8 = new PlantsValuesDO();
						plant2_8.setValues("3020");
						plant2_8.setSelected(false);
							plants2.add(plant2_8);
						
					PlantsValuesDO plant2_9 = new PlantsValuesDO();
						plant2_9.setValues("3710");
						plant2_9.setSelected(false);	
							plants2.add(plant2_9);
							
				plantsDO2.setPlants(plants2);
			
			plantsDOList.add(plantsDO2);
			
			//Plants data 3
			
			PlantsDO plantsDO3 = new PlantsDO();
			plantsDO3.setPlantHeader("Associated MBCCs");
			
				List<PlantsValuesDO> plants3 = new ArrayList<PlantsValuesDO>();
				
					PlantsValuesDO plant3_1 = new PlantsValuesDO();
						plant3_1.setValues("0514");
						plant3_1.setSelected(false);
							plants3.add(plant3_1);
						
					PlantsValuesDO plant3_2 = new PlantsValuesDO();
						plant3_2.setValues("0513");
						plant3_2.setSelected(false);
							plants3.add(plant2_2);
						
					PlantsValuesDO plant3_3 = new PlantsValuesDO();
						plant3_3.setValues("0515");
						plant3_3.setSelected(false);	
							plants3.add(plant3_3);
							
				plantsDO3.setPlants(plants3);
			
			plantsDOList.add(plantsDO3);
			
			//Plants data 4
			
			PlantsDO plantsDO4 = new PlantsDO();
			plantsDO4.setPlantHeader("Non-production plants");
			
				List<PlantsValuesDO> plants4 = new ArrayList<PlantsValuesDO>();
				
					PlantsValuesDO plant4_1 = new PlantsValuesDO();
						plant4_1.setValues("1330");
						plant4_1.setSelected(false);
							plants4.add(plant4_1);
						
					PlantsValuesDO plant4_2 = new PlantsValuesDO();
						plant4_2.setValues("9999");
						plant4_2.setSelected(false);
							plants4.add(plant4_2);
					
							
				plantsDO4.setPlants(plants4);
			
			plantsDOList.add(plantsDO4);
			
			filterPlantsDO.setPlants(plantsDOList);
			
			filterBlockDO2.setFilterPlantsDOList(filterPlantsDO);
			
			//filterBlockDO.add(filterBlockDO1);
			filterBlockDO.add(filterBlockDO2);
			
		}else if(("205_010_Gesamtprojekt_205W_alle_Werke_(Montage)").equalsIgnoreCase(filterName)){
		/* 
		 *  These Data gets populated when user selects Filter name 
		 *  as "205_010_Gesamtprojekt_205W_alle_Werke_(Montage)"
		 *  DATA 1 of Block 2
		 *  
		 */
		
		FieldDO fieldDO14 = new FieldDO();
		fieldDO14.setFieldHeader("Project");
		
			List<FieldValuesDO> fieldValueMainList14 = new ArrayList<FieldValuesDO>();
		
			List<String> fieldValueList14 = new ArrayList<String>();
				fieldValueList14.add("Project Ident");
	
			//Setting data to operator
				List<OperatorDO> operatorList14 = new ArrayList<OperatorDO>();
			
					OperatorDO operatorDO14_1 = new OperatorDO();
						operatorDO14_1.setLable("#=");
						
					OperatorDO operatorDO14_2 = new OperatorDO();
						operatorDO14_2.setLable("!=");
						
						operatorList14.add(operatorDO14_1);
						operatorList14.add(operatorDO14_2);
	
				//Setting Data to value
				List<ValueDO> valueList14 = new ArrayList<ValueDO>();
					ValueDO valuDO14 = new ValueDO();
						valuDO14.setValue("205W");
					valueList14.add(valuDO14);
		
				//Setting values to FieldValuesDO
				FieldValuesDO fieldValues14 = new FieldValuesDO();
				
					fieldValues14.setFieldvalues(fieldValueList14);
					fieldValues14.setOperatorDO(operatorList14);
					fieldValues14.setValueDO(valueList14);
		
				fieldValueMainList14.add(fieldValues14);
				
		fieldDO14.setFieldValuesDO(fieldValueMainList14);
				
		FieldDOList_For_Block1.add(fieldDO14);
		
		/* 
		 *  These Data gets populated when user selects Filter name 
		 *  as "205_010_Gesamtprojekt_205W_alle_Werke_(Montage)"
		 *  DATA 2 of Block 2
		 *  
		 */
		
		FieldDO fieldDO15 = new FieldDO();
		fieldDO15.setFieldHeader("Project");
		
			List<FieldValuesDO> fieldValueMainList15 = new ArrayList<FieldValuesDO>();
		
			List<String> fieldValueList15 = new ArrayList<String>();
				fieldValueList15.add("Controlling Relevance Plant");
	
			//Setting data to operator
				List<OperatorDO> operatorList15 = new ArrayList<OperatorDO>();
			
					OperatorDO operatorDO15_1 = new OperatorDO();
						operatorDO15_1.setLable("#=");
						
					OperatorDO operatorDO15_2 = new OperatorDO();
						operatorDO15_2.setLable("!=");
						
						operatorList15.add(operatorDO15_1);
						operatorList15.add(operatorDO15_2);
	
				//Setting Data to value
				List<ValueDO> valueList15 = new ArrayList<ValueDO>();
					ValueDO valuDO15_1 = new ValueDO();
						valuDO15_1.setValue(" ");
					
					ValueDO valuDO15_2 = new ValueDO();
						valuDO15_2.setValue("N");
					
					ValueDO valuDO15_3 = new ValueDO();
						valuDO15_3.setValue("#Y");
					
					valueList15.add(valuDO15_1);
					valueList15.add(valuDO15_2);
					valueList15.add(valuDO15_3);
		
				//Setting values to FieldValuesDO
				FieldValuesDO fieldValues15 = new FieldValuesDO();
					fieldValues15.setFieldvalues(fieldValueList15);
					fieldValues15.setOperatorDO(operatorList15);
					fieldValues15.setValueDO(valueList15);
		
				fieldValueMainList15.add(fieldValues15);
				
			fieldDO15.setFieldValuesDO(fieldValueMainList15);
				
		FieldDOList_For_Block1.add(fieldDO15);

		/* 
		 *  These Data gets populated when user selects Filter name 
		 *  as "205_010_Gesamtprojekt_205W_alle_Werke_(Montage)"
		 *  DATA 3 of Block 2
		 *  
		 */
		
		FieldDO fieldDO16 = new FieldDO();
		fieldDO16.setFieldHeader("Supplier");
		
			List<FieldValuesDO> fieldValueMainList16 = new ArrayList<FieldValuesDO>();
		
			List<String> fieldValueList16 = new ArrayList<String>();
				fieldValueList16.add("Start-up Indicator");
	
			//Setting data to operator
				List<OperatorDO> operatorList16 = new ArrayList<OperatorDO>();
			
					OperatorDO operatorDO16_1 = new OperatorDO();
						operatorDO16_1.setLable("#=");
						
					OperatorDO operatorDO16_2 = new OperatorDO();
						operatorDO16_2.setLable("!=");
						operatorList16.add(operatorDO16_1);
						operatorList16.add(operatorDO16_2);
	
				//Setting Data to value
				List<ValueDO> valueList16 = new ArrayList<ValueDO>();
					ValueDO valuDO16_1 = new ValueDO();
						valuDO16_1.setValue(" ");
					
					ValueDO valuDO16_2 = new ValueDO();
						valuDO16_2.setValue("N");
						
					ValueDO valuDO16_3 = new ValueDO();
						valuDO16_3.setValue("#Y");
						
					valueList16.add(valuDO16_1);
					valueList16.add(valuDO16_2);
					valueList16.add(valuDO16_3);
		
				//Setting values to FieldValuesDO
				FieldValuesDO fieldValues16 = new FieldValuesDO();
					fieldValues16.setFieldvalues(fieldValueList16);
					fieldValues16.setOperatorDO(operatorList16);
					fieldValues16.setValueDO(valueList16);
		
				fieldValueMainList16.add(fieldValues16);
				
			fieldDO16.setFieldValuesDO(fieldValueMainList16);
				
		FieldDOList_For_Block1.add(fieldDO16);
	
		/* 
		 *  These Data gets populated when user selects Filter name 
		 *  as "205_010_Gesamtprojekt_205W_alle_Werke_(Montage)"
		 *  DATA 4 of Block 2
		 *  
		 */
		
		FieldDO fieldDO17 = new FieldDO();
		fieldDO17.setFieldHeader("Supplier");
		
			List<FieldValuesDO> fieldValueMainList17 = new ArrayList<FieldValuesDO>();
		
			List<String> fieldValueList17 = new ArrayList<String>();
				fieldValueList17.add("Start-up Indicator");
	
			//Setting data to operator
				List<OperatorDO> operatorList17 = new ArrayList<OperatorDO>();
			
					OperatorDO operatorDO17_1 = new OperatorDO();
						operatorDO17_1.setLable("#=");
						
					OperatorDO operatorDO17_2 = new OperatorDO();
						operatorDO17_2.setLable("!=");
						operatorList17.add(operatorDO17_1);
						operatorList17.add(operatorDO17_2);
	
				//Setting Data to value
				List<ValueDO> valueList17 = new ArrayList<ValueDO>();
					ValueDO valuDO17_1 = new ValueDO();
						valuDO17_1.setValue("# ");
					
					ValueDO valuDO17_2 = new ValueDO();
						valuDO17_2.setValue("N");
					
					ValueDO valuDO17_3 = new ValueDO();
						valuDO17_3.setValue("Y");
						
					valueList17.add(valuDO17_1);
					valueList17.add(valuDO17_2);
					valueList17.add(valuDO17_3);
		
				//Setting values to FieldValuesDO
				FieldValuesDO fieldValues17 = new FieldValuesDO();
					fieldValues17.setFieldvalues(fieldValueList17);
					fieldValues17.setOperatorDO(operatorList17);
					fieldValues17.setValueDO(valueList17);
		
				fieldValueMainList17.add(fieldValues17);
				
			fieldDO17.setFieldValuesDO(fieldValueMainList17);
				
		FieldDOList_For_Block1.add(fieldDO17);
		
		/* 
		 *  These Data gets populated when user selects Filter name 
		 *  as "205_010_Gesamtprojekt_205W_alle_Werke_(Montage)"
		 *  DATA 5 of Block 2
		 *  
		 */
		FieldDO fieldDO18 = new FieldDO();
		fieldDO18.setFieldHeader("Usage");
			
			List<FieldValuesDO> fieldValueMainList18 = new ArrayList<FieldValuesDO>();
			
			List<String> fieldValueList18 = new ArrayList<String>();
				fieldValueList18.add("Model series");
		
			//Setting data to operator
			List<OperatorDO> operatorList18 = new ArrayList<OperatorDO>();
				OperatorDO operatorDO18_1 = new OperatorDO();
					operatorDO18_1.setLable("#=");
					
				OperatorDO operatorDO18_2 = new OperatorDO();
					operatorDO18_2.setLable("!=");
					
					operatorList18.add(operatorDO18_1);
					operatorList18.add(operatorDO18_2);
		
			//Setting Data to value
			List<ValueDO> valueList18 = new ArrayList<ValueDO>();
		
				ValueDO valuDO18_1 = new ValueDO();
					valuDO18_1.setValue("117");
						valueList18.add(valuDO18_1);
				
				ValueDO valuDO18_2 = new ValueDO();
					valuDO18_2.setValue("164");
						valueList18.add(valuDO18_2);
				
				ValueDO valuDO18_3 = new ValueDO();
					valuDO18_3.setValue("166");
						valueList18.add(valuDO18_3);
				
				ValueDO valuDO18_4 = new ValueDO();
					valuDO18_4.setValue("169");
						valueList18.add(valuDO18_4);
				
				ValueDO valuDO18_5 = new ValueDO();
					valuDO18_5.setValue("171");
						valueList18.add(valuDO18_5);
				
				ValueDO valuDO18_6 = new ValueDO();
					valuDO18_6.setValue("172");
						valueList18.add(valuDO18_6);
				
				ValueDO valuDO18_7 = new ValueDO();
					valuDO18_7.setValue("190");
						valueList18.add(valuDO18_7);
				
				ValueDO valuDO18_8 = new ValueDO();
					valuDO18_8.setValue("197");
						valueList18.add(valuDO18_8);
				
				ValueDO valuDO18_9 = new ValueDO();
					valuDO18_9.setValue("204");
						valueList18.add(valuDO18_9);
				
				ValueDO valuDO18_10 = new ValueDO();
					valuDO18_10.setValue("#205");
						valueList18.add(valuDO18_10);
				
				ValueDO valuDO18_11 = new ValueDO();
					valuDO18_11.setValue("207");
						valueList18.add(valuDO18_11);
				
				ValueDO valuDO18_12 = new ValueDO();
					valuDO18_12.setValue("209");
						valueList18.add(valuDO18_12);
				
				ValueDO valuDO18_13 = new ValueDO();
					valuDO18_13.setValue("211");
						valueList18.add(valuDO18_13);
				
				ValueDO valuDO18_14 = new ValueDO();
					valuDO18_14.setValue("212");
						valueList18.add(valuDO18_14);
				
				ValueDO valuDO18_16 = new ValueDO();
					valuDO18_16.setValue("213");
						valueList18.add(valuDO18_16);
				
				ValueDO valuDO18_17 = new ValueDO();
					valuDO18_17.setValue("216");
						valueList18.add(valuDO18_17);
				
				ValueDO valuDO18_18 = new ValueDO();
					valuDO18_18.setValue("217");
						valueList18.add(valuDO18_18);
				
				ValueDO valuDO18_19 = new ValueDO();
					valuDO18_19.setValue("218");
						valueList18.add(valuDO18_19);
				
				ValueDO valuDO18_20 = new ValueDO();
					valuDO18_20.setValue("219");
						valueList18.add(valuDO18_20);
				
				ValueDO valuDO18_21 = new ValueDO();
					valuDO18_21.setValue("221");
						valueList18.add(valuDO18_21);
	
				ValueDO valuDO18_22 = new ValueDO();
					valuDO18_22.setValue("222");
						valueList18.add(valuDO18_22);
	
				ValueDO valuDO18_23 = new ValueDO();
					valuDO18_23.setValue("230");
						valueList18.add(valuDO18_23);
	
				ValueDO valuDO18_24 = new ValueDO();
					valuDO18_24.setValue("231");
						valueList18.add(valuDO18_24);
				
				ValueDO valuDO18_25 = new ValueDO();
					valuDO18_25.setValue("238");
						valueList18.add(valuDO18_25);
				
				ValueDO valuDO18_26 = new ValueDO();
					valuDO18_26.setValue("240");
						valueList18.add(valuDO18_26);
				
				ValueDO valuDO18_27 = new ValueDO();
					valuDO18_27.setValue("242");
						valueList18.add(valuDO18_27);
				
				ValueDO valuDO18_28 = new ValueDO();
					valuDO18_28.setValue("246");
						valueList18.add(valuDO18_28);
				
				ValueDO valuDO18_29 = new ValueDO();
					valuDO18_29.setValue("251");
						valueList18.add(valuDO18_29);
				
				ValueDO valuDO18_30 = new ValueDO();
					valuDO18_30.setValue("253");
						valueList18.add(valuDO18_30);
				
				ValueDO valuDO18_31 = new ValueDO();
					valuDO18_31.setValue("257");
						valueList18.add(valuDO18_31);
				
				ValueDO valuDO18_32 = new ValueDO();
					valuDO18_32.setValue("290");
						valueList18.add(valuDO18_32);
				
				ValueDO valuDO18_33 = new ValueDO();
					valuDO18_33.setValue("451");
						valueList18.add(valuDO18_33);
				
				ValueDO valuDO18_34 = new ValueDO();
					valuDO18_34.setValue("453");
						valueList18.add(valuDO18_34);
				
				ValueDO valuDO18_35 = new ValueDO();
					valuDO18_35.setValue("463");
						valueList18.add(valuDO18_35);
			
			//Setting values to FieldValuesDO
			FieldValuesDO fieldValues18 = new FieldValuesDO();
				fieldValues18.setFieldvalues(fieldValueList18);
				fieldValues18.setOperatorDO(operatorList18);
				fieldValues18.setValueDO(valueList18);
			
			fieldValueMainList18.add(fieldValues18);
			
			fieldDO18.setFieldValuesDO(fieldValueMainList18);
			
			FieldDOList_For_Block1.add(fieldDO18);
		
			/* 
			 *  These Data gets populated when user selects Filter name 
			 *  as "205_010_Gesamtprojekt_205W_alle_Werke_(Montage)"
			 *  DATA 6 of Block 2
			 *  
			 */
			FieldDO fieldDO19 = new FieldDO();
			fieldDO19.setFieldHeader("Groups");
				
				List<FieldValuesDO> fieldValueMainList19 = new ArrayList<FieldValuesDO>();
				
				List<String> fieldValueList19 = new ArrayList<String>();
					fieldValueList19.add("Acquisition Type");
			
				//Setting data to operator
				List<OperatorDO> operatorList19 = new ArrayList<OperatorDO>();
					OperatorDO operatorDO19_1 = new OperatorDO();
						operatorDO19_1.setLable("#=");
					
						operatorList19.add(operatorDO19_1);
			
				//Setting Data to value
				List<ValueDO> valueList19 = new ArrayList<ValueDO>();
			
					ValueDO valuDO19_1 = new ValueDO();
						valuDO19_1.setValue("*N4*, *N7*");
							valueList19.add(valuDO19_1);
					
					ValueDO valuDO19_2 = new ValueDO();
						valuDO19_2.setValue("AK all");
							valueList19.add(valuDO19_2);
					
					ValueDO valuDO19_3 = new ValueDO();
						valuDO19_3.setValue("Bereinigung *N4* *N7* o *X4* *X7* o *U4* *U7* *L7* *L4*");
							valueList19.add(valuDO19_3);
					
					ValueDO valuDO19_4 = new ValueDO();
						valuDO19_4.setValue("BZA *L* globalx");
							valueList19.add(valuDO19_4);
					
					ValueDO valuDO19_5 = new ValueDO();
						valuDO19_5.setValue("BZA *L*/ L+89 (Import&Local)");
							valueList19.add(valuDO19_5);
					
					ValueDO valuDO19_6 = new ValueDO();
						valuDO19_6.setValue("BZA 0, 1, 4 und 7");
							valueList19.add(valuDO19_6);
					
					ValueDO valuDO19_7 = new ValueDO();
						valuDO19_7.setValue("BZA_China");
							valueList19.add(valuDO19_7);
					
					ValueDO valuDO19_8 = new ValueDO();
						valuDO19_8.setValue("Dispositive_Bauteile");
							valueList19.add(valuDO19_8);
					
					ValueDO valuDO19_9 = new ValueDO();
						valuDO19_9.setValue("Enthaelt *B0*  *B1*  *B4*  *B7*");
							valueList19.add(valuDO19_9);
					
					ValueDO valuDO19_10 = new ValueDO();
						valuDO19_10.setValue("Enthaelt *B7* oder *B4*");
							valueList19.add(valuDO19_10);
					
					ValueDO valuDO19_11 = new ValueDO();
						valuDO19_11.setValue("Enthaelt *L4* *L7*");
							valueList19.add(valuDO19_11);
					
					ValueDO valuDO19_12 = new ValueDO();
						valuDO19_12.setValue("#Enthaelt *N4* *N7* o *X4* *X7* o *U4* *U7*");
							valueList19.add(valuDO19_12);
					
					ValueDO valuDO19_13 = new ValueDO();
						valuDO19_13.setValue("V205 BIW");
							valueList19.add(valuDO19_13);
					
				//Setting values to FieldValuesDO
				FieldValuesDO fieldValues19 = new FieldValuesDO();
					fieldValues19.setFieldvalues(fieldValueList19);
					fieldValues19.setOperatorDO(operatorList19);
					fieldValues19.setValueDO(valueList19);
				
				fieldValueMainList19.add(fieldValues19);
				
				fieldDO19.setFieldValuesDO(fieldValueMainList19);
				
				FieldDOList_For_Block1.add(fieldDO19);	
		
				/* 
				 *  These Data gets populated when user selects Filter name 
				 *  as "205_010_Gesamtprojekt_205W_alle_Werke_(Montage)"
				 *  DATA 7 of Block 2
				 *  
				 */
				
				FieldDO fieldDO20 = new FieldDO();
				fieldDO20.setFieldHeader("Parts Master Data");
				
					List<FieldValuesDO> fieldValueMainList20 = new ArrayList<FieldValuesDO>();
				
					List<String> fieldValueList20 = new ArrayList<String>();
						fieldValueList20.add("Manufacturing Station");
			
					//Setting data to operator
						List<OperatorDO> operatorList20 = new ArrayList<OperatorDO>();
					
							OperatorDO operatorDO20_1 = new OperatorDO();
								operatorDO20_1.setLable("#=");
								
							OperatorDO operatorDO20_2 = new OperatorDO();
								operatorDO20_1.setLable("!=");
								
						operatorList20.add(operatorDO20_1);
						operatorList20.add(operatorDO20_2);
			
						//Setting Data to value
						List<ValueDO> valueList20 = new ArrayList<ValueDO>();
							ValueDO valuDO20_1 = new ValueDO();
								valuDO20_1.setValue("");
							
							ValueDO valuDO20_2 = new ValueDO();
								valuDO20_2.setValue("#ASSY");
							
							ValueDO valuDO20_3 = new ValueDO();
								valuDO20_3.setValue("BIW");
							
							ValueDO valuDO20_4 = new ValueDO();
								valuDO20_4.setValue("open");
							
							ValueDO valuDO20_5 = new ValueDO();
								valuDO20_5.setValue("PAINT");
							
							valueList20.add(valuDO20_1);
							valueList20.add(valuDO20_2);
							valueList20.add(valuDO20_3);
							valueList20.add(valuDO20_4);
							valueList20.add(valuDO20_5);
				
						//Setting values to FieldValuesDO
						FieldValuesDO fieldValues20 = new FieldValuesDO();
							fieldValues20.setFieldvalues(fieldValueList20);
							fieldValues20.setOperatorDO(operatorList20);
							fieldValues20.setValueDO(valueList20);
					
						fieldValueMainList20.add(fieldValues20);
						
						fieldDO20.setFieldValuesDO(fieldValueMainList20);
						
				FieldDOList_For_Block1.add(fieldDO20);		
				
				filterBlockDO1.setFieldDOList(FieldDOList_For_Block1);
				
				filterSettingDO1.setIs_ColorNeutralPartsMasterData(true);
				filterSettingDO1.setIs_ColorNeutralPartsMasterdataforColoredParts(true);
				filterSettingDO1.setIs_ColoredParts(false);
				filterSettingDO1.setValidTo("today");
				filterSettingDO1.setValidTo("infinite");
				filterSettingDO1.setIs_HighestProgressiveChangeNumberInSelectedInterval(true);
				filterSettingDO1.setIs_IncludePartsWithoutMasterData(true);
				filterSettingDO1.setIs_AutomaticViewFilter(true);
				
				filterBlockDO1.setFilterSettingDO(filterSettingDO1);
				
				/*
				 * Added Plants details
				 */
				
				PlantsDO plantsDO1 = new PlantsDO();
				plantsDO1.setPlantHeader("Productions plants");
				
					List<PlantsValuesDO> plants = new ArrayList<PlantsValuesDO>();
					
						PlantsValuesDO plant1 = new PlantsValuesDO();
							plant1.setValues("0500");
							plant1.setSelected(false);
								plants.add(plant1);
							
						PlantsValuesDO plant2 = new PlantsValuesDO();
							plant2.setValues("0540");
							plant2.setSelected(false);
								plants.add(plant2);
							
						PlantsValuesDO plant3 = new PlantsValuesDO();
							plant3.setValues("0670");
							plant3.setSelected(false);	
								plants.add(plant3);
							
						PlantsValuesDO plant4 = new PlantsValuesDO();
							plant4.setValues("1040");
							plant4.setSelected(false);	
								plants.add(plant4);
							
						PlantsValuesDO plant5 = new PlantsValuesDO();
							plant5.setValues("1170");
							plant5.setSelected(false);	
								plants.add(plant5);
							
						PlantsValuesDO plant6 = new PlantsValuesDO();
							plant6.setValues("1380");
							plant6.setSelected(false);	
								plants.add(plant6);
							
						PlantsValuesDO plant7 = new PlantsValuesDO();
							plant7.setValues("1750");
							plant7.setSelected(false);	
								plants.add(plant7);
							
						PlantsValuesDO plant8 = new PlantsValuesDO();
							plant8.setValues("3020");
							plant8.setSelected(false);
								plants.add(plant8);
							
						PlantsValuesDO plant9 = new PlantsValuesDO();
							plant9.setValues("3710");
							plant9.setSelected(false);	
								plants.add(plant9);
								
				plantsDO1.setPlants(plants);
				
				plantsDOList.add(plantsDO1);
				
				//Plants data 2
				
				PlantsDO plantsDO2 = new PlantsDO();
				plantsDO2.setPlantHeader("Contract plants");
				
					List<PlantsValuesDO> plants2 = new ArrayList<PlantsValuesDO>();
					
						PlantsValuesDO plant2_1 = new PlantsValuesDO();
							plant2_1.setValues("0500");
							plant2_1.setSelected(false);
								plants2.add(plant1);
							
						PlantsValuesDO plant2_2 = new PlantsValuesDO();
							plant2_2.setValues("0540");
							plant2_2.setSelected(false);
								plants2.add(plant2_2);
							
						PlantsValuesDO plant2_3 = new PlantsValuesDO();
							plant2_3.setValues("0670");
							plant2_3.setSelected(false);	
								plants2.add(plant2_3);
							
						PlantsValuesDO plant2_4 = new PlantsValuesDO();
							plant2_4.setValues("1040");
							plant2_4.setSelected(false);	
								plants2.add(plant2_4);
							
						PlantsValuesDO plant2_5 = new PlantsValuesDO();
							plant2_5.setValues("1170");
							plant2_5.setSelected(false);	
								plants2.add(plant2_5);
							
						PlantsValuesDO plant2_6 = new PlantsValuesDO();
							plant2_6.setValues("1380");
							plant2_6.setSelected(false);	
								plants2.add(plant2_6);
								
						PlantsValuesDO plant2_7 = new PlantsValuesDO();
							plant2_7.setValues("1750");
							plant2_7.setSelected(false);	
								plants2.add(plant2_7);
							
						PlantsValuesDO plant2_8 = new PlantsValuesDO();
							plant2_8.setValues("3020");
							plant2_8.setSelected(false);
								plants2.add(plant2_8);
							
						PlantsValuesDO plant2_9 = new PlantsValuesDO();
							plant2_9.setValues("3710");
							plant2_9.setSelected(false);	
								plants2.add(plant2_9);
								
					plantsDO2.setPlants(plants2);
				
				plantsDOList.add(plantsDO2);
				
				//Plants data 3
				
				PlantsDO plantsDO3 = new PlantsDO();
				plantsDO3.setPlantHeader("Associated MBCCs");
				
					List<PlantsValuesDO> plants3 = new ArrayList<PlantsValuesDO>();
					
						PlantsValuesDO plant3_1 = new PlantsValuesDO();
							plant3_1.setValues("0514");
							plant3_1.setSelected(false);
								plants3.add(plant3_1);
							
						PlantsValuesDO plant3_2 = new PlantsValuesDO();
							plant3_2.setValues("0513");
							plant3_2.setSelected(false);
								plants3.add(plant2_2);
							
						PlantsValuesDO plant3_3 = new PlantsValuesDO();
							plant3_3.setValues("0515");
							plant3_3.setSelected(false);	
								plants3.add(plant3_3);
								
					plantsDO3.setPlants(plants3);
				
				plantsDOList.add(plantsDO3);
				
				//Plants data 4
				
				PlantsDO plantsDO4 = new PlantsDO();
				plantsDO4.setPlantHeader("Non-production plants");
				
					List<PlantsValuesDO> plants4 = new ArrayList<PlantsValuesDO>();
					
						PlantsValuesDO plant4_1 = new PlantsValuesDO();
							plant4_1.setValues("1330");
							plant4_1.setSelected(false);
								plants4.add(plant4_1);
							
						PlantsValuesDO plant4_2 = new PlantsValuesDO();
							plant4_2.setValues("9999");
							plant4_2.setSelected(false);
								plants4.add(plant4_2);
						
								
					plantsDO4.setPlants(plants4);
				
				plantsDOList.add(plantsDO4);
				
				filterPlantsDO.setPlants(plantsDOList);
				
				filterBlockDO1.setFilterPlantsDOList(filterPlantsDO);
				
				filterBlockDO.add(filterBlockDO1);
				
				}
				
					/*
					 * Filter block available attributes
					 */
					/*
					 * Field Data1
					 */
					FieldDO fieldDO1 = new FieldDO();
						fieldDO1.setFieldHeader("Milestone");
					
					List<FieldValuesDO> fieldValuesDO = new ArrayList<FieldValuesDO>();	
						FieldValuesDO FieldValuesDO1 = new FieldValuesDO();
						FieldValuesDO FieldValuesDO2 = new FieldValuesDO();
					
					List<String> filterValueList = new ArrayList<String>();	
						String filter1 = "Prototype parts actual";
						filterValueList.add(filter1);
						
					List<String> filterValueList2 = new ArrayList<String>();	
						String filter2 = "Prototype parts expected date";
						filterValueList2.add(filter2);	
						
						//Setting data to operator
						List<OperatorDO> operatorList = new ArrayList<OperatorDO>();
						
							OperatorDO operatorDO1 = new OperatorDO();
							operatorDO1.setLable("=");
								
							OperatorDO operatorDO2 = new OperatorDO();
							operatorDO2.setLable("!=");
							
							OperatorDO operatorDO3 = new OperatorDO();
							operatorDO3.setLable("#>");
							
							OperatorDO operatorDO4 = new OperatorDO();
							operatorDO4.setLable("<");
							
							OperatorDO operatorDO5 = new OperatorDO();
							operatorDO5.setLable("&#8805");
							
							OperatorDO operatorDO6 = new OperatorDO();
							operatorDO6.setLable("&#8804");
							
							operatorList.add(operatorDO1);
							operatorList.add(operatorDO2);
							operatorList.add(operatorDO3);
							operatorList.add(operatorDO4);
							operatorList.add(operatorDO5);
							operatorList.add(operatorDO6);
				
						//Setting Data to value
						List<ValueDO> valueList = new ArrayList<ValueDO>();
							
							ValueDO valuDO1 = new ValueDO();
							valuDO1.setValue("");
							valueList.add(valuDO1);
							
							ValueDO valuDO2 = new ValueDO();
							valuDO2.setValue("date");
							valueList.add(valuDO2);
							
						FieldValuesDO1.setFieldvalues(filterValueList);
						FieldValuesDO1.setOperatorDO(operatorList);
						FieldValuesDO1.setValueDO(valueList);
						
						FieldValuesDO2.setFieldvalues(filterValueList2);
						FieldValuesDO2.setOperatorDO(operatorList);
						FieldValuesDO2.setValueDO(valueList);
					
						
						fieldValuesDO.add(FieldValuesDO1);
						fieldValuesDO.add(FieldValuesDO2);
						
						
						fieldDO1.setFieldValuesDO(fieldValuesDO);
						FieldDOList_For_Block3.add(fieldDO1);
						
					/*
					 * Field Data3
					 */
					FieldDO fieldDO3 = new FieldDO();
						fieldDO3.setFieldHeader("Supplier");
			
					List<FieldValuesDO> fieldValuesDO3 = new ArrayList<FieldValuesDO>();	
						FieldValuesDO FieldValuesDO3 = new FieldValuesDO();
						FieldValuesDO FieldValuesDO4 = new FieldValuesDO();
			
					List<String> filterValueList3 = new ArrayList<String>();	
						String filter3 = "Number of suppliers";
					filterValueList3.add(filter3);
					
					List<String> filterValueList4 = new ArrayList<String>();	
						String filter4 = "Start-up Indicator";
					filterValueList4.add(filter4);
			
					
					List<OperatorDO> operatorList3 = new ArrayList<OperatorDO>();
					
						OperatorDO operatorDO3_1 = new OperatorDO();
							operatorDO3_1.setLable("=");
							
						OperatorDO operatorDO3_2 = new OperatorDO();
							operatorDO3_2.setLable("!=");
						
						OperatorDO operatorDO3_3 = new OperatorDO();
							operatorDO3_3.setLable(">");
							
						OperatorDO operatorDO3_4 = new OperatorDO();
							operatorDO3_4.setLable("<");
						
						OperatorDO operatorDO3_5 = new OperatorDO();
							operatorDO3_5.setLable("&#8805");
							
						OperatorDO operatorDO3_6 = new OperatorDO();
							operatorDO3_6.setLable("&#8804");
					
					operatorList3.add(operatorDO3_1);
					operatorList3.add(operatorDO3_2);
					operatorList3.add(operatorDO3_3);
					operatorList3.add(operatorDO3_4);
					operatorList3.add(operatorDO3_5);
					operatorList3.add(operatorDO3_6);
					
					
					List<OperatorDO> operatorList4 = new ArrayList<OperatorDO>();
					
						OperatorDO operatorDO4_1 = new OperatorDO();
							operatorDO4_1.setLable("=");
							
						OperatorDO operatorDO4_2 = new OperatorDO();
							operatorDO4_2.setLable("!=");
					
					operatorList4.add(operatorDO4_1);
					operatorList4.add(operatorDO4_2);
			
				//Setting Data to value
				List<ValueDO> valueList3 = new ArrayList<ValueDO>();
					
					ValueDO valuDO3_1 = new ValueDO();
						valuDO3_1.setValue("1");
					valueList3.add(valuDO3_1);
			
					ValueDO valuDO3_2 = new ValueDO();
						valuDO3_2.setValue("text");
					valueList3.add(valuDO3_2);
					
					
				//Setting Data to value
				List<ValueDO> valueList4 = new ArrayList<ValueDO>();
						
					ValueDO valuDO4_1 = new ValueDO();
						valuDO4_1.setValue("");
					valueList4.add(valuDO4_1);
				
					ValueDO valuDO4_2 = new ValueDO();
						valuDO4_2.setValue("N");
					valueList4.add(valuDO4_2);
						
					ValueDO valuDO4_3 = new ValueDO();
						valuDO4_3.setValue("Y");
					valueList4.add(valuDO4_3);	
			
					FieldValuesDO3.setFieldvalues(filterValueList3);
					FieldValuesDO3.setOperatorDO(operatorList3);
					FieldValuesDO3.setValueDO(valueList3);
					
					FieldValuesDO4.setFieldvalues(filterValueList4);
					FieldValuesDO4.setOperatorDO(operatorList4);
					FieldValuesDO4.setValueDO(valueList4);
				
					fieldValuesDO3.add(FieldValuesDO3);
					fieldValuesDO3.add(FieldValuesDO4);
					
					fieldDO3.setFieldValuesDO(fieldValuesDO3);
			
				FieldDOList_For_Block3.add(fieldDO3);
					
					/*
					 * Field data 5
					 */
					FieldDO fieldDO5 = new FieldDO();
						fieldDO5.setFieldHeader("Parts master data");
			
					List<FieldValuesDO> fieldValuesDOList5 = new ArrayList<FieldValuesDO>();	
						FieldValuesDO FieldValuesDO5 = new FieldValuesDO();
			
					List<String> filterValueList5 = new ArrayList<String>();	
				
					String filter5 = "Plant";
					filterValueList5.add(filter5);	
			
					List<OperatorDO> operatorList5 = new ArrayList<OperatorDO>();
					
					OperatorDO operatorDO5_1 = new OperatorDO();
					operatorDO5_1.setLable("=");
						
					OperatorDO operatorDO5_2 = new OperatorDO();
					operatorDO5_2.setLable("!=");
					
					operatorList5.add(operatorDO5_1);
					operatorList5.add(operatorDO5_2);
			
				//Setting Data to value
				List<ValueDO> valueList5 = new ArrayList<ValueDO>();
					
					ValueDO valuDO5_1 = new ValueDO();
						valuDO5_1.setValue("");
							valueList5.add(valuDO5_1);
			
					ValueDO valuDO5_2 = new ValueDO();
						valuDO5_2.setValue("0500");
							valueList5.add(valuDO5_2);
					
					ValueDO valuDO5_3 = new ValueDO();
						valuDO5_3.setValue("0540");
							valueList5.add(valuDO5_3);
					
					ValueDO valuDO5_4 = new ValueDO();
						valuDO5_4.setValue("0670");
							valueList5.add(valuDO5_4);
					
					ValueDO valuDO5_5 = new ValueDO();
						valuDO5_5.setValue("0540");
							valueList5.add(valuDO5_5);
					
					ValueDO valuDO5_6 = new ValueDO();
						valuDO5_6.setValue("0670");
							valueList5.add(valuDO5_6);
					
					ValueDO valuDO5_7 = new ValueDO();
						valuDO5_7.setValue("1040");
							valueList5.add(valuDO5_7);
					
					ValueDO valuDO5_8 = new ValueDO();
						valuDO5_8.setValue("1170");
							valueList5.add(valuDO5_8);
			
					ValueDO valuDO5_9 = new ValueDO();
						valuDO5_9.setValue("1330");
							valueList5.add(valuDO5_9);
					
					ValueDO valuDO5_10 = new ValueDO();
						valuDO5_10.setValue("1380");
							valueList5.add(valuDO5_10);
					
					ValueDO valuDO5_11 = new ValueDO();
						valuDO5_11.setValue("1750");
							valueList5.add(valuDO5_11);
					
					ValueDO valuDO5_12 = new ValueDO();
						valuDO5_12.setValue("3020");
							valueList5.add(valuDO5_12);
					
					ValueDO valuDO5_13 = new ValueDO();
						valuDO5_13.setValue("3710");
							valueList5.add(valuDO5_13);
					
					ValueDO valuDO5_14 = new ValueDO();
					valuDO5_14.setValue("9999");
							valueList5.add(valuDO5_14);
			
					FieldValuesDO5.setFieldvalues(filterValueList5);
					FieldValuesDO5.setOperatorDO(operatorList5);
					FieldValuesDO5.setValueDO(valueList5);
				
					fieldValuesDOList5.add(FieldValuesDO5);
					fieldDO5.setFieldValuesDO(fieldValuesDOList5);
			
				FieldDOList_For_Block3.add(fieldDO5);
				/*
				 * Field data 6
				 */
					FieldDO fieldDO6 = new FieldDO();
						fieldDO6.setFieldHeader("PEM");
			
					List<FieldValuesDO> fieldValuesDOList6 = new ArrayList<FieldValuesDO>();	
						FieldValuesDO FieldValuesDO6 = new FieldValuesDO();
			
					List<String> filterValueList6 = new ArrayList<String>();	
				
					String filter6 = "Number of suppliers";
					filterValueList6.add(filter6);	
			
					List<OperatorDO> operatorList6 = new ArrayList<OperatorDO>();
					
					OperatorDO operatorDO6_1 = new OperatorDO();
						operatorDO6_1.setLable("=");
						
					OperatorDO operatorDO6_2 = new OperatorDO();
						operatorDO6_2.setLable("!=");
					
					OperatorDO operatorDO6_3 = new OperatorDO();
						operatorDO6_3.setLable(">");
						
					OperatorDO operatorDO6_4 = new OperatorDO();
						operatorDO6_4.setLable("<");
					
					OperatorDO operatorDO6_5 = new OperatorDO();
						operatorDO6_5.setLable("&#8805");
						
					OperatorDO operatorDO6_6 = new OperatorDO();
						operatorDO6_6.setLable("&#8804");
					
					operatorList6.add(operatorDO6_1);
					operatorList6.add(operatorDO6_2);
					operatorList6.add(operatorDO6_3);
					operatorList6.add(operatorDO6_4);
					operatorList6.add(operatorDO6_5);
					operatorList6.add(operatorDO6_6);
			
				//Setting Data to value
				List<ValueDO> valueList6 = new ArrayList<ValueDO>();
					
					ValueDO valuDO6_1 = new ValueDO();
						valuDO6_1.setValue("");
							valueList6.add(valuDO6_1);
			
					ValueDO valuDO6_2 = new ValueDO();
						valuDO6_2.setValue("text");
							valueList6.add(valuDO6_2);
					
					FieldValuesDO6.setFieldvalues(filterValueList6);
					FieldValuesDO6.setOperatorDO(operatorList6);
					FieldValuesDO6.setValueDO(valueList6);
				
					fieldValuesDOList6.add(FieldValuesDO6);
					fieldDO6.setFieldValuesDO(fieldValuesDOList6);
			
				FieldDOList_For_Block3.add(fieldDO6);
					/*
					 * Field data 7
					 */
					FieldDO fieldDO7 = new FieldDO();
						fieldDO7.setFieldHeader("Project");
				
					List<FieldValuesDO> fieldValuesDOList7 = new ArrayList<FieldValuesDO>();	
						FieldValuesDO FieldValuesDO7 = new FieldValuesDO();
						FieldValuesDO FieldValuesDO8 = new FieldValuesDO();
				
					List<String> filterValueList7 = new ArrayList<String>();	
						String filter7 = "Project ident";
					filterValueList7.add(filter7);
					
					List<String> filterValueList8 = new ArrayList<String>();	
						String filter8 = "Project short name";
					filterValueList8.add(filter8);
				
					List<OperatorDO> operatorList7 = new ArrayList<OperatorDO>();
					
					OperatorDO operatorDO7_1 = new OperatorDO();
						operatorDO7_1.setLable("=");
						
					OperatorDO operatorDO7_2 = new OperatorDO();
						operatorDO7_2.setLable("!=");
					
					operatorList7.add(operatorDO7_1);
					operatorList7.add(operatorDO7_2);
				
					//Setting Data to value
					List<ValueDO> valueList7 = new ArrayList<ValueDO>();
					
					ValueDO valuDO7_1 = new ValueDO();
						valuDO7_1.setValue("");
							valueList7.add(valuDO7_1);
				
					ValueDO valuDO7_2 = new ValueDO();
						valuDO7_2.setValue("text");
							valueList7.add(valuDO7_2);
					
					FieldValuesDO7.setFieldvalues(filterValueList7);
					FieldValuesDO7.setOperatorDO(operatorList7);
					FieldValuesDO7.setValueDO(valueList7);
					
					FieldValuesDO8.setFieldvalues(filterValueList8);
					FieldValuesDO8.setOperatorDO(operatorList7);
					FieldValuesDO8.setValueDO(valueList7);
					
					fieldValuesDOList7.add(FieldValuesDO7);
					fieldValuesDOList7.add(FieldValuesDO8);
					
					fieldDO7.setFieldValuesDO(fieldValuesDOList7);
				
				FieldDOList_For_Block3.add(fieldDO7);
				
				/*
				 * Field data 9
				 */
				FieldDO fieldDO9 = new FieldDO();
					fieldDO9.setFieldHeader("Usage");
			
				List<FieldValuesDO> fieldValuesDOList9 = new ArrayList<FieldValuesDO>();	
					FieldValuesDO FieldValuesDO9 = new FieldValuesDO();
			
				List<String> filterValueList9 = new ArrayList<String>();	
			
				String filter9 = "Model series";
				filterValueList9.add(filter9);	
			
				List<OperatorDO> operatorList9 = new ArrayList<OperatorDO>();
				
				OperatorDO operatorDO9_1 = new OperatorDO();
				operatorDO9_1.setLable("=");
					
				OperatorDO operatorDO9_2 = new OperatorDO();
				operatorDO9_2.setLable("!=");
				
				operatorList9.add(operatorDO9_1);
				operatorList9.add(operatorDO9_2);
			
			//Setting Data to value
			List<ValueDO> valueList9 = new ArrayList<ValueDO>();
				
				ValueDO valuDO9_1 = new ValueDO();
					valuDO9_1.setValue("");
						valueList9.add(valuDO9_1);
			
				ValueDO valuDO9_2 = new ValueDO();
					valuDO9_2.setValue("117");
						valueList9.add(valuDO9_2);
				
				ValueDO valuDO9_3 = new ValueDO();
					valuDO9_3.setValue("164");
						valueList9.add(valuDO9_3);
				
				ValueDO valuDO9_4 = new ValueDO();
					valuDO9_4.setValue("166");
						valueList9.add(valuDO9_4);
				
				ValueDO valuDO9_5 = new ValueDO();
					valuDO9_5.setValue("169");
						valueList9.add(valuDO9_5);
				
				ValueDO valuDO9_6 = new ValueDO();
					valuDO9_6.setValue("171");
						valueList9.add(valuDO9_6);
				
				ValueDO valuDO9_7 = new ValueDO();
					valuDO9_7.setValue("172");
						valueList9.add(valuDO9_7);
				
				ValueDO valuDO9_8 = new ValueDO();
					valuDO9_8.setValue("190");
						valueList9.add(valuDO9_8);
			
				ValueDO valuDO9_9 = new ValueDO();
					valuDO9_9.setValue("197");
						valueList9.add(valuDO9_9);
				
				ValueDO valuDO9_10 = new ValueDO();
					valuDO9_10.setValue("204");
						valueList9.add(valuDO9_10);
				
				ValueDO valuDO9_11 = new ValueDO();
					valuDO9_11.setValue("205");
						valueList9.add(valuDO9_11);
				
				ValueDO valuDO9_12 = new ValueDO();
					valuDO9_12.setValue("207");
						valueList9.add(valuDO9_12);
				
				ValueDO valuDO9_13 = new ValueDO();
					valuDO9_13.setValue("209");
						valueList9.add(valuDO9_13);
				
				ValueDO valuDO9_15 = new ValueDO();
					valuDO9_15.setValue("211");
						valueList9.add(valuDO9_15);
						
				ValueDO valuDO9_16 = new ValueDO();
					valuDO9_16.setValue("212");
						valueList9.add(valuDO9_16);
					
				ValueDO valuDO9_17 = new ValueDO();
					valuDO9_17.setValue("213");
						valueList9.add(valuDO9_17);
			
				ValueDO valuDO9_18 = new ValueDO();
					valuDO9_18.setValue("216");
						valueList9.add(valuDO9_18);
					
				ValueDO valuDO9_19 = new ValueDO();
					valuDO9_19.setValue("217");
						valueList9.add(valuDO9_19);
					
				ValueDO valuDO9_20 = new ValueDO();
					valuDO9_20.setValue("218");
						valueList9.add(valuDO9_20);
					
				ValueDO valuDO9_21 = new ValueDO();
					valuDO9_21.setValue("219");
						valueList9.add(valuDO9_21);
					
				ValueDO valuDO9_22 = new ValueDO();
					valuDO9_22.setValue("221");
						valueList9.add(valuDO9_22);
					
				ValueDO valuDO9_23 = new ValueDO();
					valuDO9_23.setValue("222");
						valueList9.add(valuDO9_23);		
			
				FieldValuesDO9.setFieldvalues(filterValueList9);
				FieldValuesDO9.setOperatorDO(operatorList9);
				FieldValuesDO9.setValueDO(valueList9);
			
				fieldValuesDOList9.add(FieldValuesDO9);
				fieldDO9.setFieldValuesDO(fieldValuesDOList9);
			
				FieldDOList_For_Block3.add(fieldDO9);
				
				/*
				 * Field data 10
				 */
				FieldDO fieldDO10 = new FieldDO();
					fieldDO10.setFieldHeader("Smaragd");
			
				List<FieldValuesDO> fieldValuesDOList10 = new ArrayList<FieldValuesDO>();	
					FieldValuesDO FieldValuesDO10 = new FieldValuesDO();
			
				List<String> filterValueList10 = new ArrayList<String>();	
			
				String filter10 = "Prototype Batches";
				filterValueList10.add(filter10);	
			
				List<OperatorDO> operatorList10 = new ArrayList<OperatorDO>();
				
				OperatorDO operatorDO10_1 = new OperatorDO();
					operatorDO10_1.setLable("=");
					
				OperatorDO operatorDO10_2 = new OperatorDO();
					operatorDO10_2.setLable("!=");
				
				operatorList10.add(operatorDO10_1);
				operatorList10.add(operatorDO10_2);
			
				//Setting Data to value
				List<ValueDO> valueList10 = new ArrayList<ValueDO>();
				
				ValueDO valuDO10_1 = new ValueDO();
					valuDO10_1.setValue("");
						valueList10.add(valuDO10_1);
			
				ValueDO valuDO10_2 = new ValueDO();
					valuDO10_2.setValue("text");
						valueList10.add(valuDO10_2);
				
				FieldValuesDO10.setFieldvalues(filterValueList10);
				FieldValuesDO10.setOperatorDO(operatorList10);
				FieldValuesDO10.setValueDO(valueList10);
			
				fieldValuesDOList10.add(FieldValuesDO10);
				fieldDO10.setFieldValuesDO(fieldValuesDOList10);
			
				FieldDOList_For_Block3.add(fieldDO10);
				filterBlockDO3.setFieldDOList(FieldDOList_For_Block3);
				filterBlockDO.add(filterBlockDO3);
		
		filterSectionDO.setFilterBlockDO(filterBlockDO);
		
		return filterSectionDO;
		
		}
	
	public ViewParentDO getViewResult(String Value){
		
		ViewParentDO ViewParentDO = new ViewParentDO();
		
		List<ViewDO> viewList = new ArrayList<ViewDO>();
			/*
			 * 1ST VIEW DATA PROVIDED BY NICOS
			 */
			ViewDO viewDO3 = new ViewDO();
			
				viewDO3.setValue("P138_000_Parts List Suppliers");
				viewDO3.setName("P138_000_Parts List Suppliers");
				viewDO3.setDescription("Parts list Suppliers");
				viewDO3.setReadOnly(true);
				viewDO3.setStandardView(false);
				viewDO3.setSubscribed(true);
		
				List<ColumnDO> columnList3 = new ArrayList<ColumnDO>();
			
				ColumnDO columnDO3_1 = new ColumnDO();
					columnDO3_1.setColumnName("Parts master data: Part number (K)");
						columnList3.add(columnDO3_1);
			
				ColumnDO columnDO3_2 = new ColumnDO();
					columnDO3_2.setColumnName("Parts master data: Plant (K)");
						columnList3.add(columnDO3_2);
			
				ColumnDO columnDO3_3 = new ColumnDO();
					columnDO3_3.setColumnName("Parts master data: Contract plant (K)");
						columnList3.add(columnDO3_3);
				
				ColumnDO columnDO3_4 = new ColumnDO();
					columnDO3_4.setColumnName("Usage: Model series");
						columnList3.add(columnDO3_4);
				
				ColumnDO columnDO3_5 = new ColumnDO();
					columnDO3_5.setColumnName("Supplier: Supplier number (K)");
						columnList3.add(columnDO3_5);
				
				ColumnDO columnDO3_6 = new ColumnDO();
					columnDO3_6.setColumnName("Supplier: Supplier index (K)");
						columnList3.add(columnDO3_6);
				
				ColumnDO columnDO3_7 = new ColumnDO();
					columnDO3_7.setColumnName("Supplier: Supplier name");
						columnList3.add(columnDO3_7);
				
				ColumnDO columnDO3_8 = new ColumnDO();
					columnDO3_8.setColumnName("Parts master data: Description (K)");
						columnList3.add(columnDO3_8);
				
				ColumnDO columnDO3_9 = new ColumnDO();
					columnDO3_9.setColumnName("Parts master data: ZB Indicator (K)");
						columnList3.add(columnDO3_9);
			
				viewDO3.setColumnDO(columnList3);
			
				viewList.add(viewDO3);
			
			/*
			 * 2ND VIEW DATA PROVIDED BY NICOS
			 */
			ViewDO viewDO1 = new ViewDO();
				
				viewDO1.setValue("P138_000_Parts List View");
				viewDO1.setName("P138_000_Parts List View");
				viewDO1.setDescription("Parts list");
				viewDO1.setReadOnly(true);
				viewDO1.setStandardView(false);
				viewDO1.setSubscribed(true);
			
				List<ColumnDO> columnList = new ArrayList<ColumnDO>();
			
				ColumnDO columnDO1 = new ColumnDO();
					columnDO1.setColumnName("Parts master data: Part number (K)");
						columnList.add(columnDO1);
			
				ColumnDO columnDO2 = new ColumnDO();
					columnDO2.setColumnName("Usage: Model series (K)");
						columnList.add(columnDO2);
			
				ColumnDO columnDO3 = new ColumnDO();
					columnDO3.setColumnName("Usage: Type VersionDescriptionPlant (K)");
						columnList.add(columnDO3);
				
				ColumnDO columnDO4 = new ColumnDO();
					columnDO4.setColumnName("Parts master data: Contract plant (K)");
						columnList.add(columnDO4);
				
				ColumnDO columnDO5 = new ColumnDO();
					columnDO5.setColumnName("Parts master data: ZB Indicator");
						columnList.add(columnDO5);
				
				ColumnDO columnDO6 = new ColumnDO();
					columnDO6.setColumnName("MRP controller index");
						columnList.add(columnDO6);
				
				ColumnDO columnDO7 = new ColumnDO();
					columnDO7.setColumnName("Supplier: Part master data: GF73 ECC Specialist");
						columnList.add(columnDO7);
				
				ColumnDO columnDO8 = new ColumnDO();
					columnDO8.setColumnName("Parts master data: Purchase Key");
						columnList.add(columnDO8);
				
				ColumnDO columnDO9 = new ColumnDO();
					columnDO9.setColumnName("Generic fields on parts master: GF28 MBCC Part");
						columnList.add(columnDO9);
				
				ColumnDO columnDO10 = new ColumnDO();
					columnDO10.setColumnName("Supplier: Supplier Name");
						columnList.add(columnDO10);
				
				ColumnDO columnDO11 = new ColumnDO();
					columnDO11.setColumnName("Supplier number (K)");
						columnList.add(columnDO11);
			
				viewDO1.setColumnDO(columnList);
			
		viewList.add(viewDO1);
		
			/*
			 * 3RD VIEW DATA PROVIDED BY NICOS WITH VALUE
			 * BVA_maschinell
			 */
		
			if(Value.equalsIgnoreCase("BVA_maschinell")){
			
			ViewDO viewDO = new ViewDO();
				viewDO.setValue("BVA_maschinell");
				viewDO.setName("BVA_maschinell");
				viewDO.setDescription("BVA_maschinell");
				viewDO.setReadOnly(false);
				viewDO.setStandardView(false);
				viewDO.setSubscribed(true);
			
			List<CategoryDO> categoryDOList = new ArrayList<CategoryDO>();
			
				/*
				 * SETTING VALUE FOR 1ST CATEGORY
				 */
				CategoryDO categoryDO = new CategoryDO();
					categoryDO.setCategoryName("AE KEM master (E)");
					
						List<ElementDO> elementList = new ArrayList<ElementDO>();
							
							ElementDO elementDO1 = new ElementDO();
								elementDO1.setValues("AE Duration in months");
								elementList.add(elementDO1);
								
							elementDO1 = new ElementDO();
								elementDO1.setValues("AE Planned end date");
								elementList.add(elementDO1);
								
							elementDO1 = new ElementDO();
								elementDO1.setValues("AE Planned start date");
								elementList.add(elementDO1);
								
							elementDO1 = new ElementDO();
								elementDO1.setValues("AE Special process sampling");
								elementList.add(elementDO1);	
								
							elementDO1 = new ElementDO();
								elementDO1.setValues("Change status (AE)");
								elementList.add(elementDO1);
								
					categoryDO.setValues(elementList);
					
					categoryDOList.add(categoryDO);	
					
					/*
					 * SETTING VALUE FOR 2nd CATEGORY
					 */
					CategoryDO categoryDO2 = new CategoryDO();
						categoryDO2.setCategoryName("Allocation scope");
						
							List<ElementDO> elementList2 = new ArrayList<ElementDO>();
								
								ElementDO elementDO2 = new ElementDO();
									elementDO2.setValues("ABC-Classification");
									elementList2.add(elementDO2);
									
								elementDO2 = new ElementDO();
									elementDO2.setValues("Basic Type relevance");
									elementList2.add(elementDO2);
									
								elementDO2 = new ElementDO();
									elementDO2.setValues("blocked usage");
									elementList2.add(elementDO2);
									
								elementDO2 = new ElementDO();
									elementDO2.setValues("Compoment-part responsible Log");
									elementList2.add(elementDO2);	
									
								elementDO2 = new ElementDO();
									elementDO2.setValues("Einstein-ID");
									elementList2.add(elementDO2);
									
								elementDO2 = new ElementDO();
									elementDO2.setValues("GLOBUS contract approved Ist");
									elementList2.add(elementDO2);
									
								elementDO2 = new ElementDO();
									elementDO2.setValues("Inquiry deliverables are fulfilled Ist");
									elementList2.add(elementDO2);
									
								elementDO2 = new ElementDO();
									elementDO2.setValues("Inquiry deliverables are fulfilled Plan");
									elementList2.add(elementDO2);
									
								elementDO2 = new ElementDO();
									elementDO2.setValues("K-LH relevance");
									elementList2.add(elementDO2);
									
								elementDO2 = new ElementDO();
									elementDO2.setValues("LOG Concept");
									elementList2.add(elementDO2);
									
								elementDO2 = new ElementDO();
									elementDO2.setValues("Log goals of if necessary inclusive localization locations are present Ist");
									elementList2.add(elementDO2);
									
						categoryDO2.setValues(elementList2);
						
						categoryDOList.add(categoryDO2);
						
						/*
						 * SETTING VALUE FOR 3rd CATEGORY
						 */
						CategoryDO categoryDO3 = new CategoryDO();
						categoryDO3.setCategoryName("Contact partners");
						
							List<ElementDO> elementList3 = new ArrayList<ElementDO>();
								
								ElementDO elementDO3 = new ElementDO();
									elementDO3.setValues("Ansprechpartner Anlauffabrik");
									elementList3.add(elementDO3);
									
								elementDO3 = new ElementDO();
									elementDO3.setValues("Directed PartsGSP");
									elementList3.add(elementDO3);
									
								elementDO3 = new ElementDO();
									elementDO3.setValues("IH Inward");
									elementList3.add(elementDO3);
									
								elementDO3 = new ElementDO();
									elementDO3.setValues("IH Outward");
									elementList3.add(elementDO3);	
									
								elementDO3 = new ElementDO();
									elementDO3.setValues("Materials Requirements Planner");
									elementList3.add(elementDO3);
									
								elementDO3 = new ElementDO();
									elementDO3.setValues("Materials Requirements Planner CPL1");
									elementList3.add(elementDO3);
									
								elementDO3 = new ElementDO();
									elementDO3.setValues("Module Quality Engineer (MQE)");
									elementList3.add(elementDO3);
									
								elementDO3 = new ElementDO();
									elementDO3.setValues("MRP Controller");
									elementList3.add(elementDO3);
									
								elementDO3 = new ElementDO();
									elementDO3.setValues("Number of import sampling QMIs");
									elementList3.add(elementDO3);
									
								elementDO3 = new ElementDO();
									elementDO3.setValues("Number of local sampling QMIs");
									elementList3.add(elementDO3);
									
								elementDO3 = new ElementDO();
									elementDO3.setValues("Parts Schedule Manager");
									elementList3.add(elementDO3);
									
						categoryDO3.setValues(elementList3);
						
						categoryDOList.add(categoryDO3);
						
						/*
						 * SETTING VALUE FOR 4th CATEGORY
						 */
						CategoryDO categoryDO4 = new CategoryDO();
						categoryDO4.setCategoryName("Controlling");
						
							List<ElementDO> elementList4 = new ArrayList<ElementDO>();
								
								ElementDO elementDO4 = new ElementDO();
									elementDO4.setValues("BTM active (Part)");
									elementList4.add(elementDO4);
									
								elementDO4 = new ElementDO();
									elementDO4.setValues("BTM active (Supplier)");
									elementList4.add(elementDO4);
									
								elementDO4 = new ElementDO();
									elementDO4.setValues("E2 Sponsor");
									elementList4.add(elementDO4);
									
								elementDO4 = new ElementDO();
									elementDO4.setValues("E3 Responsible Person");
									elementList4.add(elementDO4);	
									
								elementDO4 = new ElementDO();
									elementDO4.setValues("Plan scheduling mode");
									elementList4.add(elementDO4);
									
								elementDO4 = new ElementDO();
									elementDO4.setValues("Remark AK/TH (part)");
									elementList4.add(elementDO4);
									
								elementDO4 = new ElementDO();
									elementDO4.setValues("Remark AK/TH (supplier)");
									elementList4.add(elementDO4);
									
								elementDO4 = new ElementDO();
									elementDO4.setValues("Remark Sternenhimmel (Part)");
									elementList4.add(elementDO4);
									
								elementDO4 = new ElementDO();
									elementDO4.setValues("Remark Sternenhimmel (Supplier)");
									elementList4.add(elementDO4);
									
								elementDO4 = new ElementDO();
									elementDO4.setValues("Responsible person for MG");
									elementList4.add(elementDO4);
									
								elementDO4 = new ElementDO();
									elementDO4.setValues("Responsible person for MG (Usage)");
									elementList4.add(elementDO4);
									
						categoryDO4.setValues(elementList4);
						
						categoryDOList.add(categoryDO4);
						
						/*
						 * SETTING VALUE FOR 5th CATEGORY
						 */
						CategoryDO categoryDO5 = new CategoryDO();
						categoryDO5.setCategoryName("Feature");
						
							List<ElementDO> elementList5 = new ArrayList<ElementDO>();
								
								ElementDO elementDO5 = new ElementDO();
									elementDO5.setValues("Applicable Documents (DS)");
									elementList5.add(elementDO5);
									
								elementDO5 = new ElementDO();
									elementDO5.setValues("Certification Topic (DZ)");
									elementList5.add(elementDO5);
									
								elementDO5 = new ElementDO();
									elementDO5.setValues("DS-Additional Description (DS)");
									elementList5.add(elementDO5);
									
								elementDO5 = new ElementDO();
									elementDO5.setValues("DZ-Additional Description (DZ)");
									elementList5.add(elementDO5);	
									
								elementDO5 = new ElementDO();
									elementDO5.setValues("Feature Description (DS)");
									elementList5.add(elementDO5);
									
								elementDO5 = new ElementDO();
									elementDO5.setValues("Feature Name (DZ)");
									elementList5.add(elementDO5);
									
								elementDO5 = new ElementDO();
									elementDO5.setValues("Feature Number (DS) (K)");
									elementList5.add(elementDO5);
									
								elementDO5 = new ElementDO();
									elementDO5.setValues("Feature Number (DZ) (K)");
									elementList5.add(elementDO5);
									
								elementDO5 = new ElementDO();
									elementDO5.setValues("Feature Type (DS)");
									elementList5.add(elementDO5);
									
								elementDO5 = new ElementDO();
									elementDO5.setValues("Features (DS)");
									elementList5.add(elementDO5);
									
								elementDO5 = new ElementDO();
									elementDO5.setValues("Features (DZ)");
									elementList5.add(elementDO5);
									
						categoryDO5.setValues(elementList5);
						
						categoryDOList.add(categoryDO5);
						
						/*
						 * SETTING VALUE FOR 6th CATEGORY
						 */
						CategoryDO categoryDO6 = new CategoryDO();
						categoryDO6.setCategoryName("Generic fields on parts master");
						
							List<ElementDO> elementList6 = new ArrayList<ElementDO>();
								
								ElementDO elementDO6 = new ElementDO();
									elementDO6.setValues("GF01");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF02 W54_Workgroup serial change management name");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF04 Person responsible for component");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF05 Comment Development");
									elementList6.add(elementDO6);	
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF06 W67_SAP_MATSTAT");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF07 W67_Auslaufdatum");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF08 Plant 050 Manufactoring Substation");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF09 Anf_AWE_117_W371");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF10 start workflow");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF11 ESAM status X253 CN");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF12 1040_part change history");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF13 AK PASCALE");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF14 W54_Workgroup serial change management date");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF15 Localization Status");
									elementList6.add(elementDO6);	
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF16 Delivery_place_BF-phase");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF17 Sampling coordination planning expected date");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF19 P-Freigaberelevanz");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF20 BTM-Info");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF22 goods delivery samples AMG BR197");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF23 Completion date/ Clarification requirements Ak-Krit Logistic");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF24 Completion date/ Clarification requirements Ak-Krit Purchase");
									elementList6.add(elementDO6);
									
									elementDO6 = new ElementDO();
									elementDO6.setValues("GF25 MRP Ramp Up");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF26 vLB/ LOI Tracking W138");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF27 Comment Third Party Deal");
									elementList6.add(elementDO6);	
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF28 MBCC Part");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF29 Technical Tool Tracking contact person");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF30 Completion date/ Clarification requirements AK-krit Development");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF31 Teilebündel: Modulbildung in Bem.planungstool");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF32 sampling planning");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF33 date of sample ordering");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF34 W67-AbwErlBem");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF35 W67-AbwErl");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF36 W67-BO-H93");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF37 W67-BO-H09");
									elementList6.add(elementDO6);	
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF38 W67-BO-H03");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF39 W67-BO-sonst");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF40 W67-NS-X253-PKZ");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF41 W67 std del meth");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF42 W67- goods carrier (from LTM)");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF43 W67-ALM");
									elementList6.add(elementDO6);
									
								elementDO6 = new ElementDO();
									elementDO6.setValues("GF44 CCC-temp");
									elementList6.add(elementDO6);	
									
						categoryDO6.setValues(elementList6);
						
						categoryDOList.add(categoryDO6);
						
						/*
						 * SETTING VALUE FOR 7th CATEGORY
						 */
						CategoryDO categoryDO7 = new CategoryDO();
						categoryDO7.setCategoryName("Generic fields on PEM");
						
							List<ElementDO> elementList7 = new ArrayList<ElementDO>();
								
								ElementDO elementDO7 = new ElementDO();
									elementDO7.setValues("FF01 (0540) Arbeitskreis Serien-ÄM Aufgabe");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF01 (3710) PEM-Status");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF02 (0540) Arbeitskreis Serien-ÄM Name");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF03 (0540) Arbeitskreis Serien-ÄM Wiedervorlage");
									elementList7.add(elementDO7);	
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF03 (0670) IECM-Kritikalität");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF04 (0540) IECM-MFA-Aufgabe");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF04 (0670) Jahresbereinigung");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF05 (0540) IECM-MFA-Name");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF05 (0670) GET");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF05 (1750) Update PEM-Categorie");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF06 (0540) IECM-MFA-Wiedervorlage");
									elementList7.add(elementDO7);
									
									elementDO7 = new ElementDO();
									elementDO7.setValues("FF02 (0540) Arbeitskreis Serien-ÄM Name");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF03 (0540) Arbeitskreis Serien-ÄM Wiedervorlage");
									elementList7.add(elementDO7);	
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF06 (0670) AUFBR-STR");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF07 (0670) Einsatz-Plan-Masch");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF08 (0670) Einsatz-Wunsch");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF09 (0670) Einsatz-Plan");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF10 (0670) Bemerkung AKkritS");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF11 (0500) GET-Werke");
									elementList7.add(elementDO7);
									
								elementDO7 = new ElementDO();
									elementDO7.setValues("FF11 (0540) GET-Werke");
									elementList7.add(elementDO7);	
									
						categoryDO7.setValues(elementList7);
						
						categoryDOList.add(categoryDO7);
						
						/*
						 * SETTING VALUE FOR 8th CATEGORY
						 */
						CategoryDO categoryDO8 = new CategoryDO();
						categoryDO8.setCategoryName("Goods receipt");
						
							List<ElementDO> elementList8 = new ArrayList<ElementDO>();
								
								ElementDO elementDO8 = new ElementDO();
									elementDO8.setValues("Current stock line");
									elementList8.add(elementDO8);
									
								elementDO8 = new ElementDO();
									elementDO8.setValues("Current stock storage");
									elementList8.add(elementDO8);
									
								elementDO8 = new ElementDO();
									elementDO8.setValues("Date of current delivery receipt");
									elementList8.add(elementDO8);
									
								elementDO8 = new ElementDO();
									elementDO8.setValues("Date of first delivery receipt");
									elementList8.add(elementDO8);	
									
								elementDO8 = new ElementDO();
									elementDO8.setValues("Date of last stock change");
									elementList8.add(elementDO8);
									
								elementDO8 = new ElementDO();
									elementDO8.setValues("Delivery Receipt Change Level");
									elementList8.add(elementDO8);
									
								elementDO8 = new ElementDO();
									elementDO8.setValues("Delivery Receipt Serial Number");
									elementList8.add(elementDO8);
									
								elementDO8 = new ElementDO();
									elementDO8.setValues("Quantity of current delivery receipt");
									elementList8.add(elementDO8);
									
						categoryDO8.setValues(elementList8);
						
						categoryDOList.add(categoryDO8);
						
						/*
						 * SETTING VALUE FOR 9th CATEGORY
						 */
						CategoryDO categoryDO9 = new CategoryDO();
						categoryDO9.setCategoryName("Measure");
						
							List<ElementDO> elementList9 = new ArrayList<ElementDO>();
								
								ElementDO elementDO9 = new ElementDO();
									elementDO9.setValues("Changed by");
									elementList9.add(elementDO9);
									
								elementDO9 = new ElementDO();
									elementDO9.setValues("Comment");
									elementList9.add(elementDO9);
									
								elementDO9 = new ElementDO();
									elementDO9.setValues("Created by (Measures)");
									elementList9.add(elementDO9);
									
								elementDO9 = new ElementDO();
									elementDO9.setValues("Created on (Measures)");
									elementList9.add(elementDO9);	
									
								elementDO9 = new ElementDO();
									elementDO9.setValues("Finished by");
									elementList9.add(elementDO9);
									
								elementDO9 = new ElementDO();
									elementDO9.setValues("Last change on");
									elementList9.add(elementDO9);
									
								elementDO9 = new ElementDO();
									elementDO9.setValues("Measure Category");
									elementList9.add(elementDO9);
									
								elementDO9 = new ElementDO();
									elementDO9.setValues("Measure description");
									elementList9.add(elementDO9);
									
								elementDO9 = new ElementDO();
									elementDO9.setValues("Measure number");
									elementList9.add(elementDO9);
									
								elementDO9 = new ElementDO();
									elementDO9.setValues("Measure Plant");
									elementList9.add(elementDO9);
									
								elementDO9 = new ElementDO();
									elementDO9.setValues("Measure stateMeasure trigger");
									elementList9.add(elementDO9);	
									
								elementDO9 = new ElementDO();
									elementDO9.setValues("Measure type");
									elementList9.add(elementDO9);
									
								elementDO9 = new ElementDO();
									elementDO9.setValues("PAEV No.");
									elementList9.add(elementDO9);
									
								elementDO9 = new ElementDO();
									elementDO9.setValues("Person implementing");
									elementList9.add(elementDO9);
									
								elementDO9 = new ElementDO();
									elementDO9.setValues("Problem description");
									elementList9.add(elementDO9);	
									
						categoryDO9.setValues(elementList9);
						
						categoryDOList.add(categoryDO9);
						
						/*
						 * SETTING VALUE FOR 10th CATEGORY
						 */
						CategoryDO categoryDO10 = new CategoryDO();
						categoryDO10.setCategoryName("Milestone");
						
							List<ElementDO> elementList10 = new ArrayList<ElementDO>();
								
								ElementDO elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date Expected date Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date Ist");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date Ist Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date Plan automatic");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date Plan automatic Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date Plan determined");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date Plan determined Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date Plan Fachbereich");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date Plan Fachbereich Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date plant Expected date");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date plant Expected date Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date plant Ist");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date plant Ist Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date plant Plan determined");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date plant Plan determined Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date plant Plan Fachbereich");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date plant Plan Fachbereich Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Begin ship date plant Plan Fachbereich Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Color PPAR Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Color PPAR Expected date Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Color PPAR Ist");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Color PPAR Ist Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Color PPAR Plan determined");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Color PPAR Plan determined Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Color PPAR plant Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Color PPAR plant Expected date Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Color PPAR plant Ist");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Color PPAR plant Ist Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("D-P Green plant BTM Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("D-P Green plant BTM Expected date Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("D-P Green plant Expected date");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("D-P Green plant Expected date Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("D-P Green plant Ist");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("D-P Green plant Ist Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("D-P Yellow plant BTM Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("D-P Yellow plant BTM Expected date Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("D-P Yellow plant Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("D-P Yellow plant Expected date Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("D-P Yellow plant Ist");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("D-P Yellow plant Ist Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT Expected date Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT Ist");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT Ist Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT Plan automatic");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT Plan automatic Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT Plan determined");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT Plan determined Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT Plan Fachbereich");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT Plan Fachbereich Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT plant BTM Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT plant BTM Expected date Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT plant Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT plant Expected date Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT plant Ist");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT plant Ist Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT plant Plan determined");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT plant Plan determined Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT plant Plan Fachbereich");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("ESWFT plant Plan Fachbereich Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Handshake QM Werk Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Handshake QM Werk Expected date Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Handshake QM Werk Ist");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Handshake QM Werk Ist Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Latest possible start PT Tool Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Latest possible start PT Tool Expected date Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Latest possible start PT Tool Ist");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Latest possible start PT Tool Ist Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Latest possible start PT Tool Plan determined");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Latest possible start PT Tool Plan determined Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Lieferantenvergabe Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Lieferantenvergabe Expected date Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Lieferantenvergabe Ist");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Lieferantenvergabe Ist Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Lieferantenvergabe Plan automatic");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Lieferantenvergabe Plan automatic Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Lieferantenvergabe Plan determined");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Lieferantenvergabe Plan determined Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Lieferantenvergabe Plan Fachbereich");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Lieferantenvergabe Plan Fachbereich Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity blank BTM Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity blank BTM Expected date Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity blank Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity blank Expected date Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity blank Ist");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity blank Ist Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity blank Plan automatic");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity blank Plan automatic Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity blank Plan determined");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity blank Plan determined Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity blank Plan Fachbereich");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity blank Plan Fachbereich Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity Blank Supplier Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity Blank Supplier Expected date Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity P BTM Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity P BTM Expected date Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity P Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity P Expected date Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity P Ist");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity P Ist Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity P Plan automatic");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity P Plan automatic Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity P Plan determined");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity P Plan determined Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity P Plan Fachbereich");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity P Plan Fachbereich Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity W BTM Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity W BTM Expected date Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity W Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity W Expected date Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity W Ist");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity W Ist Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity W Plan automatic");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity W Plan automatic Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity W Plan determined");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity W Plan determined Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity W Plan Fachbereich");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity W Plan Fachbereich Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity Z Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity Z Expected date Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity Z Ist");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity Z Ist Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity Z Plan automatic");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity Z Plan automatic Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity Z Plan determined");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity Z Plan determined Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity Z Plan Fachbereich");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("Maturity Z Plan Fachbereich Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("off tool parts (M3) plant Expected date");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("off tool parts (M3) plant Expected date Comment");
									elementList10.add(elementDO10);	
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("off tool parts (M3) plant Ist");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("off tool parts (M3) plant Ist Comment");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("off tool parts (M3) plant Plan automatic");
									elementList10.add(elementDO10);
									
								elementDO10 = new ElementDO();
									elementDO10.setValues("off tool parts (M3) plant Plan automatic Comment");
									elementList10.add(elementDO10);	
									
						categoryDO10.setValues(elementList10);
						
						categoryDOList.add(categoryDO10);	
						
						/*
						 * SETTING VALUE FOR 11th CATEGORY
						 */
						CategoryDO categoryDO11 = new CategoryDO();
						categoryDO11.setCategoryName("nTier");
						
							List<ElementDO> elementList11 = new ArrayList<ElementDO>();
								
								ElementDO elementDO11 = new ElementDO();
									elementDO11.setValues("AKV Matrix nTier");
									elementList11.add(elementDO11);
									
								elementDO11 = new ElementDO();
									elementDO11.setValues("Date Part agreement");
									elementList11.add(elementDO11);
									
								elementDO11 = new ElementDO();
									elementDO11.setValues("GET-Relation nTier");
									elementList11.add(elementDO11);
									
								elementDO11 = new ElementDO();
									elementDO11.setValues("Last Change Part Agreement");
									elementList11.add(elementDO11);	
									
								elementDO11 = new ElementDO();
									elementDO11.setValues("nTier Plant");
									elementList11.add(elementDO11);
									
								elementDO11 = new ElementDO();
									elementDO11.setValues("Part agreement ID");
									elementList11.add(elementDO11);
									
								elementDO11 = new ElementDO();
									elementDO11.setValues("Part agreement Ident no.");
									elementList11.add(elementDO11);
									
								elementDO11 = new ElementDO();
									elementDO11.setValues("Part agreement invalid");
									elementList11.add(elementDO11);
									
								elementDO11 = new ElementDO();
									elementDO11.setValues("Part agreement position");
									elementList11.add(elementDO11);
									
								elementDO11 = new ElementDO();
									elementDO11.setValues("Part agreement valid");
									elementList11.add(elementDO11);
									
								elementDO11 = new ElementDO();
									elementDO11.setValues("Part agreement valid from");
									elementList11.add(elementDO11);	
									
								elementDO11 = new ElementDO();
									elementDO11.setValues("Part agreement valid to");
									elementList11.add(elementDO11);
									
								elementDO11 = new ElementDO();
									elementDO11.setValues("Part number nTier");
									elementList11.add(elementDO11);
									
								elementDO11 = new ElementDO();
									elementDO11.setValues("Part number ZB (K)");
									elementList11.add(elementDO11);
									
								elementDO11 = new ElementDO();
									elementDO11.setValues("Purchaser Index nTier");
									elementList11.add(elementDO11);	
									
						categoryDO11.setValues(elementList11);
						
						categoryDOList.add(categoryDO11);
						
						/*
						 * SETTING VALUE FOR 12th CATEGORY
						 */
						CategoryDO categoryDO12 = new CategoryDO();
						categoryDO12.setCategoryName("Parts master data");
						
							List<ElementDO> elementList12 = new ArrayList<ElementDO>();
								
								ElementDO elementDO12 = new ElementDO();
									elementDO12.setValues("3D Visualization (ZGS dependent)");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Basic Item Number");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("CAD Indicator");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Certification Relevance");
									elementList12.add(elementDO12);	
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Codable Control Units");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Common Part");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Confidentiality Level 1");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Confidentiality Level 2");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("CP-Count");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("CP-List");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Critical Part");
									elementList12.add(elementDO12);	
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Date E Release from (DIA-E) (Part)");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Date E Release from (DIA-P)");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Date E Release to (DIA-E)");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Date E Release to (DIA-P)");
									elementList12.add(elementDO12);	
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Date P Release (DIA-P)DIA-P supplied");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Diagnosis at end of line");
									elementList12.add(elementDO12);	
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Diagnosis change request relevance");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Diagnosis Identifier");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Directed part");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Drawing Date E");
									elementList12.add(elementDO12);	
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Drawing Date P");
									elementList12.add(elementDO12);	
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("EE-category");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Electrostatic Discharge");
									elementList12.add(elementDO12);	
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("FDOK Relevance");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("First Cost Center (EBAs)");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Function No. 1");
									elementList12.add(elementDO12);
									
								elementDO12 = new ElementDO();
									elementDO12.setValues("Function No. 2");
									elementList12.add(elementDO12);		
									
						categoryDO12.setValues(elementList12);
						
						categoryDOList.add(categoryDO12);
						
						/*
						 * SETTING VALUE FOR 13th CATEGORY
						 */
						CategoryDO categoryDO13 = new CategoryDO();
						categoryDO13.setCategoryName("PEM");
						
							List<ElementDO> elementList13 = new ArrayList<ElementDO>();
								
								ElementDO elementDO13 = new ElementDO();
									elementDO13.setValues("Category list");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("Change Notice");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("Controlled DGL");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("controlled PCN");
									elementList13.add(elementDO13);	
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("Deadline coordination id");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("Earliest possible introduction date (MRP)");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("Expected PPAR (sample parts receipt) MRP");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("First serial delivery (MRP)");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("First serial delivery as early as possible");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("First serial delivery as late as possible");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("Introduction on");
									elementList13.add(elementDO13);	
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("KEM list");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("Latest possible introduction date (MRP)");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("List of PEMs");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("Meeting date");
									elementList13.add(elementDO13);	
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("Min. lead time 1st call-off -> 1st serial delivery");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("Min. lead time 1st call-off ->introduction date (MRP)");
									elementList13.add(elementDO13);	
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("Model series list");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("PAEVs listPEM number (K)");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("PEM-Responsible (Code)");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("PEM-Responsible (Name, First name)");
									elementList13.add(elementDO13);	
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("PEM-Version");
									elementList13.add(elementDO13);	
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("Plus/Minus");
									elementList13.add(elementDO13);
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("Special distribution list");
									elementList13.add(elementDO13);	
									
								elementDO13 = new ElementDO();
									elementDO13.setValues("Target PPAR (sample parts receipt) MRP");
									elementList13.add(elementDO13);
									
						categoryDO13.setValues(elementList13);
						
						categoryDOList.add(categoryDO13);	
						
						/*
						 * SETTING VALUE FOR 14th CATEGORY
						 */
						CategoryDO categoryDO14 = new CategoryDO();
						categoryDO14.setCategoryName("Pre-production test batch");
						
							List<ElementDO> elementList14 = new ArrayList<ElementDO>();
								
								ElementDO elementDO14 = new ElementDO();
									elementDO14.setValues("BVA automatically");
									elementList14.add(elementDO14);
									
								elementDO14 = new ElementDO();
									elementDO14.setValues("BVA Comment Development");
									elementList14.add(elementDO14);
									
								elementDO14 = new ElementDO();
									elementDO14.setValues("BVA Comment Plant");
									elementList14.add(elementDO14);
									
								elementDO14 = new ElementDO();
									elementDO14.setValues("BVA defined");
									elementList14.add(elementDO14);	
									
								elementDO14 = new ElementDO();
									elementDO14.setValues("Delivery assembly parts date");
									elementList14.add(elementDO14);
									
								elementDO14 = new ElementDO();
									elementDO14.setValues("List Pre-production Test Batch");
									elementList14.add(elementDO14);
									
								elementDO14 = new ElementDO();
									elementDO14.setValues("Model series of pre-production test batch (K)");
									elementList14.add(elementDO14);
									
								elementDO14 = new ElementDO();
									elementDO14.setValues("Pre-production test batch");
									elementList14.add(elementDO14);
									
								elementDO14 = new ElementDO();
									elementDO14.setValues("Result BVA automatically");
									elementList14.add(elementDO14);
									
								elementDO14 = new ElementDO();
									elementDO14.setValues("Type Version of Pre-production Test Batch (K)");
									elementList14.add(elementDO14);
									
						categoryDO14.setValues(elementList14);
						
						categoryDOList.add(categoryDO14);	
						
						/*
						 * SETTING VALUE FOR 15th CATEGORY
						 */
						CategoryDO categoryDO15 = new CategoryDO();
						categoryDO15.setCategoryName("Priority");
						
							List<ElementDO> elementList15 = new ArrayList<ElementDO>();
								
								ElementDO elementDO15 = new ElementDO();
									elementDO15.setValues("Begin ship date Expected date Priority");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("Begin ship date plant Expected date Priority");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("Color PPAR Expected date Priority");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("D-P Green plant Expected date Priority");
									elementList15.add(elementDO15);	
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("D-P Yellow plant Expected date Priority");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("ESWFT plant Expected date Priority");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("Handshake QM Werk Expected date Priority");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("Latest possible start PT Tool Expected date Priority");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("Lieferantenvergabe Expected date Priority");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("Maturity blank Expected date Priority");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("Maturity Blank Supplier Expected date Priority");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("Maturity P Expected date Priority");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("Maturity W Expected date Priority");
									elementList15.add(elementDO15);	
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("Maturity Z Expected date Priority");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("off tool parts (M3) plant Expected date Priority");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("PPAR color approved Expected date Priority");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("PPAR color approved plant Expected date Priorit");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("PPAR complete Expected date Priority");
									elementList15.add(elementDO15);
									
								elementDO15 = new ElementDO();
									elementDO15.setValues("PPAR complete plant Expected date Priority");
									elementList15.add(elementDO15);	
									
						categoryDO15.setValues(elementList15);
						
						categoryDOList.add(categoryDO15);	
						
						/*
						 * SETTING VALUE FOR 16th CATEGORY
						 */
						CategoryDO categoryDO16 = new CategoryDO();
						categoryDO16.setCategoryName("Procurement");
						
							List<ElementDO> elementList16 = new ArrayList<ElementDO>();
								
								ElementDO elementDO16 = new ElementDO();
									elementDO16.setValues("Comment on sampling relevance");
									elementList16.add(elementDO16);
									
								elementDO16 = new ElementDO();
									elementDO16.setValues("Part State");
									elementList16.add(elementDO16);
									
								elementDO16 = new ElementDO();
									elementDO16.setValues("Receiving Area samples (ABS)");
									elementList16.add(elementDO16);
									
								elementDO16 = new ElementDO();
									elementDO16.setValues("Remark Log");
									elementList16.add(elementDO16);	
									
								elementDO16 = new ElementDO();
									elementDO16.setValues("Sampling result required (in start)");
									elementList16.add(elementDO16);
									
								elementDO16 = new ElementDO();
									elementDO16.setValues("Status Indicator");
									elementList16.add(elementDO16);
									
						categoryDO16.setValues(elementList16);
						
						categoryDOList.add(categoryDO16);	
						
						/*
						 * SETTING VALUE FOR 17th CATEGORY
						 */
						CategoryDO categoryDO17 = new CategoryDO();
						categoryDO17.setCategoryName("Project");
						
							List<ElementDO> elementList17 = new ArrayList<ElementDO>();
								
								ElementDO elementDO17 = new ElementDO();
									elementDO17.setValues("Added manually");
									elementList17.add(elementDO17);
									
								elementDO17 = new ElementDO();
									elementDO17.setValues("Comment Plan Scheduling");
									elementList17.add(elementDO17);
									
								elementDO17 = new ElementDO();
									elementDO17.setValues("Controlling Rel. Plant of color-neutral parts");
									elementList17.add(elementDO17);
									
								elementDO17 = new ElementDO();
									elementDO17.setValues("Controlling Relevance Plant");
									elementList17.add(elementDO17);	
									
								elementDO17 = new ElementDO();
									elementDO17.setValues("Controlling relevant Plant manually changed");
									elementList17.add(elementDO17);
									
								elementDO17 = new ElementDO();
									elementDO17.setValues("Ind. Plan Scheduling Rel. man. changed");
									elementList17.add(elementDO17);
									
									elementDO17 = new ElementDO();
									elementDO17.setValues("List All Projects");
									elementList17.add(elementDO17);
									
								elementDO17 = new ElementDO();
									elementDO17.setValues("List Projects New Part global");
									elementList17.add(elementDO17);
									
								elementDO17 = new ElementDO();
									elementDO17.setValues("List Projects relevant to Plan Scheduling");
									elementList17.add(elementDO17);	
									
								elementDO17 = new ElementDO();
									elementDO17.setValues("Model series of project");
									elementList17.add(elementDO17);
									
								elementDO17 = new ElementDO();
									elementDO17.setValues("New Part Indicator (global)");
									elementList17.add(elementDO17);	
									
						categoryDO17.setValues(elementList17);
						
						categoryDOList.add(categoryDO17);
						
						/*
						 * SETTING VALUE FOR 18th CATEGORY
						 */
						CategoryDO categoryDO18 = new CategoryDO();
						categoryDO18.setCategoryName("Runtime types");
						
							List<ElementDO> elementList18 = new ArrayList<ElementDO>();
								
								ElementDO elementDO18 = new ElementDO();
									elementDO18.setValues("approval lead time");
									elementList18.add(elementDO18);
									
								elementDO18 = new ElementDO();
									elementDO18.setValues("EMPBFaktorDays");
									elementList18.add(elementDO18);
									
								elementDO18 = new ElementDO();
									elementDO18.setValues("h");
									elementList18.add(elementDO18);
									
								elementDO18 = new ElementDO();
									elementDO18.setValues("L/M/S-Description");
									elementList18.add(elementDO18);	
									
								elementDO18 = new ElementDO();
									elementDO18.setValues("LaufzeitESWFT2SWFT");
									elementList18.add(elementDO18);
									
								elementDO18 = new ElementDO();
									elementDO18.setValues("LaufzeitW2Blank");
									elementList18.add(elementDO18);
									
									elementDO18 = new ElementDO();
									elementDO18.setValues("Off Tool Parts Optimization");
									elementList18.add(elementDO18);
									
								elementDO18 = new ElementDO();
									elementDO18.setValues("List Projects New Part global");
									elementList18.add(elementDO18);
									
								elementDO18 = new ElementDO();
									elementDO18.setValues("Prozess Werkzeugfreigabe");
									elementList18.add(elementDO18);	
									
								elementDO18 = new ElementDO();
									elementDO18.setValues("sourcing lead time");
									elementList18.add(elementDO18);
									
								elementDO18 = new ElementDO();
									elementDO18.setValues("TEST");
									elementList18.add(elementDO18);	
									
						categoryDO18.setValues(elementList18);
						
						categoryDOList.add(categoryDO18);
						
						/*
						 * SETTING VALUE FOR 19th CATEGORY
						 */
						CategoryDO categoryDO19 = new CategoryDO();
						categoryDO19.setCategoryName("Sampling");
						
							List<ElementDO> elementList19 = new ArrayList<ElementDO>();
								
								ElementDO elementDO19 = new ElementDO();
									elementDO19.setValues("Comment Resubmission Prognose");
									elementList19.add(elementDO19);
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("Contract supplier");
									elementList19.add(elementDO19);
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("Contract Supplier ambiguous");
									elementList19.add(elementDO19);
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("Contract supplier index");
									elementList19.add(elementDO19);	
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("Date final decision color");
									elementList19.add(elementDO19);
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("Date final decision PPR");
									elementList19.add(elementDO19);
									
									elementDO19 = new ElementDO();
									elementDO19.setValues("Decision part");
									elementList19.add(elementDO19);
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("Decision process");
									elementList19.add(elementDO19);
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("F status");
									elementList19.add(elementDO19);	
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("Final decision color");
									elementList19.add(elementDO19);
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("Final decision PPR");
									elementList19.add(elementDO19);	
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("ISIR number");
									elementList19.add(elementDO19);	
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("ISIR version");
									elementList19.add(elementDO19);
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("KEM for Sampling");
									elementList19.add(elementDO19);
									
									elementDO19 = new ElementDO();
									elementDO19.setValues("Production activ flag");
									elementList19.add(elementDO19);
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("Quantity Resubmission Prognose");
									elementList19.add(elementDO19);
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("Quantity Unit Resubmission Prognose");
									elementList19.add(elementDO19);	
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("Reported decision part");
									elementList19.add(elementDO19);
									
								elementDO19 = new ElementDO();
									elementDO19.setValues("Reported decision process");
									elementList19.add(elementDO19);		
									
						categoryDO19.setValues(elementList19);
						
						categoryDOList.add(categoryDO19);
						
						/*
						 * SETTING VALUE FOR 20th CATEGORY
						 */
						CategoryDO categoryDO20 = new CategoryDO();
						categoryDO20.setCategoryName("Smaragd");
						
							List<ElementDO> elementList20 = new ArrayList<ElementDO>();
								
								ElementDO elementDO20 = new ElementDO();
									elementDO20.setValues("3D Visualization (version dependent) (K)");
									elementList20.add(elementDO20);
									
								elementDO20 = new ElementDO();
									elementDO20.setValues("Date E Release from (DIA-E) (Smaragd)");
									elementList20.add(elementDO20);
									
								elementDO20 = new ElementDO();
									elementDO20.setValues("KEM-S for ZGS");
									elementList20.add(elementDO20);
									
								elementDO20 = new ElementDO();
									elementDO20.setValues("Prototype Batches");
									elementList20.add(elementDO20);	
									
								elementDO20 = new ElementDO();
									elementDO20.setValues("Release status");
									elementList20.add(elementDO20);
									
								elementDO20 = new ElementDO();
									elementDO20.setValues("Smaragd Drawing date");
									elementList20.add(elementDO20);
									
									elementDO20 = new ElementDO();
									elementDO20.setValues("Smaragd-ZGS");
									elementList20.add(elementDO20);
									
								elementDO20 = new ElementDO();
									elementDO20.setValues("Status G");
									elementList20.add(elementDO20);
									
								elementDO20 = new ElementDO();
									elementDO20.setValues("Status G modification date");
									elementList20.add(elementDO20);	
									
								elementDO20 = new ElementDO();
									elementDO20.setValues("Status P");
									elementList20.add(elementDO20);
									
								elementDO20 = new ElementDO();
									elementDO20.setValues("Status P modification date");
									elementList20.add(elementDO20);	
									
								elementDO20 = new ElementDO();
									elementDO20.setValues("Status V");
									elementList20.add(elementDO20);	
									
								elementDO20 = new ElementDO();
									elementDO20.setValues("Status V modification date");
									elementList20.add(elementDO20);
									
								elementDO20 = new ElementDO();
									elementDO20.setValues("Version (K)");
									elementList20.add(elementDO20);
									
						categoryDO20.setValues(elementList20);
						
						categoryDOList.add(categoryDO20);
						
						/*
						 * SETTING VALUE FOR 21th CATEGORY
						 */
						CategoryDO categoryDO21 = new CategoryDO();
						categoryDO21.setCategoryName("Supplier");
						
							List<ElementDO> elementList21 = new ArrayList<ElementDO>();
								
								ElementDO elementDO21 = new ElementDO();
									elementDO21.setValues("AKV Matrix");
									elementList21.add(elementDO21);
									
								elementDO21 = new ElementDO();
									elementDO21.setValues("Copy State");
									elementList21.add(elementDO21);
									
								elementDO21 = new ElementDO();
									elementDO21.setValues("Country");
									elementList21.add(elementDO21);
									
								elementDO21 = new ElementDO();
									elementDO21.setValues("Date Purchase Order");
									elementList21.add(elementDO21);	
									
								elementDO21 = new ElementDO();
									elementDO21.setValues("Deletion Indicator");
									elementList21.add(elementDO21);
									
								elementDO21 = new ElementDO();
									elementDO21.setValues("GET-Relation Supplier");
									elementList21.add(elementDO21);
									
									elementDO21 = new ElementDO();
									elementDO21.setValues("Incoterm");
									elementList21.add(elementDO21);
									
								elementDO21 = new ElementDO();
									elementDO21.setValues("List of suppliers relevant to start-up");
									elementList21.add(elementDO21);
									
								elementDO21 = new ElementDO();
									elementDO21.setValues("List Supplier Numbers");
									elementList21.add(elementDO21);	
									
								elementDO21 = new ElementDO();
									elementDO21.setValues("List Supplier Numbers Plant");
									elementList21.add(elementDO21);
									
								elementDO21 = new ElementDO();
									elementDO21.setValues("Number of import suppliers");
									elementList21.add(elementDO21);	
									
								elementDO21 = new ElementDO();
									elementDO21.setValues("Number of local suppliers");
									elementList21.add(elementDO21);	
									
								elementDO21 = new ElementDO();
									elementDO21.setValues("Number of startup suppliers");
									elementList21.add(elementDO21);
									
								elementDO21 = new ElementDO();
									elementDO21.setValues("Number of suppliers");
									elementList21.add(elementDO21);
									
						categoryDO21.setValues(elementList21);
						
						categoryDOList.add(categoryDO21);
						
						/*
						 * SETTING VALUE FOR 22th CATEGORY
						 */
						CategoryDO categoryDO22 = new CategoryDO();
						categoryDO22.setCategoryName("Tool Part Bundle");
						
							List<ElementDO> elementList22 = new ArrayList<ElementDO>();
								
								ElementDO elementDO22 = new ElementDO();
									elementDO22.setValues("Responsible person (Tool PB)");
									elementList22.add(elementDO22);
									
								elementDO22 = new ElementDO();
									elementDO22.setValues("Tool Part Bundle Name");
									elementList22.add(elementDO22);
									
								elementDO22 = new ElementDO();
									elementDO22.setValues("Tool Part Bundle Numbers");
									elementList22.add(elementDO22);
									
						categoryDO22.setValues(elementList22);
						
						categoryDOList.add(categoryDO22);
						
						/*
						 * SETTING VALUE FOR 23th CATEGORY
						 */
						CategoryDO categoryDO23 = new CategoryDO();
						categoryDO23.setCategoryName("Usage");
						
							List<ElementDO> elementList23 = new ArrayList<ElementDO>();
								
								ElementDO elementDO23 = new ElementDO();
									elementDO23.setValues("Deviating Purchase Key");
									elementList23.add(elementDO23);
									
								elementDO23 = new ElementDO();
									elementDO23.setValues("Documentation Maturity Level Dia E");
									elementList23.add(elementDO23);
									
								elementDO23 = new ElementDO();
									elementDO23.setValues("Documentation Maturity Level Dia P");
									elementList23.add(elementDO23);
									
								elementDO23 = new ElementDO();
									elementDO23.setValues("Module");
									elementList23.add(elementDO23);
									
								elementDO23 = new ElementDO();
									elementDO23.setValues("Module Group No.");
									elementList23.add(elementDO23);	
									
								elementDO23 = new ElementDO();
									elementDO23.setValues("Plan Purchase Key");
									elementList23.add(elementDO23);
									
								elementDO23 = new ElementDO();
									elementDO23.setValues("Position D");
									elementList23.add(elementDO23);
									
								elementDO23 = new ElementDO();
									elementDO23.setValues("Position P");
									elementList23.add(elementDO23);	
									
								elementDO23 = new ElementDO();
									elementDO23.setValues("Steering Version");
									elementList23.add(elementDO23);
									
								elementDO23 = new ElementDO();
									elementDO23.setValues("Structure Level E");
									elementList23.add(elementDO23);
									
								elementDO23 = new ElementDO();
									elementDO23.setValues("Type Version");
									elementList23.add(elementDO23);		
									
						categoryDO23.setValues(elementList23);
						
						categoryDOList.add(categoryDO23);	
			
			//viewDO.setCategoryDO(categoryDOList);
			
			viewList.add(viewDO);
			
			ViewParentDO.setViewDO(viewList);
			
			ViewParentDO.setCategoryDO(categoryDOList);
			
		}
		return ViewParentDO;
	}
	public CategoryDO getResultsByCategory(CategoryDO categoryDO){
		
		CategoryDO categoryDO1 = new CategoryDO();
		List<ElementDO> elementList = new ArrayList<ElementDO>();
		if("AE KEM master (E)".equalsIgnoreCase(categoryDO.getCategoryName())){
			
				ElementDO elementDO1 = new ElementDO();
					elementDO1.setValues("AE Duration in months");
						elementList.add(elementDO1);
				
				elementDO1 = new ElementDO();
					elementDO1.setValues("AE Planned end date");
						elementList.add(elementDO1);
				
				elementDO1 = new ElementDO();
					elementDO1.setValues("AE Planned start date");
						elementList.add(elementDO1);
				
				elementDO1 = new ElementDO();
					elementDO1.setValues("AE Special process sampling");
						elementList.add(elementDO1);	
				
				elementDO1 = new ElementDO();
					elementDO1.setValues("Change status (AE)");
						elementList.add(elementDO1);	
						
		}
		else if("Allocation scope".equalsIgnoreCase(categoryDO.getCategoryName())){
			
			ElementDO elementDO2 = new ElementDO();
				elementDO2.setValues("ABC-Classification");
				elementList.add(elementDO2);
				
			elementDO2 = new ElementDO();
				elementDO2.setValues("Basic Type relevance");
				elementList.add(elementDO2);
				
			elementDO2 = new ElementDO();
				elementDO2.setValues("blocked usage");
				elementList.add(elementDO2);
				
			elementDO2 = new ElementDO();
				elementDO2.setValues("Compoment-part responsible Log");
				elementList.add(elementDO2);	
				
			elementDO2 = new ElementDO();
				elementDO2.setValues("Einstein-ID");
				elementList.add(elementDO2);
				
			elementDO2 = new ElementDO();
				elementDO2.setValues("GLOBUS contract approved Ist");
				elementList.add(elementDO2);
				
			elementDO2 = new ElementDO();
				elementDO2.setValues("Inquiry deliverables are fulfilled Ist");
				elementList.add(elementDO2);
				
			elementDO2 = new ElementDO();
				elementDO2.setValues("Inquiry deliverables are fulfilled Plan");
				elementList.add(elementDO2);
				
			elementDO2 = new ElementDO();
				elementDO2.setValues("K-LH relevance");
				elementList.add(elementDO2);
				
			elementDO2 = new ElementDO();
				elementDO2.setValues("LOG Concept");
				elementList.add(elementDO2);
				
			elementDO2 = new ElementDO();
				elementDO2.setValues("Log goals of if necessary inclusive localization locations are present Ist");
				elementList.add(elementDO2);
		}
		if("Contact partners".equalsIgnoreCase(categoryDO.getCategoryName())){
			
			ElementDO elementDO3 = new ElementDO();
				elementDO3.setValues("Ansprechpartner Anlauffabrik");
				elementList.add(elementDO3);
				
			elementDO3 = new ElementDO();
				elementDO3.setValues("Directed PartsGSP");
				elementList.add(elementDO3);
				
			elementDO3 = new ElementDO();
				elementDO3.setValues("IH Inward");
				elementList.add(elementDO3);
				
			elementDO3 = new ElementDO();
				elementDO3.setValues("IH Outward");
				elementList.add(elementDO3);	
				
			elementDO3 = new ElementDO();
				elementDO3.setValues("Materials Requirements Planner");
				elementList.add(elementDO3);
				
			elementDO3 = new ElementDO();
				elementDO3.setValues("Materials Requirements Planner CPL1");
				elementList.add(elementDO3);
				
			elementDO3 = new ElementDO();
				elementDO3.setValues("Module Quality Engineer (MQE)");
				elementList.add(elementDO3);
				
			elementDO3 = new ElementDO();
				elementDO3.setValues("MRP Controller");
				elementList.add(elementDO3);
				
			elementDO3 = new ElementDO();
				elementDO3.setValues("Number of import sampling QMIs");
				elementList.add(elementDO3);
				
			elementDO3 = new ElementDO();
				elementDO3.setValues("Number of local sampling QMIs");
				elementList.add(elementDO3);
				
			elementDO3 = new ElementDO();
				elementDO3.setValues("Parts Schedule Manager");
				elementList.add(elementDO3);
		}
		if("Controlling".equalsIgnoreCase(categoryDO.getCategoryName())){
			
			ElementDO elementDO4 = new ElementDO();
				elementDO4.setValues("BTM active (Part)");
				elementList.add(elementDO4);
				
			elementDO4 = new ElementDO();
				elementDO4.setValues("BTM active (Supplier)");
				elementList.add(elementDO4);
				
			elementDO4 = new ElementDO();
				elementDO4.setValues("E2 Sponsor");
				elementList.add(elementDO4);
				
			elementDO4 = new ElementDO();
				elementDO4.setValues("E3 Responsible Person");
				elementList.add(elementDO4);	
				
			elementDO4 = new ElementDO();
				elementDO4.setValues("Plan scheduling mode");
				elementList.add(elementDO4);
				
			elementDO4 = new ElementDO();
				elementDO4.setValues("Remark AK/TH (part)");
				elementList.add(elementDO4);
				
			elementDO4 = new ElementDO();
				elementDO4.setValues("Remark AK/TH (supplier)");
				elementList.add(elementDO4);
				
			elementDO4 = new ElementDO();
				elementDO4.setValues("Remark Sternenhimmel (Part)");
				elementList.add(elementDO4);
				
			elementDO4 = new ElementDO();
				elementDO4.setValues("Remark Sternenhimmel (Supplier)");
				elementList.add(elementDO4);
				
			elementDO4 = new ElementDO();
				elementDO4.setValues("Responsible person for MG");
				elementList.add(elementDO4);
				
			elementDO4 = new ElementDO();
				elementDO4.setValues("Responsible person for MG (Usage)");
				elementList.add(elementDO4);
		}
		if("Feature".equalsIgnoreCase(categoryDO.getCategoryName())){
			
			ElementDO elementDO5 = new ElementDO();
				elementDO5.setValues("Applicable Documents (DS)");
				elementList.add(elementDO5);
				
			elementDO5 = new ElementDO();
				elementDO5.setValues("Certification Topic (DZ)");
				elementList.add(elementDO5);
				
			elementDO5 = new ElementDO();
				elementDO5.setValues("DS-Additional Description (DS)");
				elementList.add(elementDO5);
				
			elementDO5 = new ElementDO();
				elementDO5.setValues("DZ-Additional Description (DZ)");
				elementList.add(elementDO5);	
				
			elementDO5 = new ElementDO();
				elementDO5.setValues("Feature Description (DS)");
				elementList.add(elementDO5);
				
			elementDO5 = new ElementDO();
				elementDO5.setValues("Feature Name (DZ)");
				elementList.add(elementDO5);
				
			elementDO5 = new ElementDO();
				elementDO5.setValues("Feature Number (DS) (K)");
				elementList.add(elementDO5);
				
			elementDO5 = new ElementDO();
				elementDO5.setValues("Feature Number (DZ) (K)");
				elementList.add(elementDO5);
				
			elementDO5 = new ElementDO();
				elementDO5.setValues("Feature Type (DS)");
				elementList.add(elementDO5);
				
			elementDO5 = new ElementDO();
				elementDO5.setValues("Features (DS)");
				elementList.add(elementDO5);
				
			elementDO5 = new ElementDO();
				elementDO5.setValues("Features (DZ)");
				elementList.add(elementDO5);
		}
		if("Generic fields on parts master".equalsIgnoreCase(categoryDO.getCategoryName())){
			
				ElementDO elementDO6 = new ElementDO();
				elementDO6.setValues("GF01");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF02 W54_Workgroup serial change management name");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF04 Person responsible for component");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF05 Comment Development");
				elementList.add(elementDO6);	
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF06 W67_SAP_MATSTAT");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF07 W67_Auslaufdatum");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF08 Plant 050 Manufactoring Substation");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF09 Anf_AWE_117_W371");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF10 start workflow");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF11 ESAM status X253 CN");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF12 1040_part change history");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF13 AK PASCALE");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF14 W54_Workgroup serial change management date");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF15 Localization Status");
				elementList.add(elementDO6);	
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF16 Delivery_place_BF-phase");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF17 Sampling coordination planning expected date");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF19 P-Freigaberelevanz");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF20 BTM-Info");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF22 goods delivery samples AMG BR197");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF23 Completion date/ Clarification requirements Ak-Krit Logistic");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF24 Completion date/ Clarification requirements Ak-Krit Purchase");
				elementList.add(elementDO6);
				
				elementDO6 = new ElementDO();
				elementDO6.setValues("GF25 MRP Ramp Up");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF26 vLB/ LOI Tracking W138");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF27 Comment Third Party Deal");
				elementList.add(elementDO6);	
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF28 MBCC Part");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF29 Technical Tool Tracking contact person");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF30 Completion date/ Clarification requirements AK-krit Development");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF31 Teilebündel: Modulbildung in Bem.planungstool");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF32 sampling planning");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF33 date of sample ordering");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF34 W67-AbwErlBem");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF35 W67-AbwErl");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF36 W67-BO-H93");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF37 W67-BO-H09");
				elementList.add(elementDO6);	
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF38 W67-BO-H03");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF39 W67-BO-sonst");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF40 W67-NS-X253-PKZ");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF41 W67 std del meth");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF42 W67- goods carrier (from LTM)");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF43 W67-ALM");
				elementList.add(elementDO6);
				
			elementDO6 = new ElementDO();
				elementDO6.setValues("GF44 CCC-temp");
				elementList.add(elementDO6);		
		}
		if("Generic fields on PEM".equalsIgnoreCase(categoryDO.getCategoryName())){
				ElementDO elementDO7 = new ElementDO();
				elementDO7.setValues("FF01 (0540) Arbeitskreis Serien-ÄM Aufgabe");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF01 (3710) PEM-Status");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF02 (0540) Arbeitskreis Serien-ÄM Name");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF03 (0540) Arbeitskreis Serien-ÄM Wiedervorlage");
				elementList.add(elementDO7);	
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF03 (0670) IECM-Kritikalität");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF04 (0540) IECM-MFA-Aufgabe");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF04 (0670) Jahresbereinigung");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF05 (0540) IECM-MFA-Name");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF05 (0670) GET");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF05 (1750) Update PEM-Categorie");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF06 (0540) IECM-MFA-Wiedervorlage");
				elementList.add(elementDO7);
				
				elementDO7 = new ElementDO();
				elementDO7.setValues("FF02 (0540) Arbeitskreis Serien-ÄM Name");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF03 (0540) Arbeitskreis Serien-ÄM Wiedervorlage");
				elementList.add(elementDO7);	
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF06 (0670) AUFBR-STR");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF07 (0670) Einsatz-Plan-Masch");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF08 (0670) Einsatz-Wunsch");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF09 (0670) Einsatz-Plan");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF10 (0670) Bemerkung AKkritS");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF11 (0500) GET-Werke");
				elementList.add(elementDO7);
				
			elementDO7 = new ElementDO();
				elementDO7.setValues("FF11 (0540) GET-Werke");
				elementList.add(elementDO7);	
			
		}
		if("Goods receipt".equalsIgnoreCase(categoryDO.getCategoryName())){
			
			ElementDO elementDO8 = new ElementDO();
				elementDO8.setValues("Current stock line");
				elementList.add(elementDO8);
				
			elementDO8 = new ElementDO();
				elementDO8.setValues("Current stock storage");
				elementList.add(elementDO8);
				
			elementDO8 = new ElementDO();
				elementDO8.setValues("Date of current delivery receipt");
				elementList.add(elementDO8);
				
			elementDO8 = new ElementDO();
				elementDO8.setValues("Date of first delivery receipt");
				elementList.add(elementDO8);	
		}
		if("Measure".equalsIgnoreCase(categoryDO.getCategoryName())){
			
			ElementDO elementDO9 = new ElementDO();
				elementDO9.setValues("Changed by");
				elementList.add(elementDO9);
				
			elementDO9 = new ElementDO();
				elementDO9.setValues("Comment");
				elementList.add(elementDO9);
				
			elementDO9 = new ElementDO();
				elementDO9.setValues("Created by (Measures)");
				elementList.add(elementDO9);
				
			elementDO9 = new ElementDO();
				elementDO9.setValues("Created on (Measures)");
				elementList.add(elementDO9);	
				
			elementDO9 = new ElementDO();
				elementDO9.setValues("Finished by");
				elementList.add(elementDO9);
				
			elementDO9 = new ElementDO();
				elementDO9.setValues("Last change on");
				elementList.add(elementDO9);
				
			elementDO9 = new ElementDO();
				elementDO9.setValues("Measure Category");
				elementList.add(elementDO9);
		}
		if("Milestone".equalsIgnoreCase(categoryDO.getCategoryName())){
			
				ElementDO elementDO10 = new ElementDO();
				elementDO10.setValues("Begin ship date Expected date");
				elementList.add(elementDO10);
				
			elementDO10 = new ElementDO();
				elementDO10.setValues("Begin ship date Expected date Comment");
				elementList.add(elementDO10);
				
			elementDO10 = new ElementDO();
				elementDO10.setValues("Begin ship date Ist");
				elementList.add(elementDO10);
				
			elementDO10 = new ElementDO();
				elementDO10.setValues("Begin ship date Ist Comment");
				elementList.add(elementDO10);	
				
			elementDO10 = new ElementDO();
				elementDO10.setValues("Begin ship date Plan automatic");
				elementList.add(elementDO10);
				
			elementDO10 = new ElementDO();
				elementDO10.setValues("Begin ship date Plan automatic Comment");
				elementList.add(elementDO10);
				
			elementDO10 = new ElementDO();
				elementDO10.setValues("Begin ship date Plan determined");
				elementList.add(elementDO10);
				
			elementDO10 = new ElementDO();
				elementDO10.setValues("Begin ship date Plan determined Comment");
				elementList.add(elementDO10);
				
			elementDO10 = new ElementDO();
				elementDO10.setValues("Begin ship date Plan Fachbereich");
				elementList.add(elementDO10);
				
			elementDO10 = new ElementDO();
				elementDO10.setValues("Begin ship date Plan Fachbereich Comment");
				elementList.add(elementDO10);
		}
		if("nTier".equalsIgnoreCase(categoryDO.getCategoryName())){
			
			ElementDO elementDO11 = new ElementDO();
				elementDO11.setValues("AKV Matrix nTier");
				elementList.add(elementDO11);
				
			elementDO11 = new ElementDO();
				elementDO11.setValues("Date Part agreement");
				elementList.add(elementDO11);
				
			elementDO11 = new ElementDO();
				elementDO11.setValues("GET-Relation nTier");
				elementList.add(elementDO11);
				
			elementDO11 = new ElementDO();
				elementDO11.setValues("Last Change Part Agreement");
				elementList.add(elementDO11);	
				
			elementDO11 = new ElementDO();
				elementDO11.setValues("nTier Plant");
				elementList.add(elementDO11);
				
			elementDO11 = new ElementDO();
				elementDO11.setValues("Part agreement ID");
				elementList.add(elementDO11);
				
			elementDO11 = new ElementDO();
				elementDO11.setValues("Part agreement Ident no.");
				elementList.add(elementDO11);
		}
		if("Parts master data".equalsIgnoreCase(categoryDO.getCategoryName())){
			
			ElementDO elementDO12 = new ElementDO();
				elementDO12.setValues("3D Visualization (ZGS dependent)");
				elementList.add(elementDO12);
				
			elementDO12 = new ElementDO();
				elementDO12.setValues("Basic Item Number");
				elementList.add(elementDO12);
				
			elementDO12 = new ElementDO();
				elementDO12.setValues("CAD Indicator");
				elementList.add(elementDO12);
				
			elementDO12 = new ElementDO();
				elementDO12.setValues("Certification Relevance");
				elementList.add(elementDO12);	
				
			elementDO12 = new ElementDO();
				elementDO12.setValues("Codable Control Units");
				elementList.add(elementDO12);
				
			elementDO12 = new ElementDO();
				elementDO12.setValues("Common Part");
				elementList.add(elementDO12);
		}
		if("PEM".equalsIgnoreCase(categoryDO.getCategoryName())){
			
			ElementDO elementDO7 = new ElementDO();
			elementDO7.setValues("FF01 (0540) Arbeitskreis Serien-ÄM Aufgabe");
			elementList.add(elementDO7);
			
		elementDO7 = new ElementDO();
			elementDO7.setValues("FF01 (3710) PEM-Status");
			elementList.add(elementDO7);
			
		elementDO7 = new ElementDO();
			elementDO7.setValues("FF02 (0540) Arbeitskreis Serien-ÄM Name");
			elementList.add(elementDO7);
			
		elementDO7 = new ElementDO();
			elementDO7.setValues("FF03 (0540) Arbeitskreis Serien-ÄM Wiedervorlage");
			elementList.add(elementDO7);	
			
		elementDO7 = new ElementDO();
			elementDO7.setValues("FF03 (0670) IECM-Kritikalität");
			elementList.add(elementDO7);
			
		elementDO7 = new ElementDO();
			elementDO7.setValues("FF04 (0540) IECM-MFA-Aufgabe");
			elementList.add(elementDO7);
			
		elementDO7 = new ElementDO();
			elementDO7.setValues("FF04 (0670) Jahresbereinigung");
			elementList.add(elementDO7);
			
		}if("Pre-production test batch".equalsIgnoreCase(categoryDO.getCategoryName())){
			
		ElementDO elementDO14 = new ElementDO();
			elementDO14.setValues("BVA automatically");
			elementList.add(elementDO14);
			
		elementDO14 = new ElementDO();
			elementDO14.setValues("BVA Comment Development");
			elementList.add(elementDO14);
			
		elementDO14 = new ElementDO();
			elementDO14.setValues("BVA Comment Plant");
			elementList.add(elementDO14);
			
		elementDO14 = new ElementDO();
			elementDO14.setValues("BVA defined");
			elementList.add(elementDO14);	
			
		elementDO14 = new ElementDO();
			elementDO14.setValues("Delivery assembly parts date");
			elementList.add(elementDO14);
			
		elementDO14 = new ElementDO();
			elementDO14.setValues("List Pre-production Test Batch");
			elementList.add(elementDO14);
			
		elementDO14 = new ElementDO();
			elementDO14.setValues("Model series of pre-production test batch (K)");
			elementList.add(elementDO14);
			
		elementDO14 = new ElementDO();
			elementDO14.setValues("Pre-production test batch");
		}if("Priority".equalsIgnoreCase(categoryDO.getCategoryName())){
			
			ElementDO elementDO15 = new ElementDO();
			elementDO15.setValues("Begin ship date Expected date Priority");
			elementList.add(elementDO15);
			
		elementDO15 = new ElementDO();
			elementDO15.setValues("Begin ship date plant Expected date Priority");
			elementList.add(elementDO15);
			
		elementDO15 = new ElementDO();
			elementDO15.setValues("Color PPAR Expected date Priority");
			elementList.add(elementDO15);
			
		elementDO15 = new ElementDO();
			elementDO15.setValues("D-P Green plant Expected date Priority");
			elementList.add(elementDO15);	
			
		elementDO15 = new ElementDO();
			elementDO15.setValues("D-P Yellow plant Expected date Priority");
			elementList.add(elementDO15);
			
		elementDO15 = new ElementDO();
			elementDO15.setValues("ESWFT plant Expected date Priority");
			elementList.add(elementDO15);
		}
		if("Procurement".equalsIgnoreCase(categoryDO.getCategoryName())){
			
			ElementDO elementDO16 = new ElementDO();
				elementDO16.setValues("Comment on sampling relevance");
				elementList.add(elementDO16);
				
			elementDO16 = new ElementDO();
				elementDO16.setValues("Part State");
				elementList.add(elementDO16);
				
			elementDO16 = new ElementDO();
				elementDO16.setValues("Receiving Area samples (ABS)");
				elementList.add(elementDO16);
				
			elementDO16 = new ElementDO();
				elementDO16.setValues("Remark Log");
				elementList.add(elementDO16);	
				
			elementDO16 = new ElementDO();
				elementDO16.setValues("Sampling result required (in start)");
				elementList.add(elementDO16);
		}
		if("Project".equalsIgnoreCase(categoryDO.getCategoryName())){
				ElementDO elementDO17 = new ElementDO();
				elementDO17.setValues("Added manually");
				elementList.add(elementDO17);
				
			elementDO17 = new ElementDO();
				elementDO17.setValues("Comment Plan Scheduling");
				elementList.add(elementDO17);
				
			elementDO17 = new ElementDO();
				elementDO17.setValues("Controlling Rel. Plant of color-neutral parts");
				elementList.add(elementDO17);
				
			elementDO17 = new ElementDO();
				elementDO17.setValues("Controlling Relevance Plant");
				elementList.add(elementDO17);	
				
			elementDO17 = new ElementDO();
				elementDO17.setValues("Controlling relevant Plant manually changed");
				elementList.add(elementDO17);
				
			elementDO17 = new ElementDO();
				elementDO17.setValues("Ind. Plan Scheduling Rel. man. changed");
				elementList.add(elementDO17);
				
		}
		if("Runtime types".equalsIgnoreCase(categoryDO.getCategoryName())){
			
			ElementDO elementDO18 = new ElementDO();
			elementDO18.setValues("approval lead time");
			elementList.add(elementDO18);
			
		elementDO18 = new ElementDO();
			elementDO18.setValues("EMPBFaktorDays");
			elementList.add(elementDO18);
			
		elementDO18 = new ElementDO();
			elementDO18.setValues("h");
			elementList.add(elementDO18);
			
		elementDO18 = new ElementDO();
			elementDO18.setValues("L/M/S-Description");
			elementList.add(elementDO18);	
			
		elementDO18 = new ElementDO();
			elementDO18.setValues("LaufzeitESWFT2SWFT");
			elementList.add(elementDO18);
			
		elementDO18 = new ElementDO();
			elementDO18.setValues("LaufzeitW2Blank");
			elementList.add(elementDO18);
		}
		if("Sampling".equalsIgnoreCase(categoryDO.getCategoryName())){
			
			ElementDO elementDO19 = new ElementDO();
			elementDO19.setValues("Comment Resubmission Prognose");
			elementList.add(elementDO19);
			
		elementDO19 = new ElementDO();
			elementDO19.setValues("Contract supplier");
			elementList.add(elementDO19);
			
		elementDO19 = new ElementDO();
			elementDO19.setValues("Contract Supplier ambiguous");
			elementList.add(elementDO19);
			
		elementDO19 = new ElementDO();
			elementDO19.setValues("Contract supplier index");
			elementList.add(elementDO19);	
		}
		if("Smaragd".equalsIgnoreCase(categoryDO.getCategoryName())){
			
				ElementDO elementDO20 = new ElementDO();
				elementDO20.setValues("3D Visualization (version dependent) (K)");
				elementList.add(elementDO20);
				
			elementDO20 = new ElementDO();
				elementDO20.setValues("Date E Release from (DIA-E) (Smaragd)");
				elementList.add(elementDO20);
				
			elementDO20 = new ElementDO();
				elementDO20.setValues("KEM-S for ZGS");
				elementList.add(elementDO20);
				
			elementDO20 = new ElementDO();
				elementDO20.setValues("Prototype Batches");
				elementList.add(elementDO20);	
				
			elementDO20 = new ElementDO();
				elementDO20.setValues("Release status");
				elementList.add(elementDO20);
		}
		if("Supplier".equalsIgnoreCase(categoryDO.getCategoryName())){
				ElementDO elementDO21 = new ElementDO();
				elementDO21.setValues("AKV Matrix");
				elementList.add(elementDO21);
				
			elementDO21 = new ElementDO();
				elementDO21.setValues("Copy State");
				elementList.add(elementDO21);
				
			elementDO21 = new ElementDO();
				elementDO21.setValues("Country");
				elementList.add(elementDO21);
				
			elementDO21 = new ElementDO();
				elementDO21.setValues("Date Purchase Order");
				elementList.add(elementDO21);
			
		}if("Tool Part Bundle".equalsIgnoreCase(categoryDO.getCategoryName())){
			
				ElementDO elementDO22 = new ElementDO();
				elementDO22.setValues("Responsible person (Tool PB)");
				elementList.add(elementDO22);
				
			elementDO22 = new ElementDO();
				elementDO22.setValues("Tool Part Bundle Name");
				elementList.add(elementDO22);
				
			elementDO22 = new ElementDO();
				elementDO22.setValues("Tool Part Bundle Numbers");
				elementList.add(elementDO22);
			
		}if("Usage".equalsIgnoreCase(categoryDO.getCategoryName())){
				ElementDO elementDO23 = new ElementDO();
				elementDO23.setValues("Deviating Purchase Key");
				elementList.add(elementDO23);
				
			elementDO23 = new ElementDO();
				elementDO23.setValues("Documentation Maturity Level Dia E");
				elementList.add(elementDO23);
				
			elementDO23 = new ElementDO();
				elementDO23.setValues("Documentation Maturity Level Dia P");
				elementList.add(elementDO23);
				
			elementDO23 = new ElementDO();
				elementDO23.setValues("Module");
				elementList.add(elementDO23);
		}
		categoryDO1.setValues(elementList);
		return categoryDO1;
		
	}
	public List<CategoryDO> getResultsByCategoryPrefix(String categoryName){
		
		List<CategoryDO> categoryDOList = new ArrayList<CategoryDO>();
		CategoryDO CategoryDO1 = new CategoryDO();
		CategoryDO CategoryDO2 = new CategoryDO();
		CategoryDO CategoryDO3 = new CategoryDO();
		CategoryDO CategoryDO4 = new CategoryDO();
		
		if(categoryName.equalsIgnoreCase("pro")){
			CategoryDO1.setCategoryName("Milestone");
			List<ElementDO> elementDOList = new ArrayList<ElementDO>();
			ElementDO elementDO1 = new ElementDO();
			elementDO1.setValues("Prototype parts actual");
			elementDOList.add(elementDO1);
			
			elementDO1 = new ElementDO();
			elementDO1.setValues("Prototype parts expected date ");
			elementDOList.add(elementDO1);
			
			CategoryDO1.setValues(elementDOList);
			categoryDOList.add(CategoryDO1);
			
			CategoryDO2.setCategoryName("Project");
			List<ElementDO> elementDOList2 = new ArrayList<ElementDO>();
			ElementDO elementDO2 = new ElementDO();
			elementDO2.setValues("Project ident");
			elementDOList2.add(elementDO2);
			
			elementDO2 = new ElementDO();
			elementDO2.setValues("Project short name");
			elementDOList2.add(elementDO2);
			
			elementDO2 = new ElementDO();
			elementDO2.setValues("PTR Project");
			elementDOList2.add(elementDO2);
			
			CategoryDO2.setValues(elementDOList2);
			categoryDOList.add(CategoryDO2);
			
			CategoryDO3.setCategoryName("Sampling");
			List<ElementDO> elementDOList3 = new ArrayList<ElementDO>();
			ElementDO elementDO3 = new ElementDO();
			elementDO3.setValues("Comment Resubmission Prognose");
			elementDOList3.add(elementDO3);
			
			CategoryDO3.setValues(elementDOList3);
			categoryDOList.add(CategoryDO3);
			
			CategoryDO4.setCategoryName("Smaragd");
			List<ElementDO> elementDOList4 = new ArrayList<ElementDO>();
			ElementDO elementDO4 = new ElementDO();
			elementDO4.setValues("Prototype Batches");
			elementDOList4.add(elementDO4);
			
			CategoryDO4.setValues(elementDOList4);
			categoryDOList.add(CategoryDO4);
		}
		/*if(categoryName.equalsIgnoreCase("KEM")){
			CategoryDO1.setCategoryName("AE KEM master (E)");
			List<ElementDO> elementDOList = new ArrayList<ElementDO>();
			ElementDO elementDO1 = new ElementDO();
			elementDO1.setValues("KEM-E for ZGS");
			elementDOList.add(elementDO1);
			
			elementDO1 = new ElementDO();
			elementDO1.setValues("KEM-P for ZGS");
			elementDOList.add(elementDO1);
			
			CategoryDO1.setValues(elementDOList);
			categoryDOList.add(CategoryDO1);
		}
		if(categoryName.equalsIgnoreCase("FF0")){
			CategoryDO1.setCategoryName("Generic fields on PEM");
			List<ElementDO> elementDOList = new ArrayList<ElementDO>();
			ElementDO elementDO1 = new ElementDO();
			elementDO1.setValues("FF03 (0540) Arbeitskreis Serien-ÄM Wiedervorlage");
			elementDOList.add(elementDO1);
			
			elementDO1 = new ElementDO();
			elementDO1.setValues("FF03 (0670) IECM-Kritikalität");
			elementDOList.add(elementDO1);
			
			elementDO1 = new ElementDO();
			elementDO1.setValues("FF04 (0540) IECM-MFA-Aufgabe");
			elementDOList.add(elementDO1);
			
			elementDO1 = new ElementDO();
			elementDO1.setValues("FF04 (0670) Jahresbereinigung");
			elementDOList.add(elementDO1);
			
			CategoryDO1.setValues(elementDOList);
			categoryDOList.add(CategoryDO1);
		}
		if(categoryName.equalsIgnoreCase("D-P")){
			CategoryDO1.setCategoryName("Milestone");
			List<ElementDO> elementDOList = new ArrayList<ElementDO>();
			ElementDO elementDO1 = new ElementDO();
			elementDO1.setValues("D-P Green plant BTM Expected date");
			elementDOList.add(elementDO1);
			
			elementDO1 = new ElementDO();
			elementDO1.setValues("D-P Green plant BTM Expected date Comment");
			elementDOList.add(elementDO1);
			
			elementDO1 = new ElementDO();
			elementDO1.setValues("D-P Green plant Expected date");
			elementDOList.add(elementDO1);
			
			elementDO1 = new ElementDO();
			elementDO1.setValues("D-P Yellow plant BTM Expected date Comment");
			elementDOList.add(elementDO1);
			
			CategoryDO1.setValues(elementDOList);
			categoryDOList.add(CategoryDO1);
		}
		if(categoryName.equalsIgnoreCase("ZGS")){
			CategoryDO1.setCategoryName("nTier");
			List<ElementDO> elementDOList = new ArrayList<ElementDO>();
			ElementDO elementDO1 = new ElementDO();
			elementDO1.setValues("ZGS nTier (K)");
			elementDOList.add(elementDO1);
			
			elementDO1 = new ElementDO();
			elementDO1.setValues("GS ZB (K)");
			elementDOList.add(elementDO1);
			
			CategoryDO1.setValues(elementDOList);
			categoryDOList.add(CategoryDO1);
		}
		if(categoryName.equalsIgnoreCase("GET")){
			CategoryDO1.setCategoryName("Parts master data");
			List<ElementDO> elementDOList = new ArrayList<ElementDO>();
			ElementDO elementDO1 = new ElementDO();
			elementDO1.setValues("GET-Flag Defined");
			elementDOList.add(elementDO1);
			
			elementDO1 = new ElementDO();
			elementDO1.setValues("GET-Flag Defined Comment");
			elementDOList.add(elementDO1);
			
			elementDO1 = new ElementDO();
			elementDO1.setValues("GET-Flag Suggested");
			elementDOList.add(elementDO1);
			
			elementDO1 = new ElementDO();
			elementDO1.setValues("GET-Relations Part");
			elementDOList.add(elementDO1);
			
			CategoryDO1.setValues(elementDOList);
			categoryDOList.add(CategoryDO1);
		}*/
		return categoryDOList;
	}
	public List<ResultGridDO> getGridData(){
		
		List<ResultGridDO> resultGridDOList = new ArrayList<ResultGridDO>();
			
			ResultGridDO resultGridDO = new ResultGridDO();
		
				List<ColumnHeaderDO> columnHeaders = new ArrayList<ColumnHeaderDO>();
				
					ColumnHeaderDO ColumnHeaderDO1 = new ColumnHeaderDO();
						ColumnHeaderDO1.setColumnHeader("Part number");
						ColumnHeaderDO1
						.setTooltip("Parts master data - Part numbers. Common prefixes are 'A' (construction parts), 'H' (trial parts), 'N' (standard or norm parts), 'P' (plant-specific part), 'U', 'R' and 'S' (raw materials).");
					
					ColumnHeaderDO ColumnHeaderDO2 = new ColumnHeaderDO();
						ColumnHeaderDO2.setColumnHeader(" ");
						ColumnHeaderDO2
						.setTooltip("");
						
					ColumnHeaderDO ColumnHeaderDO3 = new ColumnHeaderDO();
						ColumnHeaderDO3.setColumnHeader("Plant");
						ColumnHeaderDO3
						.setTooltip("Parts master data - Plant number is displayed with four digits in start.");
						
					ColumnHeaderDO ColumnHeaderDO4 = new ColumnHeaderDO();
						ColumnHeaderDO4.setColumnHeader("Contract plant");
						ColumnHeaderDO4
						.setTooltip("Supplier - Contract plant (PMC and QM)");
						
					ColumnHeaderDO ColumnHeaderDO5 = new ColumnHeaderDO();
						ColumnHeaderDO5.setColumnHeader("BR");
						ColumnHeaderDO5
						.setTooltip("Usage - Model series");
						
					ColumnHeaderDO ColumnHeaderDO6 = new ColumnHeaderDO();
						ColumnHeaderDO6.setColumnHeader("Suppl-No");
						ColumnHeaderDO6
						.setTooltip("Supplier - Supplier number");
						
					ColumnHeaderDO ColumnHeaderDO7 = new ColumnHeaderDO();
						ColumnHeaderDO7.setColumnHeader("Suppl-Idx");
						ColumnHeaderDO7
						.setTooltip("Supplier - Supplier index");
						
					ColumnHeaderDO ColumnHeaderDO8 = new ColumnHeaderDO();
						ColumnHeaderDO8.setColumnHeader("Supplier name");
						ColumnHeaderDO8
						.setTooltip("Supplier - Supplier name");
						
					ColumnHeaderDO ColumnHeaderDO9 = new ColumnHeaderDO();
						ColumnHeaderDO9.setColumnHeader("Part name");
						ColumnHeaderDO9
						.setTooltip("Parts master data - Part name");
						
					ColumnHeaderDO ColumnHeaderDO10 = new ColumnHeaderDO();
						ColumnHeaderDO10.setColumnHeader("ZB Ind.");
						ColumnHeaderDO10
						.setTooltip("Parts master data - Assembly (ZB) Indicator} Quick-filter");		
					
					columnHeaders.add(ColumnHeaderDO1);
					columnHeaders.add(ColumnHeaderDO2);
					columnHeaders.add(ColumnHeaderDO3);
					columnHeaders.add(ColumnHeaderDO4);
					columnHeaders.add(ColumnHeaderDO5);
					columnHeaders.add(ColumnHeaderDO6);
					columnHeaders.add(ColumnHeaderDO7);
					columnHeaders.add(ColumnHeaderDO8);
					columnHeaders.add(ColumnHeaderDO9);
					columnHeaders.add(ColumnHeaderDO10);
					
			resultGridDO.setColumnHeaders(columnHeaders);		
					
			List<GridDO> gridList = new ArrayList<GridDO>();
			
			GridDO gridDO1 = new GridDO();
				gridDO1.setPartNumber("A 000 000 06 00");
				gridDO1.setArrow("->");
				gridDO1.setPlant("1380");
				gridDO1.setContractPlan("0513");
				gridDO1.setBr("166");
				gridDO1.setSupplyNumber("18595504");
				gridDO1.setSupplyIdx("");
				gridDO1.setSupplyName("METEOGROUP SCHWEIZ AG");
				gridDO1.setPartName("LICENCE WETTERDIENST");
				gridDO1.setZbInd("");
				gridList.add(gridDO1);
				
			GridDO gridDO2 = new GridDO();
				gridDO2.setPartNumber("");
				gridDO2.setArrow("->");
				gridDO2.setPlant("1380");
				gridDO2.setContractPlan("0513");
				gridDO2.setBr("205");
				gridDO2.setSupplyNumber("18595504");
				gridDO2.setSupplyIdx("");
				gridDO2.setSupplyName("METEOGROUP SCHWEIZ AG");
				gridDO2.setPartName("LICENCE WETTERDIENST");
				gridDO2.setZbInd("");
				gridList.add(gridDO2);	
				
			GridDO gridDO3 = new GridDO();
				gridDO3.setPartNumber("A 000 000 06 00");
				gridDO3.setArrow("->");
				gridDO3.setPlant("1380");
				gridDO3.setContractPlan("0513");
				gridDO3.setBr("166");
				gridDO3.setSupplyNumber("18595504");
				gridDO3.setSupplyIdx("");
				gridDO3.setSupplyName("METEOGROUP SCHWEIZ AG");
				gridDO3.setPartName("LICENCE WETTERDIENST");
				gridDO3.setZbInd("");
				gridList.add(gridDO3);
				
			GridDO gridDO4 = new GridDO();
				gridDO4.setPartNumber("");
				gridDO4.setArrow("->");
				gridDO4.setPlant("1380");
				gridDO4.setContractPlan("0513");
				gridDO4.setBr("205");
				gridDO4.setSupplyNumber("18595504");
				gridDO4.setSupplyIdx("");
				gridDO4.setSupplyName("METEOGROUP SCHWEIZ AG");
				gridDO4.setPartName("LICENCE WETTERDIENST");
				gridDO4.setZbInd("");
				gridList.add(gridDO4);
				
			GridDO gridDO5 = new GridDO();
				gridDO5.setPartNumber("A 000 000 06 00");
				gridDO5.setArrow("->");
				gridDO5.setPlant("1380");
				gridDO5.setContractPlan("0513");
				gridDO5.setBr("166");
				gridDO5.setSupplyNumber("18595504");
				gridDO5.setSupplyIdx("");
				gridDO5.setSupplyName("METEOGROUP SCHWEIZ AG");
				gridDO5.setPartName("LICENCE WETTERDIENST");
				gridDO5.setZbInd("");								
				gridList.add(gridDO5);
				
			GridDO gridDO6 = new GridDO();
				gridDO6.setPartNumber("");
				gridDO6.setArrow("->");
				gridDO6.setPlant("1380");
				gridDO6.setContractPlan("0513");
				gridDO6.setBr("205");
				gridDO6.setSupplyNumber("18595504");
				gridDO6.setSupplyIdx("");
				gridDO6.setSupplyName("METEOGROUP SCHWEIZ AG");
				gridDO6.setPartName("LICENCE WETTERDIENST");
				gridDO6.setZbInd("");
				gridList.add(gridDO6);	
				
				resultGridDO.setGridValues(gridList);
				
				resultGridDOList.add(resultGridDO);
				
				return resultGridDOList;
	}
}
