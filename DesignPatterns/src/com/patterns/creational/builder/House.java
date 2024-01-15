package com.patterns.creational.builder;

import com.patterns.creational.builder.utils.DoorType;
import com.patterns.creational.builder.utils.FloorType;
import com.patterns.creational.builder.utils.RoofType;
import com.patterns.creational.builder.utils.WallType;

public class House {

	private final WallType wallType;
	private final FloorType floorType;
	private final DoorType doorType;
	private final RoofType roofType;
	private final int numRooms;
	private final boolean isPool;
	private final boolean isFirePlace;
	private final boolean isBackyard;
	
	public House(WallType wallType, FloorType floorType, DoorType doorType, RoofType roofType, int numRooms,
			boolean isPool, boolean isFirePlace, boolean isBackyard) {
		super();
		this.wallType = wallType;
		this.floorType = floorType;
		this.doorType = doorType;
		this.roofType = roofType;
		this.numRooms = numRooms;
		this.isPool = isPool;
		this.isFirePlace = isFirePlace;
		this.isBackyard = isBackyard;
	}

	public WallType getWallType() {
		return wallType;
	}

	public FloorType getFloorType() {
		return floorType;
	}

	public DoorType getDoorType() {
		return doorType;
	}

	public RoofType getRoofType() {
		return roofType;
	}

	public int getNumRooms() {
		return numRooms;
	}

	public boolean isPool() {
		return isPool;
	}

	public boolean isFirePlace() {
		return isFirePlace;
	}

	public boolean isBackyard() {
		return isBackyard;
	}	
	
	public String print() {
		 String info = "";
	        info += "Type of walls of house: " + wallType + "\n";
	        info += "Type of floor of house: " + floorType + "\n";
	        info += "Type of doors in house: " + doorType + "\n";
	        info += "Type of roof in house: " + roofType + "\n";
	        info += "Number of rooms in house: " + numRooms + "\n";
	        info += "House has a pool?: " + isPool + "\n";
	        info += "House has a fireplace?: " + isFirePlace + "\n";
	        info += "House has a backyard?: " + isBackyard + "\n";
	        return info;
	}
	
}
