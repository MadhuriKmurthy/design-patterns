package com.patterns.creational.builder;

import com.patterns.creational.builder.utils.DoorType;
import com.patterns.creational.builder.utils.FloorType;
import com.patterns.creational.builder.utils.RoofType;
import com.patterns.creational.builder.utils.WallType;

public class HouseBuilder implements Builder {

	private WallType wallType;
	private FloorType floorType;
	private DoorType doorType;
	private RoofType roofType;
	private int numRooms;
	private boolean isPool;
	private boolean isFirePlace;
	private boolean isBackyard;

	@Override
	public void setWalls(WallType wallType) {
		this.wallType = wallType;
	}

	@Override
	public void setFloor(FloorType floorType) {
		this.floorType = floorType;
	}

	@Override
	public void setDoors(DoorType doorType) {
		this.doorType = doorType;
	}

	@Override
	public void setRoof(RoofType roofType) {
		this.roofType = roofType;
	}

	@Override
	public void setRooms(int numRooms) {
		this.numRooms = numRooms;
	}

	@Override
	public void setPool(boolean isPool) {
		this.isPool = isPool;
	}

	@Override
	public void setFirePlace(boolean isFirePlace) {
		this.isFirePlace = isFirePlace;
	}

	@Override
	public void setBackYard(boolean isBackyard) {
		this.isBackyard = isBackyard;
	}
	
	public House getResults() {
		return new House(wallType, floorType, doorType, roofType, numRooms, isPool, isFirePlace, isBackyard);
	}

}
