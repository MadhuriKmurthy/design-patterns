package com.patterns.creational.factorymethod;

public class CarFactory extends ManufactoringFactory{

	@Override
	protected MotorVehicle createMotorVehicle() {
		return new Car();
	}

}
