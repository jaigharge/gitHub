package com.start.partsmasterlist.dataobjects;

import java.util.List;

public class FilterPlantsDO {
	List<PlantsDO> plants;

	public List<PlantsDO> getPlants() {
		return plants;
	}

	public void setPlants(List<PlantsDO> plants) {
		this.plants = plants;
	}

	@Override
	public String toString() {
		return "FilterPlantsDO [plants=" + plants + "]";
	}
	
}
