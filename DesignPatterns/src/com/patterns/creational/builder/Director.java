package com.patterns.creational.builder;

import com.patterns.creational.builder.utils.DoorType;
import com.patterns.creational.builder.utils.FloorType;
import com.patterns.creational.builder.utils.RoofType;
import com.patterns.creational.builder.utils.WallType;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {
	
	public void buildSingleFamilyHome(Builder builder) {
		builder.setWalls(WallType.DRY_WALL);
		builder.setFloor(FloorType.CARPET);
		builder.setDoors(DoorType.OAK);
		builder.setRoof(RoofType.CLAY);
		builder.setRooms(3);
		builder.setPool(false);
		builder.setFirePlace(true);
		builder.setBackYard(true);
	}
	
	public void buildCondo(Builder builder) {
		builder.setWalls(WallType.CONCRETE);
		builder.setFloor(FloorType.HARDWOOD);
		builder.setDoors(DoorType.PINE);
		builder.setRoof(RoofType.METAL);
		builder.setRooms(2);
		builder.setPool(true);
		builder.setFirePlace(false);
		builder.setBackYard(false);		
	}
	
	public void buildTinyHome(Builder builder) {
		builder.setWalls(WallType.BRICK);
		builder.setFloor(FloorType.VINYL);
		builder.setDoors(DoorType.MAPEL);
		builder.setRoof(RoofType.RUBBER);
		builder.setRooms(1);
		builder.setPool(false);
		builder.setFirePlace(false);
		builder.setBackYard(false);		
	}
	
	public void buildCastle(Builder builder) {
		builder.setWalls(WallType.DRY_WALL);
		builder.setFloor(FloorType.CARPET);
		builder.setDoors(DoorType.OAK);
		builder.setRoof(RoofType.CLAY);
		builder.setRooms(3);
		builder.setPool(false);
		builder.setFirePlace(true);
		builder.setBackYard(true);		
	}

}
