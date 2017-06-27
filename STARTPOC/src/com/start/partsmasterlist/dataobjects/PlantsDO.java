package com.start.partsmasterlist.dataobjects;

import java.util.List;

public class PlantsDO {
	String plantHeader;
    List< PlantsValuesDO> plants;
	public String getPlantHeader() {
		return plantHeader;
	}
	public void setPlantHeader(String plantHeader) {
		this.plantHeader = plantHeader;
	}
	public List<PlantsValuesDO> getPlants() {
		return plants;
	}
	public void setPlants(List<PlantsValuesDO> plants) {
		this.plants = plants;
	}
	@Override
	public String toString() {
		return "PlantsDO [plantHeader=" + plantHeader + ", plants=" + plants
				+ "]";
	}
}
