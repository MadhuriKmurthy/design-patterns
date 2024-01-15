package com.patterns.creational.builder;

import com.patterns.creational.builder.utils.DoorType;
import com.patterns.creational.builder.utils.FloorType;
import com.patterns.creational.builder.utils.RoofType;
import com.patterns.creational.builder.utils.WallType;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {

	void setWalls(WallType wallType);
	void setFloor(FloorType floorType);
	void setDoors(DoorType doorType);
	void setRoof(RoofType roofType);
	void setRooms(int numRooms);
	void setPool(boolean isPool);
	void setFirePlace(boolean isFirePlace);
	void setBackYard(boolean isBackyard);
}
