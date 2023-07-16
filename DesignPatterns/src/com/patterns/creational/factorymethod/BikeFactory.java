package com.patterns.creational.factorymethod;

public class BikeFactory extends ManufactoringFactory{

	@Override
	protected MotorVehicle createMotorVehicle() {
		return new Bike();
	}

}
